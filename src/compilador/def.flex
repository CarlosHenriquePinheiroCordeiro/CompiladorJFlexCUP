/*incluir o pacote onde a classe será criada*/
package compilador;
import compilador.sym; /* essa classe será criada pelo CUP */
import java_cup.runtime.Symbol;
import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ComplexSymbolFactory.Location;

%%
%public
%class Lexico
%cup
%function next_token
%implements sym
%full
%line
%column
%char
%ignorecase
/* as funções abaixo sobrescrevem o construtor da classe Symbol para suporte de mais argumentos */
/* mais detalhes em: http://www2.cs.tum.edu/projects/cup/examples.php */
%{
    StringBuffer string = new StringBuffer();
    public Lexico(java.io.Reader in, ComplexSymbolFactory sf){
	this(in);
	symbolFactory = sf;
    }
    ComplexSymbolFactory symbolFactory;

    private Symbol symbol(String name, int sym) {
        return symbolFactory.newSymbol(name, sym, new Location(name,yyline+1,yycolumn+1), new Location(name,yyline+1,yycolumn+yylength()));
    }

    private Symbol symbol(String name, int sym, Object val) {
        Location left = new Location(name,yyline+1,yycolumn+1);
        Location right= new Location(name,yyline+1,yycolumn+yylength() );
        return symbolFactory.newSymbol(name, sym, left, right,val);
    }
    private Symbol symbol(String name, int sym, Object val,int buflength) {
        Location left = new Location(name,yyline+1,yycolumn+yylength()-buflength);
        Location right= new Location(name,yyline+1,yycolumn+yylength());
        return symbolFactory.newSymbol(name, sym, left, right,val);
    }
    private void error(String message) {
      System.out.println("Error at line "+(yyline+1)+", column "+(yycolumn+1)+" : "+message);
    }
%}

%eofval{
     return symbolFactory.newSymbol("EOF", EOF, new Location("EOF",yyline+1,yycolumn+1), new Location("EOF",yyline+1,yycolumn+1));
%eofval}

letras  = [a-zA-Z]
numeros = [0-9]
ws      = [\ |\n|\r]|[\t\f]
id      = {letras}({letras}|{numeros})*
const   = 0 | [1-9][0-9]*
BoolLiteral = true | false

%state STRING

%% 
/* regras de tradução - tokens */
"//".*      {/* ignorar comentários */}
<YYINITIAL> {
"program"		{return symbol("program",PROGRAM, new Integer(PROGRAM));			}
"if"			{return symbol("if"			, IF	 	, new Integer(IF));			}
"float"			{return symbol("float"		, FLOAT	 	, new Integer(FLOAT));		}
"int"			{return symbol("int"		, INT	 	, new Integer(INT));		}
"String"		{return symbol("String"		, STRING 	, new Integer(STRING));		}
"boolean"		{return symbol("boolean"	, BOOL	 	, new Integer(BOOL));		}
"void"			{return symbol("void"		, VOID	 	, new Integer(VOID));		}
"public"		{return symbol("public"		, PUBLIC 	, new Integer(PUBLIC));		}
"private"		{return symbol("private"	, PRIVATE	, new Integer(PRIVATE));	}
"protected"		{return symbol("protected"	, PROTECTED	, new Integer(PROTECTED));	}
"return"		{return symbol("return"		, RETURN	, new Integer(RETURN));		}
{BoolLiteral}   {return symbol("bool"		, BOOL		, new Boolean(Boolean.parseBoolean(yytext())));}
{id}        	{return symbol("id"			, ID		,yytext());					} 
{const}     	{return symbol("const"		, CONST		,new Integer(Integer.parseInt(yytext())));} 
{ws}            {/* nenhuma ação - ignorar espaços */  }
"("        		{return new Symbol (sym.AP			, yychar, yyline, yytext());}
")"        		{return new Symbol (sym.FP			, yychar, yyline, yytext());}
"{"       		{return new Symbol (sym.AC			, yychar, yyline, yytext());}
"}"       		{return new Symbol (sym.FC			, yychar, yyline, yytext());}
","   			{return new Symbol (sym.VIRGULA		, yychar, yyline, yytext());}
"[]"			{return new Symbol (sym.ARRAY		, yychar, yyline, yytext());}
"+"         	{return new Symbol (sym.SOMA		, yychar, yyline, yytext());}  
"-"         	{return new Symbol (sym.SUB			, yychar, yyline, yytext());}  
"*"         	{return new Symbol (sym.MULT		, yychar, yyline, yytext());} 
"/"         	{return new Symbol (sym.DIV			, yychar, yyline, yytext());}
"="         	{return new Symbol (sym.ATT			, yychar, yyline, yytext());} 
"=="        	{return new Symbol (sym.IGUAL		, yychar, yyline, yytext());} 
"!="        	{return new Symbol (sym.DIF			, yychar, yyline, yytext());}
">"         	{return new Symbol (sym.MAIORQ		, yychar, yyline, yytext());} 
"<"        		{return new Symbol (sym.MENORQ		, yychar, yyline, yytext());}
">="        	{return new Symbol (sym.MAIORI		, yychar, yyline, yytext());}
"<="        	{return new Symbol (sym.MENORI		, yychar, yyline, yytext());}
"!"         	{return new Symbol (sym.NAO			, yychar, yyline, yytext());}
"&&"        	{return new Symbol (sym.E			, yychar, yyline, yytext());}
"||"            {return new Symbol (sym.OU			, yychar, yyline, yytext());}
}
<STRING> { /* para leitura de uma string */
  \"                             { yybegin(YYINITIAL); 
      return symbol("caracter",CARACTER,string.toString(),string.length()); }
  [^\n\r\"\\]+                   { string.append( yytext() ); }
  \\t                            { string.append('\t'); }
  \\n                            { string.append('\n'); }

  \\r                            { string.append('\r'); }
  \\\"                           { string.append('\"'); }
  \\                             { string.append('\\'); }
}

/* tratamento de erros */
[^]|\n	{  /* throw new Error("Caracter inválido <"+ yytext()+">");*/
	error("Caracter inválido <"+ yytext()+">"+", na linha "+yyline+", coluna "+yycolumn);
} 
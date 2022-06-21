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
%implements sym
%full
%line
%column
%char
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

letras  	= [a-zA-Z]
numeros 	= [0-9]
id      	= {letras}({letras}|{numeros})*
ws 			= [ \n\t\r\f]+
const   	= 0|[1-9][0-9]*
flutuante   = ({const})\.?{numeros}*

%state STRING

%% 
/* regras de tradução - tokens */
"//".*      {/* ignorar comentários */}
<YYINITIAL> {
\"              {string.setLength(0); yybegin(STRING); 													}
"program"		{return symbol ("program"   , PROGRAM);													}
"void"			{return symbol ("void"	    , VOID);													}
"public"		{return symbol ("public"	, PUBLIC); 													}
"private"		{return symbol ("private"	, PRIVATE);													}
"protected"		{return symbol ("protected" , PROTECTED);												}
"return"		{return symbol ("return"    , RETURN   );												}
"if"			{return symbol ("if"		, IF	   );												}
"int"			{return symbol ("int"		, INT		, new Integer(INT));							}
"float"			{return symbol ("float"		, FLT		, new Integer(FLT));							}
"string"		{return symbol ("string"	, STR		, new Integer(STR));							}
"boolean"		{return symbol ("boolean"	, BOL  		, new Integer(BOL));							}
"true"			{return symbol ("true"		, TRUE	 	, yytext());									}
"false"			{return symbol ("false"		, FALSE	 	, yytext());									}
{ws} 			{ }
{id}        	{return symbol ("id"		, ID		, yytext());									} 
{const}     	{return symbol ("const"		, CONST		, yytext());									}
{flutuante}     {return symbol ("flutuante"	, FLUT		, yytext());									} 
"("        		{return symbol ("("			, AP);														}
")"        		{return symbol (")"			, FP);														}
"{"       		{return symbol ("{"			, AC);														}
"}"       		{return symbol ("}"			, FC);														}
";"   			{return symbol (";"			, PONTO_VIRGULA);											}
","   			{return symbol (","			, VIRGULA);													}
"[]"			{return symbol ("[]"		, ARRAY);													}
"="         	{return symbol ("="			, ATT);													    }
"+"         	{return symbol ("soma"		, SOMA		, SOMA	, new Integer(SOMA));					} 	 
"-"         	{return symbol ("sub"		, SUB		, SUB	, new Integer(SUB));					}
"*"         	{return symbol ("mult"		, MULT		, MULT	, new Integer(MULT));					} 
"/"         	{return symbol ("div"		, DIV		, DIV	, new Integer(DIV));					}	 
"=="        	{return symbol ("=="		, IGUAL		, new Integer(IGUAL));							}	 
"!="        	{return symbol ("!="		, DIF		, new Integer(DIF));							}
">"         	{return symbol (">"			, MAIORQ	, new Integer(MAIORQ));							}	 
"<"        		{return symbol ("<"			, MENORQ	, new Integer(MENORQ));							}
">="        	{return symbol (">="		, MAIORI	, new Integer(MAIORI));							}
"<="        	{return symbol ("<="		, MENORI	, new Integer(MENORI));							}
"!"         	{return symbol ("!"			, NAO		, new Integer(NAO));							}
"&&"        	{return symbol ("&&"		, E			, new Integer(E));								}
"||"            {return symbol ("||"		, OU		, new Integer(OU));								}
}

<STRING> { /* para leitura de uma string */
  \" { yybegin(YYINITIAL); 
      return symbol("string",STRING,string,string.length()); }
  [^\n\r\"\\]+ { string.append( yytext() ); }
  \\t          { string.append('\t'); }
  \\n          { string.append('\n'); }

  \\r	       { string.append('\r'); }
  \\\"         { string.append('\"'); }
  \\           { string.append('\\'); }
}

/* tratamento de erros */
[^]|\n	{  /* throw new Error("Caracter inválido <"+ yytext()+">");*/
	error("Caracter inválido <"+ yytext()+">"+", na linha "+yyline+", coluna "+yycolumn);
} 
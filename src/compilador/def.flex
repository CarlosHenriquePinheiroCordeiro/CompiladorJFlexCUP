/*incluir o pacote onde a classe será criada*/
package compilador;
import compilador.sym; /* essa classe será criada pelo CUP */
import java_cup.runtime.Symbol;

%%
%class Lexico
%full
%cup
%line
%column
%char
%ignorecase
%eofval{
    return new Symbol(sym.EOF, new String("Fim de arquivo"));
%eofval}

letras    = [a-zA-Z]
numeros   = [0-9]
ws        = [\ \t]
eof       = [\n\r]
id        = {letras}({letras}|{numeros})*
const     = {numeros}+

%% 
/* regras de tradução - tokens */
"//".*      {/* ignorar comentários */}
<YYINITIAL> "program"	{return new Symbol (sym.PROGRAM		, yychar, yyline, yytext());}
<YYINITIAL> "if"		{return new Symbol (sym.IF			, yychar, yyline, yytext());}
<YYINITIAL> "true"      {return new Symbol (sym.TRUE		, yychar, yyline, yytext());}
<YYINITIAL> "float"		{return new Symbol (sym.FLOAT		, yychar, yyline, yytext());}
<YYINITIAL> "false"		{return new Symbol (sym.FALSE		, yychar, yyline, yytext());}
<YYINITIAL> "int"		{return new Symbol (sym.INT			, yychar, yyline, yytext());}
<YYINITIAL> "String"	{return new Symbol (sym.STRING		, yychar, yyline, yytext());}
<YYINITIAL> "boolean"	{return new Symbol (sym.BOOL		, yychar, yyline, yytext());}
<YYINITIAL> "void"		{return new Symbol (sym.VOID		, yychar, yyline, yytext());}
<YYINITIAL> "public"	{return new Symbol (sym.PUBLIC		, yychar, yyline, yytext());}
<YYINITIAL> "private"	{return new Symbol (sym.PRIVATE		, yychar, yyline, yytext());}
<YYINITIAL> "protected"	{return new Symbol (sym.PROTECTED	, yychar, yyline, yytext());}
<YYINITIAL> "return"	{return new Symbol (sym.RETURN		, yychar, yyline, yytext());}
<YYINITIAL> {
"("        				{return new Symbol (sym.AP			, yychar, yyline, yytext());}
")"        				{return new Symbol (sym.FP			, yychar, yyline, yytext());}
"{"       				{return new Symbol (sym.AC			, yychar, yyline, yytext());}
"}"       				{return new Symbol (sym.FC			, yychar, yyline, yytext());}
","   					{return new Symbol (sym.VIRGULA		, yychar, yyline, yytext());}
"[]"					{return new Symbol (sym.ARRAY		, yychar, yyline, yytext());}
"+"         			{return new Symbol (sym.SOMA		, yychar, yyline, yytext());}  
"-"         			{return new Symbol (sym.SUB			, yychar, yyline, yytext());}  
"*"         			{return new Symbol (sym.MULT		, yychar, yyline, yytext());} 
"/"         			{return new Symbol (sym.DIV			, yychar, yyline, yytext());}
"="         			{return new Symbol (sym.ATT			, yychar, yyline, yytext());} 
"=="        			{return new Symbol (sym.IGUAL		, yychar, yyline, yytext());} 
"!="        			{return new Symbol (sym.DIF			, yychar, yyline, yytext());}
">"         			{return new Symbol (sym.MAIORQ		, yychar, yyline, yytext());} 
"<"        		 		{return new Symbol (sym.MENORQ		, yychar, yyline, yytext());}
">="        			{return new Symbol (sym.MAIORI		, yychar, yyline, yytext());}
"<="        			{return new Symbol (sym.MENORI		, yychar, yyline, yytext());}
"!"         			{return new Symbol (sym.NAO			, yychar, yyline, yytext());}
"&&"        			{return new Symbol (sym.E			, yychar, yyline, yytext());}
"||"        			{return new Symbol (sym.OU			, yychar, yyline, yytext());}
{id}        			{return new Symbol (sym.ID			, yychar, yyline, yytext());} 
{const}     			{return new Symbol (sym.CONST		, yychar, yyline, yytext());} 
}
<STRING> {
{ws}        			{/* nenhuma ação */}
}
. {return new Symbol(sym.ERRO);}
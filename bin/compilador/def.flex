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

program   = ["program"]
if 	      = ["if"]
true      = ["true"]
false     = ["false"]
int       = ["int"]
float     = ["float"]
String    = ["String"]
boolean   = ["boolean"]
void      = ["void"]
public    = ["public"]
private   = ["private"]
protected = ["protected"]
return    = ["return"]
ap        = ["("]
fp        = [")"]
ac        = ["{"]
fc        = ["}"]
virgula   = [","]
letras    = [a-zA-Z]
numeros   = [0-9]
ws        = [\ \t]
eof       = [\n\r]
id        = {letras}({letras}|{numeros})*
const     = {numeros}+

%% 
/* regras de tradução - tokens */
"//".*      {/* ignorar comentários */}
{program}	{return new Symbol (sym.PROGRAM		, yychar, yyline, yytext());}
{if}		{return new Symbol (sym.IF			, yychar, yyline, yytext());}
{true}		{return new Symbol (sym.TRUE		, yychar, yyline, yytext());}
{float}		{return new Symbol (sym.FLOAT		, yychar, yyline, yytext());}
{false}		{return new Symbol (sym.FALSE		, yychar, yyline, yytext());}
{int}		{return new Symbol (sym.INT			, yychar, yyline, yytext());}
{String}	{return new Symbol (sym.STRING		, yychar, yyline, yytext());}
{boolean}	{return new Symbol (sym.BOOL		, yychar, yyline, yytext());}
{void}		{return new Symbol (sym.VOID		, yychar, yyline, yytext());}
{public}	{return new Symbol (sym.PUBLIC		, yychar, yyline, yytext());}
{private}	{return new Symbol (sym.PRIVATE		, yychar, yyline, yytext());}
{protected}	{return new Symbol (sym.PROTECTED	, yychar, yyline, yytext());}
{return}	{return new Symbol (sym.RETURN		, yychar, yyline, yytext());}
{ap}        {return new Symbol (sym.AP			, yychar, yyline, yytext());}
{fp}        {return new Symbol (sym.FP			, yychar, yyline, yytext());}
{ac}        {return new Symbol (sym.AC			, yychar, yyline, yytext());}
{fc}        {return new Symbol (sym.FC			, yychar, yyline, yytext());}
{virgula}   {return new Symbol (sym.VIRGULA		, yychar, yyline, yytext());}
"[]"		{return new Symbol (sym.ARRAY		, yychar, yyline, yytext());}
"+"         {return new Symbol (sym.SOMA		, yychar, yyline, yytext());}  
"-"         {return new Symbol (sym.SUB			, yychar, yyline, yytext());}  
"*"         {return new Symbol (sym.MULT		, yychar, yyline, yytext());} 
"/"         {return new Symbol (sym.DIV			, yychar, yyline, yytext());}
"="         {return new Symbol (sym.ATT			, yychar, yyline, yytext());} 
"=="        {return new Symbol (sym.IGUAL		, yychar, yyline, yytext());} 
"!="        {return new Symbol (sym.DIF			, yychar, yyline, yytext());}
">"         {return new Symbol (sym.MAIORQ		, yychar, yyline, yytext());} 
"<"         {return new Symbol (sym.MENORQ		, yychar, yyline, yytext());}
">="        {return new Symbol (sym.MAIORI		, yychar, yyline, yytext());}
"<="        {return new Symbol (sym.MENORI		, yychar, yyline, yytext());}
"!"         {return new Symbol (sym.NAO			, yychar, yyline, yytext());}
"&&"        {return new Symbol (sym.E			, yychar, yyline, yytext());}
"||"        {return new Symbol (sym.OU			, yychar, yyline, yytext());}
{id}        {return new Symbol (sym.ID			, yychar, yyline, yytext());} 
{const}     {return new Symbol (sym.CONST		, yychar, yyline, yytext());} 
{ws}        {/* nenhuma ação */}
. {return new Symbol(sym.ERRO);}
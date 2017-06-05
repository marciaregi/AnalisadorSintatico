import java_cup.runtime.Symbol;

%%

%cup
%public
%class Lexer
%line
%column



LINHA               =  \r|\n|\r\n
OPERADOR_ARITMETICO = [\+|\*|\-|\/]
ID                  = [_|[a-zA-Z]]*
NUMEROS_NATURAIS    = [0-9]+
TEXTO               = '.*'
NUMEROS_REIAS       = [0-9]+,[0-9]+
EXPOENTE            = \^
OU                  = ":|"
E                   = "&&"
IGUAL               = "=="
NAO_IGUAL           = "!="
MENOR               = "<"
MAIOR               = ">"
MAIOR_IGUAL         = ">="
MENOR_IGUAL         = "<="
NAO                 = "!"
INICIO_BLOCO        = "{"
FIM_BLOCO           = "}"
FIM_LINHA           = ";"
ATRIBUICAO			= "="
BRANCO				= [ \t\f]

OPERADOR_RELACIONAL = {IGUAL}|{NAO_IGUAL}|{MENOR}|{MAIOR}|{MENOR_IGUAL}|{MAIOR_IGUAL}
OPERADOR_LOGICO     = {OU}|{E}|{NAO}

%%

<YYINITIAL> {

%%
"fim"			{ return new Symbol(Sym.FIM}
"then"                  { return new Symbol(Sym.THEN}
"if"                    {return new Symbol(Sym.IF); }
"for"                   {return new Symbol(Sym.FOR); }
"while"                 {return new Symbol(Sym.WHILE); }
{ID}                    {return new Symbol(Sym.ID); }
{OPERADOR_ARITMETICO}   {return new Symbol(Sym.OPERADOR_ARITMETICO); }
{NUMEROS_NATURAIS}      {return new Symbol(Sym.NUMEROS_NATURAIS); }
{TEXTO}                 {return new Symbol(Sym.TEXTO); }
{NUMEROS_REIAS}         {return new Symbol(Sym.NUMEROS_REIAS); }
{OPERADOR_LOGICO}       {return new Symbol(Sym.OPERADOR_LOGICO); }
{OPERADOR_RELACIONAL}   {return new Symbol(Sym.OPERADOR_RELACIONAL); }
{EXPOENTE}              {return new Symbol(Sym.EXPOENTE); }
{INICIO_BLOCO}          {return new Symbol(Sym.INICIO_BLOCO); }
{FIM_BLOCO}             {return new Symbol(Sym.FIM_BLOCO); }
{FIM_LINHA}		{return new Symbol(Sym.FIM_LINHA); }
{ATRIBUICAO}		{return new Symbol(Sym.ATRIBUICAO); }
{BRANCO}		{return new Symbol(Sym.BRANCO); }
{LINHA}			{return new Symbol(Sym.LINHA); }
(["$$"].*)		{return new Symbol(Sym.COMENTARIO); }

}

<<EOF>> { return new Symbol( Sym.EOF ); }


[^] { throw new Error("Illegal character: "+yytext()+" at line "+(yyline+1)+", column "+(yycolumn+1) ); }
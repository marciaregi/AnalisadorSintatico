package analisador_lexico;
import static analisador_lexico.Token.*;
%%

%{
public String lexeme;
%}


%class AnalisadorLexico
%type Token
DIG                 = [0-9]
LINHA               =  \r|\n|\r\n
OPERADOR_ARITMETICO = [\+|\*|\-|\/]
ID                  = [_|[a-zA-Z]]*
NUMEROS_NATURAIS    = {DIG}+
TEXTO               = '.[^']*'
NUMEROS_REIAS       = -{DIG}+,{DIG}+|{DIG}+,{DIG}+
TODOS_NUMEROS       = {NUMEROS_REIAS} | {NUMEROS_NATURAIS}
EXPOENTE            = {TODOS_NUMEROS} "e" {TODOS_NUMEROS}
OU                  = ":|"
E                   = "&&"
IGUAL               = "=="
NAO_IGUAL           = "!="
MENOR               = "<"
MAIOR               = ">"
MAIOR_IGUAL         = ">="
MENOR_IGUAL         = "<="
NAO                 = "!"
CHAVE_INICIO        = "{"
CHAVE_FIM           = "}"
FIM_LINHA           = ";"
ATRIBUICAO	    = "="
PARENTESES_INICIO   = "("
PARENTESES_FIM      = ")"
BRANCO				= [ \t\f]

OPERADOR_RELACIONAL = {IGUAL}|{NAO_IGUAL}|{MENOR}|{MAIOR}|{MENOR_IGUAL}|{MAIOR_IGUAL}
OPERADOR_LOGICO     = {OU}|{E}|{NAO}

%%
"inicio"                { lexeme = yytext(); return     INICIO;}
"fim"			{ lexeme = yytext(); return FIM_COMANDO;}
"then"                  { lexeme = yytext(); return THEN; }
"if"                    { lexeme = yytext(); return IF; }
"else"                    { lexeme = yytext(); return ELSE; }
"for"                   { lexeme = yytext(); return FOR; }
"while"                 { lexeme = yytext(); return WHILE; }
{ID}                    { lexeme = yytext(); return ID; }
{OPERADOR_ARITMETICO}   { lexeme = yytext(); return OPERADOR_ARITMETICO; }
{NUMEROS_NATURAIS}      { lexeme = yytext(); return NUMEROS_NATURAIS; }
{TEXTO}                 { lexeme = yytext(); return TEXTO; }
{NUMEROS_REIAS}         { lexeme = yytext(); return NUMEROS_REIAS; }
{OPERADOR_LOGICO}       { lexeme = yytext(); return OPERADOR_LOGICO; }
{OPERADOR_RELACIONAL}   { lexeme = yytext(); return OPERADOR_RELACIONAL; }
{EXPOENTE}              { lexeme = yytext(); return EXPOENTE; }
{CHAVE_INICIO}          { lexeme = yytext(); return CHAVE_INICIO; }
{CHAVE_FIM}             { lexeme = yytext(); return CHAVE_FIM; }
{FIM_LINHA}				{ lexeme = yytext(); return FIM_LINHA;}
{ATRIBUICAO}			{ lexeme = yytext(); return ATRIBUICAO; }
{PARENTESES_INICIO}			{ lexeme = yytext(); return PARENTESES_INICIO; }
{PARENTESES_FIM}			{ lexeme = yytext(); return PARENTESES_FIM; }
{BRANCO}				{ lexeme = yytext(); return BRANCO;}
{LINHA}					{ lexeme = yytext(); return LINHA;}
(["$$"].*)				{ lexeme = yytext(); return COMENTARIO;}

.                       { lexeme = yytext(); return ERROR; }
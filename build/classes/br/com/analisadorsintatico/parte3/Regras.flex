package br.com.analisadorsintatico.parte3;

import java_cup.runtime.Symbol;
import br.com.analisadorsintatico.parte3.sym;

%%

%cup
%full
%line
%char
%ignorecase
%eofval{
    return new Symbol(sym.EOF, new String("Fim do arquivo"));
%eofval}

TEXTO = [a-zA-Z_]
NUMEROS_NATURAIS = [0-9]
RESERVADO_IF = "if"
RESERVADO_WHILE = "while"
RESERVADO_THEN = "then"
RESERVADO_FOR = "for"
TIPO = ("caracter"| "Palavra")
TIPO_NUMERICO = ("inteiro" | "flutuante")
OPERADOR_ATRIBUICAO_IGUAL = "="
OPERADOR_ARITMETICO = ("+" | "-" | "*" | "/")
OPERADOR_RELACIONAL = ("==" | "!=" | "<" | ">" | "<=" | ">=")
OPERADOR_LOGICO = (":|" | "&&" | "!")
INICIO_BLOCO  = "{"
FIM_BLOCO  = "}"
FIM_LINHA  = ";"
ESPACO = [ \t\r\n]

%%

{RESERVADO_IF} {return new Symbol (sym.RESERVADO_IF, yychar, yyline, yytext());}
{RESERVADO_WHILE} {return new Symbol (sym.RESERVADO_WHILE, yychar, yyline, yytext());}
{RESERVADO_THEN} {return new Symbol (sym.RESERVADO_THEN, yychar, yyline, yytext());}
{RESERVADO_FOR} {return new Symbol (sym.RESERVADO_FOR, yychar, yyline, yytext());}
{TIPO} {return new Symbol (sym.TIPO, yychar, yyline, yytext());}
{TIPO_NUMERICO} {return new Symbol (sym.TIPO_NUMERICO, yychar, yyline, yytext());}
{OPERADOR_ARITMETICO} {return new Symbol (sym.OPERADOR_ARITMETICO, yychar, yyline, yytext());}
{OPERADOR_RELACIONAL} {return new Symbol (sym.OPERADOR_RELACIONAL, yychar, yyline, yytext());}
{OPERADOR_LOGICO} {return new Symbol (sym.OPERADOR_LOGICO, yychar, yyline, yytext());}
{INICIO_BLOCO} {return new Symbol (sym.INICIO_BLOCO, yychar, yyline, yytext());}
{FIM_BLOCO} {return new Symbol (sym.FIM_BLOCO, yychar, yyline, yytext());}
{FIM_LINHA} {return new Symbol (sym.FIM_LINHA, yychar, yyline, yytext());}
{ESPACO} {}
{TEXTO}({TEXTO}|{NUMEROS_NATURAIS})* {return new Symbol (sym.ID, yychar, yyline, yytext());}
("(-"{NUMEROS_NATURAIS}+")")|{NUMEROS_NATURAIS}+ {return new Symbol (sym.NUMERO, yychar, yyline, new Integer(yytext()));}

. {return new Symbol (sym.ERROR, yychar, yyline, yytext());}
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

LINHA = \ r | \ n | \ r \ n
OPERADOR_ARITMETICO = [\ + | \ * | \ - | \ /]
ID = [a-zA-Z_]
TEXTO = '. *'
NUMEROS_NATURAIS = [0-9] +
NUMEROS_REIAS = [0-9] +, [0-9] +
EXPOENTE = "^"
OPERADOR_LOGICO = (":|" | "&&" | "!")
OPERADOR_RELACIONAL = ("==" | "!=" | "<" | ">" | "<=" | ">=")
ATRIBUICAO = "="
FIM_LINHA = ";"
PARENTESES_INICIO = "("
PARENTESES_FIM = ")"
CHAVE_INICIO = "{"
CHAVE_FIM = "}"
TIPO = ("caracter"| "Palavra")
TIPO_NUMERICO = ("inteiro" | "flutuante")
RESERVADO_IF = "if"
RESERVADO_ELSE = "else"
RESERVADO_THEN = "then"
RESERVADO_WHILE = "while"
RESERVADO_FOR = "for"
RESERVADO_INICIO = "inicio"
RESERVADO_FIM = "fim"
RESERVADO_FIM = "fim"
BRANCO = [\ t \ f]


%%

{RESERVADO_IF} {return new Symbol (sym.RESERVADO_IF, yychar, yyline, yytext());}
{RESERVADO_ELSE} {return new Symbol (sym.RESERVADO_ELSE, yychar, yyline, yytext());}
{RESERVADO_THEN} {return new Symbol (sym.RESERVADO_THEN, yychar, yyline, yytext());}
{RESERVADO_WHILE} {return new Symbol (sym.RESERVADO_WHILE, yychar, yyline, yytext());}
{RESERVADO_FOR} {return new Symbol (sym.RESERVADO_FOR, yychar, yyline, yytext());}
{TIPO} {return new Symbol (sym.TIPO, yychar, yyline, yytext());}
{TIPO_NUMERICO} {return new Symbol (sym.TIPO_NUMERICO, yychar, yyline, yytext());}
{OPERADOR_ARITMETICO} {return new Symbol (sym.OPERADOR_ARITMETICO, yychar, yyline, yytext());}
{OPERADOR_RELACIONAL} {return new Symbol (sym.OPERADOR_RELACIONAL, yychar, yyline, yytext());}
{OPERADOR_LOGICO} {return new Symbol (sym.OPERADOR_LOGICO, yychar, yyline, yytext());}
{RESERVADO_FIM} {return new Symbol (sym.RESERVADO_FIM, yychar, yyline, yytext());}
{RESERVADO_INICIO} {return new Symbol (sym.RESERVADO_INICIO, yychar, yyline, yytext());}
{FIM_LINHA} {return new Symbol (sym.FIM_LINHA, yychar, yyline, yytext());}
{PARENTESES_INICIO} {return new Symbol (sym.PARENTESES_INICIO, yychar, yyline, yytext());}
{CHAVE_INICIO} {return new Symbol (sym.CHAVE_INICIO, yychar, yyline, yytext());}
{CHAVE_FIM} {return new Symbol (sym.CHAVE_FIM, yychar, yyline, yytext());}
{TEXTO} {return new Symbol (sym.TEXTO, yychar, yyline, yytext());}
{ID} {return new Symbol (sym.ID, yychar, yyline, yytext());}
{EXPOENTE} {return new Symbol (sym.EXPOENTE, yychar, yyline, yytext());}
{NUMEROS_NATURAIS} {return new Symbol (sym.NUMERO_NATURAIS, yychar, yyline,yytext());}
{NUMEROS_REIAS} {return new Symbol (sym.NUMERO_REAIS, yychar, yyline,yytext());}
{BRANCO} {}
. {return new Symbol (sym.ERROR, yychar, yyline, yytext());} 

package br.com.analisadorsintatico.parte3;

import java_cup.runtime.Symbol;

%%

%cup
%public
%class Lexer
%line
%column
%eofval{
    return new Symbol(Sym.EOF, new String("Fim do arquivo"));
%eofval}


DIG                 = [0-9]
LINHA               =  \r|\n|\r\n
OPERADOR_ARITMETICO = [\+|\*|\-|\/]
ID                  = ([a-z|A-Z]|[DIG])*
TEXTO               = '.[^']*'
NUMEROS_NATURAIS    = {DIG}+
NUMEROS_REIAS       = -{DIG}+,{DIG}+|{DIG}+,{DIG}+
EXPOENTE            = \^
OPERADOR_LOGICO     = (":|" | "&&" | "!")
OPERADOR_RELACIONAL = ("==" | "!=" | "<" | ">" | "<=" | ">=")
ATRIBUICAO          = "="
FIM_LINHA           = ";"
PARENTESES_INICIO   = "("
PARENTESES_FIM      = ")"
CHAVE_INICIO        = "{"
CHAVE_FIM           = "}"
TIPO                = ("caracter"| "Palavra")
TIPO_NUMERICO       = ("inteiro" | "flutuante")
RESERVADO_IF        = "if"
RESERVADO_ELSE      = "else"
RESERVADO_THEN      = "then"
RESERVADO_WHILE     = "while"
RESERVADO_FOR       = "for"
RESERVADO_INICIO    = "inicio"
RESERVADO_FIM       = "fim"
RESERVADO_FIM       = "fim"
BRANCO              = [\t\f]


%%
{RESERVADO_IF}          {return new Symbol(Sym.RESERVADO_IF);} 
{RESERVADO_ELSE}        {return new Symbol(Sym.RESERVADO_ELSE); }
{RESERVADO_THEN}        {return new Symbol(Sym.RESERVADO_THEN); }
{RESERVADO_WHILE}       {return new Symbol(Sym.RESERVADO_WHILE); }
{RESERVADO_FOR}         {return new Symbol(Sym.RESERVADO_FOR);}
{TIPO}                  {return new Symbol(Sym.TIPO);}
{TIPO_NUMERICO}         {return new Symbol(Sym.TIPO_NUMERICO);}
{OPERADOR_ARITMETICO}   {return new Symbol(Sym.OPERADOR_ARITMETICO);}
{OPERADOR_RELACIONAL}   {return new Symbol(Sym.OPERADOR_RELACIONAL);}
{OPERADOR_LOGICO}       {return new Symbol(Sym.OPERADOR_LOGICO);}
{RESERVADO_FIM}         {return new Symbol(Sym.RESERVADO_FIM);}
{RESERVADO_INICIO}      {return new Symbol(Sym.RESERVADO_INICIO);}
{FIM_LINHA}             {return new Symbol(Sym.FIM_LINHA);}
{PARENTESES_INICIO}     {return new Symbol(Sym.PARENTESES_INICIO);}
{PARENTESES_FIM}        {return new Symbol(Sym.PARENTESES_FIM);}
{CHAVE_INICIO}          {return new Symbol(Sym.CHAVE_INICIO);}
{CHAVE_FIM}             {return new Symbol(Sym.CHAVE_FIM);}
{TEXTO}                 {return new Symbol(Sym.TEXTO);}
{ID}                    {return new Symbol(Sym.ID);}
{EXPOENTE}              {return new Symbol(Sym.EXPOENTE);}
{NUMEROS_NATURAIS}      {return new Symbol(Sym.NUMERO_NATURAIS);}
{NUMEROS_REIAS}         {return new Symbol(Sym.NUMERO_REAIS);}
{BRANCO}                {return new Symbol(Sym.BRANCO);}
{LINHA}                 {return new Symbol(Sym.LINHA);}
{ATRIBUICAO}            {return new Symbol(Sym.ATRIBUICAO);}
[^] { throw new Error("Illegal character: "+yytext()+" at line "+(yyline+1)+", column "+(yycolumn+1) ); }
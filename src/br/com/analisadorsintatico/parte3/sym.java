/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.analisadorsintatico.parte3;

/**
 *
 * @author Regina
 */
public class sym {
    /* terminals */
  public static final int RESERVADO_FOR = 10;
  public static final int OPERADOR_RELACIONAL = 15;
  public static final int ID = 18;
  public static final int FIM_BLOCO = 26;
  public static final int TIPO = 12;
  public static final int OPERADOR_ARITMETICO = 13;
  public static final int OPERADOR_ATRIBUICAO = 14;
  public static final int RESERVADO_ELSE = 8;
  public static final int INICIO_BLOCO = 24;
  public static final int NUMERO = 29;
  public static final int RESERVADO_WHILE = 5;
  public static final int OPERADOR_LOGICO = 16;
  public static final int RESERVADO_IF = 4;
  public static final int TIPO_NUMERICO = 21;
  public static final String[] terminalNames = new String[] {
  "EOF",
  "error",
  "ERROR",
  "RESERVADO_NULL",
  "RESERVADO_IF",
  "RESERVADO_WHILE",
  "RESERVADO_TRY",
  "RESERVADO_CATCH",
  "RESERVADO_ELSE",
  "RESERVADO_FINALLY",
  "RESERVADO_FOR",
  "EXCECAO",
  "TIPO",
  "OPERADOR_ARITMETICO",
  "OPERADOR_ATRIBUICAO",
  "OPERADOR_RELACIONAL",
  "OPERADOR_LOGICO",
  "OPERADOR_BOOLEANO",
  "ID",
  "OPERADOR_RELACIONAL_IGUAL_DIFERENTE",
  "OPERADOR_ATRIBUICAO_IGUAL",
  "TIPO_NUMERICO",
  "SEPARADOR_PARENTESE_ABRE",
  "SEPARADOR_PARENTESE_FECHA",
  "SEPARADOR_CHAVE_ABRE",
  "SEPARADOR_CHAVE_FECHA",
  "FIM_LINHA",
  "ASPAS",
  "OPERADOR_AUTO_INCREMENTO",
  "NUMERO"
  }; 
    static int EOF;
    static int RESERVADO_THEN;
    static int ERROR;
    static int FIM_LINHA;
}

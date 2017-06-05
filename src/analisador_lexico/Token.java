/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisador_lexico;

/**
 *
 * @author Regina
 */

public enum Token {
    ID, OPERADOR_ARITMETICO, NUMEROS_NATURAIS, TEXTO,
    NUMEROS_REIAS, OPERADOR_LOGICO, OPERADOR_RELACIONAL,
    CHAVE_INICIO, CHAVE_FIM, ATRIBUICAO, THEN, IF,ELSE, FOR,
    WHILE, COMENTARIO, LINHA, ERROR, FIM_COMANDO, BRANCO, 
    EXPOENTE,FIM_LINHA, INICIO_COMANDO, PARENTESES_INICIO, PARENTESES_FIM, INICIO
}

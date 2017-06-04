/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisador_sintatico;

import java.io.File;

/**
 *
 * @author Regina
 */
public class Gerador {
     public static void main(String[] args) {
         
        //Criação de objeto do arquivo com regras de produção para análise
        File file = new File("C:/Users/Regina/Downloads/AnalisadorSintatico/src/analisador_sintatico/Regras.flex");
       
        /*Chamada da classe Main na biblioteca JFlex passando o arquivo criado anteriormente,
            para criação da classe Java responsavel pela análise Léxica.*/
        JFlex.Main.generate(file);
    }
}

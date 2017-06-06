/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela_principal;

import analisador_lexico.*;
import analisador_sintaticoo.Parser;
import analisador_sintaticoo.Yylex;
import java.io.FileNotFoundException;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Regina
 */
public class LexicoSintatico extends javax.swing.JFrame {

    private Parser p;

    /**
     * Creates new form LexicoSintatico
     */
    public LexicoSintatico() {
        initComponents();
        txtSaidaLexico.setEditable(false);
        txtSaidaSintatico.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtSaidaSintatico = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtEntrada = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtSaidaLexico = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jButtonLexico = new javax.swing.JButton();
        jButtonSintatico = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonAnalisar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel6.setFont(new java.awt.Font("Swis721 Blk BT", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Analisador Sintático");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(480, 320, 320, 20);

        txtSaidaSintatico.setColumns(20);
        txtSaidaSintatico.setRows(5);
        jScrollPane3.setViewportView(txtSaidaSintatico);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(440, 350, 350, 280);

        txtEntrada.setColumns(20);
        txtEntrada.setRows(5);
        jScrollPane5.setViewportView(txtEntrada);

        getContentPane().add(jScrollPane5);
        jScrollPane5.setBounds(30, 80, 760, 200);

        jLabel9.setFont(new java.awt.Font("Swis721 Blk BT", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("PROGRAMOL");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(310, 40, 320, 20);

        txtSaidaLexico.setColumns(20);
        txtSaidaLexico.setRows(5);
        jScrollPane6.setViewportView(txtSaidaLexico);

        getContentPane().add(jScrollPane6);
        jScrollPane6.setBounds(30, 350, 350, 280);

        jLabel10.setFont(new java.awt.Font("Swis721 Blk BT", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Analisador Léxico");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(80, 320, 320, 20);

        jButtonLexico.setBackground(new java.awt.Color(0, 0, 0));
        jButtonLexico.setFont(new java.awt.Font("Swis721 Blk BT", 1, 18)); // NOI18N
        jButtonLexico.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLexico.setText("Analisar Léxico");
        jButtonLexico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLexicoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLexico);
        jButtonLexico.setBounds(830, 260, 280, 60);

        jButtonSintatico.setBackground(new java.awt.Color(0, 0, 0));
        jButtonSintatico.setFont(new java.awt.Font("Swis721 Blk BT", 1, 18)); // NOI18N
        jButtonSintatico.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSintatico.setText("Analisar Sintático");
        jButtonSintatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSintaticoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSintatico);
        jButtonSintatico.setBounds(830, 360, 280, 60);

        jButtonLimpar.setBackground(new java.awt.Color(0, 0, 0));
        jButtonLimpar.setFont(new java.awt.Font("Swis721 Blk BT", 1, 18)); // NOI18N
        jButtonLimpar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLimpar);
        jButtonLimpar.setBounds(830, 460, 280, 60);

        jButtonAnalisar.setBackground(new java.awt.Color(0, 0, 0));
        jButtonAnalisar.setFont(new java.awt.Font("Swis721 Blk BT", 1, 18)); // NOI18N
        jButtonAnalisar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAnalisar.setText("Léxico + Sintático");
        jButtonAnalisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnalisarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAnalisar);
        jButtonAnalisar.setBounds(830, 160, 280, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tela_principal/cb8e41a8a534de21fb11dc70a383e3cc.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1120, 660);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(30, 220, 610, 100);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tela_principal/cb8e41a8a534de21fb11dc70a383e3cc.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 890, 940);

        setSize(new java.awt.Dimension(1139, 683));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Analisador Lexico
    public void executar() throws Exception {
        int cont = 0;
        int coluna = 1;
        String expr;
        //jText = textArea1;

        AnalisadorLexico lexical = new AnalisadorLexico(new StringReader(txtEntrada.getText()));
        String resultado = "";

        while (true) {
            Token token = lexical.yylex();
            if (token == null) {
                System.out.println(resultado);
                txtSaidaLexico.setText(resultado);

                return;
            }
            switch (token) {

                case OPERADOR_ARITMETICO:

                    resultado = resultado + "Linha: " + cont + " <Operador_Aritmético> " + lexical.lexeme + " Coluna " + coluna + "\n";
                    coluna += lexical.lexeme.length();
                    break;

                case OPERADOR_LOGICO:
                    //cont ++;
                    resultado = resultado + "Linha: " + cont + " <Operador_Lógico> " + lexical.lexeme + " Coluna " + coluna + "\n";
                    coluna += lexical.lexeme.length();
                    break;

                case ATRIBUICAO:
                    //cont++;
                    resultado = resultado + "Linha: " + cont + " <Operador_Atribuição> " + lexical.lexeme + " Coluna " + coluna + "\n";
                    coluna += lexical.lexeme.length();
                    break;
                case FIM_COMANDO:
                    //cont++;
                    resultado = resultado + "Linha: " + cont + " <Fim_Programa> " + lexical.lexeme + " Coluna " + coluna + "\n";
                    coluna += lexical.lexeme.length();
                    break;
                case OPERADOR_RELACIONAL:
                    //cont++;
                    resultado = resultado + "Linha: " + cont + " <Operador_Relacional> " + lexical.lexeme + " Coluna " + coluna + "\n";
                    coluna += lexical.lexeme.length();
                    break;

                case COMENTARIO:
                    //cont++;
                    resultado = resultado + "Linha: " + cont + " <Comentario> " + lexical.lexeme + " Coluna " + coluna + "\n";
                    coluna += lexical.lexeme.length();
                    break;

                case LINHA:
                    cont++;
                    coluna = 1;
                    break;

                case ERROR:
                    //cont ++;                    
                    resultado = resultado + "Erro na linha " + cont + ": Símbolo não reconhecido" + lexical.lexeme.toString() + " Coluna " + coluna + "\n";
                    coluna += lexical.lexeme.length();
                    break;

                case ID:
                    //cont++;
                    resultado = resultado + "Linha: " + cont + " <ID> " + lexical.lexeme + " Coluna " + coluna + "\n";
                    coluna += lexical.lexeme.length();
                    break;

                case NUMEROS_REIAS:
                    //cont++;
                    resultado = resultado + "Linha: " + cont + " <Numeros_reais> " + lexical.lexeme + " Coluna " + coluna + "\n";
                    coluna += lexical.lexeme.length();
                    break;
                case TEXTO:
                    //cont++;
                    resultado = resultado + "Linha: " + cont + " <Texto> " + lexical.lexeme + " Coluna " + coluna + "\n";
                    coluna += lexical.lexeme.length();
                    break;
                case THEN:
                    //cont++;
                    resultado = resultado + "Linha: " + cont + " <Então> " + lexical.lexeme + " Coluna " + coluna + "\n";
                    coluna += lexical.lexeme.length();
                    break;
                case WHILE:
                    //cont++;
                    resultado = resultado + "Linha: " + cont + " <Laço> " + lexical.lexeme + " Coluna " + coluna + "\n";
                    coluna += lexical.lexeme.length();
                    break;
                case FOR:
                    //cont++;
                    resultado = resultado + "Linha: " + cont + " <Laço> " + lexical.lexeme + " Coluna " + coluna + "\n";
                    coluna += lexical.lexeme.length();
                    break;
                case IF:
                    //cont++;
                    resultado = resultado + "Linha: " + cont + " <Condicional> " + lexical.lexeme + " Coluna " + coluna + "\n";
                    coluna += lexical.lexeme.length();
                    break;
                case ELSE:
                    //cont++;
                    resultado = resultado + "Linha: " + cont + " <Condicional> " + lexical.lexeme + " Coluna " + coluna + "\n";
                    coluna += lexical.lexeme.length();
                    break;
                case NUMEROS_NATURAIS:
                    //cont++;
                    resultado = resultado + "Linha: " + cont + " <Numero> " + lexical.lexeme + " Coluna " + coluna + "\n";
                    coluna += lexical.lexeme.length();
                    break;
                case EXPOENTE:
                    //cont ++;
                    resultado = resultado + "Linha: " + cont + " <Expoente> " + lexical.lexeme + " Coluna " + coluna + "\n";
                    coluna += lexical.lexeme.length();
                    break;
                case CHAVE_INICIO:
                    //cont++;
                    resultado = resultado + "Linha: " + cont + " <Chave_Inicio> " + lexical.lexeme + " Coluna " + coluna + "\n";
                    coluna += lexical.lexeme.length();
                    break;
                case BRANCO:
                    coluna++;

                    break;
                case CHAVE_FIM:
                    //cont ++;
                    resultado = resultado + "Linha: " + cont + " <Chave_Fim> " + lexical.lexeme + " Coluna " + coluna + "\n";
                    coluna += lexical.lexeme.length();
                    break;
                case FIM_LINHA:
                    //cont ++;
                    resultado = resultado + "Linha: " + cont + " <Fim_linha> " + lexical.lexeme + " Coluna " + coluna + "\n";
                    coluna += lexical.lexeme.length();
                    break;
                case INICIO:
                    //cont ++;
                    resultado = resultado + "Linha: " + cont + " <Inicio_Programa> " + lexical.lexeme + " Coluna " + coluna + "\n";
                    coluna += lexical.lexeme.length();
                    break;
                case PARENTESES_INICIO:
                    //cont ++;
                    resultado = resultado + "Linha: " + cont + " <Parenteses_Inicio> " + lexical.lexeme + " Coluna " + coluna + "\n";
                    coluna += lexical.lexeme.length();
                    break;
                case PARENTESES_FIM:
                    //cont ++;
                    resultado = resultado + "Linha: " + cont + " <Parenteses_Fim> " + lexical.lexeme + " Coluna " + coluna + "\n";
                    coluna += lexical.lexeme.length();
                    break;
                default:
                    //cont ++;
                    resultado = resultado + "Linha: " + cont + " <" + lexical.lexeme + "> " + " Coluna " + coluna + "\n";
                    coluna += lexical.lexeme.length();
                    break;
            }
        }

    }

   public void executarSintatico() {
       
        try {
            p = new Parser(new Yylex(new StringReader(txtEntrada.getText())));
            p.parse();

            txtSaidaSintatico.setText("Sentença correta");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
            System.err.println(e);
            txtSaidaSintatico.setText(p.getErro());
        }
    }


    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        txtEntrada.setText("");
        txtSaidaLexico.setText("");
        txtSaidaSintatico.setText("");
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonLexicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLexicoActionPerformed
        AnalisadorLexico lexical = new AnalisadorLexico(new StringReader(txtEntrada.getText()));
        try {
            executar();
        } catch (Exception ex) {
            Logger.getLogger(LexicoSintatico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonLexicoActionPerformed

    private void jButtonSintaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSintaticoActionPerformed
        try {
            try (java.io.PrintWriter writer = new java.io.PrintWriter("sentenca.txt", "UTF-8")) {
                writer.print(txtEntrada.getText());
            } catch (FileNotFoundException | UnsupportedEncodingException e) {
            }
            executarSintatico();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButtonSintaticoActionPerformed

    private void jButtonAnalisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnalisarActionPerformed
        AnalisadorLexico lexical = new AnalisadorLexico(new StringReader(txtEntrada.getText()));
        try {
            executar();
        } catch (Exception ex) {
            Logger.getLogger(LexicoSintatico.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {

            executarSintatico();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButtonAnalisarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnalisar;
    private javax.swing.JButton jButtonLexico;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSintatico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextArea txtEntrada;
    private javax.swing.JTextArea txtSaidaLexico;
    private javax.swing.JTextArea txtSaidaSintatico;
    // End of variables declaration//GEN-END:variables
}

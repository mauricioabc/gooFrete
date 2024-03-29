package com.gooFrete.View;

import com.gooFrete.Translate.Internationalization;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javax.swing.SwingUtilities;

/**
 *
 * @author mauricio.rodrigues
 */
public class Janela extends javax.swing.JFrame {

    static Janela j;
    static JanelaHome p1;
    static JanelaCadastros p2;
    static JanelaCadastroTransportador p3;
    static JanelaCadastroVeiculo p4;
    static JanelaRotas p5;
    static JanelaRelatorios p6;
    public static ResourceBundle traducao;
    public static String selectLanguage;
    
    public Janela() {
        initComponents();
        
        this.setLayout(new BorderLayout());
        
        p1 = new JanelaHome();
        
        this.add(p1, BorderLayout.CENTER);
        this.pack();
    }

    public static void loadLanguage(String targetLanguage, String targetCountry){
        selectLanguage = targetLanguage + "_" + targetCountry;
        Internationalization traduzir = new Internationalization();
        Janela.traducao = traduzir.internacionaliza(targetLanguage, targetCountry);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        
        String targetLanguage, targetCountry;
        if(args.length != 2){ //Execução sem parâmetros
            targetLanguage = System.getProperty("user.language");
            targetCountry = System.getProperty("user.country");
        } else { //Execução com parâmetros
            targetLanguage = args[0];
            targetCountry = args[1];
        }
        
        //Avaliando traduções disponíveis
        ArrayList<String> traducoesDisponiveis = new ArrayList();
        traducoesDisponiveis.add("pt");
        traducoesDisponiveis.add("en");
        traducoesDisponiveis.add("es");
        traducoesDisponiveis.add("la");
        traducoesDisponiveis.add("fr");
        traducoesDisponiveis.add("it");
        traducoesDisponiveis.add("ja");
        traducoesDisponiveis.add("de");
        if (!traducoesDisponiveis.contains(targetLanguage)) {
            targetLanguage = "pt";
            targetCountry = "BR";
        }
        //Gerando tradução
        Janela.loadLanguage(targetLanguage, targetCountry);
        
        j = new Janela();
        j.setLocationRelativeTo(null);
        j.setVisible(true);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

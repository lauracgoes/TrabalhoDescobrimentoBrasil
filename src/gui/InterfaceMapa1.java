/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author Laura
 */
public class InterfaceMapa1 extends javax.swing.JFrame {

    /**
     * Creates new form InterfaceMapa
     */
    public InterfaceMapa1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelPontuacao = new javax.swing.JLabel();
        labelInformativa = new javax.swing.JLabel();
        botaoMapaSudeste = new javax.swing.JButton();
        botaoMapaNordeste = new javax.swing.JButton();
        botaoMapaNorte = new javax.swing.JButton();
        botaoMapaCentroOeste = new javax.swing.JButton();
        botaoMapaSul = new javax.swing.JButton();
        labelImagemMapa = new javax.swing.JLabel();
        botaoListaNorte = new javax.swing.JButton();
        botaoListaNordeste = new javax.swing.JButton();
        botaoListaCentroOeste = new javax.swing.JButton();
        botaoListaSul = new javax.swing.JButton();
        botaoListaSudeste = new javax.swing.JButton();
        campoPontuacao = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        labelPontuacao.setText("Pontuação nessa fase:");
        getContentPane().add(labelPontuacao);
        labelPontuacao.setBounds(340, 400, 120, 14);

        labelInformativa.setText("Escolha uma região no mapa e uma alternativa abaixo:");
        getContentPane().add(labelInformativa);
        labelInformativa.setBounds(200, -20, 290, 80);

        botaoMapaSudeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMapaSudesteActionPerformed(evt);
            }
        });
        getContentPane().add(botaoMapaSudeste);
        botaoMapaSudeste.setBounds(250, 230, 40, 30);
        getContentPane().add(botaoMapaNordeste);
        botaoMapaNordeste.setBounds(280, 120, 50, 40);
        getContentPane().add(botaoMapaNorte);
        botaoMapaNorte.setBounds(93, 70, 50, 40);
        getContentPane().add(botaoMapaCentroOeste);
        botaoMapaCentroOeste.setBounds(160, 190, 50, 40);
        getContentPane().add(botaoMapaSul);
        botaoMapaSul.setBounds(190, 310, 30, 20);

        labelImagemMapa.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bianca\\Desktop\\Projeto PCS\\Java_Mapa_Tela_Preta-Versão-Final-Fase-3-COM-INTERFACE\\Java_Mapa_Tela_Preta (Versão Final Fase 3)\\Mapa Fase 1.jpg")); // NOI18N
        getContentPane().add(labelImagemMapa);
        labelImagemMapa.setBounds(0, -50, 460, 490);

        botaoListaNorte.setText("Norte");
        botaoListaNorte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoListaNorteActionPerformed(evt);
            }
        });
        getContentPane().add(botaoListaNorte);
        botaoListaNorte.setBounds(430, 70, 100, 23);

        botaoListaNordeste.setText("Nordeste");
        getContentPane().add(botaoListaNordeste);
        botaoListaNordeste.setBounds(430, 110, 100, 23);

        botaoListaCentroOeste.setText("Centro-Oeste");
        getContentPane().add(botaoListaCentroOeste);
        botaoListaCentroOeste.setBounds(430, 150, 100, 23);

        botaoListaSul.setText("Sul");
        getContentPane().add(botaoListaSul);
        botaoListaSul.setBounds(430, 190, 100, 23);

        botaoListaSudeste.setText("Sudeste");
        getContentPane().add(botaoListaSudeste);
        botaoListaSudeste.setBounds(430, 230, 100, 23);
        getContentPane().add(campoPontuacao);
        campoPontuacao.setBounds(460, 390, 40, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoMapaSudesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMapaSudesteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoMapaSudesteActionPerformed

    private void botaoListaNorteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoListaNorteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoListaNorteActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceMapa1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceMapa1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceMapa1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceMapa1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceMapa1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoListaCentroOeste;
    private javax.swing.JButton botaoListaNordeste;
    private javax.swing.JButton botaoListaNorte;
    private javax.swing.JButton botaoListaSudeste;
    private javax.swing.JButton botaoListaSul;
    private javax.swing.JButton botaoMapaCentroOeste;
    private javax.swing.JButton botaoMapaNordeste;
    private javax.swing.JButton botaoMapaNorte;
    private javax.swing.JButton botaoMapaSudeste;
    private javax.swing.JButton botaoMapaSul;
    private javax.swing.JTextField campoPontuacao;
    private javax.swing.JLabel labelImagemMapa;
    private javax.swing.JLabel labelInformativa;
    private javax.swing.JLabel labelPontuacao;
    // End of variables declaration//GEN-END:variables
}

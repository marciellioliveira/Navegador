/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navegador;

import java.beans.PropertyVetoException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Marcielli
 */
public class Navegador extends javax.swing.JFrame {

    /**
     * Creates new form Teste
     */
    public Navegador() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelBG = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanelBGAcimaDasAbas = new javax.swing.JPanel();
        jDesktopPaneBG = new javax.swing.JDesktopPane();
        jButtonVoltar = new javax.swing.JButton();
        jButtonAvancar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jButtonEnter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPaneBGLayout = new javax.swing.GroupLayout(jDesktopPaneBG);
        jDesktopPaneBG.setLayout(jDesktopPaneBGLayout);
        jDesktopPaneBGLayout.setHorizontalGroup(
            jDesktopPaneBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 841, Short.MAX_VALUE)
        );
        jDesktopPaneBGLayout.setVerticalGroup(
            jDesktopPaneBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        jButtonVoltar.setText("<-");

        jButtonAvancar.setText("->");

        jButton2.setText("@");

        jButton3.setText("^");

        jTextFieldPesquisa.setText("www.facebook.com.br");
        jTextFieldPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesquisaActionPerformed(evt);
            }
        });

        jButtonEnter.setText(";)");
        jButtonEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBGAcimaDasAbasLayout = new javax.swing.GroupLayout(jPanelBGAcimaDasAbas);
        jPanelBGAcimaDasAbas.setLayout(jPanelBGAcimaDasAbasLayout);
        jPanelBGAcimaDasAbasLayout.setHorizontalGroup(
            jPanelBGAcimaDasAbasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPaneBG)
            .addGroup(jPanelBGAcimaDasAbasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAvancar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPesquisa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelBGAcimaDasAbasLayout.setVerticalGroup(
            jPanelBGAcimaDasAbasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBGAcimaDasAbasLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanelBGAcimaDasAbasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEnter)
                    .addComponent(jButtonVoltar)
                    .addComponent(jButtonAvancar)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jTextFieldPesquisa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDesktopPaneBG))
        );

        jTabbedPane2.addTab("tab1", jPanelBGAcimaDasAbas);

        javax.swing.GroupLayout jPanelBGLayout = new javax.swing.GroupLayout(jPanelBG);
        jPanelBG.setLayout(jPanelBGLayout);
        jPanelBGLayout.setHorizontalGroup(
            jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        jPanelBGLayout.setVerticalGroup(
            jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisaActionPerformed
        
        jButtonEnterActionPerformed(evt);
       
    }//GEN-LAST:event_jTextFieldPesquisaActionPerformed

    private void jButtonEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnterActionPerformed
        //tentar deixar fazer login com o ping tb
        
        if((jTextFieldPesquisa.getText().equals("www.facebook.com.br")) || (jTextFieldPesquisa.getText().equals("facebook.com.br")) || (jTextFieldPesquisa.getText().equals("31.13.85.36"))) {
                
            Facebook obj1=new Facebook();
            jDesktopPaneBG.add(obj1);
            try{
                obj1.setMaximum(true);
                obj1.setVisible(true);
            obj1.setPosicao();
            } catch (PropertyVetoException e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }
            

        } else if ((jTextFieldPesquisa.getText().equals("www.google.com.br")) || (jTextFieldPesquisa.getText().equals("google.com.br")) || (jTextFieldPesquisa.getText().equals("172.217.29.67"))) { //fazer || .com

            Google obj2=new Google();
            jDesktopPaneBG.add(obj2);
            try{
                obj2.setMaximum(true);
                obj2.setVisible(true);
            obj2.setPosicao();
            } catch (PropertyVetoException e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }

        } else if (jTextFieldPesquisa.getText().equals("www.tecgirl.com.br")) {

            TecGirl obj3=new TecGirl();
            jDesktopPaneBG.add(obj3);
            try{
                obj3.setMaximum(true);
                obj3.setVisible(true);
            obj3.setPosicao();
            } catch (PropertyVetoException e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }

        } else if (jTextFieldPesquisa.getText().equals("www.fateccruzeiro.edu.br")) {

            FatecCruzeiro obj4=new FatecCruzeiro();
            jDesktopPaneBG.add(obj4);
            try{
                obj4.setMaximum(true);
                obj4.setVisible(true);
            obj4.setPosicao();
            } catch (PropertyVetoException e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }

        }

        //
        //        else {
            //
            //            JOptionPane.showMessageDialog(rootPane, "Você errou o site. Digite www.facebook.com.br na barra de pesquisa");
            //
            //        }
    }//GEN-LAST:event_jButtonEnterActionPerformed

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
            java.util.logging.Logger.getLogger(Navegador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Navegador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Navegador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Navegador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Navegador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonAvancar;
    private javax.swing.JButton jButtonEnter;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JDesktopPane jDesktopPaneBG;
    private javax.swing.JPanel jPanelBG;
    private javax.swing.JPanel jPanelBGAcimaDasAbas;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextFieldPesquisa;
    // End of variables declaration//GEN-END:variables
}

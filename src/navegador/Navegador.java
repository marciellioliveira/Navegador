/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navegador;

import java.beans.PropertyVetoException;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

/**
 *
 * @author Marcielli
 */
public class Navegador extends javax.swing.JFrame {
    
    public boolean index = false;

    /**
     * Creates new form Teste
     */
    public Navegador() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        
        this.aplicarPaginaInicial();
        
    }
    
    
    private void aplicarPaginaInicial() {
        
      //  Usar esse código para quando o usuario favoritar aparecer na tela pricipal a primeira pag
        
        Google google = new Google();
        jDesktopPaneBG1.add(google);
        try {
            
            google.setMaximum(true);            
            google.setVisible(true);
            
        } catch (PropertyVetoException e) {
            JOptionPane.showMessageDialog(rootPane, "Erro");
        }
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
        jPanel2 = new javax.swing.JPanel();
        jPanelBG = new javax.swing.JPanel();
        jTabbedPaneNovaGuia = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jDesktopPaneBG1 = new javax.swing.JDesktopPane();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPaneNovaGuia.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTabbedPaneNovaGuiaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jTabbedPaneNovaGuia.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPaneNovaGuiaStateChanged(evt);
            }
        });
        jTabbedPaneNovaGuia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPaneNovaGuiaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPaneBG1Layout = new javax.swing.GroupLayout(jDesktopPaneBG1);
        jDesktopPaneBG1.setLayout(jDesktopPaneBG1Layout);
        jDesktopPaneBG1Layout.setHorizontalGroup(
            jDesktopPaneBG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 841, Short.MAX_VALUE)
        );
        jDesktopPaneBG1Layout.setVerticalGroup(
            jDesktopPaneBG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPaneBG1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPaneBG1)
        );

        jTabbedPaneNovaGuia.addTab("Nova Guia", jPanel3);

        javax.swing.GroupLayout jPanelBGLayout = new javax.swing.GroupLayout(jPanelBG);
        jPanelBG.setLayout(jPanelBGLayout);
        jPanelBGLayout.setHorizontalGroup(
            jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneNovaGuia)
        );
        jPanelBGLayout.setVerticalGroup(
            jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneNovaGuia)
        );

        jTabbedPaneNovaGuia.getAccessibleContext().setAccessibleName("Nova Guia");

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

    private void jTabbedPaneNovaGuiaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTabbedPaneNovaGuiaAncestorAdded
        
    }//GEN-LAST:event_jTabbedPaneNovaGuiaAncestorAdded

    private void jTabbedPaneNovaGuiaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPaneNovaGuiaStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPaneNovaGuiaStateChanged

    private void jTabbedPaneNovaGuiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPaneNovaGuiaMouseClicked
        if(jTabbedPaneNovaGuia.getSelectedIndex() == 0) {
        
        //abrir nova tab do lado escrito nova guia e quando eu digitar o site o nova guia muda pro nome do site ex Facebook (talvez icone tb)
       
        try {
            JInternalFrameBGDesktopPane novojif = new JInternalFrameBGDesktopPane();
            jDesktopPaneBG1.add(novojif);
            
            novojif.setMaximum(true);            
            novojif.setVisible(true);
            
            
        } catch (PropertyVetoException e) {
            JOptionPane.showMessageDialog(rootPane, "Erro");
        }
        }

    }//GEN-LAST:event_jTabbedPaneNovaGuiaMouseClicked

  
    
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
    private javax.swing.JDesktopPane jDesktopPaneBG1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelBG;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPaneNovaGuia;
    // End of variables declaration//GEN-END:variables
}

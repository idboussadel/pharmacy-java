/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author 21270
 */
public class MainPage extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public MainPage() {
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

        btngeststck = new javax.swing.JButton();
        btngestVente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        butongestfournisseur = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btngeststck.setBackground(new java.awt.Color(51, 170, 0));
        btngeststck.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        btngeststck.setForeground(new java.awt.Color(255, 255, 255));
        btngeststck.setText("Gestion stock");
        btngeststck.setBorderPainted(false);
        btngeststck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btngeststckMouseClicked(evt);
            }
        });
        btngeststck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngeststckActionPerformed(evt);
            }
        });
        getContentPane().add(btngeststck, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 334, 70));

        btngestVente.setBackground(new java.awt.Color(51, 170, 0));
        btngestVente.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        btngestVente.setForeground(new java.awt.Color(255, 255, 255));
        btngestVente.setText("Gestion vente");
        btngestVente.setBorderPainted(false);
        btngestVente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btngestVenteMouseClicked(evt);
            }
        });
        btngestVente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngestVenteActionPerformed(evt);
            }
        });
        getContentPane().add(btngestVente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 333, 70));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(747, 142, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PAGEREF.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 741, -1));

        butongestfournisseur.setBackground(new java.awt.Color(51, 170, 0));
        butongestfournisseur.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        butongestfournisseur.setForeground(new java.awt.Color(255, 255, 255));
        butongestfournisseur.setText("Gestion des fournisseurs");
        butongestfournisseur.setOpaque(true);
        butongestfournisseur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butongestfournisseurMouseClicked(evt);
            }
        });
        butongestfournisseur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butongestfournisseurActionPerformed(evt);
            }
        });
        getContentPane().add(butongestfournisseur, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, -1, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btngeststckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngeststckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btngeststckActionPerformed

    private void btngestVenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngestVenteActionPerformed
    }//GEN-LAST:event_btngestVenteActionPerformed

    private void btngestVenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btngestVenteMouseClicked
       gestionvente gestionvente = new gestionvente();
       gestionvente.setVisible(true);
       gestionvente.setLocationRelativeTo(null);
       this.dispose();
    }//GEN-LAST:event_btngestVenteMouseClicked

    private void btngeststckMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btngeststckMouseClicked
       gestionstock1 gestionstock1 = new gestionstock1();
       gestionstock1.setVisible(true);
       gestionstock1.setLocationRelativeTo(null);
       this.dispose();
    }//GEN-LAST:event_btngeststckMouseClicked

    private void butongestfournisseurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butongestfournisseurActionPerformed
      
    }//GEN-LAST:event_butongestfournisseurActionPerformed

    private void butongestfournisseurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butongestfournisseurMouseClicked
       Gestionfournisseurs Gestionfournisseurs = new Gestionfournisseurs();
       Gestionfournisseurs.setVisible(true);
       Gestionfournisseurs.setLocationRelativeTo(null);
       this.dispose();
    }//GEN-LAST:event_butongestfournisseurMouseClicked

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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainPage MainPage = new MainPage();
                MainPage.setVisible(true);
                MainPage.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btngestVente;
    private javax.swing.JButton btngeststck;
    private javax.swing.JButton butongestfournisseur;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}

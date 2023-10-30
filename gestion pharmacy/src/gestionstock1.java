/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author user
 */
public class gestionstock1 extends javax.swing.JFrame {

    /**
     * Creates new form gestionstock1
     */
    public gestionstock1() {
        initComponents();
        remplirTableMedicaments();
    }
    

    // Fonction pour remplir la table jTable1 avec les données des médicaments
    private void remplirTableMedicaments() {
        DefaultTableModel model = (DefaultTableModel) tablemedicaments.getModel();
        model.setRowCount(0); // Réinitialiser les lignes de la table
        
        // Connexion à la base de données
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/pharmacie", "root", "")) {
            String sql = "SELECT libelle_medic, code_medic, prix_unitaire, quantite FROM medicament";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String libelle = rs.getString("libelle_medic");
                int code = rs.getInt("code_medic");
                double prix = rs.getDouble("prix_unitaire");
                int quantite = rs.getInt("quantite");

                // Ajouter une nouvelle ligne avec les données du médicament
                model.addRow(new Object[]{libelle, code, prix, quantite});
            }
        } catch (SQLException e) {
            e.printStackTrace();
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

        jLabel1 = new javax.swing.JLabel();
        SupprimerMed = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablemedicaments = new javax.swing.JTable();
        ajouterMed = new javax.swing.JButton();
        modifierMed = new javax.swing.JButton();
        rechercheMed = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnaccueil = new javax.swing.JButton();
        btnprec = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PAGEREF.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 741, -1));

        SupprimerMed.setBackground(new java.awt.Color(51, 170, 0));
        SupprimerMed.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        SupprimerMed.setForeground(new java.awt.Color(255, 255, 255));
        SupprimerMed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supprimer.png"))); // NOI18N
        SupprimerMed.setText("Supprimer med");
        SupprimerMed.setBorderPainted(false);
        SupprimerMed.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        SupprimerMed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SupprimerMedMouseClicked(evt);
            }
        });
        SupprimerMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupprimerMedActionPerformed(evt);
            }
        });
        getContentPane().add(SupprimerMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 240, 41));

        tablemedicaments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "medicament", "code", "prix unitaire", "quantité"
            }
        ));
        jScrollPane1.setViewportView(tablemedicaments);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 285, 420, 230));

        ajouterMed.setBackground(new java.awt.Color(51, 170, 0));
        ajouterMed.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ajouterMed.setForeground(new java.awt.Color(255, 255, 255));
        ajouterMed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ajouter.png"))); // NOI18N
        ajouterMed.setText("Ajouter med");
        ajouterMed.setBorderPainted(false);
        ajouterMed.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ajouterMed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ajouterMedMouseClicked(evt);
            }
        });
        ajouterMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterMedActionPerformed(evt);
            }
        });
        getContentPane().add(ajouterMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 285, 240, 41));

        modifierMed.setBackground(new java.awt.Color(51, 170, 0));
        modifierMed.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        modifierMed.setForeground(new java.awt.Color(255, 255, 255));
        modifierMed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modifier.png"))); // NOI18N
        modifierMed.setText("modifier med");
        modifierMed.setBorderPainted(false);
        modifierMed.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        modifierMed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modifierMedMouseClicked(evt);
            }
        });
        modifierMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierMedActionPerformed(evt);
            }
        });
        getContentPane().add(modifierMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 240, 41));

        rechercheMed.setBackground(new java.awt.Color(51, 170, 0));
        rechercheMed.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        rechercheMed.setForeground(new java.awt.Color(255, 255, 255));
        rechercheMed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chercher.png"))); // NOI18N
        rechercheMed.setText("Recherche med");
        rechercheMed.setBorderPainted(false);
        rechercheMed.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rechercheMed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rechercheMedMouseClicked(evt);
            }
        });
        rechercheMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechercheMedActionPerformed(evt);
            }
        });
        getContentPane().add(rechercheMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 240, 41));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel2.setText("Gestion de Stock");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 281, 31));

        btnaccueil.setBackground(new java.awt.Color(0, 204, 0));
        btnaccueil.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        btnaccueil.setForeground(new java.awt.Color(255, 255, 255));
        btnaccueil.setText("Page d'acceuil");
        btnaccueil.setBorderPainted(false);
        btnaccueil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnaccueilMouseClicked(evt);
            }
        });
        btnaccueil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaccueilActionPerformed(evt);
            }
        });
        getContentPane().add(btnaccueil, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 250, 41));

        btnprec.setBackground(new java.awt.Color(0, 204, 0));
        btnprec.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        btnprec.setForeground(new java.awt.Color(255, 255, 255));
        btnprec.setText("Page précedente");
        btnprec.setBorderPainted(false);
        btnprec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnprecMouseClicked(evt);
            }
        });
        btnprec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprecActionPerformed(evt);
            }
        });
        getContentPane().add(btnprec, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 250, 41));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SupprimerMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupprimerMedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SupprimerMedActionPerformed

    private void ajouterMedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouterMedMouseClicked
       ajoutermeddicament1 ajoutermeddicament1 = new ajoutermeddicament1();
       ajoutermeddicament1.setVisible(true);
       ajoutermeddicament1.setLocationRelativeTo(null);
       this.dispose();
    }//GEN-LAST:event_ajouterMedMouseClicked

    private void ajouterMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterMedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ajouterMedActionPerformed

    private void modifierMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierMedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modifierMedActionPerformed

    private void rechercheMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechercheMedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rechercheMedActionPerformed

    private void btnaccueilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnaccueilMouseClicked
       MainPage MainPage = new MainPage();
       MainPage.setVisible(true);
       MainPage.setLocationRelativeTo(null);
       this.dispose();
    }//GEN-LAST:event_btnaccueilMouseClicked

    private void btnaccueilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaccueilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnaccueilActionPerformed

    private void btnprecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnprecMouseClicked
       MainPage MainPage = new MainPage();
       MainPage.setVisible(true);
       MainPage.setLocationRelativeTo(null);
       this.dispose();
    }//GEN-LAST:event_btnprecMouseClicked

    private void btnprecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnprecActionPerformed

    private void rechercheMedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rechercheMedMouseClicked
       recherchemedicament1 recherchemedicament1 = new recherchemedicament1();
       recherchemedicament1.setVisible(true);
       recherchemedicament1.setLocationRelativeTo(null);
       this.dispose();
    }//GEN-LAST:event_rechercheMedMouseClicked

    private void SupprimerMedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupprimerMedMouseClicked
       supprimermedicament1 supprimermedicament1 = new supprimermedicament1();
       supprimermedicament1.setVisible(true);
       supprimermedicament1.setLocationRelativeTo(null);
       this.dispose();
    }//GEN-LAST:event_SupprimerMedMouseClicked

    private void modifierMedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifierMedMouseClicked
       modifiermedicament1 modifiermedicament1 = new modifiermedicament1();
       modifiermedicament1.setVisible(true);
       modifiermedicament1.setLocationRelativeTo(null);
       this.dispose();
    }//GEN-LAST:event_modifierMedMouseClicked

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
            java.util.logging.Logger.getLogger(gestionstock1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gestionstock1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gestionstock1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gestionstock1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gestionstock1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SupprimerMed;
    private javax.swing.JButton ajouterMed;
    private javax.swing.JButton btnaccueil;
    private javax.swing.JButton btnprec;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modifierMed;
    private javax.swing.JButton rechercheMed;
    private javax.swing.JTable tablemedicaments;
    // End of variables declaration//GEN-END:variables
}

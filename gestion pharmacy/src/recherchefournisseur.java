/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class recherchefournisseur extends javax.swing.JFrame {

    /**
     * Creates new form recherchefournisseur
     */
    public recherchefournisseur() {
        initComponents();
        btnrecherchefournisseur.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String codeFournisseur = inputcherchefournisseur.getText();

            if (codeFournisseur.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Veuillez saisir le code du fournisseur à rechercher");
                return;
            }

            String[] fournisseurInfo = getFournisseurInfo(codeFournisseur);

            if (fournisseurInfo != null) {
                DefaultTableModel model = (DefaultTableModel) tablefournisseurcherche.getModel();
                model.setRowCount(0);
                model.addRow(fournisseurInfo);
            } else {
                JOptionPane.showMessageDialog(null, "Le fournisseur avec le code " + codeFournisseur + " n'a pas été trouvé");
            }
        }
    });
    }
    public String[] getFournisseurInfo(String codeFournisseur) {
    String[] fournisseurInfo = null;

    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacie", "root", "")) {
        String query = "SELECT * FROM fournisseur WHERE code_fournisseur = ?";
        PreparedStatement statement = conn.prepareStatement(query);
        statement.setString(1, codeFournisseur);

        ResultSet resultSet = statement.executeQuery();

        if (resultSet.next()) {
            // Récupérer les informations du fournisseur
            String code = resultSet.getString("code_fournisseur");
            String prenom = resultSet.getString("prenom_fournisseur");
            String nom = resultSet.getString("nom_fournisseur");
            int age = resultSet.getInt("age_fournisseur");
            String telephone = resultSet.getString("telephone_fournisseur");
            String adresse = resultSet.getString("addresse_fournisseur");

            fournisseurInfo = new String[]{code, prenom, nom, String.valueOf(age), telephone, adresse};
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    }

    return fournisseurInfo;
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
        inputcherchefournisseur = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablefournisseurcherche = new javax.swing.JTable();
        btnprec = new javax.swing.JButton();
        btnaccueil = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnrecherchefournisseur = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PAGEREF.jpg"))); // NOI18N

        inputcherchefournisseur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputcherchefournisseurActionPerformed(evt);
            }
        });

        tablefournisseurcherche.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "code", "prenom", "nom", "age", "telephone", "addresse"
            }
        ));
        jScrollPane1.setViewportView(tablefournisseurcherche);

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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel2.setText("Saisir code fournisseur :");

        btnrecherchefournisseur.setBackground(new java.awt.Color(51, 170, 0));
        btnrecherchefournisseur.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        btnrecherchefournisseur.setForeground(new java.awt.Color(255, 255, 255));
        btnrecherchefournisseur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chercher.png"))); // NOI18N
        btnrecherchefournisseur.setText("chercheer fournisseur");
        btnrecherchefournisseur.setBorderPainted(false);
        btnrecherchefournisseur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrecherchefournisseurActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(183, 183, 183)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(inputcherchefournisseur, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(91, 91, 91)
                            .addComponent(btnrecherchefournisseur, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(btnprec, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnaccueil, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnaccueil, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnprec, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(inputcherchefournisseur, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnrecherchefournisseur, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputcherchefournisseurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputcherchefournisseurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputcherchefournisseurActionPerformed

    private void btnprecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnprecMouseClicked
        Gestionfournisseurs Gestionfournisseurs = new Gestionfournisseurs();
        Gestionfournisseurs.setVisible(true);
        Gestionfournisseurs.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnprecMouseClicked

    private void btnprecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnprecActionPerformed

    private void btnaccueilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnaccueilMouseClicked
        MainPage MainPage = new MainPage();
        MainPage.setVisible(true);
        MainPage.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnaccueilMouseClicked

    private void btnaccueilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaccueilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnaccueilActionPerformed

    private void btnrecherchefournisseurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrecherchefournisseurActionPerformed
        
    }//GEN-LAST:event_btnrecherchefournisseurActionPerformed

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
            java.util.logging.Logger.getLogger(recherchefournisseur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(recherchefournisseur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(recherchefournisseur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(recherchefournisseur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new recherchefournisseur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaccueil;
    private javax.swing.JButton btnprec;
    private javax.swing.JButton btnrecherchefournisseur;
    private javax.swing.JTextField inputcherchefournisseur;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablefournisseurcherche;
    // End of variables declaration//GEN-END:variables
}

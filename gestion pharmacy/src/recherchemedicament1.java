/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author user
 */
public class recherchemedicament1 extends javax.swing.JFrame {

    /**
     * Creates new form recherchemedicament1
     */
    public recherchemedicament1() {
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

        jLabel1 = new javax.swing.JLabel();
        btnaccueil = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnrecherchemed = new javax.swing.JButton();
        inputcodemed = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablemedicamentcherche = new javax.swing.JTable();
        btnprec = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PAGEREF.jpg"))); // NOI18N

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
        jLabel2.setText("Saisir code medicament :");

        btnrecherchemed.setBackground(new java.awt.Color(51, 170, 0));
        btnrecherchemed.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        btnrecherchemed.setForeground(new java.awt.Color(255, 255, 255));
        btnrecherchemed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chercher.png"))); // NOI18N
        btnrecherchemed.setText("Recherche medicament");
        btnrecherchemed.setBorderPainted(false);
        btnrecherchemed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrecherchemedActionPerformed(evt);
            }
        });

        inputcodemed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputcodemedActionPerformed(evt);
            }
        });

        tablemedicamentcherche.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablemedicamentcherche);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnprec, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnaccueil, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(inputcodemed, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(btnrecherchemed, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnaccueil, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnprec, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(inputcodemed, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnrecherchemed, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaccueilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnaccueilMouseClicked
        MainPage MainPage = new MainPage();
       MainPage.setVisible(true);
       MainPage.setLocationRelativeTo(null);
       this.dispose();
    }//GEN-LAST:event_btnaccueilMouseClicked

    private void btnaccueilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaccueilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnaccueilActionPerformed

    private void btnrecherchemedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrecherchemedActionPerformed
      String codeMedicament = inputcodemed.getText();


   

    try (Connection connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacie", "root", "")) {
        String query = "SELECT libelle_medic, code_medic, prix_unitaire, quantite FROM Medicament WHERE code_medic = ?";
        PreparedStatement statement = connexion.prepareStatement(query);
        statement.setString(1, codeMedicament);
        ResultSet resultSet = statement.executeQuery();

        DefaultTableModel model = (DefaultTableModel) tablemedicamentcherche.getModel();
        model.setRowCount(0);

        if (resultSet.next()) {
            String libelleMedic = resultSet.getString("libelle_medic");
            int codeMedic = resultSet.getInt("code_medic");
            double prixUnitaire = resultSet.getDouble("prix_unitaire");
            int quantite = resultSet.getInt("quantite");

            model.addRow(new Object[]{libelleMedic, codeMedic, prixUnitaire, quantite});
        } else {
            JOptionPane.showMessageDialog(null, "Aucun médicament trouvé avec le code spécifié.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_btnrecherchemedActionPerformed

    private void inputcodemedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputcodemedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputcodemedActionPerformed

    private void btnprecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnprecMouseClicked
       gestionstock1 gestionstock1 = new gestionstock1();
       gestionstock1.setVisible(true);
       gestionstock1.setLocationRelativeTo(null);
       this.dispose();
    }//GEN-LAST:event_btnprecMouseClicked

    private void btnprecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnprecActionPerformed

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
            java.util.logging.Logger.getLogger(recherchemedicament1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(recherchemedicament1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(recherchemedicament1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(recherchemedicament1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new recherchemedicament1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaccueil;
    private javax.swing.JButton btnprec;
    private javax.swing.JButton btnrecherchemed;
    private javax.swing.JTextField inputcodemed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablemedicamentcherche;
    // End of variables declaration//GEN-END:variables
}

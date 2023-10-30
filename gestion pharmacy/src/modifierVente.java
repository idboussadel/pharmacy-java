/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;



/**
 *
 * @author user
 */
public class modifierVente extends javax.swing.JFrame {

    /**
     * Creates new form modifierVente
     */
    public modifierVente() {
        initComponents();
    }
    
    private int getAncienneQuantite(Connection connexion, int numVente) throws SQLException {
    String query = "SELECT quantite_vendue FROM vente WHERE num_vente = ?";
    try (PreparedStatement statement = connexion.prepareStatement(query)) {
        statement.setInt(1, numVente);
        try (ResultSet resultSet = statement.executeQuery()) {
            if (resultSet.next()) {
                return resultSet.getInt("quantite_vendue");
            }
        }
    }
    return 0;
}

private int getCodeMedicament(Connection connexion, int numVente) throws SQLException {
    String query = "SELECT code_medic FROM vente WHERE num_vente = ?";
    try (PreparedStatement statement = connexion.prepareStatement(query)) {
        statement.setInt(1, numVente);
        try (ResultSet resultSet = statement.executeQuery()) {
            if (resultSet.next()) {
                return resultSet.getInt("code_medic");
            }
        }
    }
    return 0;
}

private int getQuantiteStock(Connection connexion, int codeMedic) throws SQLException {
    String query = "SELECT quantite FROM medicament WHERE code_medic = ?";
    try (PreparedStatement statement = connexion.prepareStatement(query)) {
        statement.setInt(1, codeMedic);
        try (ResultSet resultSet = statement.executeQuery()) {
            if (resultSet.next()) {
                return resultSet.getInt("quantite");
            }
        }
    }
    return 0;
}

private void updateQuantiteVente(Connection connexion, int numVente, int nouvelleQuantite) throws SQLException {
    String query = "UPDATE vente SET quantite_vendue = ? WHERE num_vente = ?";
    try (PreparedStatement statement = connexion.prepareStatement(query)) {
        statement.setInt(1, nouvelleQuantite);
        statement.setInt(2, numVente);
        statement.executeUpdate();
    }
}

private void updateQuantiteMedicament(Connection connexion, int codeMedic, int differenceQuantite) throws SQLException {
    String query = "UPDATE medicament SET quantite = quantite + ? WHERE code_medic = ?";
    try (PreparedStatement statement = connexion.prepareStatement(query)) { 
        statement.setInt(1, differenceQuantite);
        statement.setInt(2, codeMedic);
        statement.executeUpdate();
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
        btnprec = new javax.swing.JLabel();
        btnaccueil = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        inputnumvente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        inputquantite = new javax.swing.JTextField();
        btnmodifiervente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(741, 617));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PAGEREF.jpg"))); // NOI18N

        btnprec.setBackground(new java.awt.Color(0, 204, 0));
        btnprec.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnprec.setForeground(new java.awt.Color(255, 255, 255));
        btnprec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnprec.setText("Page precedente");
        btnprec.setOpaque(true);
        btnprec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnprecMouseClicked(evt);
            }
        });

        btnaccueil.setBackground(new java.awt.Color(0, 204, 0));
        btnaccueil.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnaccueil.setForeground(new java.awt.Color(255, 255, 255));
        btnaccueil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnaccueil.setText("Page d'accueil");
        btnaccueil.setOpaque(true);
        btnaccueil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnaccueilMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setText("La modification d'une vente:");

        jLabel5.setBackground(new java.awt.Color(0, 150, 51));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("numero vente");
        jLabel5.setOpaque(true);

        jLabel8.setBackground(new java.awt.Color(0, 150, 51));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("la nouvelle quantite vendue");
        jLabel8.setOpaque(true);

        btnmodifiervente.setBackground(new java.awt.Color(51, 170, 0));
        btnmodifiervente.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnmodifiervente.setForeground(new java.awt.Color(255, 255, 255));
        btnmodifiervente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modifier.png"))); // NOI18N
        btnmodifiervente.setText("Modifier la Vente");
        btnmodifiervente.setOpaque(true);
        btnmodifiervente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodifierventeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnprec, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnaccueil, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(222, 222, 222)
                            .addComponent(jLabel4)
                            .addGap(156, 156, 156))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(53, 53, 53)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(64, 64, 64)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(inputnumvente, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inputquantite, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(btnmodifiervente, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnprec, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnaccueil, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jLabel4)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputnumvente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputquantite, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(btnmodifiervente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnprecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnprecMouseClicked
      gestionvente gestionvente = new gestionvente();
      gestionvente.setVisible(true);
      gestionvente.setLocationRelativeTo(null);
      this.dispose();
    }//GEN-LAST:event_btnprecMouseClicked

    private void btnaccueilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnaccueilMouseClicked
        MainPage MainPage = new MainPage();
        MainPage.setVisible(true);
        MainPage.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnaccueilMouseClicked

    private void btnmodifierventeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodifierventeActionPerformed
   String numVenteStr = inputnumvente.getText();
    String nouvelleQuantiteStr = inputquantite.getText();
    
    // Vérifier si les inputs sont vides
    if (numVenteStr.isEmpty() || nouvelleQuantiteStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Veuillez remplir tous les champs.");
        return;
    }
    
    // Vérifier si les inputs sont des entiers valides
    int numVente, nouvelleQuantite;
    try {
        numVente = Integer.parseInt(numVenteStr);
        nouvelleQuantite = Integer.parseInt(nouvelleQuantiteStr);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Veuillez saisir des valeurs entières valides.");
        return;
    }

    try (Connection connexion = DriverManager.getConnection("jdbc:mysql://localhost/pharmacie", "root", "")) {
        int ancienneQuantite = getAncienneQuantite(connexion, numVente);
        int codeMedic = getCodeMedicament(connexion, numVente);
        int quantiteStock = getQuantiteStock(connexion, codeMedic);
        int differenceQuantite = nouvelleQuantite - ancienneQuantite;
        
        
        if (quantiteStock >= differenceQuantite) {
            updateQuantiteVente(connexion, numVente, nouvelleQuantite);
            updateQuantiteMedicament(connexion, codeMedic, -differenceQuantite);
            JOptionPane.showMessageDialog(this, "La vente a été modifiée avec succès.");
        } else {
            JOptionPane.showMessageDialog(this, "Quantité ou le numéro de vente est invalide.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    }//GEN-LAST:event_btnmodifierventeActionPerformed

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
            java.util.logging.Logger.getLogger(modifierVente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modifierVente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modifierVente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modifierVente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new modifierVente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnaccueil;
    private javax.swing.JButton btnmodifiervente;
    private javax.swing.JLabel btnprec;
    private javax.swing.JTextField inputnumvente;
    private javax.swing.JTextField inputquantite;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}

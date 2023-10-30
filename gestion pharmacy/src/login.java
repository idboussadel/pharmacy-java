import java.sql.*;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class login extends javax.swing.JFrame {

    
    public login() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panellogin = new javax.swing.JPanel();
        lblclose = new javax.swing.JLabel();
        lblminimize = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        btnlogin = new javax.swing.JButton();
        lblregister = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 290));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panellogin.setBackground(new java.awt.Color(255, 255, 255));

        lblclose.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        lblclose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblclose.setText("X");
        lblclose.setBorder(new javax.swing.border.MatteBorder(null));
        lblclose.setPreferredSize(new java.awt.Dimension(20, 20));
        lblclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblcloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblcloseMouseExited(evt);
            }
        });

        lblminimize.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblminimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblminimize.setText("-");
        lblminimize.setBorder(new javax.swing.border.MatteBorder(null));
        lblminimize.setPreferredSize(new java.awt.Dimension(20, 20));
        lblminimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblminimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblminimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblminimizeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelloginLayout = new javax.swing.GroupLayout(panellogin);
        panellogin.setLayout(panelloginLayout);
        panelloginLayout.setHorizontalGroup(
            panelloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelloginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblminimize, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblclose, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelloginLayout.setVerticalGroup(
            panelloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelloginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblclose, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblminimize, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        getContentPane().add(panellogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 70, 120));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Username :");
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 255)));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 200, 35));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Password :");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 255)));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 200, 35));

        txtUsername.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 200, 35));

        btnlogin.setBackground(new java.awt.Color(51, 170, 0));
        btnlogin.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnlogin.setForeground(new java.awt.Color(255, 255, 255));
        btnlogin.setText("LOGIN");
        btnlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnloginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnloginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnloginMouseExited(evt);
            }
        });
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 330, 40));

        lblregister.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblregister.setForeground(new java.awt.Color(255, 0, 0));
        lblregister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblregisterMouseClicked(evt);
            }
        });
        getContentPane().add(lblregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 265, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PAGEREF.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 120));
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 200, 35));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loging.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 790, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
   
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
      if(checkEmptyFields())
           JOptionPane.showMessageDialog(null, "Please Enter your username and your password","missing information",JOptionPane.ERROR_MESSAGE);
      else{
          PreparedStatement ps;
          ResultSet rs;
          String username = txtUsername.getText();
          String password = txtPassword.getText();
          String query = "SELECT * FROM pharmacien WHERE username=? AND password=?" ;
         try{
             ps = ConnectionDataBase.getConnection().prepareStatement(query);
             ps.setString(1,username);
             ps.setString(2,password);
             rs = ps.executeQuery();
             if(rs.next()){
                 MainPage MainPage = new MainPage();
                 MainPage.setVisible(true);
                 MainPage.setLocationRelativeTo(null);
                 this.dispose();
                            }
             else{
                 JOptionPane.showMessageDialog(null,"no user with this username or password","incorrect data",JOptionPane.ERROR_MESSAGE);
                 }
           }
         catch(Exception ex){
             JOptionPane.showMessageDialog(null,"connection with data base failed");
             
         }}
      }
    private boolean checkEmptyFields(){
    return (txtUsername.getText().equals("") || txtPassword.getText().equals(""));
    }//GEN-LAST:event_btnloginActionPerformed

    private void btnloginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnloginMouseEntered
        btnlogin.setBackground(new Color(0,153,0));
    }//GEN-LAST:event_btnloginMouseEntered

    private void btnloginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnloginMouseExited
        btnlogin.setBackground(new Color(0,255,0));
    }//GEN-LAST:event_btnloginMouseExited

    private void lblregisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblregisterMouseClicked
       
    }//GEN-LAST:event_lblregisterMouseClicked

    private void btnloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnloginMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnloginMouseClicked

    private void lblminimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblminimizeMouseExited
        Border borderlabel= BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        lblminimize.setBorder(borderlabel);
        lblminimize.setForeground(Color.black);
    }//GEN-LAST:event_lblminimizeMouseExited

    private void lblminimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblminimizeMouseEntered
        Border borderlabel= BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red);
        lblminimize.setBorder(borderlabel);
        lblminimize.setForeground(Color.red);
    }//GEN-LAST:event_lblminimizeMouseEntered

    private void lblminimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblminimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblminimizeMouseClicked

    private void lblcloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcloseMouseExited
        Border borderlabel= BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        lblclose.setBorder(borderlabel);
        lblclose.setForeground(Color.black);
    }//GEN-LAST:event_lblcloseMouseExited

    private void lblcloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcloseMouseEntered
        Border borderlabel= BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red);
        lblclose.setBorder(borderlabel);
        lblclose.setForeground(Color.red);
    }//GEN-LAST:event_lblcloseMouseEntered

    private void lblcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblcloseMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
       
        try ( Connection connexion = DriverManager.getConnection("jdbc:mysql://localhost/pharmacie", "root", "")) {
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
    
    
    
    
        
        
        
        
        
        
        
        
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                login login = new login();
                login.setVisible(true);
                login.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblclose;
    private javax.swing.JLabel lblminimize;
    private javax.swing.JLabel lblregister;
    private javax.swing.JPanel panellogin;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}

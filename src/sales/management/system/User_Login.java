
package sales.management.system;
import java.sql.*;
import javax.swing.*;
public class User_Login extends javax.swing.JFrame {

    
    public User_Login() {
        initComponents();
        setExtendedState(User_Login.MAXIMIZED_BOTH);
    }
    static String name = null;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pfPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Userid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("User_Login");
        setResizable(false);
        getContentPane().setLayout(null);

        pfPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(pfPassword);
        pfPassword.setBounds(600, 260, 280, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Password");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(460, 260, 140, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("User_id");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(460, 180, 130, 40);

        Userid.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(Userid);
        Userid.setBounds(600, 180, 270, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 204));
        jLabel2.setText(" # User_Login");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(540, 40, 280, 60);

        btnLogin.setBackground(new java.awt.Color(51, 255, 51));
        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 0, 0));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin);
        btnLogin.setBounds(540, 360, 110, 30);

        btnRegister.setBackground(new java.awt.Color(51, 255, 255));
        btnRegister.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(0, 102, 102));
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegister);
        btnRegister.setBounds(700, 360, 110, 30);

        btnBack.setBackground(new java.awt.Color(255, 51, 51));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(860, 360, 100, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sales/management/system/46714.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1430, 750);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfPasswordActionPerformed
        
    }//GEN-LAST:event_pfPasswordActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
       
        dispose();
        new User_Registration().setVisible(true);
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       dispose();
       new Login_Page().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
       
         String pass,id;
         id  = Userid.getText();
         pass =pfPassword.getText(); 
         Connection conn = null;
         PreparedStatement pst = null;
         ResultSet rs = null;
         String sql ="Select * from user_info where User_Name =? and Password = ?";
        try{
              Class.forName("com.mysql.cj.jdbc.Driver");
              conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/udetails","root","*#@$786asharaf");
              pst = conn.prepareStatement(sql);
              pst.setString(1,id);
              pst.setString(2,pass);
              rs = pst.executeQuery(); 
                   if(rs.next())
                   {
                      dispose();
                      name = id;
                      new Product_Purchase().setBill(name);
                      new Product_Purchase().setVisible(true);
                   }
                   else
                   {
                       JOptionPane.showMessageDialog(null," Invalid Uesr !!!");
                   }
                            
        }
        catch(Exception e)
        {
          JOptionPane.showMessageDialog(null,e);
        }
        finally
        {
            try{
            conn.close();
            pst.close();
            rs.close();
            }
            catch(Exception g)
            {
                
            }
        } 
    }//GEN-LAST:event_btnLoginActionPerformed

  
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
            java.util.logging.Logger.getLogger(User_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Userid;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField pfPassword;
    // End of variables declaration//GEN-END:variables
}

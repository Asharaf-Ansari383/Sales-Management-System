
package sales.management.system;

import java.sql.*;
public class User_Registration extends javax.swing.JFrame {

    public User_Registration() {
        initComponents();
        setExtendedState(User_Registration.MAXIMIZED_BOTH);
    }
    static String name = null;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        mob = new javax.swing.JTextField();
        add = new javax.swing.JTextField();
        uname = new javax.swing.JTextField();
        btnDone = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("User_Registration");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("First_Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(440, 100, 124, 35);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 255));
        jLabel2.setText("Last_Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(450, 190, 108, 33);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Email");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(450, 260, 108, 33);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Mob_Number");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(450, 330, 122, 33);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 204));
        jLabel5.setText("Address");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(450, 420, 108, 33);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 51));
        jLabel6.setText("User_Id");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(450, 490, 108, 33);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 204));
        jLabel7.setText("Password");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(450, 560, 108, 33);

        lname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        getContentPane().add(lname);
        lname.setBounds(600, 180, 265, 43);

        email.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        getContentPane().add(email);
        email.setBounds(600, 260, 265, 40);

        fname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        getContentPane().add(fname);
        fname.setBounds(600, 100, 265, 40);

        mob.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(mob);
        mob.setBounds(600, 340, 265, 40);

        add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(add);
        add.setBounds(600, 420, 265, 39);

        uname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(uname);
        uname.setBounds(600, 490, 265, 40);

        btnDone.setBackground(new java.awt.Color(255, 0, 0));
        btnDone.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDone.setForeground(new java.awt.Color(0, 0, 255));
        btnDone.setText("Done");
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });
        getContentPane().add(btnDone);
        btnDone.setBounds(600, 630, 130, 40);

        btnBack.setBackground(new java.awt.Color(51, 255, 255));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(780, 630, 120, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText(" #User_Registration");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(490, 10, 410, 40);

        pass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(pass);
        pass.setBounds(600, 560, 270, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sales/management/system/join-background.jpg"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 1360, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        
    }//GEN-LAST:event_lnameActionPerformed

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed

    }//GEN-LAST:event_fnameActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
      
    }//GEN-LAST:event_emailActionPerformed

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed

        Statement stmt = null;
        Connection conn= null;
        ResultSet  rs = null;
        try
        {
              Class.forName("com.mysql.cj.jdbc.Driver");
              conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/udetails","root","*#@$786asharaf");
              stmt = conn.createStatement();
              String sql;
              String Fname,Lname,Email,Mob,Add,Userid,Pass;
              Fname = fname.getText();
              Lname = lname.getText();
              Email = email.getText();
              Mob   = mob.getText();
              Add   = add.getText();
              Userid  = uname.getText();
              Pass  = pass.getText();     
              sql = "INSERT INTO user_info(First_Name,Last_Name,Email,Mobile_Num,Address,User_Name,Password) VALUES('"+Fname+"','"+Lname+"','"+Email+"','"+Mob+"','"+Add+"','"+Userid+"','"+Pass+"')";
              int res;
              res = stmt.executeUpdate(sql);
                stmt.close();
                name = Fname;
                new Product_Purchase().setBill(name);

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
       finally
        {
            if(conn!=null)
                try {
                    conn.close();
            } catch (SQLException ex) {
            }
        }
        new Product_Purchase().setVisible(true);
    }//GEN-LAST:event_btnDoneActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
          dispose();
          new User_Login().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    
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
            java.util.logging.Logger.getLogger(User_Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField add;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDone;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField mob;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}

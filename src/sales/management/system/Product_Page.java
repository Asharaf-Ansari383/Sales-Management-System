
package sales.management.system;
import java.sql.*;
import javax.swing.*;
public class Product_Page extends javax.swing.JFrame {
    public Product_Page() {
        initComponents();
        setExtendedState(Product_Page.MAXIMIZED_BOTH);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnadd = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        report = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        proid = new javax.swing.JTextField();
        proquantity = new javax.swing.JTextField();
        proname = new javax.swing.JTextField();
        procompany = new javax.swing.JTextField();
        proprice = new javax.swing.JTextField();
        Add_Product = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnlogout1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Product_Page");
        getContentPane().setLayout(null);

        btnadd.setBackground(new java.awt.Color(255, 51, 51));
        btnadd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnadd.setForeground(new java.awt.Color(0, 0, 153));
        btnadd.setText("Add Product");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        getContentPane().add(btnadd);
        btnadd.setBounds(896, 197, 151, 37);

        btnSearch.setBackground(new java.awt.Color(0, 255, 102));
        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 51, 51));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch);
        btnSearch.setBounds(896, 276, 151, 37);

        btnUpdate.setBackground(new java.awt.Color(0, 0, 204));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 0, 0));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(896, 440, 151, 37);

        report.setBackground(new java.awt.Color(0, 255, 255));
        report.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        report.setForeground(new java.awt.Color(255, 51, 0));
        report.setText("Sales_Report");
        report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportActionPerformed(evt);
            }
        });
        getContentPane().add(report);
        report.setBounds(896, 356, 151, 37);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 255));
        jLabel1.setText("Product_Id");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(395, 199, 135, 33);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Product_Company");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(395, 357, 166, 35);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("Product_Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(390, 270, 150, 33);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Quantity");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(395, 522, 112, 33);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Product_Price");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(395, 442, 128, 33);
        getContentPane().add(proid);
        proid.setBounds(588, 200, 251, 37);

        proquantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proquantityActionPerformed(evt);
            }
        });
        getContentPane().add(proquantity);
        proquantity.setBounds(588, 520, 251, 42);
        getContentPane().add(proname);
        proname.setBounds(588, 277, 251, 41);

        procompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procompanyActionPerformed(evt);
            }
        });
        getContentPane().add(procompany);
        procompany.setBounds(588, 358, 251, 38);
        getContentPane().add(proprice);
        proprice.setBounds(588, 443, 251, 37);

        Add_Product.setBackground(new java.awt.Color(255, 0, 0));
        Add_Product.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Add_Product.setText("Add_Product");
        Add_Product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_ProductActionPerformed(evt);
            }
        });
        getContentPane().add(Add_Product);
        Add_Product.setBounds(580, 600, 149, 41);

        jLabel6.setBackground(new java.awt.Color(255, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 255));
        jLabel6.setText("# Add_Product");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(567, 54, 311, 54);

        btnBack.setBackground(new java.awt.Color(255, 102, 204));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 0, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(750, 600, 112, 41);

        btnlogout1.setBackground(new java.awt.Color(255, 255, 0));
        btnlogout1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnlogout1.setText("Log_Out");
        btnlogout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogout1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogout1);
        btnlogout1.setBounds(896, 520, 151, 37);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sales/management/system/updat.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 1400, 690);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed

             
             new Product_Page().setVisible(true);
    }//GEN-LAST:event_btnaddActionPerformed

    private void procompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procompanyActionPerformed
      
    }//GEN-LAST:event_procompanyActionPerformed

    private void proquantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proquantityActionPerformed
        
    }//GEN-LAST:event_proquantityActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        
        dispose();
        new Search_Product().setVisible(true);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        dispose();
        new Update_Page().setVisible(true);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportActionPerformed
       
        dispose();
        new Sales_Report().setVisible(true);
    }//GEN-LAST:event_reportActionPerformed

    private void Add_ProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_ProductActionPerformed
    
        String  Proid,ProName,ProCom,ProPri,Quan;
        Proid =proid.getText();
        ProName =proname.getText();
        ProCom =procompany.getText();
        ProPri =proprice.getText();
        Quan = proquantity.getText();
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try{
              Class.forName("com.mysql.cj.jdbc.Driver");
              conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/product","root","*#@$786asharaf");
              pst = conn.prepareStatement("Insert Into product_details VALUES(?,?,?,?,?)");
              pst.setString(1,Proid);
              pst.setString(2,ProName);
              pst.setString(3,ProCom);
              pst.setString(4,ProPri);
              pst.setString(5,Quan);
              pst.executeUpdate();
              JOptionPane.showMessageDialog(null,"Product Added!!!");
           }
        catch(Exception e)
        {
          JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_Add_ProductActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        dispose();
        new Login_Page().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnlogout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogout1ActionPerformed
        dispose();
        new Welcome_Page().setVisible(true);
    }//GEN-LAST:event_btnlogout1ActionPerformed

   
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
            java.util.logging.Logger.getLogger(Product_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Product_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Product_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Product_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Product_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Product;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnlogout1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField procompany;
    private javax.swing.JTextField proid;
    private javax.swing.JTextField proname;
    private javax.swing.JTextField proprice;
    private javax.swing.JTextField proquantity;
    private javax.swing.JButton report;
    // End of variables declaration//GEN-END:variables
}

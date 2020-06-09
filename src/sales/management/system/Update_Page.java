
package sales.management.system;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class Update_Page extends javax.swing.JFrame {

    public Update_Page() {
        initComponents();
        setExtendedState(Update_Page.MAXIMIZED_BOTH);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();
        ViewProducts = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        pname = new javax.swing.JTextField();
        pprice = new javax.swing.JTextField();
        pcompany = new javax.swing.JTextField();
        quan = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Updation_of_Products");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 102));
        jLabel1.setText("#Updation");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(525, 35, 236, 56);

        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product_Id", "Product_Name", "Product_Company", "Product_Price", "Product_Quantity"
            }
        ));
        Table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(319, 136, 729, 122);

        ViewProducts.setBackground(new java.awt.Color(255, 0, 0));
        ViewProducts.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ViewProducts.setForeground(new java.awt.Color(51, 0, 204));
        ViewProducts.setText("View_Product");
        ViewProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewProductsActionPerformed(evt);
            }
        });
        getContentPane().add(ViewProducts);
        ViewProducts.setBounds(871, 276, 177, 31);

        id.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(id);
        id.setBounds(570, 336, 194, 47);

        pname.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        getContentPane().add(pname);
        pname.setBounds(570, 408, 194, 47);

        pprice.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        pprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ppriceActionPerformed(evt);
            }
        });
        getContentPane().add(pprice);
        pprice.setBounds(570, 561, 194, 47);

        pcompany.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(pcompany);
        pcompany.setBounds(570, 486, 194, 47);

        quan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        quan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quanActionPerformed(evt);
            }
        });
        getContentPane().add(quan);
        quan.setBounds(570, 633, 194, 47);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Product_Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(383, 416, 135, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("Product_id");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(383, 339, 127, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("Product_Price");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(383, 568, 149, 33);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Product_Company");
        jLabel5.setToolTipText("");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(383, 486, 177, 27);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Availabe_Quantity");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(383, 645, 165, 22);

        update.setBackground(new java.awt.Color(255, 0, 204));
        update.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        update.setForeground(new java.awt.Color(51, 255, 255));
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update);
        update.setBounds(894, 486, 165, 39);

        Back.setBackground(new java.awt.Color(255, 204, 204));
        Back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Back.setForeground(new java.awt.Color(51, 255, 102));
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back);
        Back.setBounds(894, 565, 165, 38);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sales/management/system/46714.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 1360, 790);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ViewProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewProductsActionPerformed
       
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
              conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/product","root","*#@$786asharaf");
              pst = conn.prepareStatement("Select * from product_details");
             rs = pst.executeQuery();
             DefaultTableModel tm =(DefaultTableModel)Table1.getModel();
            while(rs.next())
            {
                Object o[] = {rs.getInt(1),rs.getString("Product_Name"),rs.getString("Product_Comapny"),rs.getInt(4),rs.getInt(5)};
                tm.addRow(o);          
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
    }//GEN-LAST:event_ViewProductsActionPerformed

    private void Table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table1MouseClicked
        
        int row = Table1.getSelectedRow();
        int proid =(Integer) Table1.getValueAt(row, 0);
        String proname = (String)Table1.getValueAt(row, 1);
        String procom = (String)Table1.getValueAt(row, 2);
        int propri = (Integer)Table1.getValueAt(row, 3);
        int proqua= (Integer)Table1.getValueAt(row, 4);
         id.setText(proid+"");
         pname.setText(proname);
         pcompany.setText(procom);
         pprice.setText(propri+"");
         quan.setText(proqua+""); 
    }//GEN-LAST:event_Table1MouseClicked

    private void ppriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ppriceActionPerformed

    }//GEN-LAST:event_ppriceActionPerformed

    private void quanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quanActionPerformed

    }//GEN-LAST:event_quanActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed

        int id1 = Integer.parseInt(id.getText()); 
        String name = pname.getText();
        String com = pcompany.getText();
        int pri =Integer.parseInt(pprice.getText());
        int qua =Integer.parseInt(quan.getText());
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
             conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/product","root","*#@$786asharaf");
             String sql  = "UPDATE  product_details SET  Product_Quantity = '"+qua+"',Product_Comapny ='"+com+"',Product_Price='"+pri+"',Product_Name ='"+name+"' where Product_Id ='"+id1+"' ";
             pst = conn.prepareStatement(sql);
             pst.executeUpdate();
             JOptionPane.showMessageDialog(null,"Updated !!!");
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

    }//GEN-LAST:event_updateActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
       dispose();
       new Product_Page().setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    
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
            java.util.logging.Logger.getLogger(Update_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JTable Table1;
    private javax.swing.JButton ViewProducts;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pcompany;
    private javax.swing.JTextField pname;
    private javax.swing.JTextField pprice;
    private javax.swing.JTextField quan;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}

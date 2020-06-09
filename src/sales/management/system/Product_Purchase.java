
package sales.management.system;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class Product_Purchase extends javax.swing.JFrame {

    public Product_Purchase() {
        initComponents();
        setExtendedState(Product_Purchase.MAXIMIZED_BOTH);
        fillCheckBox();
    }
    static int tprice = 0;
    static int count = 0;
    static int  rowCount = 0;
    static String name = null; 
    public void setBill(String name)
    {
       this.name = name; 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table2 = new javax.swing.JTable();
        SeItem = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        SeQuantity = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table3 = new javax.swing.JTable();
        AddMore = new javax.swing.JButton();
        SaveBilling = new javax.swing.JButton();
        cost = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Add = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Product_Purchase");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 204));
        jLabel1.setText("Choose Products To Buy");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(409, 11, 468, 59);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Click To view Availabe Products List");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(409, 106, 362, 33);

        btnView.setBackground(new java.awt.Color(255, 0, 204));
        btnView.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        getContentPane().add(btnView);
        btnView.setBounds(775, 103, 128, 39);

        Table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product_Id", "Product_Name", "Product_Company", "Product_Price", "Product_Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table2);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(231, 153, 885, 146);

        SeItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeItemActionPerformed(evt);
            }
        });
        getContentPane().add(SeItem);
        SeItem.setBounds(405, 317, 207, 31);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Select Items");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(245, 321, 121, 31);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Quantity");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(698, 323, 127, 22);

        SeQuantity.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SeQuantity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", " " }));
        getContentPane().add(SeQuantity);
        SeQuantity.setBounds(829, 321, 171, 31);

        Table3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Table3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product_Id", "Product_Name", "Product_Company", "Product_Price", "Purchase_Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Table3);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(231, 409, 885, 176);

        AddMore.setBackground(new java.awt.Color(0, 204, 204));
        AddMore.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AddMore.setForeground(new java.awt.Color(255, 51, 51));
        AddMore.setText("Add More");
        AddMore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMoreActionPerformed(evt);
            }
        });
        getContentPane().add(AddMore);
        AddMore.setBounds(322, 656, 144, 39);

        SaveBilling.setBackground(new java.awt.Color(255, 0, 255));
        SaveBilling.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SaveBilling.setForeground(new java.awt.Color(51, 51, 255));
        SaveBilling.setText("Save Billing");
        SaveBilling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBillingActionPerformed(evt);
            }
        });
        getContentPane().add(SaveBilling);
        SaveBilling.setBounds(513, 656, 144, 39);

        cost.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        cost.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(cost);
        cost.setBounds(992, 611, 128, 50);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Total Price");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(840, 611, 142, 50);

        Add.setBackground(new java.awt.Color(255, 0, 0));
        Add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        getContentPane().add(Add);
        Add.setBounds(1018, 317, 98, 35);

        back.setBackground(new java.awt.Color(51, 255, 102));
        back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back.setForeground(new java.awt.Color(255, 0, 102));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(706, 656, 130, 39);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sales/management/system/updat.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 1430, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed

        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
              conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/product","root","*#@$786asharaf");
              pst = conn.prepareStatement("Select * From  product_details");
             rs = pst.executeQuery();
             DefaultTableModel tm =(DefaultTableModel)Table2.getModel();
             tm.setRowCount(0);
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
    }//GEN-LAST:event_btnViewActionPerformed
  
    private void Table2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table2MouseClicked

    }//GEN-LAST:event_Table2MouseClicked

    private void SeItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeItemActionPerformed
 
    }//GEN-LAST:event_SeItemActionPerformed

    private void SaveBillingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBillingActionPerformed
      
        int totalcost = Integer.parseInt(cost.getText());
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try{
              Class.forName("com.mysql.cj.jdbc.Driver");
              conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/payment","root","*#@$786asharaf");
              pst = conn.prepareStatement("Insert Into sales_report VALUES('"+name+"',SYSDATE(),CURRENT_TIME(),'"+totalcost+"')");
              pst.executeUpdate();
           }
        catch(Exception e)
        {
          JOptionPane.showMessageDialog(null,e);
        }
        dispose();
        JOptionPane.showMessageDialog(null,"Your Order Placed for Rs :"+totalcost);
        new Product_Purchase().setVisible(true);
    }//GEN-LAST:event_SaveBillingActionPerformed

    private void AddMoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMoreActionPerformed
     
                 SeItem.setSelectedItem("");
                 SeQuantity.setSelectedItem("0");
                 Add.setEnabled(true);
    }//GEN-LAST:event_AddMoreActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
   
        String prod = (String)SeItem.getSelectedItem();
        int qua = Integer.parseInt((String)SeQuantity.getSelectedItem());
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
              conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/product","root","*#@$786asharaf");
              pst = conn.prepareStatement("Select Product_id,Product_Comapny,Product_Price,Product_Quantity From  product_details where Product_Name = '"+prod+"'");
             rs = pst.executeQuery();
             DefaultTableModel tm =(DefaultTableModel)Table3.getModel();
             tm.setRowCount(count);
            while(rs.next())
            {
                Object o[] = {rs.getInt(1),prod,rs.getString("Product_Comapny"),rs.getInt(3),qua};
                int check = (Integer)rs.getInt(4);
                if(qua>check)
                {
                   JOptionPane.showMessageDialog(null,"Insufficient Amount"); 
                   break;
                }
                else
                {    
                    tm.addRow(o);
                    int price = (Integer)rs.getInt(3);
                    tprice  = tprice + qua*price;
                    String s ="";
                    cost.setText(s+tprice);
                    count++;
                    rowCount++;
                    Add.setEnabled(false);
                    itemUpdation(prod,qua);
                }
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
    }//GEN-LAST:event_AddActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed

        dispose();
        new Login_Page().setVisible(true);
    }//GEN-LAST:event_backActionPerformed
    public void fillCheckBox()
    {
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
              conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/product","root","*#@$786asharaf");
              pst = conn.prepareStatement("Select * from  product_details");
             rs = pst.executeQuery();
             SeItem.addItem("");
            while(rs.next())
            {
               String pro = rs.getString("Product_Name");
               SeItem.addItem(pro);
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
    }
    public void itemUpdation(String prod,int qua)
    {
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
             conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/product","root","*#@$786asharaf");
             String sql  = "UPDATE  product_details SET  Product_Quantity = Product_Quantity-'"+qua+"' where Product_Name ='"+prod+"'";
             pst = conn.prepareStatement(sql);
             pst.executeUpdate();
        }
        catch(Exception e)
        {
           System.out.println(e);
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
    }
    
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
            java.util.logging.Logger.getLogger(Product_Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Product_Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Product_Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Product_Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton Add;
    private javax.swing.JButton AddMore;
    private javax.swing.JButton SaveBilling;
    private javax.swing.JComboBox<String> SeItem;
    private javax.swing.JComboBox<String> SeQuantity;
    private javax.swing.JTable Table2;
    private javax.swing.JTable Table3;
    private javax.swing.JButton back;
    private javax.swing.JButton btnView;
    private javax.swing.JTextField cost;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}

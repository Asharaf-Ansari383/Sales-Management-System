
package sales.management.system;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class Sales_Report extends javax.swing.JFrame {

    
    public Sales_Report() {
        initComponents();
        setExtendedState(Sales_Report.MAXIMIZED_BOTH);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        View_report = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sales_Report");
        getContentPane().setLayout(null);

        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer_Name", "Billing_Date", "Billing_Time", "Total_Amount"
            }
        ));
        jScrollPane1.setViewportView(Table1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(269, 98, 624, 358);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("# Sales_Report");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(421, 23, 283, 44);

        View_report.setBackground(new java.awt.Color(255, 0, 255));
        View_report.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        View_report.setForeground(new java.awt.Color(51, 0, 255));
        View_report.setText("View_Report");
        View_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_reportActionPerformed(evt);
            }
        });
        getContentPane().add(View_report);
        View_report.setBounds(419, 490, 149, 36);

        Back.setBackground(new java.awt.Color(255, 153, 153));
        Back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Back.setForeground(new java.awt.Color(0, 255, 102));
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back);
        Back.setBounds(651, 490, 129, 36);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sales/management/system/updat.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 0, 1370, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
       dispose();
       new Product_Page().setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    private void View_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_reportActionPerformed
      
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
              conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/payment","root","*#@$786asharaf");
              pst = conn.prepareStatement("Select * From  sales_report");
             rs = pst.executeQuery();
             DefaultTableModel tm =(DefaultTableModel)Table1.getModel();
             tm.setRowCount(0);
            while(rs.next())
            {
                Object o[] = {rs.getString("Customer_Name"),rs.getString("Billing_Date"),rs.getString("Billing_Time"),rs.getInt(4)}; 
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
    }//GEN-LAST:event_View_reportActionPerformed

    
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
            java.util.logging.Logger.getLogger(Sales_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sales_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sales_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sales_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sales_Report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JTable Table1;
    private javax.swing.JButton View_report;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

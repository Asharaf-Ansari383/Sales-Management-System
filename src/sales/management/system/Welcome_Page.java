
package sales.management.system;
public class Welcome_Page extends javax.swing.JFrame {
    public Welcome_Page() {
        initComponents();
        setExtendedState(Welcome_Page.MAXIMIZED_BOTH);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        Enter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome Page");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Sales  Management System");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(420, -10, 523, 56);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sales/management/system/we.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(210, 30, 970, 460);

        jTextPane1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(51, 51, 51));
        jTextPane1.setText("This is a  sales managment System project,where there are two modules admin  & user.In Admin module admin can add ,search,update products.\nAdmin could also able to see bill details of customer & Admin could manage all the functionality of the shop.\nThe second module is user module, In this module user can login  if he/she has account of this shop other he/she can register to the shop by providing\nfew details. After this user can able to see availabel product to the shop and by selecting the product types and quantity he/she can buy  products\nat the end user would receive bill of product purchase.");
        jScrollPane1.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 520, 1390, 140);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Description of Project");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 490, 220, 30);

        Enter.setBackground(new java.awt.Color(51, 0, 255));
        Enter.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Enter.setForeground(new java.awt.Color(255, 0, 0));
        Enter.setText("Enter");
        Enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterActionPerformed(evt);
            }
        });
        getContentPane().add(Enter);
        Enter.setBounds(480, 660, 190, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterActionPerformed
        dispose();
        new Login_Page().setVisible(true);
     
    }//GEN-LAST:event_EnterActionPerformed

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
            java.util.logging.Logger.getLogger(Welcome_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Enter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}


package Frames;

import code.connection;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;


public class issue extends javax.swing.JFrame {

 
    public issue() {
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bid = new javax.swing.JTextField();
        copy = new javax.swing.JTextField();
        id = new com.toedter.calendar.JDateChooser();
        dd = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        mid = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        slip = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Issue Book");
        setMaximumSize(new java.awt.Dimension(700, 500));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setText("Issue Book");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 70, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Book ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 70, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Member ID");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, -1, 34));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Issue Date");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, -1, 28));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Due Date");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, -1, -1));

        bid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bidActionPerformed(evt);
            }
        });
        getContentPane().add(bid, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 150, 30));

        copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyActionPerformed(evt);
            }
        });
        getContentPane().add(copy, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 153, 30));
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 390, 160, -1));
        getContentPane().add(dd, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 450, 160, -1));

        jButton2.setBackground(new java.awt.Color(0, 51, 51));
        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 470, 72, 40));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Book Code");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 100, 30));
        getContentPane().add(mid, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 153, 30));

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/H6.PNG"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 220, 280));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 640));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Issue NO");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, 70, 20));

        slip.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        slip.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        slip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slipActionPerformed(evt);
            }
        });
        jPanel2.add(slip, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 90, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 690, 640));

        setSize(new java.awt.Dimension(973, 646));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_copyActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      dispose();
      new menu().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        Connection conn = null;
        Statement st = null;
        ResultSet rs1 = null;
        ResultSet rs2 = null;
        ResultSet rs3 = null;
        
        try{
            String bookid,memberid;
            int copyno,slipno;
            java.sql.Date idate = new java.sql.Date(id.getDate().getTime());
            java.sql.Date ddate = new java.sql.Date(dd.getDate().getTime());
            
            bookid = bid.getText();
            memberid = mid.getText();
            copyno = Integer.parseInt(copy.getText());
            slipno = Integer.parseInt(slip.getText());
            
            conn = connection.connect();
            st = conn.createStatement(); 
            
            rs1 = st.executeQuery("select book_id,book_code from book where book_id = '"+bookid+"' and book_code = '"+copyno+"' ");
            
            if(rs1.next()){
                
                rs2 = st.executeQuery("select `member_id` from `member` where member_id = '"+memberid+"' ");
                
                if(rs2.next()){
                    
                    rs3 = st.executeQuery("select availability from book where book_id = '"+bookid+"' and book_code = '"+copyno+"' and availability = 'YES' ");
                    
                    if(rs3.next()){
                       
                        st.executeUpdate("INSERT INTO `borrow`(`issue_no`, `book_id`, `book_code`, `member_id`, `issue_date`, `due_date`, `is_returned`, `returned_date`) VALUES ('"+slipno+"','"+bookid+"','"+copyno+"','"+memberid+"','"+idate+"', '"+ddate+"','NO',null)");
                        st.executeUpdate("update book set availability = 'NO' where book_id = '"+bookid+"' and book_code = '"+copyno+"' ");
                        
                        JOptionPane.showMessageDialog(null,"Done!");
                        dispose();
                        new issue().setVisible(true);
                        
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Book is not available!");
                    }
                    
                }
                else
                JOptionPane.showMessageDialog(null,"Incorrect member ID!");
            }
            else
                JOptionPane.showMessageDialog(null,"Incorrect Book ID/Copy NO!");
           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Wrong Input!");
        }finally{
        
        if(conn!=null && st!=null && rs1!=null && rs2!=null && rs3!=null){
            try{
                conn.close();
                st.close();
                rs1.close();
                rs2.close();
                rs3.close();
            }catch(Exception e){
                
            }
        }
    }
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void slipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slipActionPerformed
        
    }//GEN-LAST:event_slipActionPerformed

    private void bidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bidActionPerformed

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
            java.util.logging.Logger.getLogger(issue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(issue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(issue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(issue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new issue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bid;
    private javax.swing.JTextField copy;
    private com.toedter.calendar.JDateChooser dd;
    private com.toedter.calendar.JDateChooser id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField mid;
    private javax.swing.JTextField slip;
    // End of variables declaration//GEN-END:variables
}

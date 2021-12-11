
package Frames;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;
import code.connection;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

public class history extends javax.swing.JFrame {

    public history() {
        initComponents();
        tableh();
    }
    
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

     public void tableh(){
        
        try{
            
            conn = connection.connect();
            st = conn.createStatement();
            
            rs = st.executeQuery("SELECT * FROM `borrow` ");
            
            ht.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }finally{
        
        if(conn!=null && st!=null && rs!=null){
            try{
                conn.close();
                st.close();
            }catch(Exception e){
                
            }
        }
    }
    }
     
     
    public void idsearch(){
               
        try{
            conn = connection.connect();
            st = conn.createStatement();
            
            rs = st.executeQuery("SELECT * FROM `borrow` where book_id like '%"+bid.getText()+"%' and member_id like '%"+mid.getText()+"%' ");
            
            ht.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }finally{
        
        if(conn!=null && st!=null && rs!=null){
            try{
                conn.close();
                st.close();
            }catch(Exception e){
                
            }
        }
    }
        
    }
    
        public void nrsearch(){
     
        try{
            conn = connection.connect();
            st = conn.createStatement();
            
            rs = st.executeQuery("SELECT * FROM `borrow` where member_id like '%"+mid.getText()+"%' and book_id like '%"+bid.getText()+"%' and is_returned = 'NO' ");
            
            ht.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }finally{
        
        if(conn!=null && st!=null && rs!=null){
            try{
                conn.close();
                st.close();
            }catch(Exception e){
                
            }
        }
    }
        
    }
           
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ht = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        mid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bid = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        nr = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("History");
        setMaximumSize(new java.awt.Dimension(900, 600));
        setMinimumSize(new java.awt.Dimension(900, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ht.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        ht.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(ht);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 700, 340));

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/H13.PNG"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 230, 260));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 630));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 90, 40));

        jButton2.setBackground(new java.awt.Color(0, 51, 51));
        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Menu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 90, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Member ID");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, -1, -1));

        mid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                midKeyReleased(evt);
            }
        });
        jPanel2.add(mid, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 120, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Book ID");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        bid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bidActionPerformed(evt);
            }
        });
        bid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bidKeyReleased(evt);
            }
        });
        jPanel2.add(bid, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 110, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setText("Borrow History");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 330, 50));

        nr.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        nr.setText("Non Returned");
        nr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nrActionPerformed(evt);
            }
        });
        jPanel2.add(nr, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 730, 630));

        setSize(new java.awt.Dimension(973, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        new statistic().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        new menu().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void bidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bidKeyReleased
       if(nr.isSelected()){
            
            nrsearch();
        }else
            idsearch();
    }//GEN-LAST:event_bidKeyReleased

    private void midKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_midKeyReleased
        if(nr.isSelected()){
            
            nrsearch();
        }else
            idsearch();
    }//GEN-LAST:event_midKeyReleased

    private void bidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bidActionPerformed

    private void nrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nrActionPerformed
        
        if(nr.isSelected()){
            
            nrsearch();
        }else
            idsearch();
            
        
        
    }//GEN-LAST:event_nrActionPerformed

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
            java.util.logging.Logger.getLogger(history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new history().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bid;
    private javax.swing.JTable ht;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mid;
    private javax.swing.JCheckBox nr;
    // End of variables declaration//GEN-END:variables
}

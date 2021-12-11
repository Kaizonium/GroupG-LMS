
package Frames;

import java.sql.Connection;
import java.sql.Statement;
import code.connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class member extends javax.swing.JFrame {
 
    public member() {
        initComponents();
    }
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        
        
     public void getvalues(){
         
         try{
             conn = connection.connect();
             st = conn.createStatement();

             rs = st.executeQuery("SELECT `name`, contact_no, `birthday`,`faculty`,`sex` FROM `member` WHERE member_id = '"+id.getText()+"' ");
             
             if(rs.next()){
                 
                 bd.setDate(rs.getDate("birthday"));
                 name.setText(rs.getString("name"));
                 contact.setText(Integer.toString(rs.getInt("contact_no")));
                 sex.setSelectedItem(rs.getString("sex"));
                 facalty.setSelectedItem(rs.getString("faculty"));
     
             }
             else {
              JOptionPane.showMessageDialog(null,"ID not Exist!");
              e.setSelected(false);
              id.setEditable(true);
              }
   
         }catch(Exception e){
             
         }
         
     }   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        sex = new javax.swing.JComboBox<>();
        facalty = new javax.swing.JComboBox<>();
        bd = new com.toedter.calendar.JDateChooser();
        e = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("New Member");
        setMaximumSize(new java.awt.Dimension(700, 500));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 50, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Member ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Sex");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Birthday");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Faculty");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, -1, -1));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 310, -1));
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 140, -1));

        sex.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "male", "female", "other" }));
        getContentPane().add(sex, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, 140, -1));

        facalty.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        facalty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "Engineering", "Business", "Tech", "Computing" }));
        facalty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facaltyActionPerformed(evt);
            }
        });
        getContentPane().add(facalty, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, 140, -1));
        getContentPane().add(bd, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 140, -1));

        e.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        e.setText("Edit / Delete");
        e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eActionPerformed(evt);
            }
        });
        getContentPane().add(e, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 150, 130, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Contact NO");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 90, -1));
        getContentPane().add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 170, -1));

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/H18.PNG"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 180, 270));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 640));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(51, 51, 255));
        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("New");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, 100, 40));

        jButton4.setBackground(new java.awt.Color(51, 51, 255));
        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, 100, 40));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 100, 40));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel6.setText("Add New/Edit Member");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 490, -1));

        jButton2.setBackground(new java.awt.Color(51, 51, 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 500, 100, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 740, 640));

        setSize(new java.awt.Dimension(974, 642));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void facaltyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facaltyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_facaltyActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       dispose();
       new menu().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         
        if(sex.getSelectedIndex()==0 || facalty.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null,"Wrong Input!");
        }
        else
        {
        try{
            java.sql.Date date = new java.sql.Date(bd.getDate().getTime());
            
            conn = connection.connect();
            st = conn.createStatement();
           
            st.executeUpdate("INSERT INTO `member`(`member_id`, `name`, `contact_no`, `sex`, `birthday`,`faculty`) VALUES ('"+id.getText()+"','"+name.getText()+"', '"+Integer.parseInt(contact.getText())+"','"+sex.getSelectedItem().toString()+"','"+date+"','"+facalty.getSelectedItem().toString()+"')");
            
            
            JOptionPane.showMessageDialog(null,"Done!");
            dispose();
            new member().setVisible(true);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Wrong Input!");
        }finally{
        
        if(conn!=null && st!=null){
            try{
                conn.close();
                st.close();
            }catch(Exception e){
                
            }
        }
    } }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eActionPerformed
            if(e.isSelected()){
                id.setEditable(false);
                getvalues();
            }
            else
            {
                id.setEditable(true);
                name.setText(null);
                bd.setDate(null);
                facalty.setSelectedIndex(0);
                sex.setSelectedIndex(0);
                contact.setText(null);
            }
    }//GEN-LAST:event_eActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        if(e.isSelected()){
        
        try{   
            java.sql.Date date = new java.sql.Date(bd.getDate().getTime());
            
            conn = connection.connect();
            st = conn.createStatement();
            
            st.executeUpdate("UPDATE `member` SET `name`='"+name.getText()+"', `contact_no` = '"+Integer.parseInt(contact.getText())+"', `sex`='"+sex.getSelectedItem().toString()+"',`birthday`='"+date+"',`faculty`='"+facalty.getSelectedItem().toString()+"' WHERE member_id = '"+id.getText()+"' ");
            
            JOptionPane.showMessageDialog(null,"Done!");
            dispose();
            new member().setVisible(true);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Wrong Input!");
        }finally{
        
        if(conn!=null && st!=null){
            try{
                conn.close();
                st.close();
            }catch(Exception e){
                
            }
        }
    } }
        else
        JOptionPane.showMessageDialog(null,"Edit is not enable!");
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
        if(e.isSelected()){
            
            try{
            conn = connection.connect();
            st = conn.createStatement();
            String a = id.getText();
            
         
            st.executeUpdate("DELETE FROM `member` WHERE member_id = '"+a+"' ");
            
            JOptionPane.showMessageDialog(null,"Done!");
            dispose();
            new member().setVisible(true);
    
            }catch(Exception e){
               
            }finally{
        
        if(conn!=null && st!=null){
            try{
                conn.close();
                st.close();
            }catch(Exception e){
                
            }
        }
    }
        }
        else
        JOptionPane.showMessageDialog(null,"Delete is not enable!");
        
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new member().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser bd;
    private javax.swing.JTextField contact;
    private javax.swing.JRadioButton e;
    private javax.swing.JComboBox<String> facalty;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JTextField name;
    private javax.swing.JComboBox<String> sex;
    // End of variables declaration//GEN-END:variables
}

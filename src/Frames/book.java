
package Frames;

import java.sql.Connection;
import java.sql.Statement;
import code.connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class book extends javax.swing.JFrame {


    public book() {
        initComponents();
        bc.setEditable(false);
    }
    
    Connection conn = null;
    Statement st = null;
    ResultSet rs = null;
    
    public void getvalues(){
        
        try{
            conn = connection.connect();
            st = conn.createStatement();
            
            rs = st.executeQuery("SELECT * FROM `bookinf` WHERE book_id = '"+bid.getText()+"' ");
            
            if(rs.next()){
                
                bname.setText(rs.getString("name"));
                an.setText(rs.getString("author_name"));
                g.setSelectedItem(rs.getString("genre"));
                rd.setDate(rs.getDate("registered_date"));
                
            }
            else{
               quntity.setEnabled(true);
              JOptionPane.showMessageDialog(null,"ID not Exist!");
              e.setSelected(false);
              bid.setEditable(true);
              bc.setEditable(false);
              
            }
            
        }catch(Exception e){
            
        }
        
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bid = new javax.swing.JTextField();
        bname = new javax.swing.JTextField();
        e = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        bc = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rd = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        an = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        quntity = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        g = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ok = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edit Book");
        setMaximumSize(new java.awt.Dimension(700, 500));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(900, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setText("Add New/Edit Book");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 420, 50));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 90, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Book ID (ISBN)");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 150, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Book name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 110, -1));
        getContentPane().add(bid, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 142, -1));
        getContentPane().add(bname, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 299, -1));

        e.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        e.setText("Edit / Delete");
        e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eActionPerformed(evt);
            }
        });
        getContentPane().add(e, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Book CODE");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 100, -1));
        getContentPane().add(bc, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 140, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("(only for delete)");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, 130, -1));

        jPanel1.setBackground(new java.awt.Color(153, 51, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/H2.PNG"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 220, 270));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 630));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(rd, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 142, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Registered Date");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 130, -1));
        jPanel2.add(an, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 300, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Author name");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 130, -1));

        quntity.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        quntity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        quntity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quntityActionPerformed(evt);
            }
        });
        jPanel2.add(quntity, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Quantity");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 90, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("(only for new book)");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 180, -1));

        g.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        g.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "IT", "Mathematics", "Medicine", "Business and Economics", "Lifestyle", "Fiction", "Non-Fiction", "Language", "Poetry", "Self Help", "Reference", "Research Journal", "Science", "Literature", "Comics" }));
        jPanel2.add(g, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 170, 30));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("Genre");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 80, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("(Only for New/Update)");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 220, -1));

        ok.setBackground(new java.awt.Color(153, 51, 0));
        ok.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ok.setForeground(new java.awt.Color(255, 255, 255));
        ok.setText("New");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });
        jPanel2.add(ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 99, 40));

        jButton2.setBackground(new java.awt.Color(153, 51, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 490, 100, 40));

        jButton3.setBackground(new java.awt.Color(153, 51, 0));
        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 490, 100, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 710, 630));

        setSize(new java.awt.Dimension(972, 638));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        
        if(g.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null,"Wrong Input!");
        } else
        {
        int a;
        
        try{
            java.sql.Date date = new java.sql.Date(rd.getDate().getTime());
            int x = Integer.parseInt(quntity.getSelectedItem().toString());
            
            conn = connection.connect();
            st = conn.createStatement();
            
            st.executeUpdate("INSERT INTO `bookinf` (`book_id`, `name`, `genre`, `author_name`, `registered_date`) VALUES ('"+bid.getText()+"','"+bname.getText()+"', '"+g.getSelectedItem().toString()+"', '"+an.getText()+"','"+date+"') ");
            
            for(a=1; a<(x+1); a++){
               
                st.executeUpdate("INSERT INTO `book` (`book_id`, `book_code`, `availability`) VALUES ('"+bid.getText()+"','"+a+"','YES')");
            
            }
            
            JOptionPane.showMessageDialog(null,"Done!");
            dispose();
            new book().setVisible(true);
            
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
    }
    }    
        
    }//GEN-LAST:event_okActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       dispose();
       new menu().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eActionPerformed
        
        if(e.isSelected()){
            bid.setEditable(false);
            bc.setEditable(true);
            quntity.setEnabled(false);
            getvalues();
            
            
        }
        else{
            bid.setEditable(true);
            bc.setText(null);
            bc.setEditable(false);
            quntity.setEnabled(true);
            bname.setText(null);
            an.setText(null);
            rd.setDate(null);
            g.setSelectedIndex(0);
        }
    }//GEN-LAST:event_eActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        if(e.isSelected()){
            
            if(g.getSelectedIndex()==0){
                JOptionPane.showMessageDialog(null,"Wrong Input!");
            }
            else
            {
            try{
                
                java.sql.Date date = new java.sql.Date(rd.getDate().getTime());
            
                conn = connection.connect();
                st = conn.createStatement();
                
                st.executeUpdate("UPDATE `bookinf` SET `name`='"+bname.getText()+"',`author_name`= '"+an.getText()+"', `genre`= '"+g.getSelectedItem().toString()+"',`registered_date`= '"+date+"' WHERE book_id = '"+bid.getText()+"' ");
                
                JOptionPane.showMessageDialog(null,"Done!");
                dispose();
                new book().setVisible(true);
            
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
        }
        else
            JOptionPane.showMessageDialog(null,"Edit is not enable!");
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        if(e.isSelected()){
            
            try{
                conn = connection.connect();
                st = conn.createStatement();
                
                String a = bid.getText();
                String b = bc.getText();
                
                rs = st.executeQuery("SELECT `book_code` FROM `book` WHERE book_id = '"+a+"' and book_code = '"+b+"' ");
                
                if(rs.next()){
                
                int k = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete?", "confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);    
                
                if(k==0){
                    
                st.executeUpdate("DELETE FROM `book` WHERE book_id = '"+a+"' and book_code = '"+b+"' ");
                
                rs = st.executeQuery("select `book_id` from `book` where book_id = '"+a+"' ");
                
                if(rs.next()){
                    
                }
                else{
                    st.executeUpdate("DELETE FROM `bookinf` WHERE book_id = '"+a+"' ");
                }
                
                JOptionPane.showMessageDialog(null,"Done!");
                dispose();
                new book().setVisible(true);
                
                }
                
                }
                else
                   JOptionPane.showMessageDialog(null,"Book CODE is not exsits!");
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Wrong input!");
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
    }//GEN-LAST:event_jButton3ActionPerformed

    private void quntityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quntityActionPerformed
 
    }//GEN-LAST:event_quntityActionPerformed

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
            java.util.logging.Logger.getLogger(book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField an;
    private javax.swing.JTextField bc;
    private javax.swing.JTextField bid;
    private javax.swing.JTextField bname;
    private javax.swing.JRadioButton e;
    private javax.swing.JComboBox<String> g;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton ok;
    private javax.swing.JComboBox<String> quntity;
    private com.toedter.calendar.JDateChooser rd;
    // End of variables declaration//GEN-END:variables
}

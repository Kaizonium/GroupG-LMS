
package code;

import java.sql.Connection;
import java.sql.DriverManager;

public class connection {
    
    
 public static Connection connect(){
     
     Connection conn = null;
     try{
         
         Class.forName("com.mysql.cj.jdbc.Driver");
         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","kaizonium");
         return conn;
         
     }catch(Exception e){
      
     }
     return null;
 }  
    
}
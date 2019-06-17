/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package miniimage;


import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import javax.swing.*;

public class DBconnector {
    
    Connection conn=null;   
    
    public static Connection db(){
        
        //Use try catch 
        
        
      try{
          
          Class.forName("com.mysql.jdbc.Driver");
          Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_management","root","");
          return conn;
      }  
        catch(Exception e)
        {
            
            
          JOptionPane.showMessageDialog(null, e); 
           return null; 
            
        }
        
       
        
        
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gehan;


import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class GetDBConnection1 {
    
    
     
    static final String myhost = "jdbc:mysql://localhost:3306/erp_system?useSSL=false"; //add   ?useSSL=false   //?zeroDateTimeBehavior=convertToNull
    static final String myusername = "root";
    static final String mypassword = "";      
    
    Connection con;
    
    public GetDBConnection1() {
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            this.con = DriverManager.getConnection(myhost, myusername , mypassword);
            
            //JOptionPane.showMessageDialog(null, "Connected to Database.");
            
        }        
        catch(Exception ex){
            
            JOptionPane.showMessageDialog(null, "Error: " + ex, "Error", JOptionPane.ERROR_MESSAGE);
            
        }                    
        
    }
       
}

    


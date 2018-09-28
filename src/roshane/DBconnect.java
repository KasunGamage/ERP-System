
package roshane;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBconnect {
     public static Connection connect()
    {
        
        Connection con = null; 
        try {
            
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/erp_system","root","");
             return con;
            
        } catch (SQLException e) {
            System.out.println(e);
        }
           return null;
    }
    
}



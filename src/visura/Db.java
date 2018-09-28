
package visura;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {
    
   
    public static Connection connect() 
    {
        Connection con = null;
        
        try {
        /* Class.forName("com.mysql.jdbc.Driver");*/
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/erp_system","root","");
        } catch (SQLException e) {
        }
        return con;
    }
    
}

    


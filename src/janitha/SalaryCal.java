
package janitha;




import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.StringTokenizer;

public class SalaryCal {
    
   PreparedStatement pst =null;
   ResultSet rs=null;
   DBconnect dbc = new DBconnect();
    
    
    String eid = "";
    String today = "";
    
    public void  checkShortLeaves(String id, String tDate){
    
    this.eid = id;
    this.today = tDate;
    int otHours = 0;
    String timeDiff = "";
    try
    {
    
        String sql1= "SELECT TIMEDIFF(endX,'14:00') AS hidff FROM attendance1 WHERE eid ='"+this.eid+"' AND today = '"+this.today+"'";
        pst = dbc.con.prepareStatement(sql1);
        rs = this.pst.executeQuery();
        
        if(rs.next())
        {
            timeDiff = rs.getTime(1).toString();
            
        }
        
        StringTokenizer token = new StringTokenizer(timeDiff,":");
        if(token.hasMoreTokens()){
        
            otHours = Integer.parseInt(token.nextToken());
            System.out.println(otHours);
        
        
        }
        
        String sql2 = "update attendance1 set ot = "+otHours+" where eid = '"+this.eid+"' and today = '"+this.today+"'";
        pst = dbc.con.prepareStatement(sql2);
        rs = this.pst.executeQuery();
    
    }
    
    catch(Exception e){}
    }
}

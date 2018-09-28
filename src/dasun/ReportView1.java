/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Ishani;

/**
 *
 * @author User
 */
//public class ReportView {
    
    
    
    
    
//}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dasun;

import com.mysql.jdbc.Connection;
import java.awt.Container;
import java.util.HashMap;
import javax.swing.*;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author Hasindu
 */
public class ReportView1 extends JFrame
{
    java.sql.Connection con = null;
    public ReportView1(String fileName)
    {
        this(fileName, null);
        
    }
    public ReportView1(String fileName, HashMap para)
    {
        super("ABC Solutions Employee/Project Management System (Report Viewer)");

         DBconnect dbc = new DBconnect();
          con = dbc.connect();
         

        try
        {
             
            JasperPrint print = JasperFillManager.fillReport(fileName, para, con);
            JRViewer viewer = new JRViewer(print);
            Container c = getContentPane();
            c.add(viewer);            
        } 
        catch (JRException jRException)
        {
            
        }
        setBounds(10, 10, 900, 700);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
}




package janitha;

//import java.sql.Date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JOptionPane;
import java.text.DateFormat;
import java.text.ParseException;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main extends javax.swing.JFrame {

   //Connection con=null;
   PreparedStatement pst =null;
   ResultSet rs=null;
   DBconnect dbc = new DBconnect();
    public Main() {
        //setUndecorated(true);
        initComponents();
        //con = DBconnect.dbconnect();
        try {
             new Thread(new Runnable() {

            @Override
            public void run() {
                Date d = new Date();
                SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");

                String s2 = sd.format(d);
                date1.setText(s2);

            }
        }).start();
        new Thread(new Runnable() {

            @Override
            public void run() {
                while (true) {
                    Date d = new Date();
                    String s = d.toString();
                    String ar[] = s.split(" ");
                    time1.setText(ar[3]);

                }
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        }).start();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        String today = "";
        
        DateFormat fmt;
        fmt = new SimpleDateFormat("yyyy-MM-dd");
        
        Date d = new Date();
        today = fmt.format(d);
        /*
        select * from employee e where e.eid not in (select eid from attendance a where a.today='09-14')
        */
        try{
        String sql1="select * from attendance1 a, employee e where a.today='"+today+"' and a.eid=e.eid ";
        pst=dbc.con.prepareStatement(sql1);
            //JOptionPane.showConfirmDialog(null,"stae");
            rs=pst.executeQuery();
            while(rs.next()){
                   String eid = rs.getString("eid");
                   String name = rs.getString("name_i");
                   
                   DefaultTableModel model = (DefaultTableModel) avbl2.getModel();
                   model.addRow(new Object[]{eid,name});
        
        }
            
        String sql2 = "select eid,name_i from employee e where eid not in (select eid from attendance1 where today='"+today+"')";
        //String sql2 = "select * form attendance a,employee a where a.to"
         pst=dbc.con.prepareStatement(sql2);
            //JOptionPane.showConfirmDialog(null,"stae");
            rs=pst.executeQuery();
            while(rs.next()){
                   String eid = rs.getString("eid");
                   String name = rs.getString("name_i");
                   
                   DefaultTableModel model1 = (DefaultTableModel) table1.getModel();
                   model1.addRow(new Object[]{eid,name});
        
        }
        
        }
        
        catch(Exception e){
            JOptionPane.showConfirmDialog(null,e);}
        
        
        try {
             new Thread(new Runnable() {

            @Override
            public void run() {
                Date d=new Date();
                d = new Date();
                SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");

                
            }
        }).start();
        new Thread(new Runnable() {

            @Override
            public void run() {
                while (true) {
                    Date d = new Date();
                    String s = d.toString();
                    String ar[] = s.split(" ");
                    jLabel1.setText(ar[3]);

                }
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        }).start();
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    

    String src;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Leave_TIME = new javax.swing.JTextField();
        Report_Btn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Report_Time = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cmb_search = new javax.swing.JComboBox<>();
        txt_search = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        avbl2 = new javax.swing.JTable();
        time1 = new javax.swing.JLabel();
        date1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        avbl = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        ntabl = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        logoutbtn = new javax.swing.JLabel();
        backbtn = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 800));
        jPanel1.setLayout(null);

        jButton2.setBackground(new java.awt.Color(51, 204, 0));
        jButton2.setText("Leaving");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(936, 574, 123, 28);

        jLabel3.setText("Search With :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(867, 141, 80, 14);
        jPanel1.add(Leave_TIME);
        Leave_TIME.setBounds(766, 574, 158, 28);

        Report_Btn.setBackground(new java.awt.Color(51, 204, 0));
        Report_Btn.setText("Reporting");
        Report_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Report_BtnActionPerformed(evt);
            }
        });
        jPanel1.add(Report_Btn);
        Report_Btn.setBounds(936, 534, 123, 29);

        jButton3.setBackground(new java.awt.Color(0, 153, 0));
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(968, 206, 80, 23);
        jPanel1.add(Report_Time);
        Report_Time.setBounds(766, 534, 158, 29);

        jLabel1.setFont(new java.awt.Font("Digital-7 Italic", 1, 36)); // NOI18N
        jLabel1.setText("10:10");
        jLabel1.setMaximumSize(new java.awt.Dimension(100, 100));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(766, 454, 146, 74);

        cmb_search.setBackground(new java.awt.Color(0, 153, 0));
        cmb_search.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One...", "ID", "Name" }));
        jPanel1.add(cmb_search);
        cmb_search.setBounds(951, 138, 98, 20);

        txt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchActionPerformed(evt);
            }
        });
        jPanel1.add(txt_search);
        txt_search.setBounds(867, 168, 182, 27);

        jButton1.setBackground(new java.awt.Color(51, 204, 0));
        jButton1.setText("Leaves");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(936, 613, 123, 30);

        jPanel2.setBackground(new java.awt.Color(0, 153, 0));

        avbl2.setBackground(new java.awt.Color(0, 255, 0));
        avbl2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(avbl2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 454, 340, 203);

        time1.setBackground(new java.awt.Color(255, 255, 255));
        time1.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        time1.setForeground(new java.awt.Color(255, 255, 255));
        time1.setText("time");
        jPanel1.add(time1);
        time1.setBounds(790, 0, 70, 20);

        date1.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        date1.setForeground(new java.awt.Color(255, 255, 255));
        date1.setText("date");
        jPanel1.add(date1);
        date1.setBounds(780, 20, 100, 10);

        jPanel3.setBackground(new java.awt.Color(0, 153, 0));

        table1.setBackground(new java.awt.Color(0, 255, 0));
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 343, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(381, 454, 343, 203);

        jPanel4.setBackground(new java.awt.Color(51, 204, 0));

        avbl.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        avbl.setForeground(new java.awt.Color(255, 255, 255));
        avbl.setText("Available");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(avbl)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(avbl)
                .addContainerGap())
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(140, 396, 89, 40);

        jPanel5.setBackground(new java.awt.Color(0, 204, 0));

        ntabl.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        ntabl.setForeground(new java.awt.Color(255, 255, 255));
        ntabl.setText("Not Available");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ntabl)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ntabl)
                .addContainerGap())
        );

        jPanel1.add(jPanel5);
        jPanel5.setBounds(493, 396, 121, 40);

        jPanel6.setBackground(new java.awt.Color(0, 153, 0));

        table.setBackground(new java.awt.Color(0, 255, 0));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel6);
        jPanel6.setBounds(586, 235, 472, 108);

        logoutbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/logoutbtn.png"))); // NOI18N
        logoutbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutbtnMouseClicked(evt);
            }
        });
        jPanel1.add(logoutbtn);
        logoutbtn.setBounds(1020, 10, 25, 25);

        backbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/backbtn.png"))); // NOI18N
        backbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backbtnMouseClicked(evt);
            }
        });
        jPanel1.add(backbtn);
        backbtn.setBounds(990, 10, 25, 25);

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mark Attendance");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 20, 210, 30);

        jButton4.setBackground(new java.awt.Color(51, 204, 0));
        jButton4.setText("Attendance Details");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(800, 620, 123, 31);

        jButton5.setBackground(new java.awt.Color(102, 204, 0));
        jButton5.setText("IReport");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(950, 660, 100, 30);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/closebtn.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11);
        jLabel11.setBounds(1050, 10, 25, 25);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/minimizebtn.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10);
        jLabel10.setBounds(960, 10, 25, 25);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/main2.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1080, 720);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1096, 759));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchActionPerformed
    
    public void load(){
        
        DateFormat fmt;
        fmt = new SimpleDateFormat("yyyy-MM-dd");
        
        Date d = new Date();
        String today = fmt.format(d);
        String name1 = Report_Time.getText();
    try{
        String sql1="select * from attendance1 a, employee e where a.today='"+today+"' and a.eid=e.eid and a.eid ='"+name1+"'";
        pst=dbc.con.prepareStatement(sql1);
            //JOptionPane.showConfirmDialog(null,"stae");
            rs=pst.executeQuery();
           while(rs.next()){
                   String eid = rs.getString("eid");
                   String name = rs.getString("name_i");
                   
                   DefaultTableModel model = (DefaultTableModel) avbl2.getModel();
                   model.addRow(new Object[]{eid,name});
                   DefaultTableModel model2 = (DefaultTableModel) table1.getModel();
                
                   for(int i=0; i<=model2.getRowCount();i++){
                   
                       String row = (String)table1.getValueAt(i, 0);
                       
                           System.out.println("row ="+row);
                       
                       if(row.equals(name1))                           
                       {
                           System.out.println("row ="+row);
                            model2.removeRow(i);
                       }
                   
                   }
        
        }
}
    catch(Exception e)
    {}
    
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      DefaultTableModel model = (DefaultTableModel) table.getModel();
        try{
            String search = txt_search.getText();
            if (cmb_search.getSelectedItem().toString()== "ID"){
                String sql1 ="select * from employee where eid = '"+search+"'";
                //JOptionPane.showConfirmDialog(null,"stae");
                pst=dbc.con.prepareStatement(sql1);
                //JOptionPane.showConfirmDialog(null,"stae");
                rs=pst.executeQuery();
                while(rs.next()){
                String id = rs.getString("eid");
                String name = rs.getString("name_i");
               
                
                model.addRow(new Object[]{id,name});
                }
                
                
                
                
            
        }
            
            else if(cmb_search.getSelectedItem().toString()== "Name"){
            
            
            
                String sql1 ="select * from employee where name_i LIKE '%"+search+"%'";
                //JOptionPane.showConfirmDialog(null,"stae");
                pst=dbc.con.prepareStatement(sql1);
                rs=pst.executeQuery();
                while(rs.next()){
                String id = rs.getString("eid");
                String name = rs.getString("name_i");
                
                model.addRow(new Object[]{id,name});
                }
            
            
            }
            
            
        }
         catch (Exception e){
         
         JOptionPane.showConfirmDialog(null,e);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

   
    
    
    
    private void Report_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Report_BtnActionPerformed
        String EID = Report_Time.getText();
        
        
   
    
    if (EID.isEmpty()){
        
    JOptionPane.showMessageDialog(null, "Input the ID No");  
    //System.out.println("Enter the ID NO");
    
    }else{
        
        String today = "";
        
        DateFormat fmt;
        fmt = new SimpleDateFormat("yyyy-MM-dd");
        
        Date d = new Date();
        today = fmt.format(d);
        
        DateFormat fmt1;
        fmt1 = new SimpleDateFormat("HH:mm");
        
        String time = fmt1.format(d);
                   
       
        try{
            String sql1 ="select * from attendance1 where eid = '"+EID+"' and today='"+today+"'";
                //JOptionPane.showConfirmDialog(null,"stae");
            pst=dbc.con.prepareStatement(sql1);
                //JOptionPane.showConfirmDialog(null,"stae");
            rs=pst.executeQuery();
            
            if(rs.next()){
                  JOptionPane.showMessageDialog(null,"You Can Mark Your Attendance Only One Time!!");
                  System.out.println("deparak enna ba");
            }else{
                System.out.println("awulak na");
                try {
                    String sql8="insert into attendance1(eid, today, startX) values('" + EID + "', '" + today + "', '" + time + "')";
                    //System.out.println("wwww");
                    pst=dbc.con.prepareStatement(sql8);
                      //System.out.println("eeee");
                    pst.executeUpdate();
                     // System.out.println("tttt");
                    JOptionPane.showMessageDialog(null,"Successfully Reported");
                    //pst.executeUpdate(sql1);
                    load();
//         try{
//         
////         String sql14="select * from attendance where eid='"+EID+"'";
////         pst=dbc.con.prepareStatement(sql14);
////                //JOptionPane.showConfirmDialog(null,"stae");
////         rs=pst.executeQuery();
////         
////         while(rs.next()){
////         String s = rs.getString(2);
////         int att = (Integer.parseInt(s)+1);
////         
////         String sql15 = "update attendance set (attendace='"+att+"')";
////         pst=dbc.con.prepareStatement(sql15);
////         System.out.println("eeee");
////         pst.executeUpdate();
//         }
//        
//        
//        }
//        
//        
//        catch(Exception e){
//        
//                    JOptionPane.showMessageDialog(null,e);
//        
//        }
         
                    
                    
                    
                   

                    
                    
                    
                }
                catch(Exception e){
                }
            
            }
            
        }catch(Exception e){}
        
        
        
        
        
        
        
       //attend(); 
        
        
           
   }
    
       //GetCurrentDateAndTime();
        
    }                                        
    
    
    public void  GetCurrentDateAndTime()
{



        // TODO add your handling code here:
    }//GEN-LAST:event_Report_BtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        String EID = Leave_TIME.getText();
        
//        String ot = "14:00";
//        Date OtStart = new Date();
//        Date markedTime =  new Date();
//        
        
//       try {
           
//           OtStart = new SimpleDateFormat("HH:mm").parse(ot);
//           markedTime= new SimpleDateFormat("HH:mm").parse(EID);
//           
           
           
//           // String a= Report_Time.getText();
//       } catch (ParseException ex) {
//           Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//       }
//   
    
    if (EID.isEmpty()){
        
    JOptionPane.showMessageDialog(null, "Input the ID No");  
    //System.out.println("Enter the ID NO");
    
    }else{
        
        String ot = "14:00";
        Date OtStart = new Date();
        
        
        String today = "";
        
        DateFormat fmt;
        fmt = new SimpleDateFormat("yyyy-MM-dd");
        
        Date d = new Date();
        today = fmt.format(d);
        
        Date markedTime =  d;
        
        DateFormat fmt1;
        fmt1 = new SimpleDateFormat("HH:mm");
        
        String time = fmt1.format(d);
                   
       try{
            OtStart = new SimpleDateFormat("HH:mm").parse(ot);
            markedTime= new SimpleDateFormat("HH:mm").parse(time);
           
           
           
            String sql1 ="select * from attendance1 where eid = '"+EID+"' and today='"+today+"' and endX=''";
                //JOptionPane.showConfirmDialog(null,"stae");
            pst=dbc.con.prepareStatement(sql1);
                //JOptionPane.showConfirmDialog(null,"stae");
            rs=pst.executeQuery();
            
            if(rs.next())
            {
                  JOptionPane.showConfirmDialog(null,"You Can Leave Only one Time!!");
                  System.out.println("deparak yanna ba");
            }
            
            else
            {
                System.out.println("awulak na");
                
        
                    try
                    {
                      String sql2="update attendance1 set endX='"+time+"' where eid='"+EID+"' and today='"+today+"'";
                      //System.out.println("wwww");
                      pst=dbc.con.prepareStatement(sql2);
                        //System.out.println("eeee");
                      pst.executeUpdate();
                      
                      if (markedTime.after(OtStart)){
                      
                       SalaryCal cal = new SalaryCal();
                       cal.checkShortLeaves(EID, today);
                      
                      }
                      
                      JOptionPane.showMessageDialog(null,"Have a Nice Day!");
                      //pst.executeUpdate(sql1);
//                      while(rs.next()){
//                          
//                          int end = Integer.parseInt(rs.getString("endX"));
//                          int start = Integer.parseInt(rs.getString("startX"));
//                          int dif = (end-start);
//                          String work_hours = Integer.toString(dif);
//                          
//                           String sql0="insert into attendance1 (working_hours) values ('"+work_hours+"')";
//                      //System.out.println("wwww");
//                      pst=dbc.con.prepareStatement(sql0);
//                        //System.out.println("eeee");
//                      pst.executeUpdate();
//                      
//                      if(dif > 8){
//                      int ot =dif-8;
//                      String ott = Integer.toString(ot);
//                      
//                      String sql3="insert into attendance1 (ot) values ('"+ott+"')";
//                      //System.out.println("wwww");
//                      pst=dbc.con.prepareStatement(sql3);
//                        //System.out.println("eeee");
//                      pst.executeUpdate();
//                      
//                      
//                      
//                      }
//                      
//                      else{
//                      
//                      String sql5="insert into attendance1 (short_leaves) values ('"+work_hours+"')";
//                      //System.out.println("wwww");
//                      pst=dbc.con.prepareStatement(sql5);
//                        //System.out.println("eeee");
//                      pst.executeUpdate();
//                      
//                      }
//                      
//                      
//                      }

                  }
                    
                  catch(Exception e)
                  {
                      
                  }
                    
            }
        }
       catch (ParseException ex) {
           Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
       }
        catch(Exception e)
        {
            
            
        }
       
       
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Leave_Man attend = new Leave_Man();
        attend.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void logoutbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutbtnMouseClicked
       
    }//GEN-LAST:event_logoutbtnMouseClicked

    private void backbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbtnMouseClicked
        Emp_Main mn = new Emp_Main();
        mn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backbtnMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        checkatt ca = new checkatt();
        ca.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        try{

//            String report = "C:\\Users\\user\\Downloads\\interfaces\\interfaces\\Lord JB\\ITP_Report01.jrxml";
//            JasperReport jr = JasperCompileManager.compileReport(report);
//            JasperPrint jp = JasperFillManager.fillReport(jr, null,dbc.con);
//            JasperViewer.viewReport(jp);

        }

        catch (Exception e){

            JOptionPane.showMessageDialog(null, e);

        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jLabel10MouseClicked
   
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Leave_TIME;
    private javax.swing.JButton Report_Btn;
    private javax.swing.JTextField Report_Time;
    private javax.swing.JLabel avbl;
    private javax.swing.JTable avbl2;
    private javax.swing.JLabel backbtn;
    private javax.swing.JComboBox<String> cmb_search;
    private javax.swing.JLabel date1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel logoutbtn;
    private javax.swing.JLabel ntabl;
    private javax.swing.JTable table;
    private javax.swing.JTable table1;
    private javax.swing.JLabel time1;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}

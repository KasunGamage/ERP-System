/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasun;


import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import static java.lang.Integer.parseInt;


public class add_salary extends javax.swing.JFrame {

    Connection con =null;
    PreparedStatement pst=null;
    ResultSet rs =null;
    
 //   String year  = String.valueOf(Calendar.getInstance().get(Calendar.YEAR)); //get cuurent year
 //   int Month    = Calendar.getInstance().get(Calendar.MONTH); //get current month
    
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
    Date date = new Date();
    
    
    
    public add_salary() {
        initComponents();
        
          con = dbconnect.connect();
         
          tableload();
          
          this.setResizable(false);
            
          
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
        
    }

    
    public void tableload()
    {
        
        try 
        {
        
        String sql ="SELECT salary_id,employee_id,employee_name,employee_type,date,basic_salary,allowance,gross_salary,deduction,net_salary FROM salarydb";
        pst=con.prepareStatement(sql);
        rs =pst.executeQuery();
        
        
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
        }
        
        catch (Exception e)
        {
            System.out.println(e);
        }
     
        
        
    }
    
   
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        titlebox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        logoutbtn = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        date1 = new javax.swing.JLabel();
        time1 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 720));
        setSize(new java.awt.Dimension(1024, 720));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Employee Id");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 110, 140, 30);

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("+ Monthly Payment");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel12.setIconTextGap(10);
        jLabel12.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel12);
        jLabel12.setBounds(40, 20, 270, 30);

        jTextField3.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(102, 102, 102));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(290, 110, 140, 30);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 150, 140, 30);

        jTextField2.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(102, 102, 102));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(290, 150, 140, 30);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Title");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(110, 190, 140, 30);

        titlebox.setBackground(new java.awt.Color(0, 153, 0));
        titlebox.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        titlebox.setForeground(new java.awt.Color(255, 255, 255));
        titlebox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Title...", "Manager", "Accountant", "Sales Representer", "Driver", "Labour" }));
        titlebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleboxActionPerformed(evt);
            }
        });
        getContentPane().add(titlebox);
        titlebox.setBounds(290, 190, 140, 30);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Basic Salary");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(110, 230, 140, 30);

        jTextField4.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(102, 102, 102));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(290, 230, 140, 30);

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Bonus");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(110, 370, 140, 30);

        jTextField6.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(102, 102, 102));
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6);
        jTextField6.setBounds(290, 370, 140, 30);

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("overtime");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(110, 410, 140, 30);

        jTextField7.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(102, 102, 102));
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7);
        jTextField7.setBounds(290, 410, 140, 30);
        getContentPane().add(jLabel15);
        jLabel15.setBounds(10, 10, 34, 14);
        getContentPane().add(jLabel16);
        jLabel16.setBounds(750, 70, 80, 20);

        jLabel20.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Leaves");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(560, 170, 170, 30);

        jLabel14.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Deductions ");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(760, 90, 120, 40);

        jTextField12.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField12);
        jTextField12.setBounds(290, 450, 140, 30);

        jTextField17.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        getContentPane().add(jTextField17);
        jTextField17.setBounds(750, 130, 140, 30);

        jLabel19.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Advance Pay");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(560, 130, 170, 30);

        jTextField16.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField16);
        jTextField16.setBounds(750, 380, 140, 30);

        jTextField15.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField15);
        jTextField15.setBounds(750, 420, 140, 30);

        jLabel21.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Gross Salary");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(110, 450, 170, 30);

        jLabel23.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Net Salary");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(560, 420, 170, 30);

        jLabel24.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("EPF(10%)");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(560, 250, 170, 30);

        jTextField19.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jTextField19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField19ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField19);
        jTextField19.setBounds(750, 170, 140, 30);

        jLabel26.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Total Deduction");
        getContentPane().add(jLabel26);
        jLabel26.setBounds(560, 380, 170, 30);

        jTextField20.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jTextField20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField20ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField20);
        jTextField20.setBounds(750, 250, 140, 30);

        jButton6.setBackground(new java.awt.Color(0, 153, 0));
        jButton6.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Add Salary");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(770, 460, 100, 30);

        jTable1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee Name", "Title", "Basic Salary", "Year", "Month", "Allowances", "Gross salay", "Deductions", "Net Salary"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 540, 920, 140);

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Month");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(110, 270, 150, 30);

        jLabel25.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Taxes");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(560, 210, 170, 30);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/closebtn.png"))); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel17);
        jLabel17.setBounds(980, 0, 30, 40);

        logoutbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/logoutbtn.png"))); // NOI18N
        logoutbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutbtnMouseClicked(evt);
            }
        });
        getContentPane().add(logoutbtn);
        logoutbtn.setBounds(950, 5, 25, 30);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/minimizebtn.png"))); // NOI18N
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel22);
        jLabel22.setBounds(920, 0, 30, 40);

        date1.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        date1.setForeground(new java.awt.Color(255, 255, 255));
        date1.setText("date");
        getContentPane().add(date1);
        date1.setBounds(730, 20, 80, 10);

        time1.setBackground(new java.awt.Color(255, 255, 255));
        time1.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        time1.setForeground(new java.awt.Color(255, 255, 255));
        time1.setText("time");
        getContentPane().add(time1);
        time1.setBounds(740, 0, 70, 20);

        jTextField21.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jTextField21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField21ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField21);
        jTextField21.setBounds(750, 210, 140, 30);

        jButton7.setBackground(new java.awt.Color(0, 153, 0));
        jButton7.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Clear");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(630, 460, 100, 30);

        jLabel27.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Stamp Charges");
        getContentPane().add(jLabel27);
        jLabel27.setBounds(560, 290, 170, 30);

        jTextField22.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        getContentPane().add(jTextField22);
        jTextField22.setBounds(750, 290, 140, 30);

        jLabel18.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Allowances");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(300, 330, 120, 40);

        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/backbtn.png"))); // NOI18N
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel28);
        jLabel28.setBounds(890, 0, 30, 40);

        jTextField5.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(102, 102, 102));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(290, 270, 140, 30);

        jSeparator2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(40, 320, 480, 190);

        jSeparator1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(540, 350, 420, 160);

        jSeparator3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(40, 90, 480, 220);

        jSeparator4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(540, 90, 420, 250);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/backsup.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1024, 720);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

     
    public void cleardata()
    {
        jTextField3.setText("");
        jTextField2.setText("");
        titlebox.setSelectedIndex(0);
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField12.setText("");
        jTextField17.setText("");
        jTextField19.setText("");
        jTextField21.setText("");
        jTextField20.setText(""); 
        jTextField22.setText("");
        jTextField16.setText("");
        jTextField15.setText("");  
        
    }
    
    
    
    
    
    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed

        
      
        String id =jTextField3.getText(); //get employee id from user
        
        
        
           DateFormat d_f_1 = new SimpleDateFormat("yyyy/MM/01");          
           DateFormat d_f_2 = new SimpleDateFormat("yyyy/MM/31");          
           DateFormat y_m = new SimpleDateFormat("yyyy/MM");   
           Date date = new Date();
           
           
           String f_d=d_f_1.format(date); //first day of current month
           String l_d=d_f_2.format(date); //last day of current month
           
           //System.out.print(f_d);
           String y__m=y_m.format(date);
           jTextField6.setText("0"); // bonus
           jTextField21.setText("0"); // taxes
           jTextField22.setText("25"); // stamps value
           jTextField5.setText(y__m); //current date
           jTextField7.setText("0");
           jTextField17.setText("0");
           jTextField19.setText("0");
           
           // set name , title , basic salary , 
         try {

            String sql=" SELECT e.f_name, e.title, em.basic_salary FROM employee e,salarydetailsdb em WHERE e.title = em.employee_type AND e.eid ='"+ id +"'";
            pst=con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next()){
                jTextField2.setText(rs.getString("f_name"));
                titlebox.setSelectedItem(rs.getString("title"));
                jTextField4.setText(rs.getString("basic_salary"));             
            }
          
            
            
        }
        catch (SQLException ex)

        {
            System.out.println("error 1");
            System.out.println(ex);
        }

         //set epf
         
         double bas=Double.parseDouble(jTextField4.getText());
         double ep=(bas*10)/100;
         jTextField20.setText(String.valueOf(ep));
         
         
        
         // set advance payment , epf
         
         try {
            
            String sql=" SELECT a.amount FROM advancepaydb a WHERE a.employee_id = '" +id+"' AND a.date ='"+ y__m +"'";
            pst=con.prepareStatement(sql);
            rs = pst.executeQuery();
             
            while(rs.next()){
                jTextField17.setText(rs.getString("amount"));             
            }
             
             
        } catch (Exception e) {
            
            System.out.println("error 2");
             System.out.println(e);
            
        }
           
         //set ot
        try
        {
           
            
            
         String sql2 ="SELECT SUM(a.ot) FROM attendance1 a WHERE a.eid='"+ id +"' AND a.today between '" +f_d+ "' AND '" +l_d+ "'  Group by a.eid";
         pst = con.prepareStatement(sql2);
         rs =pst.executeQuery();
         
         //a.startX= '" +f_d+ "'  a.endX = '" +l_d+ "'
         while(rs.next())
         {
            int othours=Integer.parseInt(rs.getString("SUM(a.ot)"));
            //System.out.println(othours);
            
            String sql3="SELECT e.ot_rate_hour FROM salarydetailsdb e,employee em WHERE e.employee_type = em.title AND em.eid ='"+id+"' ";
            pst = con.prepareStatement(sql3);
            rs =pst.executeQuery();

         
             while(rs.next())
            {
                int rate=Integer.parseInt(rs.getString("ot_rate_hour"));
                int otpay=othours*rate;    
                
                  //System.out.println(otpay);
                jTextField7.setText(String.valueOf(otpay));
            }
             
            
         }
         
          int bs=Integer.parseInt(jTextField4.getText());
             int bo=Integer.parseInt(jTextField6.getText());
             int ott=Integer.parseInt(jTextField7.getText());
             
             int gross=bs+bo+ott;
             jTextField12.setText(String.valueOf(gross));
             
        
     
        } catch (SQLException e) {
            
            System.out.println("error 3");
             System.out.println(e);
        }
        
      
        
        
        try {
              
            String sql4="SELECT amount FROM advancepaydb WHERE date='"+y__m+"' AND employee_id='"+id+"' ";
            pst = con.prepareStatement(sql4);
            rs = pst.executeQuery();

             
            
            while(rs.next())
            {
              
               int am=Integer.parseInt(rs.getString("amount"));
                //System.out.println(am);
            
             jTextField17.setText(String.valueOf(am));
            }
        } 
        
        catch (SQLException e) {
            System.out.println("error 4");
             System.out.println(e);
        }
        
        
        
       // jTextField19.
                
           try 
           {
               String sql5="SELECT e.leaves_cut_hour FROM salarydetailsdb e,employee em WHERE em.title=e.employee_type AND em.eid='"+id+"' ";
               pst = con.prepareStatement(sql5);
               rs = pst.executeQuery();
               
               while(rs.next())
               {
                   int leaveamo=Integer.parseInt(rs.getString("leaves_cut_hour"));
                  // System.out.println(leaveamo);
                   
               String sql6="SELECT sum(a.short_leaves) FROM attendance1 a WHERE eid='"+id+"' AND  a.today between '" +f_d+ "' AND '" +l_d+ "'  Group by a.eid";
               pst = con.prepareStatement(sql6);
               rs = pst.executeQuery();
                while(rs.next())
               {
                   int leavehou=Integer.parseInt(rs.getString("sum(a.short_leaves)"));
                  // System.out.println(leaveamo);
                   int leavecut =leaveamo*leavehou; 
                  // System.out.println(leavecut);
                   jTextField19.setText(String.valueOf(leavecut));    
               }
               }
            
               
             int d_ap=Integer.parseInt(jTextField17.getText());
             int d_lea=Integer.parseInt(jTextField19.getText());
             int d_tax=Integer.parseInt(jTextField21.getText());
             double d_epf=Double.parseDouble(jTextField20.getText());
             int d_stamp=Integer.parseInt(jTextField22.getText());
             
             double totaldeduct=d_ap+d_lea+d_tax+d_epf+d_stamp;
             jTextField16.setText(String.valueOf(totaldeduct));
             
           //  System.out.print(totaldeduct);
           
             double gro=Double.parseDouble(jTextField12.getText());
             double net=gro-totaldeduct;
             jTextField15.setText(String.valueOf(net));
                   
               
           }    
           
           
           
           
           
           catch (Exception e)
           {
               System.out.println("error 5");
               System.err.println(e);
               
           }
        
  
        
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

      
    
    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jTextField19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField19ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

                        String empid=jTextField3.getText();
                        String name=jTextField2.getText();
                        String emptype=String.valueOf(titlebox.getSelectedIndex());
                        String date=jTextField5.getText(); 
                        String bon = jTextField6.getText();
                        String ov =jTextField7.getText();
                        String basic=jTextField4.getText();  
                        String gross=jTextField12.getText(); 
                        String ad=jTextField17.getText();
                        String le=jTextField19.getText();
                        String tx=jTextField21.getText();  
                        String ep=jTextField20.getText();         
                        String sta=jTextField22.getText(); 
                       //String ad=jTextField17.getText(); 
                        String deduction=jTextField16.getText(); 
                        String netsal=jTextField15.getText();
                        
         boolean p=false;               
                        
         try {
                       
                            

                            String sql2 ="SELECT date FROM salarydb WHERE employee_id ='"+empid+"' ";  
                            pst=con.prepareStatement(sql2);
                            rs = pst.executeQuery();

                            while(rs.next())
                           {
                                String da= rs.getString("date");
                                if(da.equals(date))
                                {
                                    p=true;
                                }
                                
                           }
             
        } catch (Exception e) {
        }
         
         
                        
        if(empid.isEmpty() || name.isEmpty() || emptype.equals(0) || basic.isEmpty() || date.isEmpty() || bon.isEmpty() || ov.isEmpty() || gross.isEmpty() 
                || ad.isEmpty() || le.isEmpty() ||tx.isEmpty() || ep.isEmpty() || sta.isEmpty() || deduction.isEmpty() || netsal.isEmpty() )
        {
            
             JOptionPane.showMessageDialog(this, "Fields are empty!\n please enter the employee id and press enter to generate details ");
            
        }
        
        else if(p==true)
                {
                    JOptionPane.showMessageDialog(this, "Payment is already given");
                    cleardata();
                }
        
        
        
                 else
             {
                        boolean success =false;
        
                        int bonus=Integer.parseInt(jTextField6.getText());
                        int ot=Integer.parseInt(jTextField7.getText());
                        
                        
                        
                        
                       
                        
                        String id=empid;
                     //   int da=Integer.parseInt(date); 
                        int ba=Integer.parseInt(basic); 
                        int all=ot+bonus; 
                        double gro=Double.parseDouble(gross);
                        double de=Double.parseDouble(deduction); 
                        double net=Double.parseDouble(netsal);
                        
                        try {

                        String sql=" INSERT INTO salarydb(employee_id,employee_name,employee_type,date,basic_salary,allowance,gross_salary,deduction,net_salary) VALUES ('"+id+"','"+name+"','"+emptype+"','"+date+"','"+ba+"' ,'"+all+"' ,'"+gro+"' ,'"+de+"' ,'"+net+"') ";
                        pst =con.prepareStatement(sql);
                        pst.execute();
                        success = true;
                    }
                    catch (SQLException ex)

                    {
                        System.out.println(ex);
                    }

                  
                        
                    if(success)
                    {
                        JOptionPane.showMessageDialog(this,"New payment is Added to the database!","Success",1);
                        tableload();
                        cleardata();
                    }
                    
                    

                    else
                    {
                        JOptionPane.showMessageDialog(this,"Operation failed","Error", 0);
                    }
        
                }
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void titleboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleboxActionPerformed

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked

        Payroll_Main m=new Payroll_Main();
        m.setVisible(true);
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel28MouseClicked

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField21ActionPerformed

    private void jTextField20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField20ActionPerformed

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel17MouseClicked

    private void logoutbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutbtnMouseClicked

    }//GEN-LAST:event_logoutbtnMouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        // TODO add your handling code here:
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       
        cleardata();
        
        
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(add_salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_salary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date1;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel logoutbtn;
    private javax.swing.JLabel time1;
    private javax.swing.JComboBox<String> titlebox;
    // End of variables declaration//GEN-END:variables
}

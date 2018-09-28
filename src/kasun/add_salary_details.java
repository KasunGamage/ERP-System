/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasun;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Kasun
 */
public class add_salary_details extends javax.swing.JFrame {

  
    Connection con =null;
    PreparedStatement pst=null;
    ResultSet rs =null;
    
    
    public add_salary_details() {
        initComponents();
        
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
        
        
     con = dbconnect.connect();   
     
     tableload();
        
    }

    
  
 
    public void tableload()
    {
        
        try 
        {
        
        String sql ="SELECT type_id,employee_type,basic_salary,ot_rate_hour,epf,etf,leaves_cut_hour,max_advance_pay_amount FROM salarydetailsdb ";
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

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        logoutbtn = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        date1 = new javax.swing.JLabel();
        time1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 720));
        setResizable(false);
        getContentPane().setLayout(null);

        jTextField1.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setToolTipText("");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(480, 140, 140, 30);

        jTextField2.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setToolTipText("");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(480, 180, 140, 30);

        jTextField3.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setToolTipText("");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(480, 260, 140, 30);

        jTextField4.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setToolTipText("");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(480, 220, 140, 30);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Overtime Rate ->  ((basic/30)*1.5)");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(180, 230, 200, 30);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("EPF");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(180, 270, 160, 30);

        jButton1.setBackground(new java.awt.Color(0, 153, 0));
        jButton1.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(770, 290, 100, 30);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ETF");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(180, 310, 160, 30);

        jButton2.setBackground(new java.awt.Color(0, 153, 0));
        jButton2.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Add ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(770, 210, 100, 30);

        jTextField5.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setToolTipText("");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(480, 300, 140, 30);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Basic Salary");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(180, 190, 160, 30);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Employee Type");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 150, 160, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee Type Id", "Employee Type", "Basic Salary", "OverTime Rate", "EPF", "ETF", "Leave cut amount", "Maximum Advance Pay Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(70);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(70);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(4).setMaxWidth(50);
            jTable1.getColumnModel().getColumn(5).setMinWidth(40);
            jTable1.getColumnModel().getColumn(5).setMaxWidth(40);
            jTable1.getColumnModel().getColumn(6).setMinWidth(100);
            jTable1.getColumnModel().getColumn(7).setMinWidth(160);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(70, 490, 870, 180);

        jButton3.setBackground(new java.awt.Color(0, 153, 0));
        jButton3.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(770, 250, 100, 30);

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Id");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(480, 100, 140, 30);

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Employee Type Id");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(180, 110, 160, 30);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/closebtn.png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel16);
        jLabel16.setBounds(980, 0, 30, 40);

        logoutbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/logoutbtn.png"))); // NOI18N
        logoutbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutbtnMouseClicked(evt);
            }
        });
        getContentPane().add(logoutbtn);
        logoutbtn.setBounds(950, 5, 25, 30);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/minimizebtn.png"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel14);
        jLabel14.setBounds(920, 0, 30, 40);

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

        jButton4.setBackground(new java.awt.Color(0, 153, 0));
        jButton4.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(770, 330, 100, 30);

        jTextField6.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setToolTipText("");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6);
        jTextField6.setBounds(480, 380, 140, 30);

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Total Advance pay amount -> (Basic Salary/(1/3))");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(180, 390, 260, 30);

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Leaves amount per day -> (Basic Salary/30)");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(180, 350, 230, 30);

        jTextField7.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setToolTipText("");
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7);
        jTextField7.setBounds(480, 340, 140, 30);

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("+ Salary Details");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel12.setIconTextGap(10);
        jLabel12.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel12);
        jLabel12.setBounds(30, 20, 250, 30);

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/backbtn.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel11);
        jLabel11.setBounds(890, 5, 25, 30);

        jSeparator1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(690, 170, 250, 220);

        jSeparator2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(70, 70, 590, 390);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/backsup.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1024, 720);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed

               int ba= Integer.parseInt(jTextField2.getText());
               
               String overtimerate=String.valueOf((ba/30)*1.5);
               // b=String.valueOf(ba);
               int etfrate=5;
               int epfrate=10;
               String leaveamnt=String.valueOf(ba/30);
               String mxadvancepayment=String.valueOf(ba/3);
               
               
               
               jTextField4.setText(overtimerate);
               jTextField3.setText(String.valueOf(epfrate));
               jTextField5.setText(String.valueOf(etfrate));
               jTextField7.setText(leaveamnt);
                jTextField6.setText(mxadvancepayment);
               
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        
                
        
        
        String emp = jTextField1.getText();
        String bas = jTextField2.getText();
        String ove = jTextField4.getText();
        String ep  = jTextField3.getText();
        String et  = jTextField5.getText();
        String leav  = jTextField7.getText();
        String advance  = jTextField6.getText();
              
        boolean s = false;
        
                  try {

                            String sql2="SELECT employee_type FROM salarydetailsdb WHERE employee_type='"+emp+"' ";
                            pst =con.prepareStatement(sql2);
                            rs=pst.executeQuery();

                             while(rs.next())
                           {

                                String type =rs.getString("employee_type");

                                if(emp.equals(type))  
                               {         
                                s = true;              
                               }

                           }
                      } 

                catch (Exception e) 
                      {
                            System.out.println(e);
                      }
       
        if(s==true)
        {
              JOptionPane.showMessageDialog(this, emp+" Employee type is already there!");
              cleardata();
        }
    
      
        else if((emp.isEmpty() || bas.isEmpty() || ove.isEmpty() || ep.isEmpty() || et.isEmpty() || leav.isEmpty() || advance.isEmpty()))
        {
            JOptionPane.showMessageDialog(this, "Fields cannot be empty!");
        }
        
        
        
        
          
        else if(emp.matches("[0-9]+"))
                    {
                    
                          JOptionPane.showMessageDialog(this,"Employee Type field cannot have Ineger values");
                          jTextField1.setText(null);
                          
                    }
        
        
        else if(bas.matches("[a-zA-Z]+") || ove.matches("[a-zA-Z]+") || ep.matches("[a-zA-Z]+") || et.matches("[a-zA-Z]+") || leav.matches("[a-zA-Z]+") || advance.matches("[a-zA-Z]+"))
        {
            if(bas.matches("[a-zA-Z]+"))
            {
                JOptionPane.showMessageDialog(this,"Basic Salary field cannot have string values");
                jTextField2.setText(null);
            }
            
            else if(ove.matches("[a-zA-Z]+"))
            {
                JOptionPane.showMessageDialog(this,"Over Time rate field cannot have string values");
                jTextField4.setText(null);
            }
            
            else if(ep.matches("[a-zA-Z]*"))
            {
                JOptionPane.showMessageDialog(this,"EPF field cannot have string values");
                jTextField3.setText(null);
            }
            
            else if(et.matches("[a-zA-Z]*"))
            {
                JOptionPane.showMessageDialog(this,"ETF field cannot have string values");
                jTextField5.setText(null);
            }
            
               else if(leav.matches("[a-zA-Z]*"))
            {
                JOptionPane.showMessageDialog(this,"Leaves field cannot have string values");
                jTextField7.setText(null);
            }
            
               else if(advance.matches("[a-zA-Z]*"))
            {
                JOptionPane.showMessageDialog(this,"Advance Pay field cannot have string values");
                jTextField6.setText(null);
            }
          
            
            
        }
        
      
   
        else
        {
        

                    String employee_type = jTextField1.getText();
                    int basic = Integer.valueOf(jTextField2.getText());
                    double overtime_rate = Double.valueOf(jTextField4.getText());
                    int epf = Integer.valueOf(jTextField3.getText());
                    int etf = Integer.valueOf(jTextField5.getText());
                    int lea = Integer.valueOf(jTextField7.getText());
                    int adv = Integer.valueOf(jTextField6.getText());

                    boolean success =false;

                    
          
                    
                    try {

                        String sql=" INSERT INTO salarydetailsdb(employee_type,basic_salary,ot_rate_hour,epf,etf,leaves_cut_hour,max_advance_pay_amount) VALUES ('"+employee_type+"','"+basic+"','"+overtime_rate+"','"+epf+"','"+etf+"' , '"+lea+"' , '"+adv+"') ";
                        pst=con.prepareStatement(sql);
                        pst.execute();
                        success = true;
                    }
                    catch (SQLException ex)

                    {
                        System.out.println(ex);
                    }

                    if(success)
                    {
                        JOptionPane.showMessageDialog(this,"New salary detail is Added to the database!","Success",1);
                        tableload();
                        cleardata();
                    }

                    else
                    {
                        JOptionPane.showMessageDialog(this,"Operation failed","Error", 0);
                    }
                    
                    
    
                    
                    
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
      
        int r= jTable1.getSelectedRow();
        
        String id = jTable1.getValueAt(r, 0).toString();
        String type =jTable1.getValueAt(r, 1).toString();
        String basic =jTable1.getValueAt(r, 2).toString();
        String o_rate =jTable1.getValueAt(r, 3).toString();
        String epf =jTable1.getValueAt(r, 4).toString();
        String etf =jTable1.getValueAt(r, 5).toString();
        String leave =jTable1.getValueAt(r, 5).toString();
        String advance =jTable1.getValueAt(r, 6).toString();
        
        jLabel8.setText(id);
        jTextField1.setText(type);
        jTextField2.setText(basic);
        jTextField4.setText(o_rate);
        jTextField3.setText(epf);
        jTextField5.setText(etf);
        jTextField7.setText(leave);
        jTextField6.setText(advance);
        
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        
        String emp = jTextField1.getText();
        String bas = jTextField2.getText();
        String ove = jTextField4.getText();
        String ep  = jTextField3.getText();
        String et  = jTextField5.getText();
        String leav  = jTextField7.getText();
        String advance  = jTextField6.getText();
              
        
        
        
        
      //  boolean s = false;
        
        if((emp.isEmpty() || bas.isEmpty() || ove.isEmpty() || ep.isEmpty() || et.isEmpty() || leav.isEmpty() || advance.isEmpty()))
        {
            JOptionPane.showMessageDialog(this, "Fields cannot be empty!");
        }
    
        else if(emp.matches("[0-9]+"))
                    {
                          JOptionPane.showMessageDialog(this,"Employee Type field cannot have Ineger values");
                          jTextField1.setText(null);
                     }
        
        
        else if(bas.matches("[a-zA-Z]+") || ove.matches("[a-zA-Z]+") || ep.matches("[a-zA-Z]+") || et.matches("[a-zA-Z]+") || leav.matches("[a-zA-Z]+") || advance.matches("[a-zA-Z]+"))
        {
            if(bas.matches("[a-zA-Z]+"))
            {
                JOptionPane.showMessageDialog(this,"Basic Salary field cannot have string values");
                jTextField2.setText(null);
            }
            
            else if(ove.matches("[a-zA-Z]+"))
            {
                JOptionPane.showMessageDialog(this,"Over Time rate field cannot have string values");
                jTextField4.setText(null);
            }
            
            else if(ep.matches("[a-zA-Z]*"))
            {
                JOptionPane.showMessageDialog(this,"EPF field cannot have string values");
                jTextField3.setText(null);
            }
            
            else if(et.matches("[a-zA-Z]*"))
            {
                JOptionPane.showMessageDialog(this,"ETF field cannot have string values");
                jTextField5.setText(null);
            }
            
               else if(leav.matches("[a-zA-Z]*"))
            {
                JOptionPane.showMessageDialog(this,"Leaves field cannot have string values");
                jTextField7.setText(null);
            }
            
               else if(advance.matches("[a-zA-Z]*"))
            {
                JOptionPane.showMessageDialog(this,"Advance Pay field cannot have string values");
                jTextField6.setText(null);
            }
        }
       else
            {
        
     
                                int x = JOptionPane.showConfirmDialog(this, "Do you rwally want to update !");



                         if(x == 0)
                         {

                           int id =Integer.valueOf(jLabel8.getText());  
                           String employee_type = jTextField1.getText();
                           int basic = Integer.valueOf(jTextField2.getText());
                           int overtime_rate = Integer.valueOf(jTextField4.getText());
                           int epf = Integer.valueOf(jTextField3.getText());
                           int etf = Integer.valueOf(jTextField5.getText());
                           int lea = Integer.valueOf(jTextField7.getText());
                           int adv = Integer.valueOf(jTextField6.getText());

                             try 
                             {
                              String sql = "UPDATE salarydetailsdb SET employee_type ='"+employee_type+"' , basic_salary ='"+ basic +"' ,ot_rate_hour='"+overtime_rate +"', epf= '"+ epf +"' , etf= '"+ etf +"', leaves_cut_hour='"+lea +"' ,max_advance_pay_amount = '"+ adv +"' WHERE type_id = '"+ id +"' ";

                               pst = con.prepareStatement(sql);
                               pst.execute();

                               tableload();
                               cleardata();

                             } 

                             catch (Exception e)
                             {
                                 System.out.println(e);
                             }




                         }

       
            }

        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
       
      int x = JOptionPane.showConfirmDialog(this, "Do you really want to Delete !");
       
      
      
      if(x == 0)
      {
          
        int id=Integer.valueOf(jLabel8.getText());  
       
  
          try 
          {
           String sql = "DELETE  FROM salarydetailsdb WHERE type_id ='"+ id +"' ";
        
            pst = con.prepareStatement(sql);
            pst.execute();
            
            tableload();
              cleardata();
          } 
          
          catch (Exception e)
          {
              
          }
        


    }//GEN-LAST:event_jButton1ActionPerformed
    }
    
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed


        cleardata();
        jLabel8.setText("");

        
        
        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked

        Payroll_Main m=new Payroll_Main();
        m.setVisible(true);
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void logoutbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutbtnMouseClicked

    }//GEN-LAST:event_logoutbtnMouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jLabel14MouseClicked
    
   
    public void cleardata()
    {
        jTextField1.setText(null);
        jTextField2.setText(null);
        jTextField3.setText(null);
        jTextField4.setText(null);
        jTextField5.setText(null);
        jTextField6.setText(null);
        jTextField7.setText(null);
        
        
    }

    
    
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
            java.util.logging.Logger.getLogger(add_salary_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_salary_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_salary_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_salary_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_salary_details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel logoutbtn;
    private javax.swing.JLabel time1;
    // End of variables declaration//GEN-END:variables
}

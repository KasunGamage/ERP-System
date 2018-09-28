package kasun;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Kasun
 */
public class Add_advance_pay extends javax.swing.JFrame {

    
    Connection con =null;
    PreparedStatement pst=null;
    ResultSet rs =null;
    public Add_advance_pay() {
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

    
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM");
    Date date = new Date();
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        logoutbtn = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        date1 = new javax.swing.JLabel();
        time1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 720));
        setSize(new java.awt.Dimension(1024, 720));
        getContentPane().setLayout(null);

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("+ Advance Payment");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel12.setIconTextGap(10);
        jLabel12.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel12);
        jLabel12.setBounds(40, 20, 230, 30);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Amount");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(290, 290, 170, 30);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Employee Id");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(290, 130, 170, 30);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Employee Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(290, 170, 170, 30);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Employee Type");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(290, 210, 170, 30);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Date");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(290, 250, 170, 30);

        jTextField1.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(460, 130, 210, 30);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/minimizebtn.png"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel14);
        jLabel14.setBounds(920, 0, 30, 40);

        logoutbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/logoutbtn.png"))); // NOI18N
        logoutbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutbtnMouseClicked(evt);
            }
        });
        getContentPane().add(logoutbtn);
        logoutbtn.setBounds(950, 5, 30, 30);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/closebtn.png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel16);
        jLabel16.setBounds(980, 0, 30, 40);

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

        jTextField2.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        getContentPane().add(jTextField2);
        jTextField2.setBounds(460, 170, 210, 30);

        jTextField3.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(460, 210, 210, 30);

        jTextField4.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(460, 250, 210, 30);

        jTextField5.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(460, 290, 210, 30);

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Maxium Amount ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(680, 290, 120, 30);

        jButton1.setBackground(new java.awt.Color(0, 153, 0));
        jButton1.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(370, 360, 100, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee Id", "Employee Name", "Employee Type", "Date", "Amount"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(80, 470, 840, 180);

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel8);
        jLabel8.setBounds(790, 290, 80, 30);

        jButton2.setBackground(new java.awt.Color(0, 153, 0));
        jButton2.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(500, 360, 100, 30);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/backbtn.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10);
        jLabel10.setBounds(890, 0, 30, 40);

        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(80, 90, 840, 340);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/backsup.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1024, 720);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

  
   
    
    public void cleardata()
    {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText(""); 
        jLabel8.setText("");
        
    }
    
    public void tableload()
    {
        
        try 
        {
        
        String sql ="SELECT payment_id,employee_id,employee_name,employee_type,date,amount FROM advancepaydb";
        pst=con.prepareStatement(sql);
        rs =pst.executeQuery();
        
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
        }
        
        catch (Exception e)
        {
            System.out.println(e);
        }
     
        
        
    }
    
    
    
    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        //add to the database
        
        String emp_id   = jTextField1.getText();
        String emp_name = jTextField2.getText();
        String emp_type = jTextField3.getText();
        String date     = jTextField4.getText();
        String amount   = jTextField5.getText(); 
        boolean m=false;
        boolean em=false;
        boolean name_nt_mtch=false;
        boolean type_nt_match =false;
        
                        try //check amount is less than acctual amount employee can get
                        {
                            String id =jTextField1.getText();
                            int a=Integer.parseInt(amount);

                            String sql2 ="SELECT e.basic_salary FROM salarydetailsdb e, employee em WHERE em.title=e.employee_type AND em.eid ='"+id+"' ";  
                            pst=con.prepareStatement(sql2);
                            rs = pst.executeQuery();

                            while(rs.next())
                           {
                                 int basic=Integer.parseInt(rs.getString("basic_salary"));
                                 int mxam = basic/3;

                                 if(mxam < a)
                                 {
                                      m=true;
                                     
                                 }
                           }

                        }

                        catch (Exception e)
                        {
                            System.out.println(e);
                        }
        
                        //end
                        
        
                    try //check employee get advance paymentto twice in given month 
                     {
                         String empid = jTextField1.getText();
                         String mnth  = jTextField4.getText();

                         String sql="SELECT date FROM advancepaydb WHERE employee_id='"+empid+"' ";
                         pst =con.prepareStatement(sql);
                         rs =pst.executeQuery();

                         while(rs.next())
                         {
                             String d = rs.getString("date");

                             if(d.equals(mnth))
                             {
                                 em=true;
                                 //jLabel9.setText("Employee already get advance pay for this month");                  
                             }

                         }                       
                     } 

                     catch (Exception e)
                     {


                     }
                        //end
                    
                    
                    
                    
                    try {
                            String empid = jTextField1.getText();
                            
                            String sql="SELECT eid,f_name,title FROM employee WHERE eid ='"+empid+"' ";
                            pst =con.prepareStatement(sql);
                            rs =pst.executeQuery();
                            
                            while(rs.next())
                            {
                                String na=rs.getString("f_name");
                                String et=rs.getString("title");
                           //     String 
                                
                                if(!(na.equals(emp_name)))
                                {
                                    name_nt_mtch=true;
                                    
                                }
                                
                                if(!(et.equals(emp_type)))
                                {
                                    type_nt_match=true;
                                }
                    
                            }
    
                        }
                    
                    catch (Exception e)
                        {
                            
                        }
         if(emp_id.isEmpty() || emp_name.isEmpty() || emp_type.isEmpty() || date.isEmpty()) //|| amount.isEmpty() )
        {
             JOptionPane.showMessageDialog(this, "Enter the Employee Id and Press enter to generate other details!");
             cleardata();
        }
         
      
           if( name_nt_mtch==true)
         {
             JOptionPane.showMessageDialog(this, "Employee Name not matched with Employee Id\nplease Enter the Employee Id and Press Enter to the generate other details.");
             jTextField2.setText("");
         }
         
         else if(type_nt_match==true)
         {
             JOptionPane.showMessageDialog(this, "Employee Type not matched with Employee Id\nplease Enter the Employee Id and Press Enter to the generate other details");
             jTextField3.setText("");
         }
                    
         
      /*   else if((dateFormat.format(date).equals(date)))
         {
                JOptionPane.showMessageDialog(this, "Date must be this month \nDate format is \"yyyy/MM\" ");
             
         }*/
    
         else if(em==true)
         {
              JOptionPane.showMessageDialog(this, "Employee already get advance pay for this Month");
              cleardata();
         }
        
         else if(amount.isEmpty())
         {
             JOptionPane.showMessageDialog(this, "Pls enter the Amount");
         }

         else if(m==true)
         {
              JOptionPane.showMessageDialog(this, "Please Enter the Amount less than "+jLabel8.getText());
              jTextField5.setText("");
         }
       
        

        else if(amount.matches("[a-zA-Z]+"))
                    {
                    
                          JOptionPane.showMessageDialog(this,"Amount field must be Integer Type");
                          jTextField5.setText(null);
                          
                    }

         else
        {
            
      
           String id       = jTextField1.getText();
           String name     = jTextField2.getText();
           String emptype  = jTextField3.getText();
           String dat      = jTextField4.getText();
           int amoun       = Integer.parseInt(jTextField5.getText()); 
             
                boolean success =false;

                    try {

                        String sql=" INSERT INTO advancepaydb(employee_id,employee_name,employee_type,date,amount) VALUES ('"+id+"','"+name+"','"+emptype+"','"+dat+"','"+amoun+"') ";
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
                        JOptionPane.showMessageDialog(this,"New advance pay is Added to the database!","Success",1);
                        tableload();
                        cleardata();
                    }

                    else
                    {
                        JOptionPane.showMessageDialog(this,"Operation failed","Error", 0);
                    }
        
             
        }     
         
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       
        int r= jTable1.getSelectedRow();
        
        String emp_id = jTable1.getValueAt(r, 1).toString();
        String emp_name =jTable1.getValueAt(r, 2).toString();
        String emp_type =jTable1.getValueAt(r, 3).toString();
        String date =jTable1.getValueAt(r, 4).toString();
        String amount =jTable1.getValueAt(r, 5).toString();
       
     //   jLabel8.setText(id);
        jTextField1.setText(emp_id);
        jTextField2.setText(emp_name);
        jTextField3.setText(emp_type);
        jTextField4.setText(date);
        jTextField5.setText(amount);
    
        
        
        
        
        
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        
        
        String id =jTextField1.getText();
        
        
        
        
        
        
        
        try 
        {
            
       
        
          String sql ="SELECT f_name ,title FROM employee  WHERE eid ='"+id+"' ";
          pst=con.prepareStatement(sql);
          rs = pst.executeQuery();
            
            while(rs.next()){
                jTextField2.setText(rs.getString("f_name"));               
                jTextField3.setText(rs.getString("title"));
                
            }
            
            
            
          String sql2 ="SELECT e.basic_salary FROM  salarydetailsdb e, employee em WHERE em.title=e.employee_type AND em.eid ='"+ id+"' ";  
          pst=con.prepareStatement(sql2);
          rs = pst.executeQuery();
             
          while(rs.next()){
                
                 int basic=Integer.parseInt(rs.getString("basic_salary"));
                 int mxam = basic/3;
                 
                 jLabel8.setText(String.valueOf(mxam));
                 jTextField4.setText(dateFormat.format(date));
                
            }
            
        
         } 
        
        catch (Exception e) 
        {
             System.out.print(e);
        }
        
        
     
        
        
        
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
        cleardata();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        
        Payroll_Main m=new Payroll_Main();
        m.setVisible(true);
        this.dispose();
        
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void logoutbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutbtnMouseClicked

    }//GEN-LAST:event_logoutbtnMouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel16MouseClicked

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
            java.util.logging.Logger.getLogger(Add_advance_pay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_advance_pay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_advance_pay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_advance_pay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_advance_pay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel logoutbtn;
    private javax.swing.JLabel time1;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gehan;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author gEhan
 */
public class CalculateIncome extends javax.swing.JFrame {

    ResultSet rs;
    PreparedStatement pst;  
    Statement st;  
    
    
 GetDBConnection1 dbc = new GetDBConnection1();
    public CalculateIncome() {
        initComponents();
        
         try {
             new Thread(new Runnable() {

            @Override
            public void run() {
                java.util.Date d = new java.util.Date();
                SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");

                String s2 = sd.format(d);
                date1.setText(s2);

            }
        }).start();
        new Thread(new Runnable() {

            @Override
            public void run() {
                while (true) {
                    java.util.Date d = new java.util.Date();
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
    public static String method = null;
    public static String bookType = null;
     public static String date;
      public static String amountType = null;
    public static Double amount = 0.0;
     public static Double Ctotal = 0.0;
      public static Double Dtotal = 0.0;
    
   DateFormat dfcal = DateFormat.getDateInstance();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        date1 = new javax.swing.JLabel();
        time1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        closebtn = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JLabel();
        backbtn = new javax.swing.JLabel();
        minimizedbtn = new javax.swing.JLabel();
        MethodCombo = new javax.swing.JComboBox<>();
        monthCombo = new javax.swing.JComboBox<>();
        yearCombo = new javax.swing.JComboBox<>();
        BookTypeCombo = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        calbtn = new javax.swing.JButton();
        selctMethslbl = new javax.swing.JLabel();
        bookTypelbl = new javax.swing.JLabel();
        selectDatelbl = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        creditText = new javax.swing.JTextField();
        creditbalancelbl = new javax.swing.JLabel();
        debitBalancelbl = new javax.swing.JLabel();
        DebitText = new javax.swing.JTextField();
        totalIncomelbl = new javax.swing.JLabel();
        totincime = new javax.swing.JTextField();
        prfitlbl = new javax.swing.JLabel();
        profittxt = new javax.swing.JTextField();
        printbtn = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        selectmonthlbl = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(175, 10));
        setMinimumSize(new java.awt.Dimension(1024, 720));
        setSize(new java.awt.Dimension(1024, 720));
        getContentPane().setLayout(null);

        jPanel1.setMinimumSize(new java.awt.Dimension(1024, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 720));
        jPanel1.setLayout(null);

        date1.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        date1.setForeground(new java.awt.Color(255, 255, 255));
        date1.setText("date");
        jPanel1.add(date1);
        date1.setBounds(710, 20, 60, 10);

        time1.setBackground(new java.awt.Color(255, 255, 255));
        time1.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        time1.setForeground(new java.awt.Color(255, 255, 255));
        time1.setText("time");
        jPanel1.add(time1);
        time1.setBounds(710, 0, 70, 20);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Calculate Income");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 13, 170, 40);

        closebtn.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        closebtn.setForeground(new java.awt.Color(204, 204, 204));
        closebtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/closebtn.png"))); // NOI18N
        closebtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        closebtn.setPreferredSize(new java.awt.Dimension(30, 30));
        closebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closebtnMouseClicked(evt);
            }
        });
        jPanel1.add(closebtn);
        closebtn.setBounds(990, 10, 25, 25);

        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/logoutbtn.png"))); // NOI18N
        logoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutBtnMouseClicked(evt);
            }
        });
        jPanel1.add(logoutBtn);
        logoutBtn.setBounds(960, 10, 25, 25);

        backbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/backbtn.png"))); // NOI18N
        backbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backbtnMouseClicked(evt);
            }
        });
        jPanel1.add(backbtn);
        backbtn.setBounds(930, 10, 25, 25);

        minimizedbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/minimizebtn.png"))); // NOI18N
        minimizedbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizedbtnMouseClicked(evt);
            }
        });
        jPanel1.add(minimizedbtn);
        minimizedbtn.setBounds(900, 10, 25, 25);

        MethodCombo.setBackground(new java.awt.Color(0, 153, 0));
        MethodCombo.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        MethodCombo.setForeground(new java.awt.Color(255, 255, 255));
        MethodCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Method", "Daily", "Monthly" }));
        MethodCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                MethodComboItemStateChanged(evt);
            }
        });
        MethodCombo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MethodComboMouseClicked(evt);
            }
        });
        jPanel1.add(MethodCombo);
        MethodCombo.setBounds(270, 250, 130, 28);

        monthCombo.setBackground(new java.awt.Color(0, 153, 0));
        monthCombo.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        monthCombo.setForeground(new java.awt.Color(255, 255, 255));
        monthCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "date", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }));
        monthCombo.setEnabled(false);
        jPanel1.add(monthCombo);
        monthCombo.setBounds(270, 340, 75, 28);

        yearCombo.setBackground(new java.awt.Color(0, 153, 0));
        yearCombo.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        yearCombo.setForeground(new java.awt.Color(255, 255, 255));
        yearCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "year", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
        yearCombo.setEnabled(false);
        yearCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearComboActionPerformed(evt);
            }
        });
        jPanel1.add(yearCombo);
        yearCombo.setBounds(360, 340, 75, 28);

        BookTypeCombo.setBackground(new java.awt.Color(0, 153, 0));
        BookTypeCombo.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        BookTypeCombo.setForeground(new java.awt.Color(255, 255, 255));
        BookTypeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Book Type", "Cash Book", "Bank Book" }));
        jPanel1.add(BookTypeCombo);
        BookTypeCombo.setBounds(270, 390, 130, 28);

        jDateChooser1.setDateFormatString("yyyy-MMM-d ");
        jDateChooser1.setPreferredSize(new java.awt.Dimension(70, 20));
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(270, 290, 130, 30);

        calbtn.setBackground(new java.awt.Color(0, 153, 0));
        calbtn.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        calbtn.setForeground(new java.awt.Color(255, 255, 255));
        calbtn.setText("Calculate");
        calbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calbtnActionPerformed(evt);
            }
        });
        jPanel1.add(calbtn);
        calbtn.setBounds(220, 460, 100, 28);

        selctMethslbl.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        selctMethslbl.setForeground(new java.awt.Color(255, 255, 255));
        selctMethslbl.setText("Select Calculate Method");
        jPanel1.add(selctMethslbl);
        selctMethslbl.setBounds(140, 250, 130, 28);

        bookTypelbl.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        bookTypelbl.setForeground(new java.awt.Color(255, 255, 255));
        bookTypelbl.setText("Select Book Type");
        jPanel1.add(bookTypelbl);
        bookTypelbl.setBounds(140, 390, 130, 28);

        selectDatelbl.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        selectDatelbl.setForeground(new java.awt.Color(255, 255, 255));
        selectDatelbl.setText("Select Date");
        jPanel1.add(selectDatelbl);
        selectDatelbl.setBounds(140, 290, 130, 28);

        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(80, 220, 440, 300);
        jPanel1.add(creditText);
        creditText.setBounds(690, 250, 150, 28);

        creditbalancelbl.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        creditbalancelbl.setForeground(new java.awt.Color(255, 255, 255));
        creditbalancelbl.setText("Credit Balance");
        jPanel1.add(creditbalancelbl);
        creditbalancelbl.setBounds(560, 250, 130, 28);

        debitBalancelbl.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        debitBalancelbl.setForeground(new java.awt.Color(255, 255, 255));
        debitBalancelbl.setText("Debit Balance");
        jPanel1.add(debitBalancelbl);
        debitBalancelbl.setBounds(560, 300, 130, 28);
        jPanel1.add(DebitText);
        DebitText.setBounds(690, 300, 150, 28);

        totalIncomelbl.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        totalIncomelbl.setForeground(new java.awt.Color(255, 255, 255));
        totalIncomelbl.setText("Total Income");
        jPanel1.add(totalIncomelbl);
        totalIncomelbl.setBounds(560, 360, 130, 28);
        jPanel1.add(totincime);
        totincime.setBounds(690, 360, 150, 28);

        prfitlbl.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        prfitlbl.setForeground(new java.awt.Color(255, 255, 255));
        prfitlbl.setText("Profit");
        jPanel1.add(prfitlbl);
        prfitlbl.setBounds(560, 420, 130, 28);
        jPanel1.add(profittxt);
        profittxt.setBounds(690, 420, 150, 28);

        printbtn.setBackground(new java.awt.Color(0, 153, 0));
        printbtn.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        printbtn.setForeground(new java.awt.Color(255, 255, 255));
        printbtn.setText("Print");
        jPanel1.add(printbtn);
        printbtn.setBounds(560, 510, 100, 28);

        clear.setBackground(new java.awt.Color(0, 153, 0));
        clear.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear);
        clear.setBounds(740, 510, 100, 28);

        selectmonthlbl.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        selectmonthlbl.setForeground(new java.awt.Color(255, 255, 255));
        selectmonthlbl.setText("Select Month");
        jPanel1.add(selectmonthlbl);
        selectmonthlbl.setBounds(140, 350, 120, 16);

        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(540, 170, 350, 390);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/backsup.jpg"))); // NOI18N
        jPanel1.add(bg);
        bg.setBounds(0, 0, 1024, 720);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1024, 720);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void calbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calbtnActionPerformed

       
        
        DateFormat df =new SimpleDateFormat("mm/dd/yyyy");
        //Date newdate = df.parse(date);
        
        bookType =(String) BookTypeCombo.getSelectedItem();
        method =(String) MethodCombo.getSelectedItem();

        String q1="SELECT amountType,amount FROM cash_book where date='"+date+"'";
        String q3="SELECT amount FROM bank_book where date='"+date+"'";

        try{
        
            
        if( bookType.equals("Cash Book"))
        {
            if(method.equals("Daily"))
                
            {  
                
              //  date = dfcal.format(Caldate.getDate());
                pst = dbc.con.prepareStatement(q1);
                rs = this.pst.executeQuery();
                 
            while (rs.next())
            {
                amount=rs.getDouble("amount");
                amountType=rs.getString("amountType");
               JOptionPane.showMessageDialog(null,"Select Method Type !!");
                if(amountType.equals("Credit"))
                {
                    Ctotal=Ctotal+amount;
                }
                else if(amountType.equals("Debit"))
                {
                     Dtotal=Dtotal+amount;
                }
               
            }
            creditText.setText((Ctotal).toString());
            DebitText.setText((Dtotal).toString());

            }
            else if(method.equals("Monthly"))
            {
               
                
                //String day= dateCombo.getSelectedItem().toString();
                String month=monthCombo.getSelectedItem().toString();
                String year=yearCombo.getSelectedItem().toString();
                //date=month+" "+day+","+year;
                String q2="SELECT amountType,amount FROM cash_book where date LIKE CONCAT('" +  month + "','%','"+year+"')"; 
                
                pst = dbc.con.prepareStatement(q2);
                rs = this.pst.executeQuery();
                System.out.println("amount");
            while (rs.next())
            {
                 amount=rs.getDouble("amount");
                amountType=rs.getString("amountType");
                   System.out.println(amount);
                System.out.println(amountType);
                 if(amountType.equals("Credit"))
                {
                    Ctotal=Ctotal+amount;
                }
                else if(amountType.equals("Debit"))
                {
                     Dtotal=Dtotal+amount;
                }
                 
            } 
            creditText.setText((Ctotal).toString());
            DebitText.setText((Dtotal).toString());
            
                  
                  
            }

            else
            {
                JOptionPane.showMessageDialog(null,"Select Method Type !!");
            }
        }

        else if( bookType.equals("Bank Book"))
        {
            if(method.equals("Daily"))
                
            {  
                
                date = ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText();
                pst = dbc.con.prepareStatement(q3);
                rs = this.pst.executeQuery();
           
            while (rs.next())
            {
                amount=rs.getDouble("amount");
                
                
          
                    Ctotal=0.0;
                     Dtotal=Dtotal+amount;
                
               
            }
            creditText.setText(("0.0").toString());
            DebitText.setText((Dtotal).toString());

            }
            else if(method.equals("Monthly"))
            {
               
                
                //String day= dateCombo.getSelectedItem().toString();
                String month=monthCombo.getSelectedItem().toString();
                String year=yearCombo.getSelectedItem().toString();
                //date=month+" "+day+","+year;
                String q2="SELECT amount FROM bank_book where date LIKE CONCAT('" +  month + "','%','"+year+"')"; 
                
                pst = dbc.con.prepareStatement(q2);
                rs = this.pst.executeQuery();
               
            while (rs.next())
            {
                 amount=rs.getDouble("amount");
               
                    Ctotal=0.0;
                     Dtotal=Dtotal+amount;
               
                 
            } 
            creditText.setText(("0.0").toString());
            DebitText.setText((Dtotal).toString());
            
                  
                  
            }

            else
            {
                JOptionPane.showMessageDialog(null,"Select Method Type !!");
            }
        }

        else
        {
            JOptionPane.showMessageDialog(null,"Select Book Type !!");
        }
        
        
        totincime.setText((Dtotal).toString());
        Double profit= Dtotal+Ctotal;
        profittxt.setText((profit).toString());
        
        }
        catch (Exception e)
                {
                    JOptionPane.showMessageDialog(null,e);
                }
    }//GEN-LAST:event_calbtnActionPerformed

    private void yearComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearComboActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        BookTypeCombo.setSelectedItem("Book Type");
        MethodCombo.setSelectedItem("Method");
        yearCombo.setSelectedItem("Year");
        monthCombo.setSelectedItem("Month");
       // Caldate.setDate(null);
        ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).setText(null);
        totincime.setText((""));
        profittxt.setText((""));
        creditText.setText((""));
        DebitText.setText((""));
        
        
    }//GEN-LAST:event_clearActionPerformed

    private void closebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebtnMouseClicked
        // TODO add your handling code here:

        this.dispose();
    }//GEN-LAST:event_closebtnMouseClicked

    private void logoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseClicked
        Login login = new Login ();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutBtnMouseClicked

    private void backbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbtnMouseClicked
        Accounts accounts = new Accounts();
        accounts.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backbtnMouseClicked

    private void minimizedbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizedbtnMouseClicked
        // TODO add your handling code here:
        this.setState(ICONIFIED);
    }//GEN-LAST:event_minimizedbtnMouseClicked

    private void MethodComboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MethodComboMouseClicked

    }//GEN-LAST:event_MethodComboMouseClicked

    private void MethodComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_MethodComboItemStateChanged

        method=MethodCombo.getSelectedItem().toString();

        if(method.equals("Daily"))
        {
            ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).setEnabled(true);
            //Caldate.setEnabled(true);
            yearCombo.setEnabled(false);
            monthCombo.setEnabled(false);

        }
        else if(method.equals("Monthly"))
        {
            yearCombo.setEnabled(true);
            monthCombo.setEnabled(true);
           // Caldate.setEnabled(false);
            ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).setEnabled(false);
        }
    }//GEN-LAST:event_MethodComboItemStateChanged

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
            java.util.logging.Logger.getLogger(CalculateIncome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculateIncome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculateIncome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculateIncome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculateIncome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BookTypeCombo;
    private javax.swing.JTextField DebitText;
    private javax.swing.JComboBox<String> MethodCombo;
    private javax.swing.JLabel backbtn;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel bookTypelbl;
    private javax.swing.JButton calbtn;
    private javax.swing.JButton clear;
    private javax.swing.JLabel closebtn;
    private javax.swing.JTextField creditText;
    private javax.swing.JLabel creditbalancelbl;
    private javax.swing.JLabel date1;
    private javax.swing.JLabel debitBalancelbl;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logoutBtn;
    private javax.swing.JLabel minimizedbtn;
    private javax.swing.JComboBox<String> monthCombo;
    private javax.swing.JLabel prfitlbl;
    private javax.swing.JButton printbtn;
    private javax.swing.JTextField profittxt;
    private javax.swing.JLabel selctMethslbl;
    private javax.swing.JLabel selectDatelbl;
    private javax.swing.JLabel selectmonthlbl;
    private javax.swing.JLabel time1;
    private javax.swing.JLabel totalIncomelbl;
    private javax.swing.JTextField totincime;
    private javax.swing.JComboBox<String> yearCombo;
    // End of variables declaration//GEN-END:variables
}
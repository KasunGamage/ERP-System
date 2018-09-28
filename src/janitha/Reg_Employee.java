
package janitha;


import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class Reg_Employee extends javax.swing.JFrame {

    
    
    
  //public Connection con=null;
PreparedStatement pst =null;
ResultSet rs=null;
DBconnect dbc = new DBconnect();
ValidMethods vm = new ValidMethods();


  
    public Reg_Employee() {
        
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
    


    String id;
    String type;
    String title;
    String name;
    String iname;
    String day;
    String month;
    String year; 
    String nic;
    String padd;
    String poadd;
    String tell;
    String mob;
    String email;
    String bank;
    String acc_no;
    String etf;
    String epf;
    String r_day;
    String r_month;
    String r_year;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        emptxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        typebox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        titlebox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        namebox = new javax.swing.JTextField();
        nibox = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        daybox = new javax.swing.JComboBox<>();
        monthbox = new javax.swing.JComboBox<>();
        yearbox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        nicbox = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        addbox = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        poaddbox = new javax.swing.JTextField();
        telbox = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        mobbox = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        emailbox = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        bankbox = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        accbox = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        etfbox = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        epfbox = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rday = new javax.swing.JComboBox<>();
        rmonth = new javax.swing.JComboBox<>();
        ryear = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        logoutbtn = new javax.swing.JLabel();
        backbtn = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        time1 = new javax.swing.JLabel();
        date1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        jLabel18.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Register an Employee");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(50, 20, 230, 23);

        jLabel19.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Employee ID\n");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(10, 99, 63, 16);
        jPanel1.add(emptxt);
        emptxt.setBounds(123, 92, 130, 28);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Employee Type");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 158, 100, 16);

        typebox.setBackground(new java.awt.Color(102, 204, 0));
        typebox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type...", "Permanent", "Contract Basis" }));
        jPanel1.add(typebox);
        typebox.setBounds(123, 155, 130, 20);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Title");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 199, 90, 16);

        titlebox.setBackground(new java.awt.Color(102, 204, 0));
        titlebox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Title...", "Manager", "Accountant", "Sales Rep", "Driver", "Labor" }));
        jPanel1.add(titlebox);
        titlebox.setBounds(123, 196, 130, 20);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Full Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 237, 90, 16);
        jPanel1.add(namebox);
        namebox.setBounds(123, 229, 241, 30);
        jPanel1.add(nibox);
        nibox.setBounds(124, 279, 240, 30);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Name with Initials");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 287, 104, 16);

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Date of Birth");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 339, 90, 16);

        daybox.setBackground(new java.awt.Color(102, 204, 0));
        daybox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel1.add(daybox);
        daybox.setBounds(123, 339, 60, 20);

        monthbox.setBackground(new java.awt.Color(102, 204, 0));
        monthbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jPanel1.add(monthbox);
        monthbox.setBounds(185, 339, 90, 20);

        yearbox.setBackground(new java.awt.Color(102, 204, 0));
        yearbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", " ", " ", " " }));
        jPanel1.add(yearbox);
        yearbox.setBounds(285, 339, 113, 20);

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("NIC.No");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 431, 80, 16);
        jPanel1.add(nicbox);
        nicbox.setBounds(122, 428, 179, 30);

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Permanent Address");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(411, 95, 110, 16);
        jPanel1.add(addbox);
        addbox.setBounds(523, 85, 236, 52);

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Postal Address");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(413, 165, 100, 16);
        jPanel1.add(poaddbox);
        poaddbox.setBounds(525, 165, 240, 53);
        jPanel1.add(telbox);
        telbox.setBounds(525, 236, 190, 30);

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Tel No");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(429, 241, 75, 20);

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Mobile No");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(429, 292, 71, 16);

        mobbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobboxActionPerformed(evt);
            }
        });
        jPanel1.add(mobbox);
        mobbox.setBounds(525, 284, 190, 30);

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Email");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(427, 347, 80, 16);

        emailbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailboxActionPerformed(evt);
            }
        });
        jPanel1.add(emailbox);
        emailbox.setBounds(525, 339, 190, 31);

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Bank");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(425, 400, 90, 16);
        jPanel1.add(bankbox);
        bankbox.setBounds(525, 392, 190, 30);

        jLabel15.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Account Number");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(783, 93, 100, 16);

        accbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accboxActionPerformed(evt);
            }
        });
        jPanel1.add(accbox);
        accbox.setBounds(940, 85, 130, 30);

        jLabel16.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("E.T.F Number");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(783, 133, 90, 16);
        jPanel1.add(etfbox);
        etfbox.setBounds(940, 125, 130, 30);

        jLabel17.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("E.P.F Number");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(783, 174, 110, 16);
        jPanel1.add(epfbox);
        epfbox.setBounds(940, 166, 130, 30);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Registered Date");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 385, 104, 16);

        rday.setBackground(new java.awt.Color(102, 204, 0));
        rday.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel1.add(rday);
        rday.setBounds(124, 382, 59, 20);

        rmonth.setBackground(new java.awt.Color(102, 204, 0));
        rmonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jPanel1.add(rmonth);
        rmonth.setBounds(185, 382, 90, 20);

        ryear.setBackground(new java.awt.Color(102, 204, 0));
        ryear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2016", "2015", "2014", "2013", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", " " }));
        ryear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ryearActionPerformed(evt);
            }
        });
        jPanel1.add(ryear);
        ryear.setBounds(285, 382, 113, 20);

        jButton2.setBackground(new java.awt.Color(102, 204, 0));
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(883, 444, 87, 30);

        jButton1.setBackground(new java.awt.Color(102, 204, 0));
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(980, 444, 90, 30);

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

        table.setBackground(new java.awt.Color(0, 204, 0));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Emp ID", "Name", "Title ", "ETF Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 501, 1060, 92);

        time1.setBackground(new java.awt.Color(255, 255, 255));
        time1.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        time1.setForeground(new java.awt.Color(255, 255, 255));
        time1.setText("time");
        jPanel1.add(time1);
        time1.setBounds(760, 0, 70, 20);

        date1.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        date1.setForeground(new java.awt.Color(255, 255, 255));
        date1.setText("date");
        jPanel1.add(date1);
        date1.setBounds(760, 20, 60, 10);

        jButton3.setBackground(new java.awt.Color(102, 204, 0));
        jButton3.setText("IReport");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(783, 444, 90, 30);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/closebtn.png"))); // NOI18N
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel20);
        jLabel20.setBounds(1050, 10, 25, 25);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/minimizebtn.png"))); // NOI18N
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel21);
        jLabel21.setBounds(960, 10, 25, 25);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/main2.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1080, 720);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 720));

        setSize(new java.awt.Dimension(1096, 759));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mobboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobboxActionPerformed

    private void accboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accboxActionPerformed

    private void ryearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ryearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ryearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int eCount = 0;
        id=emptxt.getText();
        type = typebox.getSelectedItem().toString();
        title = titlebox.getSelectedItem().toString();
        if(vm.textOnlyValidation2(namebox.getText()) && !namebox.getText().isEmpty()){
        name = namebox.getText();}
        else{
        eCount++;}
        
        if(vm.textOnlyValidation2(nibox.getText()) && !nibox.getText().isEmpty()){
        iname = nibox.getText();}
        else{
        eCount++;}
        day = daybox.getSelectedItem().toString();
        month = monthbox.getSelectedItem().toString();
        year = yearbox.getSelectedItem().toString(); 
        nic = nicbox.getText();
        
        if(vm.addressValidation(addbox.getText()) && !addbox.getText().isEmpty()){
        padd = addbox.getText();}
        else{
        eCount++;}
        
        if(vm.addressValidation(poaddbox.getText()) && !poaddbox.getText().isEmpty()){
        poadd = poaddbox.getText();}
        else{
        eCount++;}
       
        
        if(vm.phoneValidation(telbox.getText()) && !telbox.getText().isEmpty()){
        tell = telbox.getText();}
        else{
        eCount++;}
        
        if(vm.phoneValidation(mobbox.getText()) && !mobbox.getText().isEmpty()){
        mob = mobbox.getText();}
        else{
        eCount++;}
        
        email = emailbox.getText();
        bank = bankbox.getText();
        acc_no = accbox.getText();
        etf = etfbox.getText();
        epf = epfbox.getText();
        r_day = rday.getSelectedItem().toString();
        r_month = rmonth.getSelectedItem().toString();
        r_year = ryear.getSelectedItem().toString();
        
        
       DefaultTableModel model = (DefaultTableModel) table.getModel();
       model.addRow(new Object[]{emptxt.getText(),nibox.getText(),titlebox.getSelectedItem().toString(),etfbox.getText()});
       
        if (eCount ==0) {
            
        
            try {
                String sql1="INSERT INTO employee  values('"+id+"','"+type+"','"+title+"','"+name+"','"+iname+"','"+day+"','"+ month+"','"+year+"','"+nic+"','"+padd+"','"+poadd+"','"+tell+"','"+mob+"','"+email+"','"+bank+"','"+acc_no+"','"+etf+"','"+epf+"','"+r_day+"','"+r_month+"','"+r_year+"')";
                
                System.out.println("a");
                System.out.println(sql1);
                pst = dbc.con.prepareStatement(sql1);
                System.out.println("b");
                pst.executeUpdate();

                System.out.println("c");
                    
                JOptionPane.showMessageDialog(null,"Successfully Added");
                // System.out.println("c");
                // pst.executeUpdate(sql1);
               // textOnlyValidation1(String namebox); 
            }
            catch(Exception e){
                //JOptionPane.showMessageDialog(null,"Employee ID is Already Exist!!");
                System.out.println(e);
            }
         
        }
        else{
        
        JOptionPane.showMessageDialog(null,"Error!!");
        }
            
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void logoutbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutbtnMouseClicked
       

    }//GEN-LAST:event_logoutbtnMouseClicked

    private void backbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbtnMouseClicked
        Emp_Main mn = new Emp_Main();
        mn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backbtnMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Update_Employee upd = new Update_Employee();
        upd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void emailboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailboxActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      
        try{
        
            String report = "C:\\Users\\user\\Downloads\\interfaces\\interfaces\\Lord JB\\ITP_Report01.jrxml";
            /*JasperReport jr = JasperCompileManager.compileReport(report);
            JasperPrint jp = JasperFillManager.fillReport(jr, null,dbc.con);
            JasperViewer.viewReport(jp);
            */
           }
        
        catch (Exception e){
        
        JOptionPane.showMessageDialog(null, e);
        
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jLabel21MouseClicked

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
            java.util.logging.Logger.getLogger(Reg_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reg_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reg_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reg_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reg_Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accbox;
    private javax.swing.JTextField addbox;
    private javax.swing.JLabel backbtn;
    private javax.swing.JTextField bankbox;
    private javax.swing.JLabel date1;
    private javax.swing.JComboBox<String> daybox;
    private javax.swing.JTextField emailbox;
    private javax.swing.JTextField emptxt;
    private javax.swing.JTextField epfbox;
    private javax.swing.JTextField etfbox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoutbtn;
    private javax.swing.JTextField mobbox;
    private javax.swing.JComboBox<String> monthbox;
    private javax.swing.JTextField namebox;
    private javax.swing.JTextField nibox;
    private javax.swing.JTextField nicbox;
    private javax.swing.JTextField poaddbox;
    private javax.swing.JComboBox<String> rday;
    private javax.swing.JComboBox<String> rmonth;
    private javax.swing.JComboBox<String> ryear;
    private javax.swing.JTable table;
    private javax.swing.JTextField telbox;
    private javax.swing.JLabel time1;
    private javax.swing.JComboBox<String> titlebox;
    private javax.swing.JComboBox<String> typebox;
    private javax.swing.JComboBox<String> yearbox;
    // End of variables declaration//GEN-END:variables
}

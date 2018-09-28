
package dasun;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;






public final class OrderForm extends javax.swing.JFrame {
Connection con = null;
PreparedStatement pst;
ResultSet rs =null;

   
   
    public OrderForm() {
        this.pst = null;
        initComponents();
        con = DBconnect.connect();
        tableLoad();
        
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
    public void tableLoad()
    {
        try {
             String sql = "SELECT orderid,invoiceNo,todayDate,delivaryDate,shopName,shopAddress,bottleSize,bottleCategory,amount FROM `order`";  
            pst=con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            ordertableTB.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
        }
    }
  public void tableLoad(String a)
    {
        try {
             String sql = "SELECT shopName,shopAddress FROM `customer`";  
            pst=con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            
            
        } catch (Exception e) {
        }
    }
    
   
    
    
    String orderid;
    String invoiceno;
    String day;
    String delivarydate;
    String shopname;
    String address;
    String size;
    String category;
    String amount;
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        shopnameTF = new javax.swing.JTextField();
        shopnameLBL = new javax.swing.JLabel();
        addressLBL = new javax.swing.JLabel();
        searchBTN = new javax.swing.JButton();
        quantityCMB = new javax.swing.JComboBox<String>();
        jLabel3 = new javax.swing.JLabel();
        amountTXT = new javax.swing.JTextField();
        addBTN = new javax.swing.JButton();
        updateBTN = new javax.swing.JButton();
        clearBTN = new javax.swing.JButton();
        invoicenoTXT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        categoryCMB = new javax.swing.JComboBox<String>();
        jScrollPane2 = new javax.swing.JScrollPane();
        searchTBL = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        backLBL = new javax.swing.JLabel();
        logoutLBL = new javax.swing.JLabel();
        time1 = new javax.swing.JLabel();
        date1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ordertableTB = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ordersrcTF = new javax.swing.JTextField();
        serach2BTN = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        resetBTN = new javax.swing.JButton();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 720));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1024, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 720));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Shop Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(520, 110, 80, 30);

        shopnameTF.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        shopnameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shopnameTFActionPerformed(evt);
            }
        });
        jPanel1.add(shopnameTF);
        shopnameTF.setBounds(600, 110, 210, 30);

        shopnameLBL.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        shopnameLBL.setForeground(new java.awt.Color(255, 255, 255));
        shopnameLBL.setText("Shop Name");
        jPanel1.add(shopnameLBL);
        shopnameLBL.setBounds(600, 180, 180, 40);

        addressLBL.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        addressLBL.setForeground(new java.awt.Color(255, 255, 255));
        addressLBL.setText("Address");
        jPanel1.add(addressLBL);
        addressLBL.setBounds(790, 180, 170, 40);

        searchBTN.setBackground(new java.awt.Color(0, 153, 0));
        searchBTN.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        searchBTN.setForeground(new java.awt.Color(255, 255, 255));
        searchBTN.setText("Search");
        searchBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTNActionPerformed(evt);
            }
        });
        jPanel1.add(searchBTN);
        searchBTN.setBounds(830, 110, 110, 30);

        quantityCMB.setBackground(new java.awt.Color(0, 153, 0));
        quantityCMB.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        quantityCMB.setForeground(new java.awt.Color(255, 255, 255));
        quantityCMB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bottle Size", "200ml", "250ml", "350ml", "400ml", "500ml PET", "1.5L PET" }));
        quantityCMB.setMinimumSize(new java.awt.Dimension(101, 20));
        quantityCMB.setPreferredSize(new java.awt.Dimension(101, 20));
        quantityCMB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityCMBActionPerformed(evt);
            }
        });
        jPanel1.add(quantityCMB);
        quantityCMB.setBounds(170, 260, 210, 30);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Quantity");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 380, 80, 30);

        amountTXT.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jPanel1.add(amountTXT);
        amountTXT.setBounds(170, 380, 210, 30);

        addBTN.setBackground(new java.awt.Color(0, 153, 0));
        addBTN.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        addBTN.setForeground(new java.awt.Color(255, 255, 255));
        addBTN.setText("Add");
        addBTN.setPreferredSize(new java.awt.Dimension(110, 20));
        addBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBTNActionPerformed(evt);
            }
        });
        jPanel1.add(addBTN);
        addBTN.setBounds(120, 440, 120, 30);

        updateBTN.setBackground(new java.awt.Color(0, 153, 0));
        updateBTN.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        updateBTN.setForeground(new java.awt.Color(255, 255, 255));
        updateBTN.setText("Update");
        updateBTN.setPreferredSize(new java.awt.Dimension(110, 20));
        updateBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBTNActionPerformed(evt);
            }
        });
        jPanel1.add(updateBTN);
        updateBTN.setBounds(350, 440, 120, 30);

        clearBTN.setBackground(new java.awt.Color(0, 153, 0));
        clearBTN.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        clearBTN.setForeground(new java.awt.Color(255, 255, 255));
        clearBTN.setText("Cancel Order");
        clearBTN.setPreferredSize(new java.awt.Dimension(110, 30));
        clearBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBTNActionPerformed(evt);
            }
        });
        jPanel1.add(clearBTN);
        clearBTN.setBounds(580, 440, 120, 30);

        invoicenoTXT.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jPanel1.add(invoicenoTXT);
        invoicenoTXT.setBounds(170, 140, 210, 30);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Invoice No");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 140, 70, 40);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Date");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 80, 70, 30);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Delivery Date");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 200, 80, 40);

        categoryCMB.setBackground(new java.awt.Color(0, 153, 0));
        categoryCMB.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        categoryCMB.setForeground(new java.awt.Color(255, 255, 255));
        categoryCMB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bottle Category", "Apple Soda", "Orange Barly", "Cream Soda", "EGB", "EGB Lite", "Lemonade", "Necto", "Orange Crush", "Soda", "Tonic", "Twistee Peach", "Twistee Apple", "Bitter Lemon", "Ginger Ale", "Wild Elephant" }));
        categoryCMB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryCMBActionPerformed(evt);
            }
        });
        jPanel1.add(categoryCMB);
        categoryCMB.setBounds(170, 320, 210, 30);

        searchTBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        searchTBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchTBLMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(searchTBL);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(520, 260, 430, 110);

        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(470, 90, 510, 330);

        backLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/backbtn.png"))); // NOI18N
        backLBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLBLMouseClicked(evt);
            }
        });
        jPanel1.add(backLBL);
        backLBL.setBounds(930, 10, 25, 25);

        logoutLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/logoutbtn.png"))); // NOI18N
        jPanel1.add(logoutLBL);
        logoutLBL.setBounds(960, 10, 25, 25);

        time1.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        time1.setForeground(new java.awt.Color(255, 255, 255));
        time1.setText("time");
        jPanel1.add(time1);
        time1.setBounds(705, 0, 80, 20);

        date1.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        date1.setForeground(new java.awt.Color(255, 255, 255));
        date1.setText("date");
        jPanel1.add(date1);
        date1.setBounds(705, 16, 80, 20);

        ordertableTB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        ordertableTB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ordertableTBMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(ordertableTB);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(50, 500, 930, 140);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bottle Size");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 260, 80, 40);

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Bottle Category");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(50, 320, 100, 40);

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Invoice No");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(520, 50, 80, 30);

        ordersrcTF.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jPanel1.add(ordersrcTF);
        ordersrcTF.setBounds(600, 50, 210, 30);

        serach2BTN.setBackground(new java.awt.Color(0, 153, 0));
        serach2BTN.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        serach2BTN.setForeground(new java.awt.Color(255, 255, 255));
        serach2BTN.setText("Serach");
        serach2BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serach2BTNActionPerformed(evt);
            }
        });
        jPanel1.add(serach2BTN);
        serach2BTN.setBounds(830, 50, 110, 30);

        jDateChooser1.setDateFormatString("yyyy-MMM-d ");
        jDateChooser1.setPreferredSize(new java.awt.Dimension(70, 20));
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(170, 80, 210, 30);

        resetBTN.setBackground(new java.awt.Color(0, 153, 0));
        resetBTN.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        resetBTN.setForeground(new java.awt.Color(255, 255, 255));
        resetBTN.setText("Reset");
        resetBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBTNActionPerformed(evt);
            }
        });
        jPanel1.add(resetBTN);
        resetBTN.setBounds(810, 440, 120, 30);

        jDateChooser2.setDateFormatString("yyyy-MMM-d");
        jPanel1.add(jDateChooser2);
        jDateChooser2.setBounds(170, 200, 210, 30);

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Order Card");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(60, 20, 330, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/minimizebtn.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10);
        jLabel10.setBounds(900, 10, 25, 25);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/closebtn.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11);
        jLabel11.setBounds(990, 10, 25, 25);

        bg.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        bg.setForeground(new java.awt.Color(255, 255, 255));
        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/backsup.jpg"))); // NOI18N
        jPanel1.add(bg);
        bg.setBounds(0, 0, 1024, 720);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1024, 720);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void quantityCMBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityCMBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityCMBActionPerformed

    private void searchBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBTNActionPerformed
       String shopname = shopnameTF.getText();
       
        
        
        String sql = "SELECT shopName,shopAddress from `customer` where shopName LIKE '"+shopname+"%'";
        try {
              pst =con.prepareStatement(sql);
              rs = pst.executeQuery();
              searchTBL.setModel(DbUtils.resultSetToTableModel(rs));
         
           
            
        } catch (Exception e) {
        }
      
      
        
    }//GEN-LAST:event_searchBTNActionPerformed

    private void addBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBTNActionPerformed
           
           
           
           invoiceno = invoicenoTXT.getText();
           day=((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText();
           delivarydate = ((JTextField)jDateChooser2.getDateEditor().getUiComponent()).getText();
           shopname = shopnameLBL.getText();
           address = addressLBL.getText();
           size = (String) quantityCMB.getSelectedItem();
           category =(String)  categoryCMB.getSelectedItem();
           amount = amountTXT.getText();
           
          if(Validate()) 
          {
          try {
            
            
            String query1="INSERT INTO `order` (invoiceNo,todayDate,delivaryDate,shopName,shopAddress,bottleSize,bottleCategory,amount) VALUES('"+invoiceno+"','"+day+"','"+delivarydate+"','"+shopname+"','"+address+"','"+size+"','"+category+"','"+amount+"')";
            pst=con.prepareStatement(query1);
            pst.execute();
           
            
            //load table
            tableLoad();
            
            invoicenoTXT.setText("");     
            ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).setText("");
           ((JTextField)jDateChooser2.getDateEditor().getUiComponent()).setText("");
            shopnameLBL.setText("");
            addressLBL.setText("");
            quantityCMB.setSelectedItem("Bottle Size");
            categoryCMB.setSelectedItem("Bottle Category");
            amountTXT.setText("");
                    
            
        } catch (Exception e) {
              System.out.println(e);
        }
          }
          else{
              JOptionPane.showMessageDialog(null,"error in inputs");
          }
          
    }//GEN-LAST:event_addBTNActionPerformed

    private void updateBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBTNActionPerformed
     
         int x = JOptionPane.showConfirmDialog(null, "Do You Really Want to Update");
         
         if(x==0)
         {
             invoiceno  = invoicenoTXT.getText();
           day=((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText();
             delivarydate =((JTextField)jDateChooser2.getDateEditor().getUiComponent()).getText();
             shopname = shopnameLBL.getText();
             address = addressLBL.getText();
             size = quantityCMB.getSelectedItem().toString();
             category = categoryCMB.getSelectedItem().toString();
             amount = amountTXT.getText();
             if(Validate()){
             String sql = "UPDATE `order` SET invoiceNo = '"+invoiceno+"', todayDate= '"+day+"', delivaryDate ='"+delivarydate+"',shopName='"+shopname+"',shopAddress = '"+address+"' ,bottleSize='"+size+"', bottleCategory='"+category+"', amount= '"+amount+"' where orderId='"+orderid+"'";
             try {
                 pst =con.prepareStatement(sql);
                 pst.execute();
                 
                 tableLoad();
                 
            invoicenoTXT.setText("");    
            ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).setText("");
            ((JTextField)jDateChooser2.getDateEditor().getUiComponent()).setText("");
            shopnameLBL.setText("Shop Name");
            addressLBL.setText("Address");
            quantityCMB.setSelectedItem("Bottle Size");
            categoryCMB.setSelectedItem("Bottle Category");
            amountTXT.setText("");
                 
             } catch (Exception e) {
             }
         }
             else{
                 
             }
         }
    }//GEN-LAST:event_updateBTNActionPerformed

    private void categoryCMBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryCMBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryCMBActionPerformed

    private void clearBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBTNActionPerformed
        int y = JOptionPane.showConfirmDialog(null, "Do You Really Want to Delete");
        
        if(y==0)
        {
            //orderid = invoicenoTXT.getText();
            
            String sql = "DELETE from  `order` where orderId='"+orderid+"'";
            try {
                pst=con.prepareStatement(sql);
                pst.execute();
                
                tableLoad();
                
            invoicenoTXT.setText("");     
            ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).setText("");
            ((JTextField)jDateChooser2.getDateEditor().getUiComponent()).setText("");
            quantityCMB.setSelectedItem("Bottle Size");
            categoryCMB.setSelectedItem("Bottle Category");
            amountTXT.setText("");
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_clearBTNActionPerformed

    private void backLBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLBLMouseClicked
        OrderMainForm odrmForm = new OrderMainForm();
        odrmForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backLBLMouseClicked

    private void ordertableTBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ordertableTBMouseClicked
        int row  = ordertableTB.getSelectedRow();
        orderid = ordertableTB.getValueAt(row, 0).toString();
        invoiceno = ordertableTB.getValueAt(row, 1).toString();
        day = ordertableTB.getValueAt(row, 2).toString();
        delivarydate = ordertableTB.getValueAt(row, 3).toString();
        shopname = ordertableTB.getValueAt(row, 4).toString();
        address = ordertableTB.getValueAt(row, 5).toString();
        size = ordertableTB.getValueAt(row, 6).toString();
        category = ordertableTB.getValueAt(row, 7).toString();
        amount = ordertableTB.getValueAt(row, 8).toString();
        
        invoicenoTXT.setText(invoiceno);
        ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).setText(day);
        ((JTextField)jDateChooser2.getDateEditor().getUiComponent()).setText(delivarydate);
        shopnameLBL.setText(shopname);
        addressLBL.setText(address);
        quantityCMB.setSelectedItem(size);
        categoryCMB.setSelectedItem(category);
        amountTXT.setText(amount);
               
        
                
    }//GEN-LAST:event_ordertableTBMouseClicked

    private void searchTBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchTBLMouseClicked
        int row  = searchTBL.getSelectedRow();
          shopname = searchTBL.getValueAt(row, 0).toString();
        address = searchTBL.getValueAt(row, 1).toString();
        
         shopnameLBL.setText(shopname);
        addressLBL.setText(address);
    }//GEN-LAST:event_searchTBLMouseClicked

    private void serach2BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serach2BTNActionPerformed
        String invoiceid1 = ordersrcTF.getText();
       
        
        
        String sql = "SELECT orderId,invoiceNo,todayDate,delivaryDate,shopName,shopAddress,bottleSize,bottleCategory,amount from `order` where invoiceNo LIKE '%"+invoiceid1+"%'";
        try {
              pst =con.prepareStatement(sql);
        rs = pst.executeQuery();
         ordertableTB.setModel(DbUtils.resultSetToTableModel(rs));
         
           
            
        } catch (Exception e) {
        }       
    }//GEN-LAST:event_serach2BTNActionPerformed

    private void resetBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBTNActionPerformed
         invoicenoTXT.setText("");
        ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).setText("");
        ((JTextField)jDateChooser2.getDateEditor().getUiComponent()).setText("");
        shopnameLBL.setText("Shop Name");
        addressLBL.setText("Address");
        quantityCMB.setSelectedItem("Bottle Size");
        categoryCMB.setSelectedItem("Bottle Category");
        amountTXT.setText("");
    }//GEN-LAST:event_resetBTNActionPerformed

    private void shopnameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shopnameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shopnameTFActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private boolean Validate(){
        if(day.equals("") || invoiceno.equals("") || delivarydate.equals("") || size.equals("Bottle Size")|| category.equals("Bottle Category") || amount.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Fields Cannot be Empty!");
            return false;
        }
        else if(shopname.equals("Shop Name") || address.equals("Address"))
        {
            JOptionPane.showMessageDialog(null, "Please Search and Select Shop Name and Address");
            return false;
        }
        else
            return true;
    }
    
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
            java.util.logging.Logger.getLogger(OrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new OrderForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBTN;
    private javax.swing.JLabel addressLBL;
    private javax.swing.JTextField amountTXT;
    private javax.swing.JLabel backLBL;
    private javax.swing.JLabel bg;
    private javax.swing.JComboBox<String> categoryCMB;
    private javax.swing.JButton clearBTN;
    private javax.swing.JLabel date1;
    private javax.swing.JTextField invoicenoTXT;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel logoutLBL;
    private javax.swing.JTextField ordersrcTF;
    private javax.swing.JTable ordertableTB;
    private javax.swing.JComboBox<String> quantityCMB;
    private javax.swing.JButton resetBTN;
    private javax.swing.JButton searchBTN;
    private javax.swing.JTable searchTBL;
    private javax.swing.JButton serach2BTN;
    private javax.swing.JLabel shopnameLBL;
    private javax.swing.JTextField shopnameTF;
    private javax.swing.JLabel time1;
    private javax.swing.JButton updateBTN;
    // End of variables declaration//GEN-END:variables

    private boolean validateInput() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

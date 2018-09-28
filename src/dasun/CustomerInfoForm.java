
package dasun;


import static java.awt.Frame.ICONIFIED;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class CustomerInfoForm extends javax.swing.JFrame {
    Connection con = null;          // Setting db connect to null
    PreparedStatement pst = null;                       // setting sql query statement to null
    ResultSet rs = null; 
 
    public CustomerInfoForm() {
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
            String sql = "SELECT shopOwnerName,shopName,shopAddress,pMobile,pShop,shopId from customer";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            customerTB.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
        }
    }
    
    
    
    private String shopID;
    private String shopowner;
    private String shopname;
    private String address;
    private String mobile;
    private String m_shop;
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        da = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        shopownernameTXT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        shopnameTXT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        shopaddressTXT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        mobileTXT = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        shopphoneTXT = new javax.swing.JTextField();
        submitBTN = new javax.swing.JButton();
        deleteBTN = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        customerTB = new javax.swing.JTable();
        updateBTN = new javax.swing.JButton();
        searchTXT = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        time1 = new javax.swing.JLabel();
        backLBL = new javax.swing.JLabel();
        lgoutLBL = new javax.swing.JLabel();
        date1 = new javax.swing.JLabel();
        reBTN = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
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

        da.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        da.setForeground(new java.awt.Color(255, 255, 255));
        da.setText("date");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 720));
        getContentPane().setLayout(null);

        jPanel1.setMinimumSize(new java.awt.Dimension(1024, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 720));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Shop Owner's Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(250, 150, 140, 30);

        shopownernameTXT.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        shopownernameTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shopownernameTXTActionPerformed(evt);
            }
        });
        jPanel1.add(shopownernameTXT);
        shopownernameTXT.setBounds(460, 150, 300, 30);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Shop Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(250, 210, 130, 30);

        shopnameTXT.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jPanel1.add(shopnameTXT);
        shopnameTXT.setBounds(460, 210, 300, 30);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Shop Address");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(250, 270, 120, 40);

        shopaddressTXT.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        shopaddressTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shopaddressTXTActionPerformed(evt);
            }
        });
        jPanel1.add(shopaddressTXT);
        shopaddressTXT.setBounds(460, 270, 300, 30);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Phone ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(250, 320, 120, 30);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Mobile");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(450, 320, 60, 30);

        mobileTXT.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jPanel1.add(mobileTXT);
        mobileTXT.setBounds(550, 320, 210, 30);

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Shop");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(450, 380, 40, 40);

        shopphoneTXT.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jPanel1.add(shopphoneTXT);
        shopphoneTXT.setBounds(550, 380, 210, 30);

        submitBTN.setBackground(new java.awt.Color(0, 153, 0));
        submitBTN.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        submitBTN.setForeground(new java.awt.Color(255, 255, 255));
        submitBTN.setText("Submit");
        submitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBTNActionPerformed(evt);
            }
        });
        jPanel1.add(submitBTN);
        submitBTN.setBounds(170, 460, 110, 30);

        deleteBTN.setBackground(new java.awt.Color(0, 153, 0));
        deleteBTN.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        deleteBTN.setForeground(new java.awt.Color(255, 255, 255));
        deleteBTN.setText("Delete Customer");
        deleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTNActionPerformed(evt);
            }
        });
        jPanel1.add(deleteBTN);
        deleteBTN.setBounds(530, 460, 140, 30);

        customerTB.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        customerTB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Shop ID", "Shop Owner's Name", "Shop Name", "Shop Address", "Mobile", "Phone"
            }
        ));
        customerTB.setSelectionBackground(new java.awt.Color(0, 153, 0));
        customerTB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerTBMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(customerTB);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(100, 510, 810, 148);

        updateBTN.setBackground(new java.awt.Color(0, 153, 0));
        updateBTN.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        updateBTN.setForeground(new java.awt.Color(255, 255, 255));
        updateBTN.setText("Update");
        updateBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBTNActionPerformed(evt);
            }
        });
        jPanel1.add(updateBTN);
        updateBTN.setBounds(350, 460, 110, 30);

        searchTXT.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jPanel1.add(searchTXT);
        searchTXT.setBounds(460, 90, 190, 30);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Shop Name");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(250, 90, 90, 30);

        jButton1.setBackground(new java.awt.Color(0, 153, 0));
        jButton1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(650, 90, 110, 30);

        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(150, 80, 710, 370);

        time1.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        time1.setForeground(new java.awt.Color(255, 255, 255));
        time1.setText("time");
        jPanel1.add(time1);
        time1.setBounds(705, 0, 80, 20);

        backLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/backbtn.png"))); // NOI18N
        backLBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLBLMouseClicked(evt);
            }
        });
        jPanel1.add(backLBL);
        backLBL.setBounds(930, 10, 25, 25);

        lgoutLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/logoutbtn.png"))); // NOI18N
        jPanel1.add(lgoutLBL);
        lgoutLBL.setBounds(960, 10, 25, 25);

        date1.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        date1.setForeground(new java.awt.Color(255, 255, 255));
        date1.setText("date");
        jPanel1.add(date1);
        date1.setBounds(705, 14, 80, 20);

        reBTN.setBackground(new java.awt.Color(0, 153, 0));
        reBTN.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        reBTN.setForeground(new java.awt.Color(255, 255, 255));
        reBTN.setText("Reset");
        reBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reBTNActionPerformed(evt);
            }
        });
        jPanel1.add(reBTN);
        reBTN.setBounds(720, 460, 120, 30);

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Shop Registration");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 20, 330, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/closebtn.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9);
        jLabel9.setBounds(990, 10, 25, 25);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/minimizebtn.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10);
        jLabel10.setBounds(900, 10, 25, 25);

        bg.setBackground(new java.awt.Color(0, 153, 0));
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

    private void shopownernameTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shopownernameTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shopownernameTXTActionPerformed

    private void shopaddressTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shopaddressTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shopaddressTXTActionPerformed

    private void submitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBTNActionPerformed
        
        shopowner = shopownernameTXT.getText();
        shopname = shopnameTXT.getText();
        address = shopaddressTXT.getText();
        mobile = mobileTXT.getText();
        m_shop = shopphoneTXT.getText();
         
      //  JOptionPane.showConfirmDialog(null, "1");
      if(Validate()){
        try {
           String sql1 = "INSERT INTO customer(shopOwnerName,shopName,shopAddress,pMobile,pShop) values('"+shopowner+"','"+shopname+"','"+address+"','"+mobile+"','"+m_shop+"')";
            
            pst= con.prepareStatement(sql1);
           //  JOptionPane.showConfirmDialog(null, "2");
            pst.execute(sql1);
            JOptionPane.showConfirmDialog(null, "2");
            tableLoad();
            
            shopownernameTXT.setText("");
            shopnameTXT.setText("");
            shopaddressTXT.setText("");
            mobileTXT.setText("");
            shopphoneTXT.setText("");
                    
        } 
        catch (Exception e) 
        {
            System.out.println(e);   
        }
      }
      else{
          
      }
    }//GEN-LAST:event_submitBTNActionPerformed

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTNActionPerformed
        int y = JOptionPane.showConfirmDialog(null, "Do You Really Want to Delete");
        
        if(y==0)
        {
           shopname = shopnameTXT.getText();
            
            String sql = "DELETE from  customer  where shopName='"+shopname+"'";
            try {
                pst=con.prepareStatement(sql);
                pst.execute();
                
                tableLoad();
                
            shopownernameTXT.setText("");
            shopnameTXT.setText("");
            shopaddressTXT.setText("");
            mobileTXT.setText("");
            shopphoneTXT.setText("");
           
            } catch (Exception e) {
            }
        }
               
    }//GEN-LAST:event_deleteBTNActionPerformed

    private void customerTBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerTBMouseClicked
         int row  = customerTB.getSelectedRow();
        shopowner = customerTB.getValueAt(row, 0).toString();
        shopname= customerTB.getValueAt(row, 1).toString();
        address = customerTB.getValueAt(row, 2).toString();
        mobile = customerTB.getValueAt(row, 3).toString();
        m_shop = customerTB.getValueAt(row, 4).toString();
       
        
        shopownernameTXT.setText(shopowner);
        shopnameTXT.setText(shopname);
        shopaddressTXT.setText(address);
        mobileTXT.setText(mobile);
        shopphoneTXT.setText(m_shop);
        
    }//GEN-LAST:event_customerTBMouseClicked

    private void updateBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBTNActionPerformed
        int v = JOptionPane.showConfirmDialog(null,"Do You Really Want to Update ");
        if(v==0)
         {
             shopowner  = shopownernameTXT.getText();
             shopname = shopnameTXT.getText();
             address = shopaddressTXT.getText();
             mobile= mobileTXT.getText();
             m_shop=shopphoneTXT.getText();
             
             if(Validate()){
                 
             String sql = "UPDATE customer SET shopOwnerName = '"+shopowner+"', shopName= '"+shopname+"', shopAddress ='"+address+"', pMobile='"+mobile+"', pShop='"+m_shop+"' where shopName='"+shopname+"'";
             try {
                 pst =con.prepareStatement(sql);
                 pst.execute();
                 
                 tableLoad();
                 
            shopownernameTXT.setText("");
            shopnameTXT.setText("");
            shopaddressTXT.setText("");
            mobileTXT.setText("");
            shopphoneTXT.setText("");
                 
             } catch (Exception e) {
             }
         }
             else{
                 
             }
         }
        
    }//GEN-LAST:event_updateBTNActionPerformed

    private void backLBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLBLMouseClicked
        OrderMainForm odrmForm = new OrderMainForm();
        odrmForm.setVisible(true);
        this.dispose();        
    }//GEN-LAST:event_backLBLMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String shopname1 = shopnameTXT.getText();
       
        try {
            String sql = "SELECT shopOwnerName,shopName,shopAddress,pMobile,pShop,shopId from customer where shopName LIKE '"+shopname1+"%'";
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            
            customerTB.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
        }
        
       
       
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void reBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reBTNActionPerformed
        shopownernameTXT.setText("");
            shopnameTXT.setText("");
            shopaddressTXT.setText("");
            mobileTXT.setText("");
            shopphoneTXT.setText("");
    }//GEN-LAST:event_reBTNActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
       this.setState(ICONIFIED);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

      private boolean Validate(){
        if(shopowner.equals("") || shopname.equals("") || address.equals("") ||  mobile.equals("") || m_shop.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Fields Cannot be Empty!");
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
            java.util.logging.Logger.getLogger(CustomerInfoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerInfoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerInfoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerInfoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CustomerInfoForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLBL;
    private javax.swing.JLabel bg;
    private javax.swing.JTable customerTB;
    private javax.swing.JLabel da;
    private javax.swing.JLabel date1;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lgoutLBL;
    private javax.swing.JTextField mobileTXT;
    private javax.swing.JButton reBTN;
    private javax.swing.JTextField searchTXT;
    private javax.swing.JTextField shopaddressTXT;
    private javax.swing.JTextField shopnameTXT;
    private javax.swing.JTextField shopownernameTXT;
    private javax.swing.JTextField shopphoneTXT;
    private javax.swing.JButton submitBTN;
    private javax.swing.JLabel time1;
    private javax.swing.JButton updateBTN;
    // End of variables declaration//GEN-END:variables
}

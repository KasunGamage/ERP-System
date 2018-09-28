/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roshane;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author Roshen Aponsu
 */
public class Update extends javax.swing.JFrame {
     Connection con=null;
   PreparedStatement pst =null;
   ResultSet rs =null;
    /**
     * Creates new form notification
     */
   /* public notification() {
        initComponents();
    }*/
    /**
     * Creates new form Update
     */
    public Update() {
        initComponents();
        con = DBconnect.connect();
        
        tableload();
        
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
        try{
            String sql = "SELECT vno,regno,model,capacity,vtype FROM `vehicle`";
            pst=con.prepareStatement(sql);
            rs = pst.executeQuery();
        
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e){
            
        }
    }
    
     String Vno;
        String Rno;
        String model;
        String capacity ;
        String veType ;
    
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        MTXT = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        regnoTXT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        vehiclenoTXT = new javax.swing.JTextField();
        CTXT = new javax.swing.JTextField();
        vtTXT = new javax.swing.JComboBox<>();
        update = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        menuBtn = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        time1 = new javax.swing.JLabel();
        date1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 720));
        getContentPane().setLayout(null);

        jPanel1.setMinimumSize(new java.awt.Dimension(1024, 720));
        jPanel1.setLayout(null);
        jPanel1.add(MTXT);
        MTXT.setBounds(190, 180, 292, 30);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Vehicle No");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 110, 70, 16);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Capacity");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(90, 230, 42, 16);
        jPanel1.add(regnoTXT);
        regnoTXT.setBounds(190, 140, 292, 30);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Model");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(90, 190, 60, 16);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Reg No");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 150, 70, 16);

        vehiclenoTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehiclenoTXTActionPerformed(evt);
            }
        });
        jPanel1.add(vehiclenoTXT);
        vehiclenoTXT.setBounds(190, 100, 292, 30);

        CTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CTXTActionPerformed(evt);
            }
        });
        jPanel1.add(CTXT);
        CTXT.setBounds(190, 220, 292, 30);

        vtTXT.setBackground(new java.awt.Color(102, 204, 0));
        vtTXT.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        vtTXT.setForeground(new java.awt.Color(255, 255, 255));
        vtTXT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Van", "Lorry" }));
        vtTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vtTXTActionPerformed(evt);
            }
        });
        jPanel1.add(vtTXT);
        vtTXT.setBounds(190, 270, 180, 22);

        update.setBackground(new java.awt.Color(0, 153, 0));
        update.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update);
        update.setBounds(240, 360, 96, 32);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Vehicle Type");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(90, 270, 63, 16);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vehicle No", "Reg No", "Model", "Capacity", "Vehicle Type"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(180, 420, 750, 140);

        jButton5.setBackground(new java.awt.Color(0, 153, 0));
        jButton5.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(700, 360, 90, 32);

        jButton4.setBackground(new java.awt.Color(0, 153, 0));
        jButton4.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("ADD");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(490, 360, 92, 32);
        jPanel1.add(menuBtn);
        menuBtn.setBounds(10, 40, 30, 30);

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Insert  New Vehicle");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(90, 20, 270, 30);

        time1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        time1.setForeground(new java.awt.Color(255, 255, 255));
        time1.setText("Time ");
        jPanel1.add(time1);
        time1.setBounds(710, 0, 80, 20);

        date1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        date1.setForeground(new java.awt.Color(255, 255, 255));
        date1.setText("Date");
        jPanel1.add(date1);
        date1.setBounds(710, 15, 100, 16);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/minimizebtn.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8);
        jLabel8.setBounds(900, 10, 25, 25);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/backbtn.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9);
        jLabel9.setBounds(930, 10, 25, 25);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/logoutbtn.png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(960, 10, 25, 25);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/closebtn.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11);
        jLabel11.setBounds(990, 10, 25, 25);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/backsup.jpg"))); // NOI18N
        jPanel1.add(bg);
        bg.setBounds(0, 0, 1030, 720);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1024, 720);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void vehiclenoTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehiclenoTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vehiclenoTXTActionPerformed

    private void CTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CTXTActionPerformed

    private void vtTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vtTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vtTXTActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        
         int x = JOptionPane.showConfirmDialog(null, "Do You Really Want to Update");
        if(x==0){
        String Vno= vehiclenoTXT.getText();
        String Rno = regnoTXT.getText();
        String model = MTXT.getText();
        String capacity = CTXT.getText();
        String veType = vtTXT.getSelectedItem().toString();
        
        
          String Sq13 ="UPDATE `vehicle` SET vno='"+Vno+"',regno='"+Rno+"',model='"+model+"',capacity='"+capacity+"',vtype='"+veType+"' where vno='"+Vno+"'";
        try{
      
           
          
           pst=con.prepareStatement(Sq13);
           pst.execute();
                   tableload();

           }
            catch (Exception e){
                
            }
        }
        else{
            
        }
    }//GEN-LAST:event_updateActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
               String Vno = vehiclenoTXT.getText();
               String Rno = regnoTXT.getText();
               String model = MTXT.getText();
               String capacity = CTXT.getText();
               String veType = vtTXT.getSelectedItem().toString(); 
               
        try{
         //   System.out.println("a");
             String sq11="INSERT INTO `vehicle`(vno,regno,model,capacity,vtype) Values('"+Vno+"','"+Rno+"','"+model+"','"+capacity+"','"+veType+"')";
            // System.out.println("b");
             pst=con.prepareStatement(sq11);
            // System.out.println("c");
             pst.execute(sq11);
             
                     tableload();

        }
        catch(Exception e){
            System.out.println(e);
        }
               
               
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
           int x=JOptionPane.showConfirmDialog(null,"Do you really want to Delete");
        if (x==0){
        String Vno=vehiclenoTXT.getText();
        String sql16="DELETE  from `vehicle` where vno ='"+Vno+"'";
        
         
        
         try{
      pst=con.prepareStatement(sql16);
      pst.execute();   
              tableload();

            }
      catch (Exception e){
          System.out.println(e);
      }
        
        }  
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
         int row  = jTable1.getSelectedRow();
         Vno= jTable1.getValueAt(row, 0).toString();
        Rno = jTable1.getValueAt(row, 1).toString();
        model = jTable1.getValueAt(row, 2).toString();
        capacity = jTable1.getValueAt(row, 3).toString();
        veType = jTable1.getValueAt(row, 4).toString();
       
        
        vehiclenoTXT.setText(Vno);
       
        regnoTXT.setText(Rno);
        MTXT.setText(model);
        CTXT.setText(capacity);
        vtTXT.setSelectedItem(veType);
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        vehicleMain mn = new vehicleMain();
        mn.setVisible(true);
        this.dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

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
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CTXT;
    private javax.swing.JTextField MTXT;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel date1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel menuBtn;
    private javax.swing.JTextField regnoTXT;
    private javax.swing.JLabel time1;
    private javax.swing.JButton update;
    private javax.swing.JTextField vehiclenoTXT;
    private javax.swing.JComboBox<String> vtTXT;
    // End of variables declaration//GEN-END:variables
}

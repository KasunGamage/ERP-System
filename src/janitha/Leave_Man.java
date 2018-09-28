
package janitha;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Leave_Man extends javax.swing.JFrame {

PreparedStatement pst =null;
ResultSet rs=null;
DBconnect dbc = new DBconnect();
   
    public Leave_Man() {
        //setUndecorated(true);
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
         
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        from_box = new com.toedter.calendar.JDateChooser();
        to_box = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        id_box = new javax.swing.JTextField();
        name_box = new javax.swing.JTextField();
        time1 = new javax.swing.JLabel();
        date1 = new javax.swing.JLabel();
        logoutbtn = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        backbtn = new javax.swing.JLabel();
        title_box = new javax.swing.JComboBox<>();
        bttn = new javax.swing.JButton();
        txt_search = new javax.swing.JTextField();
        search_btn = new javax.swing.JButton();
        cmb_search = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 720));
        jPanel1.setLayout(null);

        jPanel2.setPreferredSize(new java.awt.Dimension(1080, 720));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Employee ID");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(40, 110, 70, 16);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Leave Period");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(40, 280, 89, 26);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("to");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(220, 330, 28, 16);

        from_box.setBackground(new java.awt.Color(102, 204, 0));
        from_box.setDateFormatString("yyyy-MM-dd");
        jPanel2.add(from_box);
        from_box.setBounds(160, 280, 161, 30);

        to_box.setBackground(new java.awt.Color(102, 204, 0));
        to_box.setDateFormatString("yyyy-MM-dd");
        jPanel2.add(to_box);
        to_box.setBounds(160, 350, 161, 29);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Employee Name");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(40, 170, 105, 16);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Title");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(40, 220, 89, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Reason");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(690, 100, 73, 15);
        jPanel2.add(jTextField1);
        jTextField1.setBounds(760, 100, 278, 123);
        jPanel2.add(id_box);
        id_box.setBounds(160, 100, 159, 31);
        jPanel2.add(name_box);
        name_box.setBounds(160, 160, 159, 31);

        time1.setBackground(new java.awt.Color(255, 255, 255));
        time1.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        time1.setForeground(new java.awt.Color(255, 255, 255));
        time1.setText("time");
        jPanel2.add(time1);
        time1.setBounds(750, 0, 70, 20);

        date1.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        date1.setForeground(new java.awt.Color(255, 255, 255));
        date1.setText("date");
        jPanel2.add(date1);
        date1.setBounds(750, 20, 60, 10);

        logoutbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/logoutbtn.png"))); // NOI18N
        jPanel2.add(logoutbtn);
        logoutbtn.setBounds(1010, 10, 25, 25);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Leave Management");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(50, 20, 170, 23);

        backbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/backbtn.png"))); // NOI18N
        backbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backbtnMouseClicked(evt);
            }
        });
        jPanel2.add(backbtn);
        backbtn.setBounds(980, 10, 25, 25);

        title_box.setBackground(new java.awt.Color(102, 204, 0));
        title_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Title...", "Manager", "Accountant", "Sales Rep", "Driver", "Labor" }));
        jPanel2.add(title_box);
        title_box.setBounds(160, 210, 144, 30);

        bttn.setBackground(new java.awt.Color(51, 204, 0));
        bttn.setText("Approve Leave");
        bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnActionPerformed(evt);
            }
        });
        jPanel2.add(bttn);
        bttn.setBounds(891, 411, 159, 35);

        txt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchActionPerformed(evt);
            }
        });
        jPanel2.add(txt_search);
        txt_search.setBounds(40, 508, 190, 30);

        search_btn.setText("Search");
        search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btnActionPerformed(evt);
            }
        });
        jPanel2.add(search_btn);
        search_btn.setBounds(151, 546, 80, 23);

        cmb_search.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One...", "ID", "Name" }));
        jPanel2.add(cmb_search);
        cmb_search.setBounds(124, 477, 107, 20);

        jLabel18.setText("Search With :");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(40, 480, 80, 14);

        jPanel3.setBackground(new java.awt.Color(0, 153, 0));

        table.setBackground(new java.awt.Color(0, 153, 0));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Title", "Name", "Leave From", "To"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(245, 477, 805, 114);

        jButton3.setBackground(new java.awt.Color(102, 204, 0));
        jButton3.setText("IReport");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(960, 370, 90, 30);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/closebtn.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel11);
        jLabel11.setBounds(1040, 10, 25, 25);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/minimizebtn.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel10);
        jLabel10.setBounds(950, 10, 25, 25);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/main2.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(0, -10, 1070, 730);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 2, 1080, 770);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1074, 854));

        setSize(new java.awt.Dimension(1080, 720));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnActionPerformed


    DateFormat fmt;       
    fmt = new SimpleDateFormat("yyyy-MM-dd");
        
        
    String id = id_box.getText();
    String name = name_box.getText();
    String title = title_box.getSelectedItem().toString();
    String year1 = fmt.format(from_box.getDate());
    String year2 = fmt.format(to_box.getDate());

    
    try{
    
    String sql1 = "insert into leaves (eid,title,f_name,from_1,to_1) values ('"+id+"','"+title+"','"+name+"','"+year1+"','"+year2+"')";
    pst = dbc.con.prepareStatement(sql1);
    pst.executeUpdate();
    JOptionPane.showMessageDialog(null,"Approved");
                
    try {
          String sql12="update attendance set leaves_1=leaves_1+1 where eid='"+id+"'";
          System.out.println("wwww");
          pst=dbc.con.prepareStatement(sql12);
            //System.out.println("eeee");
          pst.executeUpdate();
           // System.out.println("tttt");
          
          //pst.executeUpdate(sql1);
          
          
          
          
          
      }
      catch(Exception e){
          
           JOptionPane.showMessageDialog(null,e);
      }
    }
    
    catch(Exception e){    
       JOptionPane.showMessageDialog(null,e);
     
    }
           
        
        
    }//GEN-LAST:event_bttnActionPerformed

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchActionPerformed

    private void search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btnActionPerformed
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        try{
            String search = txt_search.getText();
            if (cmb_search.getSelectedItem().toString()== "ID"){
                String sql ="select * from leaves where eid = '"+search+"'";
                //JOptionPane.showConfirmDialog(null,"stae");
                pst=dbc.con.prepareStatement(sql);
                rs=pst.executeQuery();
                while(rs.next()){
                    String id = rs.getString("eid");
                    String title = rs.getString("title");
                    String name = rs.getString("f_name");
                    String from = rs.getString("from_1");
                    String to = rs.getString("to_1");

                    model.addRow(new Object[]{id,title,name,from,to});
                }

            }

            else if(cmb_search.getSelectedItem().toString()== "Name"){
                
                String sql ="select * from leaves where name_i LIKE '%"+search+"%'";
                //JOptionPane.showConfirmDialog(null,"stae");
                pst=dbc.con.prepareStatement(sql);
                rs=pst.executeQuery();
                while(rs.next()){
                    String id = rs.getString("eid");
                    String title = rs.getString("title");
                    String name = rs.getString("f_name");
                    String from = rs.getString("from_1");
                    String to = rs.getString("to_1");

                    model.addRow(new Object[]{id,title,name,from,to});
                }

            }

        }
        catch (Exception e){

        }

    }//GEN-LAST:event_search_btnActionPerformed

    private void backbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbtnMouseClicked
        Emp_Main mn = new Emp_Main();
        mn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backbtnMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        try{

//            String report = "C:\\Users\\user\\Downloads\\interfaces\\interfaces\\Lord JB\\ITP_Report01.jrxml";
//            JasperReport jr = JasperCompileManager.compileReport(report);
//            JasperPrint jp = JasperFillManager.fillReport(jr, null,dbc.con);
//            JasperViewer.viewReport(jp);

        }

        catch (Exception e){

            JOptionPane.showMessageDialog(null, e);

        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      
        Date cdd = new Date();
        
        from_box.setMinSelectableDate(cdd);
        
        
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Leave_Man.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Leave_Man.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Leave_Man.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Leave_Man.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Leave_Man().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backbtn;
    private javax.swing.JButton bttn;
    private javax.swing.JComboBox<String> cmb_search;
    private javax.swing.JLabel date1;
    private com.toedter.calendar.JDateChooser from_box;
    private javax.swing.JTextField id_box;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel logoutbtn;
    private javax.swing.JTextField name_box;
    private javax.swing.JButton search_btn;
    private javax.swing.JTable table;
    private javax.swing.JLabel time1;
    private javax.swing.JComboBox<String> title_box;
    private com.toedter.calendar.JDateChooser to_box;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}

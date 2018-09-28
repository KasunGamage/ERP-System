/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gehan;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author gEhan
 */
public class Admin_Home extends javax.swing.JFrame {

    /**
     * Creates new form Admin_Home
     */
    public Admin_Home() {
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        minimizedbtn = new javax.swing.JLabel();
        closebtn = new javax.swing.JLabel();
        AddUsersText = new javax.swing.JLabel();
        AddUsersIcon = new javax.swing.JLabel();
        logoutbtn = new javax.swing.JLabel();
        date1 = new javax.swing.JLabel();
        time1 = new javax.swing.JLabel();
        bgAdmin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(175, 10));
        setMinimumSize(new java.awt.Dimension(1024, 720));
        setSize(new java.awt.Dimension(1024, 720));
        getContentPane().setLayout(null);

        jPanel1.setMinimumSize(new java.awt.Dimension(1024, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 720));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administrative Panel");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(120, 44, 190, 20);

        minimizedbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/minimizebtn.png"))); // NOI18N
        minimizedbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizedbtnMouseClicked(evt);
            }
        });
        jPanel1.add(minimizedbtn);
        minimizedbtn.setBounds(930, 10, 25, 25);

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

        AddUsersText.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        AddUsersText.setForeground(new java.awt.Color(0, 102, 0));
        AddUsersText.setText("Add Users");
        jPanel1.add(AddUsersText);
        AddUsersText.setBounds(490, 350, 140, 21);

        AddUsersIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/addUsers.png"))); // NOI18N
        AddUsersIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddUsersIconMouseClicked(evt);
            }
        });
        jPanel1.add(AddUsersIcon);
        AddUsersIcon.setBounds(490, 270, 90, 70);

        logoutbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/logoutbtn.png"))); // NOI18N
        logoutbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutbtnMouseClicked(evt);
            }
        });
        jPanel1.add(logoutbtn);
        logoutbtn.setBounds(960, 10, 25, 25);

        date1.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        date1.setForeground(new java.awt.Color(255, 255, 255));
        date1.setText("date");
        jPanel1.add(date1);
        date1.setBounds(730, 20, 80, 16);

        time1.setBackground(new java.awt.Color(255, 255, 255));
        time1.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        time1.setForeground(new java.awt.Color(255, 255, 255));
        time1.setText("time");
        jPanel1.add(time1);
        time1.setBounds(730, 0, 70, 16);

        bgAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/backmain.jpg"))); // NOI18N
        jPanel1.add(bgAdmin);
        bgAdmin.setBounds(0, 0, 1024, 720);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1024, 720);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddUsersIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddUsersIconMouseClicked
        // TODO add your handling code here:
        Add_Users au = new Add_Users();
        au.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AddUsersIconMouseClicked

    private void logoutbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutbtnMouseClicked
        Login login = new Login ();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutbtnMouseClicked

    private void minimizedbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizedbtnMouseClicked
        // TODO add your handling code here:
        this.setState(ICONIFIED);
    }//GEN-LAST:event_minimizedbtnMouseClicked

    private void closebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebtnMouseClicked
        // TODO add your handling code here:

        this.dispose();
    }//GEN-LAST:event_closebtnMouseClicked

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
            java.util.logging.Logger.getLogger(Admin_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddUsersIcon;
    private javax.swing.JLabel AddUsersText;
    private javax.swing.JLabel bgAdmin;
    private javax.swing.JLabel closebtn;
    private javax.swing.JLabel date1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logoutbtn;
    private javax.swing.JLabel minimizedbtn;
    private javax.swing.JLabel time1;
    // End of variables declaration//GEN-END:variables
}
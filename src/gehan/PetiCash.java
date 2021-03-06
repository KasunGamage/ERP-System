/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gehan;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gEhan
 */
public class PetiCash extends javax.swing.JFrame {

    ResultSet rs;
    PreparedStatement pst;
    Statement st;

    GetDBConnection1 dbc = new GetDBConnection1(); //connect to database

    /**
     * Creates new form Ledger
     */
    public PetiCash() {
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

    public static String ledgerBookID = null;
    public static String date = null;
    public static String amountType = null;
    public static String ledgerType = null;
    public static String paymentType = null;
    public static Double amount = 0.0;
    public static String des = null;

    DateFormat df = DateFormat.getDateInstance();

    private int idAutoGenerate() {
        String queryid = "SELECT MAX(ledger_id) FROM ledger_book";
        int nextappid;

        try {
            pst = dbc.con.prepareStatement(queryid);
            rs = this.pst.executeQuery();

            while (rs.next()) {
                nextappid = rs.getInt(1);
                Integer appid = nextappid + 1;
                return appid;

            }

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(this, err);
        }
        return 0;

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
        closebtn = new javax.swing.JLabel();
        logoutbtn = new javax.swing.JLabel();
        backbtn = new javax.swing.JLabel();
        minimizedbtn = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ledgerBookTable = new javax.swing.JTable();
        ledgerID = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        ledgerBookIDText = new javax.swing.JTextField();
        amountCombo = new javax.swing.JComboBox<>();
        description = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionText = new javax.swing.JTextArea();
        addbtn = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        searchLedger = new javax.swing.JButton();
        time1 = new javax.swing.JLabel();
        date1 = new javax.swing.JLabel();
        rupeeslbl = new javax.swing.JLabel();
        rupeesText = new javax.swing.JTextField();
        ledgerBookClear = new javax.swing.JButton();
        ledgerBookIdGenerate = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        addbtn1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        rupeeslbl1 = new javax.swing.JLabel();
        description1 = new javax.swing.JLabel();
        description2 = new javax.swing.JLabel();
        rupeesText2 = new javax.swing.JTextField();
        rupeesText3 = new javax.swing.JTextField();
        rupeesText1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(175, 10));
        setMinimumSize(new java.awt.Dimension(1024, 720));
        setSize(new java.awt.Dimension(1024, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closebtn.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        closebtn.setForeground(new java.awt.Color(204, 204, 204));
        closebtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/closebtn.png"))); // NOI18N
        closebtn.setLabelFor(closebtn);
        closebtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        closebtn.setPreferredSize(new java.awt.Dimension(30, 30));
        closebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closebtnMouseClicked(evt);
            }
        });
        jPanel1.add(closebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 10, 25, 25));

        logoutbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoutbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/logoutbtn.png"))); // NOI18N
        logoutbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutbtnMouseClicked(evt);
            }
        });
        jPanel1.add(logoutbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 10, 25, 25));

        backbtn.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        backbtn.setForeground(new java.awt.Color(204, 204, 204));
        backbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/backbtn.png"))); // NOI18N
        backbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backbtnMouseClicked(evt);
            }
        });
        jPanel1.add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, 25, 25));

        minimizedbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/minimizebtn.png"))); // NOI18N
        minimizedbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizedbtnMouseClicked(evt);
            }
        });
        jPanel1.add(minimizedbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 25, 25));

        jScrollPane2.setBackground(new java.awt.Color(0, 153, 0));

        ledgerBookTable.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        ledgerBookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Begin Blance", "Peti Cash ID", "Date", "Description", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ledgerBookTable.setGridColor(new java.awt.Color(0, 204, 0));
        ledgerBookTable.setSelectionBackground(new java.awt.Color(0, 153, 0));
        ledgerBookTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ledgerBookTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ledgerBookTable);
        if (ledgerBookTable.getColumnModel().getColumnCount() > 0) {
            ledgerBookTable.getColumnModel().getColumn(1).setResizable(false);
            ledgerBookTable.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 390, 140));

        ledgerID.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        ledgerID.setForeground(new java.awt.Color(255, 255, 255));
        ledgerID.setText("Peti Cash ID");
        jPanel1.add(ledgerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 130, 28));

        Date.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        Date.setForeground(new java.awt.Color(255, 255, 255));
        Date.setText("Date");
        jPanel1.add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 130, 28));

        type.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        type.setForeground(new java.awt.Color(255, 255, 255));
        type.setText("Method");
        jPanel1.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 130, 28));

        ledgerBookIDText.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        ledgerBookIDText.setForeground(new java.awt.Color(0, 153, 0));
        ledgerBookIDText.setEnabled(false);
        ledgerBookIDText.setSelectionColor(new java.awt.Color(0, 153, 0));
        jPanel1.add(ledgerBookIDText, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 130, 28));

        amountCombo.setBackground(new java.awt.Color(0, 153, 0));
        amountCombo.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        amountCombo.setForeground(new java.awt.Color(255, 255, 255));
        amountCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Method", "Add Begin Balance", "Add Expenses" }));
        jPanel1.add(amountCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 150, 28));

        description.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        description.setForeground(new java.awt.Color(255, 255, 255));
        description.setText("Balance Amount");
        jPanel1.add(description, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 470, 130, 28));

        descriptionText.setColumns(20);
        descriptionText.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        descriptionText.setForeground(new java.awt.Color(0, 153, 0));
        descriptionText.setRows(5);
        descriptionText.setSelectionColor(new java.awt.Color(0, 153, 0));
        jScrollPane1.setViewportView(descriptionText);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 220, -1));

        addbtn.setBackground(new java.awt.Color(0, 153, 0));
        addbtn.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        addbtn.setForeground(new java.awt.Color(255, 255, 255));
        addbtn.setText("Add");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        jPanel1.add(addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 540, 70, -1));

        update.setBackground(new java.awt.Color(0, 153, 0));
        update.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 540, 70, 25));

        delete.setBackground(new java.awt.Color(0, 153, 0));
        delete.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 540, -1, -1));

        searchLedger.setBackground(new java.awt.Color(0, 153, 0));
        searchLedger.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        searchLedger.setForeground(new java.awt.Color(255, 255, 255));
        searchLedger.setText("Search");
        searchLedger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchLedgerActionPerformed(evt);
            }
        });
        jPanel1.add(searchLedger, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 330, 90, -1));

        time1.setBackground(new java.awt.Color(255, 255, 255));
        time1.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        time1.setForeground(new java.awt.Color(255, 255, 255));
        time1.setText("time");
        jPanel1.add(time1, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 0, 60, 20));

        date1.setFont(new java.awt.Font("Calibri Light", 0, 13)); // NOI18N
        date1.setForeground(new java.awt.Color(255, 255, 255));
        date1.setText("date");
        jPanel1.add(date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 14, 70, -1));

        rupeeslbl.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        rupeeslbl.setForeground(new java.awt.Color(255, 255, 255));
        rupeeslbl.setText("Rs.");
        jPanel1.add(rupeeslbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 130, 28));

        rupeesText.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        rupeesText.setForeground(new java.awt.Color(0, 153, 0));
        rupeesText.setSelectionColor(new java.awt.Color(0, 153, 0));
        rupeesText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rupeesTextActionPerformed(evt);
            }
        });
        jPanel1.add(rupeesText, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 130, 28));

        ledgerBookClear.setBackground(new java.awt.Color(0, 153, 0));
        ledgerBookClear.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        ledgerBookClear.setForeground(new java.awt.Color(255, 255, 255));
        ledgerBookClear.setText("Clear");
        ledgerBookClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ledgerBookClearActionPerformed(evt);
            }
        });
        jPanel1.add(ledgerBookClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 330, 90, -1));

        ledgerBookIdGenerate.setBackground(new java.awt.Color(0, 153, 0));
        ledgerBookIdGenerate.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        ledgerBookIdGenerate.setForeground(new java.awt.Color(255, 255, 255));
        ledgerBookIdGenerate.setText("Generate");
        ledgerBookIdGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ledgerBookIdGenerateActionPerformed(evt);
            }
        });
        jPanel1.add(ledgerBookIdGenerate, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 80, 25));

        jDateChooser1.setDateFormatString("yyyy-MMM-d ");
        jDateChooser1.setPreferredSize(new java.awt.Dimension(70, 20));
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 130, 30));

        addbtn1.setBackground(new java.awt.Color(0, 153, 0));
        addbtn1.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        addbtn1.setForeground(new java.awt.Color(255, 255, 255));
        addbtn1.setText("Set");
        addbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtn1ActionPerformed(evt);
            }
        });
        jPanel1.add(addbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 80, 25));

        jButton1.setBackground(new java.awt.Color(0, 153, 0));
        jButton1.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Calculate");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 530, -1, -1));

        rupeeslbl1.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        rupeeslbl1.setForeground(new java.awt.Color(255, 255, 255));
        rupeeslbl1.setText("Rs.");
        jPanel1.add(rupeeslbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 130, 28));

        description1.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        description1.setForeground(new java.awt.Color(255, 255, 255));
        description1.setText("Description");
        jPanel1.add(description1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 130, 28));

        description2.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        description2.setForeground(new java.awt.Color(255, 255, 255));
        description2.setText("Total Expences");
        jPanel1.add(description2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 420, 130, 28));

        rupeesText2.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        rupeesText2.setForeground(new java.awt.Color(0, 153, 0));
        rupeesText2.setSelectionColor(new java.awt.Color(0, 153, 0));
        rupeesText2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rupeesText2ActionPerformed(evt);
            }
        });
        jPanel1.add(rupeesText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 420, 130, 28));

        rupeesText3.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        rupeesText3.setForeground(new java.awt.Color(0, 153, 0));
        rupeesText3.setSelectionColor(new java.awt.Color(0, 153, 0));
        rupeesText3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rupeesText3ActionPerformed(evt);
            }
        });
        jPanel1.add(rupeesText3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 470, 130, 28));

        rupeesText1.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        rupeesText1.setForeground(new java.awt.Color(0, 153, 0));
        rupeesText1.setSelectionColor(new java.awt.Color(0, 153, 0));
        rupeesText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rupeesText1ActionPerformed(evt);
            }
        });
        jPanel1.add(rupeesText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 130, 28));

        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 430, 440));

        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 460, 440));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Peti Cash");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 95, 26));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/backsup.jpg"))); // NOI18N
        jPanel1.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 720));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutbtnMouseClicked
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutbtnMouseClicked

    private void backbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbtnMouseClicked
        Accounts accounts = new Accounts();
        accounts.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backbtnMouseClicked

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) ledgerBookTable.getModel();

        ledgerBookID = ledgerBookIDText.getText();
        date = ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText();
        amountType = (String) amountCombo.getSelectedItem();
        amount = Double.parseDouble(rupeesText.getText());
        des = descriptionText.getText();

        try {
            JOptionPane.showMessageDialog(null, "ok.");
            String query1 = "INSERT INTO ledger_book values('" + ledgerBookID + "','" + date + "','" + ledgerType + "','" + paymentType + "','" + amountType + "','" + amount + "','" + des + "')";

            pst = dbc.con.prepareStatement(query1);

            pst.execute();
            JOptionPane.showMessageDialog(null, "ok.");
            model.addRow(new Object[]{ledgerBookID, date, ledgerType, paymentType, amountType, des, amount});
            JOptionPane.showConfirmDialog(null, "Successfully Added");

            ledgerBookIDText.setText("");
            descriptionText.setText("");
           ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).setText(null);
            amountCombo.setSelectedItem("Amount");
            rupeesText.setText("0.0");
        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_addbtnActionPerformed

    private void rupeesTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rupeesTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rupeesTextActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) ledgerBookTable.getModel();

        int x = JOptionPane.showConfirmDialog(null, "Do you really want to update?");
        if (x == 0) {
            ledgerBookID = ledgerBookIDText.getText();
            date = ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText();
            amountType = (String) amountCombo.getSelectedItem();
            amount = Double.parseDouble(rupeesText.getText());

            des = descriptionText.getText();

            String sql = "Update ledger_book SET  ledger_id='" + ledgerBookID + "' , date='" + date + "' ,ledgerType='" + ledgerType + "',paymenType='" + paymentType + "', amountType='" + amountType + "', amount='" + amount + "' , description='" + des + "' WHERE ledger_id='" + ledgerBookID + "' ";
            try {
                pst = dbc.con.prepareStatement(sql);

                pst.execute();
                JOptionPane.showConfirmDialog(null, "Updated");
                model.addRow(new Object[]{ledgerBookID, date, ledgerType, paymentType, amountType, des, amount});

                ledgerBookIDText.setText("");
                descriptionText.setText("");
                ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).setText(null);
                amountCombo.setSelectedItem("Amount");
                rupeesText.setText("0.0");

            } catch (Exception e) {

            }
        }

    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        try {

            ledgerBookID = ledgerBookIDText.getText();
            String sql = "delete  from ledger_book where ledger_id ='" + ledgerBookID + "'";
            pst = dbc.con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Successfully Deleted");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " error");
        }
        //---------delete from table------------------
        DefaultTableModel model = (DefaultTableModel) ledgerBookTable.getModel();
        model.removeRow(ledgerBookTable.getSelectedRow());

        //-----------reset textfields---------------
        ledgerBookIDText.setText("");
        descriptionText.setText("");
        ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).setText(null);
        amountCombo.setSelectedItem("Amount");
        rupeesText.setText("0.0");


    }//GEN-LAST:event_deleteActionPerformed

    private void searchLedgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchLedgerActionPerformed
        // TODO add your handling code here:
        ledgerBookID = ledgerBookIDText.getText();
        date = ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText();

        try {

            String sql = "Select * from ledger_book where ledger_id LIKE CONCAT('%','" + ledgerBookID + "','%') and (date='" + date + "') ";

            pst = dbc.con.prepareStatement(sql);

            rs = pst.executeQuery();

            while (rs.next()) {

                ledgerBookID = rs.getString("ledger_id");
                //date = df.format(Ldate.getDate("date"));
                des = rs.getString("description");
                amountType = rs.getString("amountType");
                ledgerType = rs.getString("ledgerType");
                paymentType = rs.getString("paymentType");
                amount = rs.getDouble("amount");

                String rupee = (Double.toString(amount));

                ledgerBookIDText.setText(ledgerBookID);
                descriptionText.setText(des);
                amountCombo.setSelectedItem(amountType);
                rupeesText.setText(rupee);

                DefaultTableModel model = (DefaultTableModel) ledgerBookTable.getModel();

                model.addRow(new Object[]{ledgerBookID, date, ledgerType, paymentType, amountType, des, amount});
            }

        } catch (Exception e) {
        }


    }//GEN-LAST:event_searchLedgerActionPerformed

    private void ledgerBookTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ledgerBookTableMouseClicked
        // TODO add your handling code here:
        int r = ledgerBookTable.getSelectedRow();

        ledgerBookID = ledgerBookTable.getValueAt(r, 0).toString();
        date = ledgerBookTable.getValueAt(r, 1).toString();
        ledgerType = ledgerBookTable.getValueAt(r, 2).toString();
        paymentType = ledgerBookTable.getValueAt(r, 3).toString();
        amountType = ledgerBookTable.getValueAt(r, 4).toString();
        des = ledgerBookTable.getValueAt(r, 5).toString();
        String rupee = ledgerBookTable.getValueAt(r, 6).toString();

       
        ledgerBookIDText.setText(ledgerBookID);
        descriptionText.setText(des);
        ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).setText(String.valueOf(df));
        amountCombo.setSelectedItem(amountType);
        rupeesText.setText(rupee);


    }//GEN-LAST:event_ledgerBookTableMouseClicked

    private void ledgerBookClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ledgerBookClearActionPerformed
        DefaultTableModel model = (DefaultTableModel) ledgerBookTable.getModel();

        model.setRowCount(0);
        ledgerBookIDText.setText("");
        descriptionText.setText("");
       ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).setText(null);
        amountCombo.setSelectedItem("Amount");
        rupeesText.setText("0.0");
    }//GEN-LAST:event_ledgerBookClearActionPerformed

    private void ledgerBookIdGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ledgerBookIdGenerateActionPerformed
        // TODO add your handling code here:
        Integer cashID = idAutoGenerate();
        ledgerBookID = cashID.toString();

        ledgerBookIDText.setText(ledgerBookID);
    }//GEN-LAST:event_ledgerBookIdGenerateActionPerformed

    private void closebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebtnMouseClicked
        // TODO add your handling code here:

        this.dispose();

    }//GEN-LAST:event_closebtnMouseClicked

    private void minimizedbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizedbtnMouseClicked
        // TODO add your handling code here:
        this.setState(ICONIFIED);
    }//GEN-LAST:event_minimizedbtnMouseClicked

    private void rupeesText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rupeesText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rupeesText1ActionPerformed

    private void addbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addbtn1ActionPerformed

    private void rupeesText2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rupeesText2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rupeesText2ActionPerformed

    private void rupeesText3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rupeesText3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rupeesText3ActionPerformed

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
            java.util.logging.Logger.getLogger(PetiCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PetiCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PetiCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PetiCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PetiCash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Date;
    private javax.swing.JButton addbtn;
    private javax.swing.JButton addbtn1;
    private javax.swing.JComboBox<String> amountCombo;
    private javax.swing.JLabel backbtn;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel closebtn;
    private javax.swing.JLabel date1;
    private javax.swing.JButton delete;
    private javax.swing.JLabel description;
    private javax.swing.JLabel description1;
    private javax.swing.JLabel description2;
    private javax.swing.JTextArea descriptionText;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton ledgerBookClear;
    private javax.swing.JTextField ledgerBookIDText;
    private javax.swing.JButton ledgerBookIdGenerate;
    private javax.swing.JTable ledgerBookTable;
    private javax.swing.JLabel ledgerID;
    private javax.swing.JLabel logoutbtn;
    private javax.swing.JLabel minimizedbtn;
    private javax.swing.JTextField rupeesText;
    private javax.swing.JTextField rupeesText1;
    private javax.swing.JTextField rupeesText2;
    private javax.swing.JTextField rupeesText3;
    private javax.swing.JLabel rupeeslbl;
    private javax.swing.JLabel rupeeslbl1;
    private javax.swing.JButton searchLedger;
    private javax.swing.JLabel time1;
    private javax.swing.JLabel type;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}

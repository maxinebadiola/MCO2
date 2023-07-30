/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package javaproject9;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 *
 * @author ERICA
 */
public class TransactionMaintenancePanel extends javax.swing.JPanel {
    private Machine machine;
    private ProductPanel productPanel;



    public TransactionMaintenancePanel(Machine machine) {
       this.machine = machine;
       initComponents();
    }
    
 

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        displayTransactions = new javax.swing.JRadioButton();
        displaySalesReport = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        maintenanceSelectButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        restockSlotPanel = new javax.swing.JPanel();
        titleLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        confirmButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        restockCurrencyLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        restockAllSlotsPanel = new javax.swing.JPanel();
        titleLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jSeparator5 = new javax.swing.JSeparator();
        jButton5 = new javax.swing.JButton();
        confirmButton3 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        restockAllCurrencyLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        editPricePanel = new javax.swing.JPanel();
        titleLabel5 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jSeparator6 = new javax.swing.JSeparator();
        jButton6 = new javax.swing.JButton();
        confirmButton4 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        collectCurrencyLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));
        setPreferredSize(new java.awt.Dimension(520, 470));
        setLayout(new java.awt.CardLayout());

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        titleLabel.setFont(new java.awt.Font("Arial Black", 2, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 204));
        titleLabel.setText("PRODUCT MAINTENANCE");

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 276));
        jPanel1.setLayout(new java.awt.GridLayout(2, 2));

        displayTransactions.setBackground(new java.awt.Color(255, 255, 204));
        buttonGroup1.add(displayTransactions);
        displayTransactions.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        displayTransactions.setForeground(new java.awt.Color(255, 153, 153));
        displayTransactions.setText("Display Transactions");
        displayTransactions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayTransactionsActionPerformed(evt);
            }
        });
        jPanel1.add(displayTransactions);

        displaySalesReport.setBackground(new java.awt.Color(255, 255, 204));
        buttonGroup1.add(displaySalesReport);
        displaySalesReport.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        displaySalesReport.setForeground(new java.awt.Color(255, 153, 153));
        displaySalesReport.setText("Display Sales Report");
        displaySalesReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displaySalesReportActionPerformed(evt);
            }
        });
        jPanel1.add(displaySalesReport);

        jSeparator1.setForeground(new java.awt.Color(204, 204, 255));

        jButton1.setBackground(new java.awt.Color(255, 153, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        maintenanceSelectButton.setBackground(new java.awt.Color(153, 209, 153));
        maintenanceSelectButton.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        maintenanceSelectButton.setForeground(new java.awt.Color(255, 255, 255));
        maintenanceSelectButton.setText("Select Option");
        maintenanceSelectButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 5, true));
        maintenanceSelectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maintenanceSelectButtonActionPerformed(evt);
            }
        });

        clearButton.setBackground(new java.awt.Color(153, 209, 153));
        clearButton.setFont(new java.awt.Font("Agency FB", 1, 21)); // NOI18N
        clearButton.setForeground(new java.awt.Color(255, 255, 255));
        clearButton.setText("Clear Selection");
        clearButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 5, true));
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maintenanceSelectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(jButton1))
                    .addComponent(jSeparator1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(maintenanceSelectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearButton)
                        .addContainerGap(71, Short.MAX_VALUE))))
        );

        add(jPanel2, "card2");

        restockSlotPanel.setBackground(new java.awt.Color(255, 204, 204));

        titleLabel2.setFont(new java.awt.Font("Arial Black", 2, 24)); // NOI18N
        titleLabel2.setForeground(new java.awt.Color(255, 255, 204));
        titleLabel2.setText("Vending Machine Maintenance");

        jPanel5.setBackground(new java.awt.Color(255, 255, 204));
        jPanel5.setPreferredSize(new java.awt.Dimension(500, 276));
        jPanel5.setLayout(new java.awt.GridLayout(5, 3));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 255));

        jButton3.setBackground(new java.awt.Color(255, 153, 153));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        jButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        confirmButton1.setBackground(new java.awt.Color(153, 209, 153));
        confirmButton1.setFont(new java.awt.Font("Agency FB", 1, 21)); // NOI18N
        confirmButton1.setForeground(new java.awt.Color(255, 255, 255));
        confirmButton1.setText("Confirm");
        confirmButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 5, true));
        confirmButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButton1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        restockCurrencyLabel.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        restockCurrencyLabel.setForeground(new java.awt.Color(255, 255, 204));
        restockCurrencyLabel.setText("RESTOCK ALL CURRENCY");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter Stock:");

        javax.swing.GroupLayout restockSlotPanelLayout = new javax.swing.GroupLayout(restockSlotPanel);
        restockSlotPanel.setLayout(restockSlotPanelLayout);
        restockSlotPanelLayout.setHorizontalGroup(
            restockSlotPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(restockSlotPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(restockSlotPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, restockSlotPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(restockSlotPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirmButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(90, 90, 90)
                        .addComponent(jButton3))
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                    .addComponent(jSeparator3))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, restockSlotPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(restockSlotPanelLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(restockCurrencyLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        restockSlotPanelLayout.setVerticalGroup(
            restockSlotPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(restockSlotPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(restockCurrencyLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(restockSlotPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(restockSlotPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(restockSlotPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(restockSlotPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(confirmButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(restockSlotPanel, "card2");

        restockAllSlotsPanel.setBackground(new java.awt.Color(255, 204, 204));

        titleLabel4.setFont(new java.awt.Font("Arial Black", 2, 24)); // NOI18N
        titleLabel4.setForeground(new java.awt.Color(255, 255, 204));
        titleLabel4.setText("Vending Machine Maintenance");

        jPanel7.setBackground(new java.awt.Color(255, 255, 204));
        jPanel7.setPreferredSize(new java.awt.Dimension(500, 276));
        jPanel7.setLayout(new java.awt.GridLayout(5, 3));

        jSeparator5.setForeground(new java.awt.Color(204, 204, 255));

        jButton5.setBackground(new java.awt.Color(255, 153, 153));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        jButton5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        confirmButton3.setBackground(new java.awt.Color(153, 209, 153));
        confirmButton3.setFont(new java.awt.Font("Agency FB", 1, 21)); // NOI18N
        confirmButton3.setForeground(new java.awt.Color(255, 255, 255));
        confirmButton3.setText("Confirm");
        confirmButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 5, true));
        confirmButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButton3ActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        restockAllCurrencyLabel.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        restockAllCurrencyLabel.setForeground(new java.awt.Color(255, 255, 204));
        restockAllCurrencyLabel.setText("RESTOCK CURRENCY");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Enter Stock:");

        javax.swing.GroupLayout restockAllSlotsPanelLayout = new javax.swing.GroupLayout(restockAllSlotsPanel);
        restockAllSlotsPanel.setLayout(restockAllSlotsPanelLayout);
        restockAllSlotsPanelLayout.setHorizontalGroup(
            restockAllSlotsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(restockAllSlotsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(restockAllSlotsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, restockAllSlotsPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(restockAllSlotsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirmButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(90, 90, 90)
                        .addComponent(jButton5))
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                    .addComponent(jSeparator5))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, restockAllSlotsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(restockAllSlotsPanelLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(restockAllCurrencyLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        restockAllSlotsPanelLayout.setVerticalGroup(
            restockAllSlotsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(restockAllSlotsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(restockAllCurrencyLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(restockAllSlotsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(restockAllSlotsPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(restockAllSlotsPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(restockAllSlotsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(confirmButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(restockAllSlotsPanel, "card2");

        editPricePanel.setBackground(new java.awt.Color(255, 204, 204));

        titleLabel5.setFont(new java.awt.Font("Arial Black", 2, 24)); // NOI18N
        titleLabel5.setForeground(new java.awt.Color(255, 255, 204));
        titleLabel5.setText("Vending Machine Maintenance");

        jPanel8.setBackground(new java.awt.Color(255, 255, 204));
        jPanel8.setPreferredSize(new java.awt.Dimension(500, 276));
        jPanel8.setLayout(new java.awt.GridLayout(5, 3));

        jSeparator6.setForeground(new java.awt.Color(204, 204, 255));

        jButton6.setBackground(new java.awt.Color(255, 153, 153));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        jButton6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        confirmButton4.setBackground(new java.awt.Color(153, 209, 153));
        confirmButton4.setFont(new java.awt.Font("Agency FB", 1, 21)); // NOI18N
        confirmButton4.setForeground(new java.awt.Color(255, 255, 255));
        confirmButton4.setText("Confirm");
        confirmButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 5, true));
        confirmButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButton4ActionPerformed(evt);
            }
        });

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        collectCurrencyLabel.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        collectCurrencyLabel.setForeground(new java.awt.Color(255, 255, 204));
        collectCurrencyLabel.setText("COLLECT CURRENCY");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Enter Stock:");

        javax.swing.GroupLayout editPricePanelLayout = new javax.swing.GroupLayout(editPricePanel);
        editPricePanel.setLayout(editPricePanelLayout);
        editPricePanelLayout.setHorizontalGroup(
            editPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPricePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(editPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editPricePanelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(editPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirmButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(90, 90, 90)
                        .addComponent(jButton6))
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                    .addComponent(jSeparator6))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editPricePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(editPricePanelLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(collectCurrencyLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        editPricePanelLayout.setVerticalGroup(
            editPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPricePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(collectCurrencyLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(editPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editPricePanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(editPricePanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(editPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(confirmButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(editPricePanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed

    }//GEN-LAST:event_clearButtonActionPerformed

    private void maintenanceSelectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maintenanceSelectButtonActionPerformed
  /*      JPanel maintenancePanel = null;
        
    if (restockSlotButton.isSelected()) {
        
        maintenancePanel = restockSlotPanel;
        jPanel1.add(restockSlotPanel, "restockSlotPanel");
        restockSlotPanel.add(productPanel);
  
           
    } else if (restockAllSlotsButton.isSelected()) {
        
        maintenancePanel = restockAllSlotsPanel;
        jPanel1.add(restockAllSlotsPanel, "restockAllSlotsPanel");
        restockAllSlotsPanel.add(printProductMaintenance());
        restockSlotPanel.add(textField);
        
    } else if (editProductPriceButton.isSelected()) {
        maintenancePanel = editPricePanel;
        jPanel3.add(editPricePanel, "editPricePanel");
        editPricePanel.add(productPanel);
        editPricePanel.add(textField);
        
    } else if (restockProductButton.isSelected()) {
        maintenancePanel = restockSlotPanel;
        jPanel3.add(restockSlotPanel, "restockCurrencyPanel");
        restockSlotPanel.add(buttonCurrencyStock());
        restockSlotPanel.add(textField);
        
    } else if (displayTransactions.isSelected()) {
       maintenancePanel = restockAllSlotsPanel;
        jPanel3.add(restockAllSlotsPanel, "restockAllCurrencyPanel");
        restockAllSlotsPanel.add(printCurrencyStock());
        restockAllSlotsPanel.add(textField);
        
    } else if (displaySalesReport.isSelected()) {
        maintenancePanel = editPricePanel;
        jPanel3.add(editPricePanel, "collectCurrencyPanel");
        editPricePanel.add(buttonCurrencyStock());
        editPricePanel.add(textField);
        
    } else if (collectAllCurrencyButton.isSelected()) {
        maintenancePanel = collectAllCurrencyPanel;
        jPanel3.add(collectAllCurrencyPanel, "collectAllCurrencyPanel");
        collectAllCurrencyPanel.add(printCurrencyStock());
        collectAllCurrencyPanel.add(textField);
        
    } else if (displayTransactionsButton.isSelected()) {
        maintenancePanel = displayTransactionsPanel;
        jPanel3.add(displayTransactionsPanel, "displayTransactionsPanel");
        displayTransactionsPanel.add(printTransactions());
        displayTransactionsPanel.add(textField);
        
    } else if (displaySalesReportButton.isSelected()) {
        maintenancePanel = displaySalesReportPanel;
        jPanel3.add(displaySalesReportPanel, "displaySalesReportPanel");
        displaySalesReportPanel.add(printSalesReport());
        displaySalesReportPanel.add(textField);  
    }

    // Add the custom panel to jPanel3
    jPanel3.removeAll();
        jPanel3.add(maintenancePanel);
        jPanel3.revalidate();
        jPanel3.repaint();
*/
    }//GEN-LAST:event_maintenanceSelectButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void confirmButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void confirmButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmButton3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void confirmButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmButton4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void displaySalesReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displaySalesReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_displaySalesReportActionPerformed

    private void displayTransactionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayTransactionsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_displayTransactionsActionPerformed



       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel collectCurrencyLabel;
    private javax.swing.JButton confirmButton1;
    private javax.swing.JButton confirmButton3;
    private javax.swing.JButton confirmButton4;
    private javax.swing.JRadioButton displaySalesReport;
    private javax.swing.JRadioButton displayTransactions;
    private javax.swing.JPanel editPricePanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JButton maintenanceSelectButton;
    private javax.swing.JLabel restockAllCurrencyLabel;
    private javax.swing.JPanel restockAllSlotsPanel;
    private javax.swing.JLabel restockCurrencyLabel;
    private javax.swing.JPanel restockSlotPanel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel titleLabel2;
    private javax.swing.JLabel titleLabel4;
    private javax.swing.JLabel titleLabel5;
    // End of variables declaration//GEN-END:variables
}

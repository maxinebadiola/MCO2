/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package javaproject9;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author ERICA
 */
public class ComboProductsPanel extends javax.swing.JPanel {
    private Machine machine;
    HashMap<Product, Integer> selectedComboProducts = new HashMap<>();
    /**
     * Creates new form ProductsPanel
     * @param machine
     */

   public ComboProductsPanel(Machine machine) {
        this.machine = machine;
        initComponents();
        generateProductButtons();
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
        jPanel1 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 204));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void generateProductButtons() {
        ArrayList<Slot> slotList = machine.getSlotList();

        removeAll();
        JPanel productPanel = new JPanel();
        productPanel.setLayout(new GridBagLayout());
        
        productPanel.setBackground(new Color(255,255,204));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0; 

        for (Slot slot : slotList) {
            Product product = slot.getProduct();

            JLabel nameLabel = new JLabel(product.getName());
            gbc.gridx = 0; 
            productPanel.add(nameLabel, gbc);

            JLabel countLabel = new JLabel("(Count: 0)");
            gbc.gridx = 1; 
            productPanel.add(countLabel, gbc);

            JButton incrementButton = new JButton("+");
            gbc.gridx = 2; 
            productPanel.add(incrementButton, gbc);

            JButton decrementButton = new JButton("-");
            gbc.gridx = 3; 
            productPanel.add(decrementButton, gbc);

            incrementButton.addActionListener(e -> {
                int count = selectedComboProducts.getOrDefault(product, 0);
                count++;
                selectedComboProducts.put(product, count);
                countLabel.setText("(Count: " + count + ")");
            });

            decrementButton.addActionListener(e -> {
                int count = selectedComboProducts.getOrDefault(product, 0);
                if (count > 0) {
                    count--;
                    selectedComboProducts.put(product, count);
                    countLabel.setText("(Count: " + count + ")");
                }
            });

            JLabel stockLabel = new JLabel("Stock: " + slot.getStock());
            gbc.gridx = 4; 
            productPanel.add(stockLabel, gbc);

            JLabel priceLabel = new JLabel("Price: PHP " + product.getPrice());
            gbc.gridx = 5; 
            productPanel.add(priceLabel, gbc);

            JLabel caloriesLabel = new JLabel("Calories: " + product.getCalories());
            gbc.gridx = 6; 
            productPanel.add(caloriesLabel, gbc);

            gbc.gridy++; 
        }

        jPanel1.add(productPanel);

       
        int preferredHeight = gbc.gridy * 30 + 10; 
        setPreferredSize(new Dimension(getPreferredSize().width, preferredHeight));

        revalidate();
        repaint();
    }
    
    public void resetCountLabels() {
        for (Product product : selectedComboProducts.keySet()) {
            selectedComboProducts.put(product, 0);
        }        
        for (Component component : jPanel1.getComponents()) {
            if (component instanceof JPanel) {
                for (Component subComponent : ((JPanel) component).getComponents()) {
                    if (subComponent instanceof JLabel) {
                        JLabel label = (JLabel) subComponent;
                        String labelText = label.getText();
                        if (labelText.startsWith("(Count: ")) {
                            label.setText("(Count: 0)"); 
                        }
                    }
                }
            }
        }
    }
    
    public HashMap<Product, Integer> getSelectedComboProducts() {
        return selectedComboProducts;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
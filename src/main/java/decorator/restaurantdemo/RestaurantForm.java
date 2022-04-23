/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package decorator.restaurantdemo;
import java.awt.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.text.*;
/**
 *
 * @author Forge-15 1650
 */
public class RestaurantForm extends javax.swing.JFrame {
    
    // declare variable
    int q1, sd1, sd2, sd3, b1, b2;
    // Declaration of String class Objects.
    String str = " ";
    double subnetamount,mainmealAmount,saladAmount,ffAmount,bbAmount,sdAmount,coffeeAmount,taxAmount,totaltopay;
    //triger check
    boolean check;
    //table no
    int tableno = 1;
    
    

    /**
     * Creates new form RestaurantForm
     */
    public RestaurantForm() {
        initComponents();
        // hide receipt button
        receiptButton.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainMealGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        mealAquantity = new javax.swing.JSpinner();
        mealBquantity = new javax.swing.JSpinner();
        mealCquantity = new javax.swing.JSpinner();
        quantityLabel1 = new javax.swing.JLabel();
        saladQuantity = new javax.swing.JSpinner();
        ffQuantity = new javax.swing.JSpinner();
        beanQuantity = new javax.swing.JSpinner();
        SDQuantity = new javax.swing.JSpinner();
        coffeeQuantity = new javax.swing.JSpinner();
        resetButton = new javax.swing.JButton();
        orderButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        mainMealRadioA = new javax.swing.JRadioButton();
        mainMealRadioB = new javax.swing.JRadioButton();
        mainMealRadioC = new javax.swing.JRadioButton();
        SDCheckBox = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        CoffeeCheckBox = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        saladCheckBox = new javax.swing.JCheckBox();
        frenchfriesCheckBox = new javax.swing.JCheckBox();
        bakedBeansCheckBox = new javax.swing.JCheckBox();
        receiptButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        receiptPane = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        tablenoSpinner = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 660, 500));
        setMinimumSize(new java.awt.Dimension(660, 550));
        setPreferredSize(new java.awt.Dimension(660, 550));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Ink Free", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome to Restaurant Cincai");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Developed by Tee Ming Yuan");
        jLabel6.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(43, 43, 43))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 100));

        mealAquantity.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        mealAquantity.setPreferredSize(new java.awt.Dimension(60, 25));
        mealAquantity.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                mealAquantityStateChanged(evt);
            }
        });
        getContentPane().add(mealAquantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        mealBquantity.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        mealBquantity.setPreferredSize(new java.awt.Dimension(60, 25));
        mealBquantity.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                mealBquantityStateChanged(evt);
            }
        });
        getContentPane().add(mealBquantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        mealCquantity.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        mealCquantity.setPreferredSize(new java.awt.Dimension(60, 25));
        mealCquantity.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                mealCquantityStateChanged(evt);
            }
        });
        getContentPane().add(mealCquantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        quantityLabel1.setText("Quantity");
        getContentPane().add(quantityLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, 20));

        saladQuantity.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        saladQuantity.setPreferredSize(new java.awt.Dimension(60, 25));
        saladQuantity.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                saladQuantityStateChanged(evt);
            }
        });
        getContentPane().add(saladQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, -1, -1));

        ffQuantity.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        ffQuantity.setPreferredSize(new java.awt.Dimension(60, 25));
        ffQuantity.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ffQuantityStateChanged(evt);
            }
        });
        getContentPane().add(ffQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, -1, -1));

        beanQuantity.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        beanQuantity.setPreferredSize(new java.awt.Dimension(60, 25));
        beanQuantity.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                beanQuantityStateChanged(evt);
            }
        });
        getContentPane().add(beanQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, -1, -1));

        SDQuantity.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        SDQuantity.setPreferredSize(new java.awt.Dimension(60, 25));
        SDQuantity.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SDQuantityStateChanged(evt);
            }
        });
        getContentPane().add(SDQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, -1, -1));

        coffeeQuantity.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        coffeeQuantity.setPreferredSize(new java.awt.Dimension(60, 25));
        coffeeQuantity.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                coffeeQuantityStateChanged(evt);
            }
        });
        getContentPane().add(coffeeQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, -1, -1));

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        getContentPane().add(resetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, -1, -1));

        orderButton.setText("Order");
        orderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderButtonActionPerformed(evt);
            }
        });
        getContentPane().add(orderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, -1, -1));

        jLabel2.setText("Main meal");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 68, -1));

        mainMealGroup.add(mainMealRadioA);
        mainMealRadioA.setText("Main Meal A");
        mainMealRadioA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMealRadioAActionPerformed(evt);
            }
        });
        getContentPane().add(mainMealRadioA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 110, 30));

        mainMealGroup.add(mainMealRadioB);
        mainMealRadioB.setText("Main Meal B");
        mainMealRadioB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMealRadioBActionPerformed(evt);
            }
        });
        getContentPane().add(mainMealRadioB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 110, 30));

        mainMealGroup.add(mainMealRadioC);
        mainMealRadioC.setText("Main Meal C");
        mainMealRadioC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMealRadioCActionPerformed(evt);
            }
        });
        getContentPane().add(mainMealRadioC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 110, 30));

        SDCheckBox.setText("Soft drinks");
        SDCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SDCheckBoxActionPerformed(evt);
            }
        });
        getContentPane().add(SDCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 85, 20));

        jLabel4.setText("Beverages");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, 10));

        CoffeeCheckBox.setText("Coffee");
        CoffeeCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CoffeeCheckBoxActionPerformed(evt);
            }
        });
        getContentPane().add(CoffeeCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 85, 20));

        jLabel3.setText("Side dish");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 56, -1));

        saladCheckBox.setText("Salad");
        saladCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saladCheckBoxActionPerformed(evt);
            }
        });
        getContentPane().add(saladCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 85, -1));

        frenchfriesCheckBox.setText("French fries");
        frenchfriesCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frenchfriesCheckBoxActionPerformed(evt);
            }
        });
        getContentPane().add(frenchfriesCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 85, -1));

        bakedBeansCheckBox.setText("Baked beans");
        bakedBeansCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bakedBeansCheckBoxActionPerformed(evt);
            }
        });
        getContentPane().add(bakedBeansCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 98, -1));

        receiptButton.setText("Receipt");
        receiptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receiptButtonActionPerformed(evt);
            }
        });
        getContentPane().add(receiptButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, -1, -1));

        receiptPane.setEditable(false);
        receiptPane.setFocusCycleRoot(false);
        receiptPane.setPreferredSize(new java.awt.Dimension(30, 20));
        jScrollPane2.setViewportView(receiptPane);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 300, 370));

        jLabel5.setText("Table No.");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        tablenoSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        tablenoSpinner.setPreferredSize(new java.awt.Dimension(60, 25));
        tablenoSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tablenoSpinnerStateChanged(evt);
            }
        });
        getContentPane().add(tablenoSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 0, 51));
        jPanel2.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 90, 100));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void orderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderButtonActionPerformed
        // TODO add your handling code here:
        
        check = true;
        receiptPane.setText(null);
        
         // Override Method
                if(mainMealRadioA.isSelected() ){
                    MainMealA m0 = new MainMealA();
                    Restaurant m1 = new AddSalad(new MainMealA());
                    Restaurant m2 = new AddFF(new MainMealA());
                    Restaurant m3 = new AddBB(new MainMealA());
                    Restaurant m4 = new AddSD(new MainMealA());
                    Restaurant m5 = new AddCoffee(new MainMealA());
                    Restaurant m6 = new AddCoffee(new AddSD(new AddBB(new AddFF(new AddSalad(new MainMealA())))));
                    str = "Order Success ! ";
                    mainmealAmount = m0.prices(q1, sd1, sd2, sd3, b1, b2);
                    saladAmount = m1.prices(q1, sd1, sd2, sd3, b1, b2) - m0.prices(q1, sd1, sd2, sd3, b1, b2) ;
                    ffAmount = m2.prices(q1, sd1, sd2, sd3, b1, b2) - m0.prices(q1, sd1, sd2, sd3, b1, b2);
                    bbAmount = m3.prices(q1, sd1, sd2, sd3, b1, b2) - m0.prices(q1, sd1, sd2, sd3, b1, b2);
                    sdAmount = m4.prices(q1, sd1, sd2, sd3, b1, b2) - m0.prices(q1, sd1, sd2, sd3, b1, b2);
                    coffeeAmount = m5.prices(q1, sd1, sd2, sd3, b1, b2) - m0.prices(q1, sd1, sd2, sd3, b1, b2);
                    subnetamount = m6.prices(q1, sd1, sd2, sd3, b1, b2);
                    
                    receiptButton.setVisible(true);
          
                    
                }
                else if(mainMealRadioB.isSelected()){
                    MainMealB m0 = new MainMealB();
                    Restaurant m1 = new AddSalad(new MainMealB());
                    Restaurant m2 = new AddFF(new MainMealB());
                    Restaurant m3 = new AddBB(new MainMealB());
                    Restaurant m4 = new AddSD(new MainMealB());
                    Restaurant m5 = new AddCoffee(new MainMealB());
                    Restaurant m6 = new AddCoffee(new AddSD(new AddBB(new AddFF(new AddSalad(new MainMealB())))));
                    str = "Order Success ! ";
                    mainmealAmount = m0.prices(q1, sd1, sd2, sd3, b1, b2);
                    saladAmount = m1.prices(q1, sd1, sd2, sd3, b1, b2) - m0.prices(q1, sd1, sd2, sd3, b1, b2) ;
                    ffAmount = m2.prices(q1, sd1, sd2, sd3, b1, b2) - m0.prices(q1, sd1, sd2, sd3, b1, b2);
                    bbAmount = m3.prices(q1, sd1, sd2, sd3, b1, b2) - m0.prices(q1, sd1, sd2, sd3, b1, b2);
                    sdAmount = m4.prices(q1, sd1, sd2, sd3, b1, b2) - m0.prices(q1, sd1, sd2, sd3, b1, b2);
                    coffeeAmount = m5.prices(q1, sd1, sd2, sd3, b1, b2) - m0.prices(q1, sd1, sd2, sd3, b1, b2);
                    subnetamount = m6.prices(q1, sd1, sd2, sd3, b1, b2);
                    receiptButton.setVisible(true);
                    
                }
                else if(mainMealRadioC.isSelected()){
                    MainMealC m0 = new MainMealC();
                    Restaurant m1 = new AddSalad(new MainMealC());
                    Restaurant m2 = new AddFF(new MainMealC());
                    Restaurant m3 = new AddBB(new MainMealC());
                    Restaurant m4 = new AddSD(new MainMealC());
                    Restaurant m5 = new AddCoffee(new MainMealC());
                    Restaurant m6 = new AddCoffee(new AddSD(new AddBB(new AddFF(new AddSalad(new MainMealC())))));
                    str = "Order Success ! ";
                    mainmealAmount = m0.prices(q1, sd1, sd2, sd3, b1, b2);
                    saladAmount = m1.prices(q1, sd1, sd2, sd3, b1, b2) - m0.prices(q1, sd1, sd2, sd3, b1, b2) ;
                    ffAmount = m2.prices(q1, sd1, sd2, sd3, b1, b2) - m0.prices(q1, sd1, sd2, sd3, b1, b2);
                    bbAmount = m3.prices(q1, sd1, sd2, sd3, b1, b2) - m0.prices(q1, sd1, sd2, sd3, b1, b2);
                    sdAmount = m4.prices(q1, sd1, sd2, sd3, b1, b2) - m0.prices(q1, sd1, sd2, sd3, b1, b2);
                    coffeeAmount = m5.prices(q1, sd1, sd2, sd3, b1, b2) - m0.prices(q1, sd1, sd2, sd3, b1, b2);
                    subnetamount = m6.prices(q1, sd1, sd2, sd3, b1, b2);
                    receiptButton.setVisible(true);
                   
                }
                else {
  
                    str = "Please select a main meal !";
                    
                    
                }
                // MessageDialog to show information selected radion buttons.
                JOptionPane.showMessageDialog(RestaurantForm.this, str);
                
  
                
    }//GEN-LAST:event_orderButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
       resetFunction();
    }//GEN-LAST:event_resetButtonActionPerformed

    private void bakedBeansCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bakedBeansCheckBoxActionPerformed
        // TODO add your handling code here:
        if (bakedBeansCheckBox.isSelected()){
            if((int)beanQuantity.getValue() < 1){
                beanQuantity.setValue(1);
            }
            sd3 = (int)beanQuantity.getValue();
        }else{
            beanQuantity.setValue(0);
            sd3 = (int)beanQuantity.getValue();
        }
    }//GEN-LAST:event_bakedBeansCheckBoxActionPerformed

    private void frenchfriesCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frenchfriesCheckBoxActionPerformed
        // TODO add your handling code here:
        if (frenchfriesCheckBox.isSelected()){
            if((int)ffQuantity.getValue() < 1){
                ffQuantity.setValue(1);
            }
            sd2 = (int)ffQuantity.getValue();
        }else{
            ffQuantity.setValue(0);
            sd2 = (int)ffQuantity.getValue();
        }
    }//GEN-LAST:event_frenchfriesCheckBoxActionPerformed

    private void saladCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saladCheckBoxActionPerformed
        // TODO add your handling code here:
        if (saladCheckBox.isSelected()){
            if((int)saladQuantity.getValue() < 1){
                saladQuantity.setValue(1);
            }
            sd1 = (int)saladQuantity.getValue();
            
        }else{
            saladQuantity.setValue(0);
            sd1 = (int)saladQuantity.getValue();
        }
    }//GEN-LAST:event_saladCheckBoxActionPerformed

    private void CoffeeCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CoffeeCheckBoxActionPerformed
        // TODO add your handling code here:
        if (CoffeeCheckBox.isSelected()){
            if((int)coffeeQuantity.getValue() < 1){
                coffeeQuantity.setValue(1);
            }
            b2 = (int)coffeeQuantity.getValue();
        }else{
            coffeeQuantity.setValue(0);
            sd1 = (int)coffeeQuantity.getValue();
        }
    }//GEN-LAST:event_CoffeeCheckBoxActionPerformed

    private void SDCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SDCheckBoxActionPerformed
        // TODO add your handling code here:
        if (SDCheckBox.isSelected()){
            if((int)SDQuantity.getValue() < 1){
                SDQuantity.setValue(1);
            }
            SDQuantity.setValue(1);
            b1 = (int)SDQuantity.getValue();
        }else{
            SDQuantity.setValue(0);
            b1 = (int)SDQuantity.getValue();
        }
    }//GEN-LAST:event_SDCheckBoxActionPerformed

    private void mainMealRadioCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMealRadioCActionPerformed
        // TODO add your handling code here:
        if (mainMealRadioC.isSelected()) {
            if((int)mealCquantity.getValue() < 1){
                mealCquantity.setValue(1);
            }
            mealAquantity.setValue(0);
            mealBquantity.setValue(0);
            q1 = (int)mealCquantity.getValue();

        }
    }//GEN-LAST:event_mainMealRadioCActionPerformed

    private void mainMealRadioBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMealRadioBActionPerformed
        // TODO add your handling code here:
        if (mainMealRadioB.isSelected()) {
            if((int)mealBquantity.getValue() < 1){
                mealBquantity.setValue(1);
            }
            mealAquantity.setValue(0);
            mealCquantity.setValue(0);
            q1 = (int)mealBquantity.getValue();

        }
    }//GEN-LAST:event_mainMealRadioBActionPerformed

    private void mainMealRadioAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMealRadioAActionPerformed
        // TODO add your handling code here:
        if (mainMealRadioA.isSelected()) {
            if((int)mealAquantity.getValue() < 1){
                mealAquantity.setValue(1);
            }
            
            mealBquantity.setValue(0);
            mealCquantity.setValue(0);
            q1 = (int)mealAquantity.getValue();
            
        }
    }//GEN-LAST:event_mainMealRadioAActionPerformed

    private void mealAquantityStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_mealAquantityStateChanged
        // TODO add your handling code here:
        if (mainMealRadioA.isSelected()) {
            q1 = (int)mealAquantity.getValue();

        }
    }//GEN-LAST:event_mealAquantityStateChanged

    private void setInsertText()
    {
        Document doc = receiptPane.getDocument();
        int CurrentDocLength = doc.getLength();
        receiptPane.setSelectionStart(CurrentDocLength);
        receiptPane.setSelectionEnd(CurrentDocLength);
    }
    private void insertText(String text,SimpleAttributeSet font){
        setInsertText();
        Document doc = receiptPane.getDocument();
        try{
            doc.insertString(doc.getLength(), text, font);
        }catch (BadLocationException ex) {
                Logger.getLogger(RestaurantForm.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    private void receiptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receiptButtonActionPerformed
        // TODO add your handling code here:
        //font 
        SimpleAttributeSet header = new SimpleAttributeSet();
        StyleConstants.setForeground(header,Color.RED);
        StyleConstants.setFontSize(header, 20);
        StyleConstants.setBold(header, true);
        StyleConstants.setAlignment(header,StyleConstants.ALIGN_CENTER);
        
        SimpleAttributeSet font = new SimpleAttributeSet();
        StyleConstants.setForeground(font,Color.gray);
        StyleConstants.setBold(font, false);
        
        SimpleAttributeSet font2 = new SimpleAttributeSet();
        StyleConstants.setBold(font2, true);
        
        SimpleAttributeSet grayline = new SimpleAttributeSet();
        StyleConstants.setForeground(grayline,Color.gray);
     
        
        
        // GST tax = 6%
        taxAmount = subnetamount * 6 / 100 ;
        totaltopay = subnetamount + taxAmount;
        
        // hide receipt button
        receiptButton.setVisible(false);
        
        insertText("Restaurant Cincai",header);
        
        //Displaying current date 
        LocalDate nowDate = LocalDate.now();
        insertText("\n\n Date : " + nowDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),font2);
        
        //Displaying current time in 12 hour format with AM/PM
        LocalTime nowTime = LocalTime.now();
        insertText("\n Time : " + nowTime.format(DateTimeFormatter.ofPattern("hh:mm a")),font2);
               
        insertText("\n Table - " + tableno,font2);
        
        insertText("\n\nQTY    Item name\tPrice(RM)\tAmount",font2);
        insertText("\n---------------------------------------------------------------------",grayline);
        
        if (mainMealRadioA.isSelected() && check == true) {
            insertText("\n  " + q1 + "        Main meal A\t20.0\t" + mainmealAmount,font);
            insertText("\n  " + sd1 + "        Salad\t\t12.0\t" + saladAmount,font);
            insertText("\n  " + sd2 + "        French Fries\t8.0\t" + ffAmount ,font);
            insertText("\n  " + sd3 + "        Baked Beans\t7.0\t" + bbAmount,font);
            insertText("\n  " + b1 + "        Soft Drinks\t3.0\t" + sdAmount,font);
            insertText("\n  " + b2 + "        Coffee\t2.0\t" + coffeeAmount,font);
            
            insertText("\n---------------------------------------------------------------------",grayline);
            insertText("\nSubnet Total :",font2);
            insertText("\t\tRM" + subnetamount,font);
            insertText("\n---------------------------------------------------------------------",grayline);
            insertText("\nSales tax (6%) :",font2);
            insertText("\t\tRM" + taxAmount,font);
            insertText("\n---------------------------------------------------------------------",grayline);
            insertText("\nTotal to pay :",font2);
            insertText("\t\tRM" + totaltopay,font);
            insertText("\n---------------------------------------------------------------------",grayline);
            
        }else if(mainMealRadioB.isSelected() && check == true){
            insertText("\n  " + q1 + "        Main meal B\t23.0\t" + mainmealAmount,font);
            insertText("\n  " + sd1 + "        Salad\t\t12.0\t" + saladAmount,font);
            insertText("\n  " + sd2 + "        French Fries\t8.0\t" + ffAmount ,font);
            insertText("\n  " + sd3 + "        Baked Beans\t7.0\t" + bbAmount,font);
            insertText("\n  " + b1 + "        Soft Drinks\t3.0\t" + sdAmount,font);
            insertText("\n  " + b2 + "        Coffee\t2.0\t" + coffeeAmount,font);
            
            insertText("\n---------------------------------------------------------------------",grayline);
            insertText("\nSubnet Total :",font2);
            insertText("\t\tRM" + subnetamount,font);
            insertText("\n---------------------------------------------------------------------",grayline);
            insertText("\nSales tax (6%) :",font2);
            insertText("\t\tRM" + taxAmount,font);
            insertText("\n---------------------------------------------------------------------",grayline);
            insertText("\nTotal to pay :",font2);
            insertText("\t\tRM" + totaltopay,font);
            insertText("\n---------------------------------------------------------------------",grayline);
            
        }else if(mainMealRadioC.isSelected() && check == true){
            insertText("\n  " + q1 + "        Main meal C\t28.0\t" + mainmealAmount,font);
            insertText("\n  " + sd1 + "        Salad\t\t12.0\t" + saladAmount,font);
            insertText("\n  " + sd2 + "        French Fries\t8.0\t" + ffAmount ,font);
            insertText("\n  " + sd3 + "        Baked Beans\t7.0\t" + bbAmount,font);
            insertText("\n  " + b1 + "        Soft Drinks\t3.0\t" + sdAmount,font);
            insertText("\n  " + b2 + "        Coffee\t2.0\t" + coffeeAmount,font);
            
            insertText("\n---------------------------------------------------------------------",grayline);
            insertText("\nSubnet Total :",font2);
            insertText("\t\tRM" + subnetamount,font);
            insertText("\n---------------------------------------------------------------------",grayline);
            insertText("\nSales tax (6%) :",font2);
            insertText("\t\tRM" + taxAmount,font);
            insertText("\n---------------------------------------------------------------------",grayline);
            insertText("\nTotal to pay :",font2);
            insertText("\t\tRM" + totaltopay,font);
            insertText("\n---------------------------------------------------------------------",grayline);
            
        }else{ 
            resetFunction();
        }
        
    }//GEN-LAST:event_receiptButtonActionPerformed

    private void mealBquantityStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_mealBquantityStateChanged
        // TODO add your handling code here:
        if (mainMealRadioB.isSelected()) {
            q1 = (int)mealBquantity.getValue();

        }
    }//GEN-LAST:event_mealBquantityStateChanged

    private void mealCquantityStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_mealCquantityStateChanged
        // TODO add your handling code here:
        if (mainMealRadioC.isSelected()) {
            q1 = (int)mealCquantity.getValue();

        }
    }//GEN-LAST:event_mealCquantityStateChanged

    private void SDQuantityStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SDQuantityStateChanged
        // TODO add your handling code here:
        if (SDCheckBox.isSelected()){
            b1 = (int)SDQuantity.getValue();
        }
    }//GEN-LAST:event_SDQuantityStateChanged

    private void coffeeQuantityStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_coffeeQuantityStateChanged
        // TODO add your handling code here:
        if (CoffeeCheckBox.isSelected()){
            b2 = (int)coffeeQuantity.getValue();
        }
    }//GEN-LAST:event_coffeeQuantityStateChanged

    private void saladQuantityStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_saladQuantityStateChanged
        // TODO add your handling code here:
        if (saladCheckBox.isSelected()){
            sd1 = (int)saladQuantity.getValue();
        }
    }//GEN-LAST:event_saladQuantityStateChanged

    private void ffQuantityStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ffQuantityStateChanged
        // TODO add your handling code here:
        if (frenchfriesCheckBox.isSelected()){
            sd2 = (int)ffQuantity.getValue();
        }
    }//GEN-LAST:event_ffQuantityStateChanged

    private void beanQuantityStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_beanQuantityStateChanged
        // TODO add your handling code here:
        if (bakedBeansCheckBox.isSelected()){
            sd3 = (int)beanQuantity.getValue();
        }
    }//GEN-LAST:event_beanQuantityStateChanged

    private void tablenoSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tablenoSpinnerStateChanged
        // TODO add your handling code here:
        tableno = (int)tablenoSpinner.getValue();
    }//GEN-LAST:event_tablenoSpinnerStateChanged

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
            java.util.logging.Logger.getLogger(RestaurantForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RestaurantForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RestaurantForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RestaurantForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RestaurantForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CoffeeCheckBox;
    private javax.swing.JCheckBox SDCheckBox;
    private javax.swing.JSpinner SDQuantity;
    private javax.swing.JCheckBox bakedBeansCheckBox;
    private javax.swing.JSpinner beanQuantity;
    private javax.swing.JSpinner coffeeQuantity;
    private javax.swing.JSpinner ffQuantity;
    private javax.swing.JCheckBox frenchfriesCheckBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.ButtonGroup mainMealGroup;
    private javax.swing.JRadioButton mainMealRadioA;
    private javax.swing.JRadioButton mainMealRadioB;
    private javax.swing.JRadioButton mainMealRadioC;
    private javax.swing.JSpinner mealAquantity;
    private javax.swing.JSpinner mealBquantity;
    private javax.swing.JSpinner mealCquantity;
    private javax.swing.JButton orderButton;
    private javax.swing.JLabel quantityLabel1;
    private javax.swing.JButton receiptButton;
    private javax.swing.JTextPane receiptPane;
    private javax.swing.JButton resetButton;
    private javax.swing.JCheckBox saladCheckBox;
    private javax.swing.JSpinner saladQuantity;
    private javax.swing.JSpinner tablenoSpinner;
    // End of variables declaration//GEN-END:variables
    private void resetFunction(){
        
        // reset all selection
        receiptPane.setText(null);
        mainMealGroup.clearSelection();
        CoffeeCheckBox.setSelected(false);
        SDCheckBox.setSelected(false);
        saladCheckBox.setSelected(false);
        frenchfriesCheckBox.setSelected(false);
        bakedBeansCheckBox.setSelected(false);
        
        mealAquantity.setValue(0);
        mealBquantity.setValue(0);
        mealCquantity.setValue(0);
        SDQuantity.setValue(0);
        coffeeQuantity.setValue(0);
        saladQuantity.setValue(0);
        ffQuantity.setValue(0);
        beanQuantity.setValue(0);
        tablenoSpinner.setValue(1);
        
        tableno = q1 = sd1 = sd2 = sd3 = b1 = b2 = 0 ;
        subnetamount = mainmealAmount = saladAmount = ffAmount = bbAmount = sdAmount = coffeeAmount = 0;
        
        JOptionPane.showMessageDialog(RestaurantForm.this,"Reset success !");
        
    }
}


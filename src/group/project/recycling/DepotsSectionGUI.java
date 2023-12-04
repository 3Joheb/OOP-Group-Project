/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package group.project.recycling;

/**
 *
 * @author zoheb
 */
public class DepotsSectionGUI extends javax.swing.JPanel {
    private DepotsSection logic;
    private Integer paymentValue;

    /**
     * Creates new form DepotsGUI
     * @param logic
     */
    public DepotsSectionGUI(DepotsSection logic) {
        initComponents();
        
        // Save logic instance
        this.logic = logic;

        // Fix text area bg color
        pickUpTxtAr.setBackground(new java.awt.Color(0, 0, 0, 0));
        dropOffTxtAr.setBackground(new java.awt.Color(0, 0, 0, 0));

        // set slider max value
        closestDepotSldr.setMaximum(50);
        
        // Create cards using logic list
        for(DepotCard card : logic.getCards()){
            createNewCard(card);
        }
    }

    private void createNewCard(DepotCard card) {
        // Store card variables
        String cardName = card.getName();
        String location = card.getLocation();
        String openTime = card.getOpenTime();
        String closeTime = card.getCloseTime();
        String num = card.getPhoneNumber();
        String err = card.getReadError();

        // Create new card gui instance
        DepotCardGUI cardGUI = new DepotCardGUI();
        cardGUI.setNameLbl(cardName);
        cardGUI.setLocationLbl(location);
        cardGUI.setTimeLbl(openTime, closeTime);
        cardGUI.setPhoneNumLbl(num);
        cardGUI.setReadError(err);

        // Add card to card container/panel
        cardContainer.add(cardGUI);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPane = new javax.swing.JScrollPane();
        scrollContainer = new javax.swing.JPanel();
        pickupHeadingLbl = new javax.swing.JLabel();
        pickUpTxtAr = new javax.swing.JTextArea();
        cardScrollPane = new javax.swing.JScrollPane();
        cardContainer = new javax.swing.JPanel();
        dropOffLbl = new javax.swing.JLabel();
        dropOffTxtAr = new javax.swing.JTextArea();
        nameLbl = new javax.swing.JLabel();
        emailLbl = new javax.swing.JLabel();
        pNumLbl = new javax.swing.JLabel();
        streetLbl = new javax.swing.JLabel();
        cityLbl = new javax.swing.JLabel();
        countyLbl = new javax.swing.JLabel();
        totalLbl = new javax.swing.JLabel();
        emailTFld = new javax.swing.JTextField();
        nameTFld = new javax.swing.JTextField();
        pNumTFld = new javax.swing.JTextField();
        cityTFld = new javax.swing.JTextField();
        countyTFld = new javax.swing.JTextField();
        streetTFld = new javax.swing.JTextField();
        payBtn = new javax.swing.JButton();
        closestDepotLbl = new javax.swing.JLabel();
        closestDepotSldr = new javax.swing.JSlider();
        depotSldr0Lbl = new javax.swing.JLabel();
        depotSldr50Lbl = new javax.swing.JLabel();
        usrSldrValue = new javax.swing.JLabel();

        scrollPane.setBorder(null);
        scrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        pickupHeadingLbl.setFont(new java.awt.Font("Eras Medium ITC", 0, 22)); // NOI18N
        pickupHeadingLbl.setText("Want us to pick up your recycling waste?");

        pickUpTxtAr.setEditable(false);
        pickUpTxtAr.setColumns(20);
        pickUpTxtAr.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        pickUpTxtAr.setLineWrap(true);
        pickUpTxtAr.setRows(5);
        pickUpTxtAr.setText("If you’d like us to pick up your recycling waste, fill in the form below.");
        pickUpTxtAr.setWrapStyleWord(true);
        pickUpTxtAr.setAutoscrolls(false);
        pickUpTxtAr.setBorder(null);
        pickUpTxtAr.setCaretColor(new java.awt.Color(242, 242, 242));
        pickUpTxtAr.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        pickUpTxtAr.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        pickUpTxtAr.setEnabled(false);
        pickUpTxtAr.setSelectedTextColor(new java.awt.Color(242, 242, 242));

        cardScrollPane.setBorder(null);
        cardScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        cardContainer.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 20, 5));
        cardScrollPane.setViewportView(cardContainer);

        dropOffLbl.setFont(new java.awt.Font("Eras Medium ITC", 0, 32)); // NOI18N
        dropOffLbl.setText("Drop off you recycling waste at our depots");

        dropOffTxtAr.setEditable(false);
        dropOffTxtAr.setColumns(20);
        dropOffTxtAr.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        dropOffTxtAr.setLineWrap(true);
        dropOffTxtAr.setRows(5);
        dropOffTxtAr.setText("If you aren’t near any recycling facilities or only want to go to a single place to drop of various recycling waste, drop off your waste at one of our depots and we’ll hand it over to recycling facilities free of charge.");
        dropOffTxtAr.setWrapStyleWord(true);
        dropOffTxtAr.setAutoscrolls(false);
        dropOffTxtAr.setBorder(null);
        dropOffTxtAr.setCaretColor(new java.awt.Color(242, 242, 242));
        dropOffTxtAr.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        dropOffTxtAr.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        dropOffTxtAr.setEnabled(false);
        dropOffTxtAr.setSelectedTextColor(new java.awt.Color(242, 242, 242));

        nameLbl.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        nameLbl.setText("Name:");

        emailLbl.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        emailLbl.setText("Email");

        pNumLbl.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        pNumLbl.setText("Phone number:");

        streetLbl.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        streetLbl.setText("Street:");

        cityLbl.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        cityLbl.setText("City:");

        countyLbl.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        countyLbl.setText("County:");

        totalLbl.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        totalLbl.setText("Total:");

        emailTFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTFldActionPerformed(evt);
            }
        });

        nameTFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTFldActionPerformed(evt);
            }
        });

        pNumTFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pNumTFldActionPerformed(evt);
            }
        });

        cityTFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityTFldActionPerformed(evt);
            }
        });

        countyTFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countyTFldActionPerformed(evt);
            }
        });

        streetTFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                streetTFldActionPerformed(evt);
            }
        });

        payBtn.setBackground(new java.awt.Color(0, 153, 51));
        payBtn.setFont(new java.awt.Font("Eras Medium ITC", 1, 14)); // NOI18N
        payBtn.setForeground(new java.awt.Color(242, 242, 242));
        payBtn.setText("Pay");
        payBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payBtnActionPerformed(evt);
            }
        });

        closestDepotLbl.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        closestDepotLbl.setText("Closest Depot:");

        closestDepotSldr.setValue(0);
        closestDepotSldr.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                closestDepotSldrStateChanged(evt);
            }
        });

        depotSldr0Lbl.setText("0 KM");

        depotSldr50Lbl.setText("50 KM");

        javax.swing.GroupLayout scrollContainerLayout = new javax.swing.GroupLayout(scrollContainer);
        scrollContainer.setLayout(scrollContainerLayout);
        scrollContainerLayout.setHorizontalGroup(
            scrollContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scrollContainerLayout.createSequentialGroup()
                .addGap(456, 456, 456)
                .addComponent(payBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, scrollContainerLayout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addGroup(scrollContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, scrollContainerLayout.createSequentialGroup()
                        .addComponent(cardScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, scrollContainerLayout.createSequentialGroup()
                        .addGroup(scrollContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pickupHeadingLbl)
                            .addComponent(totalLbl)
                            .addGroup(scrollContainerLayout.createSequentialGroup()
                                .addGroup(scrollContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(scrollContainerLayout.createSequentialGroup()
                                        .addComponent(closestDepotLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(usrSldrValue)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(depotSldr0Lbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(closestDepotSldr, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, scrollContainerLayout.createSequentialGroup()
                                        .addComponent(countyLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(countyTFld, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, scrollContainerLayout.createSequentialGroup()
                                        .addComponent(pNumLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pNumTFld, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, scrollContainerLayout.createSequentialGroup()
                                        .addComponent(streetLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(streetTFld, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, scrollContainerLayout.createSequentialGroup()
                                        .addComponent(cityLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cityTFld, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, scrollContainerLayout.createSequentialGroup()
                                        .addComponent(nameLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nameTFld, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, scrollContainerLayout.createSequentialGroup()
                                        .addComponent(emailLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(emailTFld, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, scrollContainerLayout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(pickUpTxtAr, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(depotSldr50Lbl)))
                        .addGap(360, 360, 360))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, scrollContainerLayout.createSequentialGroup()
                        .addComponent(dropOffLbl)
                        .addGap(218, 218, 218))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, scrollContainerLayout.createSequentialGroup()
                        .addComponent(dropOffTxtAr, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(335, 335, 335))))
        );
        scrollContainerLayout.setVerticalGroup(
            scrollContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scrollContainerLayout.createSequentialGroup()
                .addGroup(scrollContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(scrollContainerLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(dropOffLbl)
                        .addGap(18, 18, 18)
                        .addComponent(dropOffTxtAr, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(cardScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pickupHeadingLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pickUpTxtAr, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addGroup(scrollContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(nameLbl)
                            .addComponent(nameTFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(scrollContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(emailLbl)
                            .addComponent(emailTFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(scrollContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(pNumLbl)
                            .addComponent(pNumTFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(scrollContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(streetLbl)
                            .addComponent(streetTFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(scrollContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(cityLbl)
                            .addComponent(cityTFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(scrollContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(countyLbl)
                            .addComponent(countyTFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(scrollContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(depotSldr0Lbl)
                            .addComponent(closestDepotSldr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(depotSldr50Lbl))
                        .addGap(20, 20, 20)
                        .addComponent(totalLbl)
                        .addGap(14, 14, 14)
                        .addComponent(payBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(scrollContainerLayout.createSequentialGroup()
                        .addGap(868, 868, 868)
                        .addGroup(scrollContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(closestDepotLbl)
                            .addComponent(usrSldrValue))))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        scrollPane.setViewportView(scrollContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1092, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void emailTFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTFldActionPerformed

    private void nameTFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTFldActionPerformed

    private void pNumTFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pNumTFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pNumTFldActionPerformed

    private void cityTFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityTFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityTFldActionPerformed

    private void countyTFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countyTFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countyTFldActionPerformed

    private void streetTFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_streetTFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_streetTFldActionPerformed

    private void payBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payBtnActionPerformed
        // Save text field values to logic
        logic.setFullName(nameTFld.getText());
        logic.setEmail(emailTFld.getText());
        logic.setNumber(pNumTFld.getText());
        logic.setStreet(streetTFld.getText());
        logic.setCity(cityTFld.getText());
        logic.setCounty(countyTFld.getText());
        logic.setPaymentValue(getPaymentValue());
    }//GEN-LAST:event_payBtnActionPerformed

    private void closestDepotSldrStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_closestDepotSldrStateChanged

        int sliderValue = closestDepotSldr.getValue();
        usrSldrValue.setText(Integer.toString(sliderValue));

        // Change payment value
        setPaymentValue(sliderValue);

        // Update payment label
        totalLbl.setText("Total: €" + Integer.toString(paymentValue));
    }//GEN-LAST:event_closestDepotSldrStateChanged

    public Integer getPaymentValue() {
        return paymentValue;
    }

    private void setPaymentValue(Integer sliderValue) {
        if (sliderValue < 10) {
            paymentValue = 5;
        } else if (sliderValue > 35) {
            paymentValue = 15;
        } else {
            paymentValue = 10;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cardContainer;
    private javax.swing.JScrollPane cardScrollPane;
    private javax.swing.JLabel cityLbl;
    private javax.swing.JTextField cityTFld;
    private javax.swing.JLabel closestDepotLbl;
    private javax.swing.JSlider closestDepotSldr;
    private javax.swing.JLabel countyLbl;
    private javax.swing.JTextField countyTFld;
    private javax.swing.JLabel depotSldr0Lbl;
    private javax.swing.JLabel depotSldr50Lbl;
    private javax.swing.JLabel dropOffLbl;
    private javax.swing.JTextArea dropOffTxtAr;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JTextField emailTFld;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTFld;
    private javax.swing.JLabel pNumLbl;
    private javax.swing.JTextField pNumTFld;
    private javax.swing.JButton payBtn;
    private javax.swing.JTextArea pickUpTxtAr;
    private javax.swing.JLabel pickupHeadingLbl;
    private javax.swing.JPanel scrollContainer;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JLabel streetLbl;
    private javax.swing.JTextField streetTFld;
    private javax.swing.JLabel totalLbl;
    private javax.swing.JLabel usrSldrValue;
    // End of variables declaration//GEN-END:variables
}

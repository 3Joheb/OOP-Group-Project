/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package group.project.recycling;

/**
 *
 * @author zoheb
 */
public class DepotsGUI extends javax.swing.JPanel {

    /**
     * Creates new form DepotsGUI
     */
    public DepotsGUI() {
        initComponents();
        
        // Fix text area bg color
        pickUpTxtAr.setBackground(new java.awt.Color(0, 0, 0, 0));
        dropOffTxtAr.setBackground(new java.awt.Color(0, 0, 0, 0));

        // Create and add three cards
        for (int i = 0; i < 5; i++) {
            DepotCardsGUI card = new DepotCardsGUI();
            cardContainer.add(card);
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
        addressLbl = new javax.swing.JLabel();
        cityLbl = new javax.swing.JLabel();
        countyLbl = new javax.swing.JLabel();
        totalLbl = new javax.swing.JLabel();
        emailTFld = new javax.swing.JTextField();
        nameTFld = new javax.swing.JTextField();
        pNumTFld = new javax.swing.JTextField();
        cityTFld = new javax.swing.JTextField();
        countyTFld = new javax.swing.JTextField();
        addressTFld = new javax.swing.JTextField();
        payBtn = new javax.swing.JButton();
        closestDepotLbl = new javax.swing.JLabel();
        closestDepotSldr = new javax.swing.JSlider();

        scrollPane.setBorder(null);
        scrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        pickupHeadingLbl.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        pickupHeadingLbl.setText("Want us to pick up your recycling waste?");

        pickUpTxtAr.setEditable(false);
        pickUpTxtAr.setColumns(20);
        pickUpTxtAr.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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

        dropOffLbl.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        dropOffLbl.setText("Drop off you recycling waste at our depots");

        dropOffTxtAr.setEditable(false);
        dropOffTxtAr.setColumns(20);
        dropOffTxtAr.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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

        nameLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameLbl.setText("Name:");

        emailLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emailLbl.setText("Email");

        pNumLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pNumLbl.setText("Phone number:");

        addressLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addressLbl.setText("Address:");

        cityLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cityLbl.setText("City:");

        countyLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        countyLbl.setText("County:");

        totalLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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

        addressTFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTFldActionPerformed(evt);
            }
        });

        payBtn.setBackground(new java.awt.Color(0, 153, 51));
        payBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        payBtn.setForeground(new java.awt.Color(242, 242, 242));
        payBtn.setText("Pay");
        payBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payBtnActionPerformed(evt);
            }
        });

        closestDepotLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        closestDepotLbl.setText("Closest Depot:");

        closestDepotSldr.setValue(0);

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
                            .addGroup(scrollContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(scrollContainerLayout.createSequentialGroup()
                                    .addComponent(closestDepotLbl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                                    .addComponent(addressLbl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(addressTFld, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                    .addComponent(pickUpTxtAr, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                    .addComponent(addressLbl)
                    .addComponent(addressTFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(scrollContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cityLbl)
                    .addComponent(cityTFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(scrollContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(countyLbl)
                    .addComponent(countyTFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(scrollContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closestDepotLbl)
                    .addComponent(closestDepotSldr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(totalLbl)
                .addGap(14, 14, 14)
                .addComponent(payBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
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

    private void addressTFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTFldActionPerformed

    private void payBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLbl;
    private javax.swing.JTextField addressTFld;
    private javax.swing.JPanel cardContainer;
    private javax.swing.JScrollPane cardScrollPane;
    private javax.swing.JLabel cityLbl;
    private javax.swing.JTextField cityTFld;
    private javax.swing.JLabel closestDepotLbl;
    private javax.swing.JSlider closestDepotSldr;
    private javax.swing.JLabel countyLbl;
    private javax.swing.JTextField countyTFld;
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
    private javax.swing.JLabel totalLbl;
    // End of variables declaration//GEN-END:variables
}

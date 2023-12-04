/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package group.project.recycling;

/**
 *
 * @author zoheb
 */
public class AddFacilitySectionGUI extends javax.swing.JPanel {

    /**
     * Creates new form AddFacilityGUI
     */
    public AddFacilitySectionGUI() {
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

        jFileChooser1 = new javax.swing.JFileChooser();
        formHeadingLbl = new javax.swing.JLabel();
        companyNameLbl = new javax.swing.JLabel();
        facilityNameLbl = new javax.swing.JLabel();
        emailLbl = new javax.swing.JLabel();
        pNumLbl = new javax.swing.JLabel();
        streetLbl = new javax.swing.JLabel();
        cityLbl = new javax.swing.JLabel();
        countyLbl = new javax.swing.JLabel();
        openTimeLbl = new javax.swing.JLabel();
        closeTimeLbl = new javax.swing.JLabel();
        wasteAcceptedLbl = new javax.swing.JLabel();
        imgLbl = new javax.swing.JLabel();
        companyNameTFld = new javax.swing.JTextField();
        facilityNameTFld = new javax.swing.JTextField();
        emailTFld = new javax.swing.JTextField();
        pNumTFld = new javax.swing.JTextField();
        addressTFld = new javax.swing.JTextField();
        cityTFld = new javax.swing.JTextField();
        countyTFld = new javax.swing.JTextField();
        openTimeTFld = new javax.swing.JTextField();
        closeTimeTFld = new javax.swing.JTextField();
        wasteTFld = new javax.swing.JTextField();
        selectFileBtn = new javax.swing.JButton();
        submitBtn = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1092, 614));
        setMinimumSize(new java.awt.Dimension(1092, 614));

        formHeadingLbl.setFont(new java.awt.Font("Eras Medium ITC", 0, 24)); // NOI18N
        formHeadingLbl.setText("Fill the form below to list your recycling facility?");

        companyNameLbl.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        companyNameLbl.setText("Company Name:");

        facilityNameLbl.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        facilityNameLbl.setText("Facility Name:");

        emailLbl.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        emailLbl.setText("Email:");

        pNumLbl.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        pNumLbl.setText("Phone number:");

        streetLbl.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        streetLbl.setText("Street:");

        cityLbl.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        cityLbl.setText("City:");

        countyLbl.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        countyLbl.setText("County:");

        openTimeLbl.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        openTimeLbl.setText("Open time:");

        closeTimeLbl.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        closeTimeLbl.setText("Close time:");

        wasteAcceptedLbl.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        wasteAcceptedLbl.setText("Waste accepted:");

        imgLbl.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        imgLbl.setText("Image of facility");

        companyNameTFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyNameTFldActionPerformed(evt);
            }
        });

        facilityNameTFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facilityNameTFldActionPerformed(evt);
            }
        });

        addressTFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTFldActionPerformed(evt);
            }
        });

        selectFileBtn.setBackground(new java.awt.Color(0, 102, 204));
        selectFileBtn.setFont(new java.awt.Font("Eras Medium ITC", 1, 14)); // NOI18N
        selectFileBtn.setForeground(new java.awt.Color(242, 242, 242));
        selectFileBtn.setText("Select File");
        selectFileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectFileBtnActionPerformed(evt);
            }
        });

        submitBtn.setBackground(new java.awt.Color(0, 151, 51));
        submitBtn.setFont(new java.awt.Font("Eras Medium ITC", 1, 14)); // NOI18N
        submitBtn.setForeground(new java.awt.Color(242, 242, 242));
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(formHeadingLbl)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(companyNameLbl)
                                    .addComponent(facilityNameLbl)
                                    .addComponent(emailLbl)
                                    .addComponent(pNumLbl)
                                    .addComponent(streetLbl)
                                    .addComponent(cityLbl)
                                    .addComponent(countyLbl)
                                    .addComponent(openTimeLbl)
                                    .addComponent(closeTimeLbl)
                                    .addComponent(wasteAcceptedLbl)
                                    .addComponent(imgLbl))
                                .addGap(131, 131, 131)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(companyNameTFld)
                                    .addComponent(facilityNameTFld)
                                    .addComponent(emailTFld)
                                    .addComponent(pNumTFld)
                                    .addComponent(addressTFld)
                                    .addComponent(cityTFld)
                                    .addComponent(countyTFld)
                                    .addComponent(openTimeTFld)
                                    .addComponent(closeTimeTFld)
                                    .addComponent(wasteTFld)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(selectFileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(485, 485, 485)
                        .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(274, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(formHeadingLbl)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(companyNameTFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(companyNameLbl))
                                        .addGap(18, 18, 18)
                                        .addComponent(facilityNameLbl))
                                    .addComponent(facilityNameTFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(emailLbl))
                            .addComponent(emailTFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(pNumLbl))
                    .addComponent(pNumTFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(streetLbl)
                    .addComponent(addressTFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityLbl)
                    .addComponent(cityTFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countyLbl)
                    .addComponent(countyTFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(openTimeLbl)
                    .addComponent(openTimeTFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closeTimeLbl)
                    .addComponent(closeTimeTFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wasteAcceptedLbl)
                    .addComponent(wasteTFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imgLbl)
                    .addComponent(selectFileBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(submitBtn)
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void companyNameTFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyNameTFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_companyNameTFldActionPerformed

    private void selectFileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectFileBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectFileBtnActionPerformed

    private void facilityNameTFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facilityNameTFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_facilityNameTFldActionPerformed

    private void addressTFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTFldActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_submitBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTFld;
    private javax.swing.JLabel cityLbl;
    private javax.swing.JTextField cityTFld;
    private javax.swing.JLabel closeTimeLbl;
    private javax.swing.JTextField closeTimeTFld;
    private javax.swing.JLabel companyNameLbl;
    private javax.swing.JTextField companyNameTFld;
    private javax.swing.JLabel countyLbl;
    private javax.swing.JTextField countyTFld;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JTextField emailTFld;
    private javax.swing.JLabel facilityNameLbl;
    private javax.swing.JTextField facilityNameTFld;
    private javax.swing.JLabel formHeadingLbl;
    private javax.swing.JLabel imgLbl;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel openTimeLbl;
    private javax.swing.JTextField openTimeTFld;
    private javax.swing.JLabel pNumLbl;
    private javax.swing.JTextField pNumTFld;
    private javax.swing.JButton selectFileBtn;
    private javax.swing.JLabel streetLbl;
    private javax.swing.JButton submitBtn;
    private javax.swing.JLabel wasteAcceptedLbl;
    private javax.swing.JTextField wasteTFld;
    // End of variables declaration//GEN-END:variables
}
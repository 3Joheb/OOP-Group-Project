/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package group.project.recycling;

import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author zoheb
 */
public class AddFacilitySectionGUI extends javax.swing.JPanel {

    private final AddFacilitySection logic;

    /**
     * Creates new form AddFacilityGUI
     *
     * @param logic
     */
    public AddFacilitySectionGUI(AddFacilitySection logic) {
        initComponents();

        // Set field error color
        fieldErrLbl.setForeground(new java.awt.Color(204, 0, 51, 0));

        // Save logic instance
        this.logic = logic;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        streetTFld = new javax.swing.JTextField();
        cityTFld = new javax.swing.JTextField();
        countyTFld = new javax.swing.JTextField();
        openTimeTFld = new javax.swing.JTextField();
        closeTimeTFld = new javax.swing.JTextField();
        selectFileBtn = new javax.swing.JButton();
        submitBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        wasteJList = new javax.swing.JList<>();
        fieldErrLbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

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
        openTimeLbl.setText("Opening time:");

        closeTimeLbl.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        closeTimeLbl.setText("Closing time:");

        wasteAcceptedLbl.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        wasteAcceptedLbl.setText("Waste accepted:");

        imgLbl.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        imgLbl.setText("Image of facility");

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

        wasteJList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Paper (newspapers, magazines, cardboard)", "Plastic bottles", "Glass bottles and jars", "Aluminum cans", "Steel cans", "Electronics (computers, laptops, smartphones)", "Batteries (alkaline, rechargeable)", "Textiles (clothing, shoes)", "Organic waste (food scraps, yard waste)", "Metal appliances (refrigerators, washing machines)", "Paperboard (cereal boxes, shoeboxes)", "Styrofoam", "Light bulbs (CFLs, LEDs)", "Printer cartridges", "Tires", "Paint cans", "Wood waste", "Used cooking oil", "Household hazardous waste (cleaning products, chemicals)", "Plastic bags" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(wasteJList);

        fieldErrLbl.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        fieldErrLbl.setText("Please fill all fields");

        jLabel2.setFont(new java.awt.Font("Eras Medium ITC", 0, 10)); // NOI18N
        jLabel2.setText("Military Time e.g. 0700");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(322, 322, 322)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(formHeadingLbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(facilityNameLbl)
                            .addComponent(pNumLbl)
                            .addComponent(streetLbl)
                            .addComponent(countyLbl)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(openTimeLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addComponent(closeTimeLbl)
                            .addComponent(wasteAcceptedLbl)
                            .addComponent(imgLbl)
                            .addComponent(emailLbl)
                            .addComponent(companyNameLbl)
                            .addComponent(cityLbl)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(163, 163, 163)
                                .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(companyNameTFld)
                                    .addComponent(facilityNameTFld)
                                    .addComponent(emailTFld)
                                    .addComponent(pNumTFld)
                                    .addComponent(streetTFld)
                                    .addComponent(cityTFld)
                                    .addComponent(countyTFld)
                                    .addComponent(openTimeTFld)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(selectFileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(closeTimeTFld)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldErrLbl)))))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(formHeadingLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(companyNameTFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(companyNameLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(facilityNameTFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(facilityNameLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pNumTFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pNumLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(streetTFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(streetLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityTFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countyTFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(countyLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(openTimeTFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(openTimeLbl)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closeTimeTFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(closeTimeLbl))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(wasteAcceptedLbl)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imgLbl)
                    .addComponent(selectFileBtn))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitBtn)
                    .addComponent(fieldErrLbl))
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void selectFileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectFileBtnActionPerformed
        // TODO add your handling code here:
        selectImagePath();
    }//GEN-LAST:event_selectFileBtnActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // Check fields are filled
        if (!isFieldsFilled()) {
            // Show error msg
            fieldErrLbl.setForeground(new java.awt.Color(204, 0, 51));
            return;
        }

        // Hide error msg
        fieldErrLbl.setForeground(new java.awt.Color(204, 0, 51, 0));

        // Logic setters
        logic.setCompanyName(companyNameTFld.getText());
        logic.setFacilityName(facilityNameTFld.getText());
        logic.setEmail(emailTFld.getText());
        logic.setNumber(pNumTFld.getText());
        logic.setStreet(streetTFld.getText());
        logic.setCity(cityTFld.getText());
        logic.setCounty(countyTFld.getText());
        logic.setOpenTime(openTimeTFld.getText());
        logic.setCloseTime(closeTimeTFld.getText());
        logic.setAcceptedWaste(wasteJList.getSelectedValuesList());

        logic.saveJSONFile();

        resetTextFields();
    }//GEN-LAST:event_submitBtnActionPerformed

    // Create dialog box to select image file
    private void selectImagePath() {
        JFileChooser fileChooser = new JFileChooser();

        // Result determined by the action user takes
        int result = fileChooser.showOpenDialog(this);

        // If result is (user selected a file)
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();

            // Handle file logic checks
            logic.resolveFile(selectedFile);
        }
    }

    private void resetTextFields() {
        companyNameTFld.setText("");
        facilityNameTFld.setText("");
        emailTFld.setText("");
        pNumTFld.setText("");
        streetTFld.setText("");
        cityTFld.setText("");
        countyTFld.setText("");
        openTimeTFld.setText("");
        closeTimeTFld.setText("");
    }

    private boolean isFieldsFilled() {
        // Save text field values to logic variables
        String[] textFields = {
            companyNameTFld.getText(), emailTFld.getText(),
            pNumTFld.getText(), streetTFld.getText(), cityTFld.getText(),
            countyTFld.getText(), openTimeTFld.getText(), closeTimeTFld.getText()
        };

        // Check text fields
        for (String tf : textFields) {
            if (tf.isBlank()) {
                fieldErrLbl.setText("Please fill all text fields");
                return false;
            }
        }

        // Check Jlist
        if (wasteJList.getSelectedValuesList().isEmpty()) {
            fieldErrLbl.setText("Please select waste accepted");
            return false;
        }

        // Check image 
        if (logic.getImgPath() == null) {
            fieldErrLbl.setText("Please select an image");
            return false;
        }

        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel fieldErrLbl;
    private javax.swing.JLabel formHeadingLbl;
    private javax.swing.JLabel imgLbl;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel openTimeLbl;
    private javax.swing.JTextField openTimeTFld;
    private javax.swing.JLabel pNumLbl;
    private javax.swing.JTextField pNumTFld;
    private javax.swing.JButton selectFileBtn;
    private javax.swing.JLabel streetLbl;
    private javax.swing.JTextField streetTFld;
    private javax.swing.JButton submitBtn;
    private javax.swing.JLabel wasteAcceptedLbl;
    private javax.swing.JList<String> wasteJList;
    // End of variables declaration//GEN-END:variables
}

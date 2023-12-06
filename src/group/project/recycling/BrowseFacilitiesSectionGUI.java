/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package group.project.recycling;

import java.util.List;

/**
 *
 * @author zoheb
 */
public class BrowseFacilitiesSectionGUI extends javax.swing.JPanel {

    private final BrowseFacilitiesSection logic;

    /**
     * Creates new form BrowseFacilitiesGUI
     *
     * @param logic
     */
    public BrowseFacilitiesSectionGUI(BrowseFacilitiesSection logic) {
        initComponents();

        // Store logic reference
        this.logic = logic;

        // Increase scroll increment
        scrollPane.getVerticalScrollBar().setUnitIncrement(10);

        // Create and add three cards
        for(FacilityCard card : logic.getList()){
            createNewCardGUI(card);
        }
    }

    private void createNewCardGUI(FacilityCard card) {
        // Store card variables
        String cardName = card.getName();
        String street = card.getStreet();
        String city = card.getCity();
        String county = card.getCounty();
        String openTime = card.getOpenTime();
        String closeTime = card.getCloseTime();
        List<String> acceptedWaste = card.getAcceptedWaste();
        String email = card.getEmail();
        String num = card.getNum();
        String imgPath = card.getImgPath();

        // Create new card gui instance
        FacilityCardGUI cardGUI = new FacilityCardGUI();
        cardGUI.setNameLbl(cardName);
        cardGUI.setStreetLbl(street);
        cardGUI.setCityLbl(city);
        cardGUI.setCountyLbl(county);
        cardGUI.setTimeLbl(openTime, closeTime);
        cardGUI.setAcceptedWasteLbl(acceptedWaste);
        cardGUI.setEmailLbl(email);
        cardGUI.setNumLbl(num);
        cardGUI.setImgIconPath(imgPath);

        // Add card to card container/panel
        cardPanel.add(cardGUI);
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
        scrollPaneContainer = new javax.swing.JPanel();
        optionsPanel = new javax.swing.JPanel();
        searchTxtFld = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        countyComboBox = new javax.swing.JComboBox<>();
        wasteComboBox = new javax.swing.JComboBox<>();
        searchLbl = new javax.swing.JLabel();
        countryFltrLbl = new javax.swing.JLabel();
        wasteFltrLbl = new javax.swing.JLabel();
        cardPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 204, 204));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1092, 614));

        scrollPane.setBorder(null);
        scrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setPreferredSize(new java.awt.Dimension(1092, 614));

        optionsPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        searchTxtFld.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N

        searchBtn.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        searchBtn.setText("search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        countyComboBox.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        countyComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NONE", "Dublin", "Kildare", "Galway", "Mayo" }));
        countyComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countyComboBoxActionPerformed(evt);
            }
        });

        wasteComboBox.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        wasteComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NONE", "Wood", "Electronics", "Textiles", "Plastics" }));
        wasteComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wasteComboBoxActionPerformed(evt);
            }
        });

        searchLbl.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        searchLbl.setText("Search facility by name");

        countryFltrLbl.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        countryFltrLbl.setText("Filter by county");

        wasteFltrLbl.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        wasteFltrLbl.setText("Filter by waste accepted");

        javax.swing.GroupLayout optionsPanelLayout = new javax.swing.GroupLayout(optionsPanel);
        optionsPanel.setLayout(optionsPanelLayout);
        optionsPanelLayout.setHorizontalGroup(
            optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchLbl)
                    .addComponent(searchTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchBtn)
                .addGap(57, 57, 57)
                .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(countryFltrLbl)
                    .addComponent(countyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(wasteFltrLbl)
                    .addComponent(wasteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        optionsPanelLayout.setVerticalGroup(
            optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, optionsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(searchLbl)
                    .addComponent(countryFltrLbl)
                    .addComponent(wasteFltrLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(searchTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn)
                    .addComponent(countyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wasteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        cardPanel.setMaximumSize(new java.awt.Dimension(680, 32767));
        cardPanel.setPreferredSize(new java.awt.Dimension(680, 0));
        cardPanel.setLayout(new javax.swing.BoxLayout(cardPanel, javax.swing.BoxLayout.Y_AXIS));

        javax.swing.GroupLayout scrollPaneContainerLayout = new javax.swing.GroupLayout(scrollPaneContainer);
        scrollPaneContainer.setLayout(scrollPaneContainerLayout);
        scrollPaneContainerLayout.setHorizontalGroup(
            scrollPaneContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scrollPaneContainerLayout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addGroup(scrollPaneContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(optionsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(203, Short.MAX_VALUE))
        );
        scrollPaneContainerLayout.setVerticalGroup(
            scrollPaneContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scrollPaneContainerLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(optionsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        scrollPane.setViewportView(scrollPaneContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBtnActionPerformed

    private void wasteComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wasteComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wasteComboBoxActionPerformed

    private void countyComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countyComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countyComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cardPanel;
    private javax.swing.JLabel countryFltrLbl;
    private javax.swing.JComboBox<String> countyComboBox;
    private javax.swing.JPanel optionsPanel;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JPanel scrollPaneContainer;
    private javax.swing.JButton searchBtn;
    private javax.swing.JLabel searchLbl;
    private javax.swing.JTextField searchTxtFld;
    private javax.swing.JComboBox<String> wasteComboBox;
    private javax.swing.JLabel wasteFltrLbl;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package group.project;
import java.util.ArrayList;

/**
 *
 * @author adria
 */
public class ListGUI extends javax.swing.JFrame {
    private ArrayList <ListApp> list;

    /**
     * Creates new form ClothesGUI
     */
    public ListGUI() {
        initComponents();
        Typelbl.setVisible(false);
        Sizelbl.setVisible(false);
        Qlbl.setVisible(false);
        QualityCbx.setVisible(false);
        SizeCbx.setVisible(false);
        TypeCbx.setVisible(false);
        Pricelbl.setVisible(false);
        Namelbl.setVisible(false);
        Quantitylbl.setVisible(false);
        Cardlbl.setVisible(false);
        Addresslbl.setVisible(false);
        PriceCbx.setVisible(false);
        NameFld.setVisible(false);
        QuantityFld.setVisible(false);
        CardFld.setVisible(false);
        AddressFld.setVisible(false);
        Deslbl.setVisible(false);
        DesTA.setVisible(false);
        Subbtn.setVisible(false);
        Sublbl.setVisible(false);
        list = new ArrayList<>();
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTN1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        Qlbl = new javax.swing.JLabel();
        Sizelbl = new javax.swing.JLabel();
        Typelbl = new javax.swing.JLabel();
        Pricelbl = new javax.swing.JLabel();
        Namelbl = new javax.swing.JLabel();
        Quantitylbl = new javax.swing.JLabel();
        Cardlbl = new javax.swing.JLabel();
        Addresslbl = new javax.swing.JLabel();
        AddressFld = new javax.swing.JTextField();
        CardFld = new javax.swing.JTextField();
        QuantityFld = new javax.swing.JTextField();
        NameFld = new javax.swing.JTextField();
        SizeCbx = new javax.swing.JComboBox<>();
        QualityCbx = new javax.swing.JComboBox<>();
        TypeCbx = new javax.swing.JComboBox<>();
        ListBtn = new javax.swing.JRadioButton();
        BuyBtn = new javax.swing.JRadioButton();
        BrowseBtn = new javax.swing.JRadioButton();
        homeBtn = new javax.swing.JButton();
        Deslbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DesTA = new javax.swing.JTextArea();
        Subbtn = new javax.swing.JButton();
        Sublbl = new javax.swing.JLabel();
        PriceCbx = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Eras Medium ITC", 0, 11)); // NOI18N
        jLabel1.setText("LIST ITEMS");

        Qlbl.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        Qlbl.setText("Quality");

        Sizelbl.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        Sizelbl.setText("Size");

        Typelbl.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        Typelbl.setText("Type");

        Pricelbl.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        Pricelbl.setText("Price");

        Namelbl.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        Namelbl.setText("Name");

        Quantitylbl.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        Quantitylbl.setText("Quantity");

        Cardlbl.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        Cardlbl.setText("Card Details");

        Addresslbl.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        Addresslbl.setText("Address");

        AddressFld.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        AddressFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressFldActionPerformed(evt);
            }
        });

        CardFld.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N

        QuantityFld.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N

        NameFld.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N

        SizeCbx.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        SizeCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S", "M", "L" }));

        QualityCbx.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        QualityCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BAD", "OKAY", "GOOD", "EXCELLENT" }));

        TypeCbx.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        TypeCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SHOE", "TOPS", "BOTTOMS" }));

        BTN1.add(ListBtn);
        ListBtn.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        ListBtn.setText("LIST");
        ListBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListBtnActionPerformed(evt);
            }
        });

        BTN1.add(BuyBtn);
        BuyBtn.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        BuyBtn.setText("BUY");
        BuyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyBtnActionPerformed(evt);
            }
        });

        BTN1.add(BrowseBtn);
        BrowseBtn.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        BrowseBtn.setText("BROWSE");
        BrowseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseBtnActionPerformed(evt);
            }
        });

        homeBtn.setFont(new java.awt.Font("Eras Medium ITC", 0, 11)); // NOI18N
        homeBtn.setText("Home");
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        Deslbl.setText("Description");

        DesTA.setColumns(20);
        DesTA.setRows(5);
        jScrollPane1.setViewportView(DesTA);

        Subbtn.setText("Submit ");
        Subbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubbtnActionPerformed(evt);
            }
        });

        PriceCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "€5", "€10", "€15" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(homeBtn)
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Sizelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Qlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(Typelbl)
                            .addComponent(Pricelbl)
                            .addComponent(Namelbl)
                            .addComponent(Quantitylbl)
                            .addComponent(Cardlbl)
                            .addComponent(Addresslbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(NameFld, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(QuantityFld, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CardFld, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddressFld, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(QualityCbx, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SizeCbx, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TypeCbx, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PriceCbx, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(126, 126, 126)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BuyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ListBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(16, 16, 16))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BrowseBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(8, 8, 8))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Subbtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Sublbl, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Deslbl)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(homeBtn))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Qlbl)
                    .addComponent(QualityCbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ListBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sizelbl)
                    .addComponent(SizeCbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuyBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Typelbl)
                    .addComponent(TypeCbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BrowseBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pricelbl)
                    .addComponent(PriceCbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Namelbl)
                    .addComponent(NameFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Quantitylbl)
                    .addComponent(QuantityFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cardlbl)
                    .addComponent(CardFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Addresslbl)
                    .addComponent(AddressFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Deslbl)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Subbtn)
                    .addComponent(Sublbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddressFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddressFldActionPerformed

    private void BuyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyBtnActionPerformed
        // TODO add your handling code here:
        Sizelbl.setVisible(false);
        QualityCbx.setVisible(false);
        SizeCbx.setVisible(false);
        TypeCbx.setVisible(false);
        Pricelbl.setVisible(false);
        Namelbl.setVisible(false);
        Quantitylbl.setVisible(false);
        Cardlbl.setVisible(true);
        Addresslbl.setVisible(true);
        PriceCbx.setVisible(false);
        NameFld.setVisible(false);
        QuantityFld.setVisible(false);
        CardFld.setVisible(true);
        AddressFld.setVisible(true);
        Deslbl.setVisible(false);
        DesTA.setVisible(false);
        Subbtn.setVisible(true);
        Sublbl.setVisible(true);
        
        
                
        
    }//GEN-LAST:event_BuyBtnActionPerformed

    private void BrowseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseBtnActionPerformed
        // TODO add your handling code here:
        Sizelbl.setVisible(true);
        QualityCbx.setVisible(false);
        SizeCbx.setVisible(true);
        TypeCbx.setVisible(false);
        Pricelbl.setVisible(true);
        Namelbl.setVisible(true);
        Quantitylbl.setVisible(true);
        Cardlbl.setVisible(false);
        Addresslbl.setVisible(false);
        PriceCbx.setVisible(true);
        NameFld.setVisible(true);
        QuantityFld.setVisible(true);
        CardFld.setVisible(false);
        AddressFld.setVisible(false);
        Deslbl.setVisible(false);
        DesTA.setVisible(false);
        Subbtn.setVisible(false);
        Sublbl.setVisible(false);
    }//GEN-LAST:event_BrowseBtnActionPerformed

    private void ListBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListBtnActionPerformed
        // TODO add your handling code here:
        Qlbl.setVisible(true);
        Sizelbl.setVisible(true);
        Typelbl.setVisible(true);
        QualityCbx.setVisible(true);
        SizeCbx.setVisible(true);
        TypeCbx.setVisible(true);
        Pricelbl.setVisible(true);
        Namelbl.setVisible(false);
        Quantitylbl.setVisible(false);
        Cardlbl.setVisible(false);
        Addresslbl.setVisible(false);
        PriceCbx.setVisible(true);
        NameFld.setVisible(false);
        QuantityFld.setVisible(false);
        CardFld.setVisible(false);
        AddressFld.setVisible(false);
        Deslbl.setVisible(true);
        DesTA.setVisible(true);
        Subbtn.setVisible(false);
        Sublbl.setVisible(false);
        
        
    }//GEN-LAST:event_ListBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
         MainGUI m = new MainGUI();
         m.setVisible(true);
    }//GEN-LAST:event_homeBtnActionPerformed

    private void SubbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubbtnActionPerformed
        // TODO add your handling code here:Generate random number
           // instance for buy class
    Buy buyInstance = new Buy();

    // Set values 
    buyInstance.setName(NameFld.getText()); // type for name
    buyInstance.setAddress(AddressFld.getText()); // type for address
    buyInstance.setCardNum(CardFld.getText()); // type for card number
    String price = (String) PriceCbx.getSelectedItem();
    double value = Double.parseDouble(price.substring(1));
    buyInstance.setPrice(value); 

    boolean orderSubmitted = buyInstance.submitOrder();
    if (orderSubmitted) {
        // Order is succsefull
    } else {
        // Order failed
    }
        
    }//GEN-LAST:event_SubbtnActionPerformed

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
            java.util.logging.Logger.getLogger(ListGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressFld;
    private javax.swing.JLabel Addresslbl;
    private javax.swing.ButtonGroup BTN1;
    private javax.swing.JRadioButton BrowseBtn;
    private javax.swing.JRadioButton BuyBtn;
    private javax.swing.JTextField CardFld;
    private javax.swing.JLabel Cardlbl;
    private javax.swing.JTextArea DesTA;
    private javax.swing.JLabel Deslbl;
    private javax.swing.JRadioButton ListBtn;
    private javax.swing.JTextField NameFld;
    private javax.swing.JLabel Namelbl;
    private javax.swing.JComboBox<String> PriceCbx;
    private javax.swing.JLabel Pricelbl;
    private javax.swing.JLabel Qlbl;
    private javax.swing.JComboBox<String> QualityCbx;
    private javax.swing.JTextField QuantityFld;
    private javax.swing.JLabel Quantitylbl;
    private javax.swing.JComboBox<String> SizeCbx;
    private javax.swing.JLabel Sizelbl;
    private javax.swing.JButton Subbtn;
    private javax.swing.JLabel Sublbl;
    private javax.swing.JComboBox<String> TypeCbx;
    private javax.swing.JLabel Typelbl;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

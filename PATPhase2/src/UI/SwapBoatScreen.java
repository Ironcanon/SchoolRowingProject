package UI;

import Java.DatabaseConnector;
import Models.Users;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author stuff
 */
public class SwapBoatScreen extends javax.swing.JFrame {

    Users user;
    Dashboard dash;
    DatabaseConnector db = new DatabaseConnector();

    /**
     * Creates new form SwapBoatScreen
     *
     * @param userN
     * @param dashN
     */
    //Constructer takes in a user and a dashborad and sets the private user and dashboard varible respectivly to it
    public SwapBoatScreen(Users userN, Dashboard dashN) {
        //creates the JFrame and populates it with content
        initComponents();
        //Sets the JFrame to the center of the users screen
        this.setLocationRelativeTo(null);
        user = userN;
        dash = dashN;
        //Calls the helper methode to populate the comboBox
        populateCBoxes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBG = new javax.swing.JPanel();
        lblSwapBoat = new javax.swing.JLabel();
        lblWithBoat = new javax.swing.JLabel();
        cBoxBoat2 = new javax.swing.JComboBox();
        btnSwap = new javax.swing.JButton();
        cBoxBoat1 = new javax.swing.JComboBox();
        btnHelp = new javax.swing.JButton();

        setResizable(false);

        pnlBG.setBackground(new java.awt.Color(153, 153, 153));

        lblSwapBoat.setText("Swap boat:");

        lblWithBoat.setText("With boat:");

        cBoxBoat2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnSwap.setText("Swap");
        btnSwap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSwapActionPerformed(evt);
            }
        });

        cBoxBoat1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnHelp.setText("Help");
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBGLayout = new javax.swing.GroupLayout(pnlBG);
        pnlBG.setLayout(pnlBGLayout);
        pnlBGLayout.setHorizontalGroup(
            pnlBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBGLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cBoxBoat1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cBoxBoat2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlBGLayout.createSequentialGroup()
                        .addComponent(lblSwapBoat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(btnHelp))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlBGLayout.createSequentialGroup()
                        .addGroup(pnlBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblWithBoat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSwap, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlBGLayout.setVerticalGroup(
            pnlBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBGLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSwapBoat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHelp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cBoxBoat1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblWithBoat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cBoxBoat2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSwap)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     //Populates both combBoxs by calling the database, returning a String array and setting the listModels of the combo boxs to that String array

    private void populateCBoxes() {

        DefaultComboBoxModel cbm1 = new DefaultComboBoxModel(db.getBoatsInTrailer(user, true));
        DefaultComboBoxModel cbm2 = new DefaultComboBoxModel(db.getBoatsInTrailer(user, true));
        //If the list is empty adds "N/A" as the only option
        if (cbm1.getSize() == 0) {
            cbm1.addElement("N/A");
        }
        if (cbm2.getSize() == 0) {
            cbm2.addElement("N/A");
        }
        cBoxBoat1.setModel(cbm1);
        cBoxBoat2.setModel(cbm2);
    }

    //Grabs the boat names from both the combo boxs and swaps their slots, then updates the database
    private void btnSwapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSwapActionPerformed
        String boatName1 = (String) cBoxBoat1.getSelectedItem();
        String boatName2 = (String) cBoxBoat2.getSelectedItem();

        db.swapSlots(boatName1, boatName2);

        dash.updateTrailer(user);
    }//GEN-LAST:event_btnSwapActionPerformed
    //Opens the help file
    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed
        try {
            File helpFile = new File("src/Resources/HTML/Help.html");
            Desktop.getDesktop().open(helpFile);
        } catch (IOException e) {
            System.out.println("Error\n" + e);
        }
    }//GEN-LAST:event_btnHelpActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnSwap;
    private javax.swing.JComboBox cBoxBoat1;
    private javax.swing.JComboBox cBoxBoat2;
    private javax.swing.JLabel lblSwapBoat;
    private javax.swing.JLabel lblWithBoat;
    private javax.swing.JPanel pnlBG;
    // End of variables declaration//GEN-END:variables
}

package UI;

import Java.DatabaseConnector;
import Models.Users;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

/**
 * @author ma19peza
 */
public class Dashboard extends javax.swing.JFrame {

    private Users user;
    private BoatInputScreen BIS;
    private ViewBoatsScreen VBS;
    private SwapBoatScreen SwBS;
    private SetBoatScreen SeBS;
    public DatabaseConnector db;

    /**
     * Creates new form Dashboard
     *
     * @param userN
     * @param DBC
     */
    //Constructer takes in a user and sets the private user varible to it
    public Dashboard(Users userN, DatabaseConnector DBC) {
        //creates the JFrame and populates it with content
        initComponents();
        //Sets the JFrame to the center of the users screen
        this.setLocationRelativeTo(null);
        user = userN;
        db = DBC;
        //Calls the helper methode to update the trailer gui
        updateTrailer(user);
        txtLblUsername.setText(userN.getName());
        checkSecurityLevel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBG = new javax.swing.JPanel();
        txtLblUsername = new javax.swing.JLabel();
        txtLblSecurityLvl = new javax.swing.JLabel();
        btnAddBoat = new javax.swing.JButton();
        btnViewBoats = new javax.swing.JButton();
        lblUsername = new javax.swing.JLabel();
        lblSecurityLvl = new javax.swing.JLabel();
        pnlTrailerLayout = new javax.swing.JPanel();
        lblBoatName1 = new javax.swing.JLabel();
        lblBoatName2 = new javax.swing.JLabel();
        lblBoatName3 = new javax.swing.JLabel();
        lblBoatName4 = new javax.swing.JLabel();
        lblBoatName5 = new javax.swing.JLabel();
        lblBoatName6 = new javax.swing.JLabel();
        lblBoatName7 = new javax.swing.JLabel();
        lblBoatName8 = new javax.swing.JLabel();
        lblBoatName9 = new javax.swing.JLabel();
        lblBoatName10 = new javax.swing.JLabel();
        lblBoatName11 = new javax.swing.JLabel();
        lblBoatName12 = new javax.swing.JLabel();
        lblBGImage = new javax.swing.JLabel();
        btnSetBoat = new javax.swing.JButton();
        btnSwapBoat = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pnlBG.setBackground(new java.awt.Color(153, 153, 153));

        txtLblUsername.setBackground(new java.awt.Color(255, 255, 255));
        txtLblUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtLblUsername.setOpaque(true);

        txtLblSecurityLvl.setBackground(new java.awt.Color(255, 255, 255));
        txtLblSecurityLvl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtLblSecurityLvl.setOpaque(true);

        btnAddBoat.setText("Add Boat");
        btnAddBoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBoatActionPerformed(evt);
            }
        });

        btnViewBoats.setText("View Boats");
        btnViewBoats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewBoatsActionPerformed(evt);
            }
        });

        lblUsername.setText("Username");

        lblSecurityLvl.setText("Security Level");

        pnlTrailerLayout.setBackground(new java.awt.Color(255, 255, 255));
        pnlTrailerLayout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBoatName1.setText("N/A");
        pnlTrailerLayout.add(lblBoatName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 120, 30));

        lblBoatName2.setText("N/A");
        pnlTrailerLayout.add(lblBoatName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 120, 30));

        lblBoatName3.setText("N/A");
        pnlTrailerLayout.add(lblBoatName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 120, 30));

        lblBoatName4.setText("N/A");
        pnlTrailerLayout.add(lblBoatName4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 120, 30));

        lblBoatName5.setText("N/A");
        pnlTrailerLayout.add(lblBoatName5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 120, 30));

        lblBoatName6.setText("N/A");
        pnlTrailerLayout.add(lblBoatName6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 120, 30));

        lblBoatName7.setText("N/A");
        pnlTrailerLayout.add(lblBoatName7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 120, 30));

        lblBoatName8.setText("N/A");
        pnlTrailerLayout.add(lblBoatName8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 120, 30));

        lblBoatName9.setText("N/A");
        pnlTrailerLayout.add(lblBoatName9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 120, 30));

        lblBoatName10.setText("N/A");
        pnlTrailerLayout.add(lblBoatName10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 120, 30));

        lblBoatName11.setText("N/A");
        pnlTrailerLayout.add(lblBoatName11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 550, 120, 30));

        lblBoatName12.setText("N/A");
        pnlTrailerLayout.add(lblBoatName12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 550, 120, 30));

        lblBGImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/TrailerOverlay.png"))); // NOI18N
        pnlTrailerLayout.add(lblBGImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnSetBoat.setText("Set Boat");
        btnSetBoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetBoatActionPerformed(evt);
            }
        });

        btnSwapBoat.setText("Swap Boat");
        btnSwapBoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSwapBoatActionPerformed(evt);
            }
        });

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
            .addGroup(pnlBGLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnViewBoats, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(btnAddBoat, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(btnSetBoat, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(btnSwapBoat, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(pnlTrailerLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBGLayout.createSequentialGroup()
                            .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtLblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBGLayout.createSequentialGroup()
                            .addComponent(lblSecurityLvl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtLblSecurityLvl, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnHelp, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        pnlBGLayout.setVerticalGroup(
            pnlBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBGLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBGLayout.createSequentialGroup()
                        .addGroup(pnlBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBGLayout.createSequentialGroup()
                                .addComponent(btnAddBoat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnViewBoats, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlBGLayout.createSequentialGroup()
                                .addGroup(pnlBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtLblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtLblSecurityLvl, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                                    .addComponent(lblSecurityLvl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBGLayout.createSequentialGroup()
                                .addComponent(btnSetBoat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSwapBoat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBGLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnHelp))))
                    .addComponent(pnlTrailerLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
    //Refreshes the gui trailer on the dashboard with the boats in the trailer

    public void updateTrailer(Users user) {
        //Grabs an array of all the boats that are in the trailer (that have a slot != -1)
        String[] boatList = db.getBoatsInTrailer(user, false);

        for (int i = 0; i < boatList.length; i++) {
            //Splits each boat string into its data points (temp[6] is the slot and temp[1] is the boat name
            String[] temp = boatList[i].split(",");
            //Checks which slot the current boat is in and sets the name of the cell to the boat name
            switch (temp[6]) {
                case "1":
                    lblBoatName1.setText(temp[1]);
                    break;
                case "2":
                    lblBoatName2.setText(temp[1]);
                    break;
                case "3":
                    lblBoatName3.setText(temp[1]);
                    break;
                case "4":
                    lblBoatName4.setText(temp[1]);
                    break;
                case "5":
                    lblBoatName5.setText(temp[1]);
                    break;
                case "6":
                    lblBoatName6.setText(temp[1]);
                    break;
                case "7":
                    lblBoatName7.setText(temp[1]);
                    break;
                case "8":
                    lblBoatName8.setText(temp[1]);
                    break;
                case "9":
                    lblBoatName9.setText(temp[1]);
                    break;
                case "10":
                    lblBoatName10.setText(temp[1]);
                    break;
                case "11":
                    lblBoatName11.setText(temp[1]);
                    break;
                case "12":
                    lblBoatName12.setText(temp[1]);
                    break;
            }
        }
    }

    //Helper methode that visually clears the boat from the given slot by setting the label of the slot to "N/A"

    public void clearSlot(int slot) {
        switch (slot) {
            case 1:
                lblBoatName1.setText("N/A");
                break;
            case 2:
                lblBoatName2.setText("N/A");
                break;
            case 3:
                lblBoatName3.setText("N/A");
                break;
            case 4:
                lblBoatName4.setText("N/A");
                break;
            case 5:
                lblBoatName5.setText("N/A");
                break;
            case 6:
                lblBoatName6.setText("N/A");
                break;
            case 7:
                lblBoatName7.setText("N/A");
                break;
            case 8:
                lblBoatName8.setText("N/A");
                break;
            case 9:
                lblBoatName9.setText("N/A");
                break;
            case 10:
                lblBoatName10.setText("N/A");
                break;
            case 11:
                lblBoatName11.setText("N/A");
                break;
            case 12:
                lblBoatName12.setText("N/A");
                break;
        }
    }

    //Helper methode that checks if  the current user is an admin and if so enables admin features (adding boats, setting and swapping boats in the trailer) )

    private void checkSecurityLevel() {
        if (!user.isAdmin()) {
            btnAddBoat.setEnabled(false);
            btnSetBoat.setEnabled(false);
            btnSwapBoat.setEnabled(false);
            txtLblSecurityLvl.setText("Standard User");
        } else {
            btnAddBoat.setEnabled(true);
            btnSetBoat.setEnabled(true);
            btnSwapBoat.setEnabled(true);
            txtLblSecurityLvl.setText("Admin");
        }
    }

    //Instantiates a new SwapBoatScreen with the local user and this Dashboard object and sets it visable
    private void btnSwapBoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSwapBoatActionPerformed
        SwBS = new SwapBoatScreen(user, this);
        SwBS.setVisible(true);
    }//GEN-LAST:event_btnSwapBoatActionPerformed
    //Instantiates a new SetBoatScreen with the local user and this Dashboard object and sets it visable
    private void btnSetBoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetBoatActionPerformed
        SeBS = new SetBoatScreen(user, this);
        SeBS.setVisible(true);
    }//GEN-LAST:event_btnSetBoatActionPerformed
    //Instantiates a new ViewBoatScreen with the local user and this Dashboard object and sets it visable
    private void btnViewBoatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewBoatsActionPerformed
        VBS = new ViewBoatsScreen(user, this);
        VBS.setVisible(true);
    }//GEN-LAST:event_btnViewBoatsActionPerformed
    //Instantiates a new AddBoatScreen with this Dashboard object and sets it visable
    private void btnAddBoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBoatActionPerformed
        BIS = new BoatInputScreen(user, this);
        BIS.setVisible(true);
    }//GEN-LAST:event_btnAddBoatActionPerformed
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
    private javax.swing.JButton btnAddBoat;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnSetBoat;
    private javax.swing.JButton btnSwapBoat;
    private javax.swing.JButton btnViewBoats;
    private javax.swing.JLabel lblBGImage;
    private javax.swing.JLabel lblBoatName1;
    private javax.swing.JLabel lblBoatName10;
    private javax.swing.JLabel lblBoatName11;
    private javax.swing.JLabel lblBoatName12;
    private javax.swing.JLabel lblBoatName2;
    private javax.swing.JLabel lblBoatName3;
    private javax.swing.JLabel lblBoatName4;
    private javax.swing.JLabel lblBoatName5;
    private javax.swing.JLabel lblBoatName6;
    private javax.swing.JLabel lblBoatName7;
    private javax.swing.JLabel lblBoatName8;
    private javax.swing.JLabel lblBoatName9;
    private javax.swing.JLabel lblSecurityLvl;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel pnlBG;
    private javax.swing.JPanel pnlTrailerLayout;
    private javax.swing.JLabel txtLblSecurityLvl;
    private javax.swing.JLabel txtLblUsername;
    // End of variables declaration//GEN-END:variables
}

package UI;

import Java.DatabaseConnector;
import Models.Boats;
import Models.Users;
import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author ma19peza
 */
public class ViewBoatsScreen extends javax.swing.JFrame {

    private Users user;
    private Dashboard dash;
    DatabaseConnector db;

    /**
     * Creates new form ViewBoatsScreen
     *
     * @param userN
     */
    //Constructer for the ViewBoatScreen
    public ViewBoatsScreen(Users userN, Dashboard dashN) {
        user = userN;
        dash = dashN;
        db = dash.db;
        //creates the JFrame and populates it with content
        initComponents();
        //Sets the JFrame to the center of the users screen
        this.setLocationRelativeTo(null);
        //Calls a helper methode to populate the list model
        populateList();
        //Calls a helper methode to set the error msgs be hidden
        setErrVisable(false);
        checkSecurityLevel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGr1 = new javax.swing.ButtonGroup();
        pnlBG = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listBoats = new javax.swing.JList();
        btnEdit = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        lblBoatName = new javax.swing.JLabel();
        txtBoatName = new javax.swing.JTextField();
        lblNoS = new javax.swing.JLabel();
        txtSeatNumbers = new javax.swing.JTextField();
        lblHIN = new javax.swing.JLabel();
        txtHINNumber = new javax.swing.JTextField();
        lblOarType = new javax.swing.JLabel();
        rbtnSculling = new javax.swing.JRadioButton();
        rbtnSweep = new javax.swing.JRadioButton();
        lblDoP = new javax.swing.JLabel();
        datePick = new org.jdatepicker.JDatePicker();
        btnHelp = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblBNPressenceChk = new javax.swing.JLabel();
        lblBNLogicChk = new javax.swing.JLabel();
        lblNSPressenceChk = new javax.swing.JLabel();
        lblNSRangeChk = new javax.swing.JLabel();
        lblNSLogicChk = new javax.swing.JLabel();
        lblHINPressenceChk = new javax.swing.JLabel();
        lblHINLengthChk = new javax.swing.JLabel();
        lblHINFormatChk = new javax.swing.JLabel();
        lblOTPressenceChk = new javax.swing.JLabel();
        lblDPPressenceChk = new javax.swing.JLabel();
        lblDPLogicChk = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtErr = new javax.swing.JTextArea();
        btnDelete = new javax.swing.JButton();

        setResizable(false);

        pnlBG.setBackground(new java.awt.Color(153, 153, 153));

        listBoats.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(listBoats);

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblBoatName.setText("Boat Name");

        txtBoatName.setEnabled(false);

        lblNoS.setText("Number of Seats");

        txtSeatNumbers.setEnabled(false);

        lblHIN.setText("Hull Identification Number");

        txtHINNumber.setEnabled(false);

        lblOarType.setText("Oar Type");

        rbtnSculling.setBackground(new java.awt.Color(153, 153, 153));
        btnGr1.add(rbtnSculling);
        rbtnSculling.setText("Sculling");
        rbtnSculling.setEnabled(false);

        rbtnSweep.setBackground(new java.awt.Color(153, 153, 153));
        btnGr1.add(rbtnSweep);
        rbtnSweep.setText("Sweep");
        rbtnSweep.setEnabled(false);

        lblDoP.setText("Date of Purchase");

        datePick.setEnabled(false);

        btnHelp.setText("Help");
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.setEnabled(false);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblBNPressenceChk.setText("Boat name is empty, requries input");

        lblBNLogicChk.setText("Name can't contain any numbers");

        lblNSPressenceChk.setText("Number of seats is empty, requries input");

        lblNSRangeChk.setText("Seat number is out of allowed range");

        lblNSLogicChk.setText("Seat number can only be an interger");

        lblHINPressenceChk.setText("HIN is empty, requires input");

        lblHINLengthChk.setText("HIN is the incorrect length, needs to be 12 characters long");

        lblHINFormatChk.setText("HIN must have a county code, first 2 characters must be letters");

        lblOTPressenceChk.setText("Oar type is empty, one must be selected");

        lblDPPressenceChk.setText("Date is empty, requries input");

        lblDPLogicChk.setText("Purchase date is in the future, must be in the past");

        txtErr.setEditable(false);
        txtErr.setColumns(20);
        txtErr.setRows(5);
        jScrollPane2.setViewportView(txtErr);

        btnDelete.setText("Delete");
        btnDelete.setEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBGLayout = new javax.swing.GroupLayout(pnlBG);
        pnlBG.setLayout(pnlBGLayout);
        pnlBGLayout.setHorizontalGroup(
            pnlBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBGLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
                    .addGroup(pnlBGLayout.createSequentialGroup()
                        .addComponent(lblHINLengthChk)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBGLayout.createSequentialGroup()
                        .addComponent(lblHINFormatChk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHelp))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBGLayout.createSequentialGroup()
                        .addGroup(pnlBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblHIN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblNoS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblBoatName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtBoatName)
                                .addComponent(txtSeatNumbers)
                                .addComponent(txtHINNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblHINPressenceChk)
                            .addComponent(lblBNLogicChk)
                            .addComponent(lblBNPressenceChk)
                            .addComponent(lblNSPressenceChk)
                            .addComponent(lblNSRangeChk)
                            .addComponent(lblNSLogicChk)
                            .addGroup(pnlBGLayout.createSequentialGroup()
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblOTPressenceChk)
                            .addComponent(datePick, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblOarType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDoP, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlBGLayout.createSequentialGroup()
                                .addComponent(rbtnSculling)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbtnSweep))
                            .addComponent(lblDPPressenceChk)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBGLayout.createSequentialGroup()
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblDPLogicChk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addGap(25, 25, 25)))
                .addContainerGap())
        );
        pnlBGLayout.setVerticalGroup(
            pnlBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBoatName, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOarType))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBoatName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnSculling, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnSweep, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBNPressenceChk)
                    .addComponent(lblOTPressenceChk))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBNLogicChk)
                .addGap(28, 28, 28)
                .addGroup(pnlBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNoS, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDoP, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSeatNumbers, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datePick, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNSPressenceChk)
                    .addComponent(lblDPPressenceChk))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNSRangeChk)
                    .addComponent(lblDPLogicChk))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBGLayout.createSequentialGroup()
                        .addComponent(lblNSLogicChk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblHIN, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHINNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(lblHINPressenceChk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblHINLengthChk)
                        .addGap(8, 8, 8)
                        .addGroup(pnlBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnHelp)
                            .addComponent(lblHINFormatChk)))
                    .addGroup(pnlBGLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
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
    //Helper methode that grabs all the boats that are in the database and adds them to a list model

    private void populateList() {
        String[] model = db.getAllBoats(user);
        DefaultListModel dlm = new DefaultListModel();
        for(int i = 0; i < model.length; i++) {
            dlm.addElement(model[i]);
        }
        listBoats.setModel(dlm);
    }

    //Helper methode that enables or disables the editable fields depending on the given boolean
    private void fieldsEditable(boolean edit) {
        if (edit) {
            txtBoatName.setEnabled(edit);
            txtHINNumber.setEnabled(edit);
            txtSeatNumbers.setEnabled(edit);
            rbtnSculling.setEnabled(edit);
            rbtnSweep.setEnabled(edit);
            datePick.setEnabled(edit);
        } else {
            txtBoatName.setEnabled(edit);
            txtBoatName.setText(null);
            txtHINNumber.setEnabled(edit);
            txtHINNumber.setText(null);
            txtSeatNumbers.setEnabled(edit);
            txtSeatNumbers.setText(null);
            btnGr1.clearSelection();
            rbtnSculling.setEnabled(edit);
            rbtnSweep.setEnabled(edit);
            datePick.setEnabled(edit);
            datePick.getModel().setValue(null);
        }

    }

    //Validates the text in the editable fields
    private boolean validatetxt() {
        String errMsg = "Validation compleate\n";
        boolean err = false;

        //Pressence check for String input
        if (txtBoatName.getText().isEmpty()) {
            errMsg += "ERROR: Boat name is empty, requries input\n";
            lblBNPressenceChk.setVisible(true);
            err = true;
        }
        //Type check for String input
        for (int i = 0; i < txtBoatName.getText().length(); i++) {
            if ((Character.isDigit(txtBoatName.getText().charAt(i)))) {
                errMsg += "ERROR: Name can't contain any numbers\n";
                lblBNLogicChk.setVisible(true);
                err = true;
                break;
            }
        }
        if (err) {
            lblBoatName.setForeground(Color.red);
        } else {
            lblBoatName.setForeground(Color.green);
        }

        err = false;

        //Pressence check for Numerical input
        if (txtSeatNumbers.getText().isEmpty()) {
            errMsg += "ERROR: Number of seats is empty, requries input\n";
            lblNSPressenceChk.setVisible(true);
            err = true;
        } else {
            try {
                //Range check for Numerical input only if the input isn't empty
                switch (Integer.parseInt(txtSeatNumbers.getText())) {
                    case 1:
                    case 2:
                    case 4:
                    case 8:
                        break;
                    default:
                        errMsg += "ERROR: Seat number has to be 1,2,4 or 8\n";
                        lblNSRangeChk.setVisible(true);
                        err = true;
                        break;
                }
            } //Type check for Numerical input
            catch (java.lang.NumberFormatException e) {
                errMsg += "ERROR: Seat number can only be an interger\n";
                lblNSLogicChk.setVisible(true);
                err = true;
            }
        }
        if (err) {
            lblNoS.setForeground(Color.red);
        } else {
            lblNoS.setForeground(Color.green);
        }

        err = false;

        //Pressence check for Date input
        if (datePick.getModel().getValue() == null) {
            errMsg += "ERROR: Date is empty, requries input\n";
            lblDPPressenceChk.setVisible(true);
            err = true;
        }

        Calendar cal = Calendar.getInstance();
        Calendar now = Calendar.getInstance();
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        cal.set(datePick.getModel().getYear(), datePick.getModel().getMonth(), datePick.getModel().getDay());

        //Logic check for Date input
        if (cal.getTimeInMillis() > now.getTimeInMillis()) {
            errMsg += "ERROR: Purchase date is in the future, must be in the past\n";
            lblDPLogicChk.setVisible(true);
            err = true;
        }

        if (err) {
            lblDoP.setForeground(Color.red);
        } else {
            lblDoP.setForeground(Color.green);
        }

        err = false;

        //Pressence check for Boolean input
        if (rbtnSculling.isSelected() == false && rbtnSweep.isSelected() == false) {
            errMsg += "ERROR: Oar type is empty, one must be selected\n";
            lblOTPressenceChk.setVisible(true);
            err = true;
        }
        if (err) {
            lblOarType.setForeground(Color.red);
        } else {
            lblOarType.setForeground(Color.green);
        }

        err = false;
        //Pressence Check
        if (txtHINNumber.getText().isEmpty()) {
            errMsg += "ERROR: HIN is empty, requires input\n";
            lblHINPressenceChk.setVisible(true);
            err = true;
        }
        //Length check for ID input
        if (txtHINNumber.getText().length() != 12) {
            errMsg += "ERROR: HIN is the incorrect length, needs to be 12 characters long\n";
            lblHINLengthChk.setVisible(true);
            err = true;
        } else {
            for (int i = 0; i < 2; i++) {
                if (Character.isDigit(txtHINNumber.getText().charAt(i))) {
                    //Format check for ID input
                    errMsg += "ERROR: HIN must have a county code, first 2 characters must be letters";
                    lblHINFormatChk.setVisible(true);
                    err = true;
                    break;
                }
            }
        }
        if (err) {
            lblHIN.setForeground(Color.red);
        } else {
            lblHIN.setForeground(Color.green);
        }

        //Output final error messages, if any
        if (errMsg != "Validation compleate\n") {
            txtErr.setText("Validation compleate\nErrors found, fix before continuing");
            return false;
        } else {
            errMsg += "No errors, boat updated";
            txtErr.setText(errMsg);
            return true;
        }
    }

    //Helper methode that sets the error msgs visable or not depending on the given boolean
    private void setErrVisable(boolean bool) {
        lblDPLogicChk.setVisible(bool);
        lblDPPressenceChk.setVisible(bool);
        lblHINFormatChk.setVisible(bool);
        lblHINLengthChk.setVisible(bool);
        lblHINPressenceChk.setVisible(bool);
        lblBNPressenceChk.setVisible(bool);
        lblBNLogicChk.setVisible(bool);
        lblNSPressenceChk.setVisible(bool);
        lblNSRangeChk.setVisible(bool);
        lblNSLogicChk.setVisible(bool);
        lblOTPressenceChk.setVisible(bool);
    }

    //Helper methode that returns a boolean depending on whether or not the oarType radioButton is selected
    private boolean oarTypeToBoolean() {
        if (rbtnSweep.isSelected()) {
            return true;
        } else {
            return true;
        }
    }

    //Helper methode that checks if the current user is an admin and if so enables admin features (Editing boats in the database)
    private void checkSecurityLevel() {
        if (!user.isAdmin()) {
            btnEdit.setEnabled(false);
        } else {
            btnEdit.setEnabled(true);
        }
    }

    //Enables the editable fields and sets their values to the selected boat
    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        fieldsEditable(true);
        btnSave.setEnabled(true);
        btnCancel.setEnabled(true);
        btnDelete.setEnabled(true);

        String value = String.valueOf(listBoats.getSelectedValue());

        listBoats.setEnabled(false);
        btnEdit.setEnabled(false);

        String[] splitV = value.split(",");

        txtBoatName.setText(splitV[1]);
        txtSeatNumbers.setText(splitV[2]);
        txtHINNumber.setText(splitV[3]);

        if (splitV[4].equals("Sweep")) {
            rbtnSweep.setSelected(true);
        } else {
            rbtnSculling.setSelected(true);
        }

        String[] date = splitV[5].split("/");
        datePick.getModel().setDate(Integer.parseInt(date[2]), Integer.parseInt(date[1]) - 1, Integer.parseInt(date[0]));
        datePick.getModel().setSelected(true);
    }//GEN-LAST:event_btnEditActionPerformed
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (validatetxt()) {
            String value = String.valueOf(listBoats.getSelectedValue());
            String[] splitV = value.split(",");
            Calendar cal = Calendar.getInstance();
            cal.set(datePick.getModel().getYear(), datePick.getModel().getMonth(), datePick.getModel().getDay());
            Boats temp = new Boats(Integer.parseInt(splitV[0]), txtBoatName.getText(), Integer.parseInt(txtSeatNumbers.getText()), txtHINNumber.getText(), oarTypeToBoolean(), cal, Integer.parseInt(splitV[6]), splitV[7]);
            db.updateBoat(temp);
            populateList();
        }
    }//GEN-LAST:event_btnSaveActionPerformed
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        fieldsEditable(false);
        listBoats.setEnabled(true);
        btnEdit.setEnabled(true);
        btnSave.setEnabled(false);
        btnCancel.setEnabled(false);
        btnDelete.setEnabled(false);
    }//GEN-LAST:event_btnCancelActionPerformed
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int choise = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete the selected boat?", "Confirm delete", JOptionPane.YES_NO_OPTION);
        if (choise == 0) {
            String value = String.valueOf(listBoats.getSelectedValue());
            String[] splitV = value.split(",");

            int boatID = Integer.parseInt(splitV[0]);
            db.deleteBoat(boatID);
            populateList();

            fieldsEditable(false);
            listBoats.setEnabled(true);
            btnEdit.setEnabled(true);
            btnSave.setEnabled(false);
            btnCancel.setEnabled(false);
            btnDelete.setEnabled(false);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed
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
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.ButtonGroup btnGr1;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnSave;
    private org.jdatepicker.JDatePicker datePick;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBNLogicChk;
    private javax.swing.JLabel lblBNPressenceChk;
    private javax.swing.JLabel lblBoatName;
    private javax.swing.JLabel lblDPLogicChk;
    private javax.swing.JLabel lblDPPressenceChk;
    private javax.swing.JLabel lblDoP;
    private javax.swing.JLabel lblHIN;
    private javax.swing.JLabel lblHINFormatChk;
    private javax.swing.JLabel lblHINLengthChk;
    private javax.swing.JLabel lblHINPressenceChk;
    private javax.swing.JLabel lblNSLogicChk;
    private javax.swing.JLabel lblNSPressenceChk;
    private javax.swing.JLabel lblNSRangeChk;
    private javax.swing.JLabel lblNoS;
    private javax.swing.JLabel lblOTPressenceChk;
    private javax.swing.JLabel lblOarType;
    private javax.swing.JList listBoats;
    private javax.swing.JPanel pnlBG;
    private javax.swing.JRadioButton rbtnSculling;
    private javax.swing.JRadioButton rbtnSweep;
    private javax.swing.JTextField txtBoatName;
    private javax.swing.JTextArea txtErr;
    private javax.swing.JTextField txtHINNumber;
    private javax.swing.JTextField txtSeatNumbers;
    // End of variables declaration//GEN-END:variables
}

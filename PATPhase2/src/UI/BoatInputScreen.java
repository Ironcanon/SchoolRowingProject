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

/**
 * @author ma19peza
 */
public class BoatInputScreen extends javax.swing.JFrame {

    private String errMsg;
    private Users user;
    private Dashboard dash;
    private DatabaseConnector db;

    /**
     * Creates new form InputScreen
     *
     * @param userN
     */
    //Constructer takes in a user and sets the private user varible to it
    public BoatInputScreen(Users userN, Dashboard dashN) {
        //creates the JFrame and populates it with content
        initComponents();
        //Sets the JFrame to the center of the users screen
        this.setLocationRelativeTo(null);
        setErrorPaneVisable(false);
        user = userN;
        dash = dashN;
        db = dash.db;
        //Instantiate the errMsg varible
        errMsg = "";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup1 = new javax.swing.ButtonGroup();
        bgPanelCentre = new javax.swing.JPanel();
        btnHelp = new javax.swing.JButton();
        lblHeading = new javax.swing.JLabel();
        txtInputString = new javax.swing.JTextField();
        txtInputNumber = new javax.swing.JTextField();
        txtInputID = new javax.swing.JTextField();
        rbtnSculling = new javax.swing.JRadioButton();
        rbtnSweep = new javax.swing.JRadioButton();
        dateInputDate = new org.jdatepicker.JDatePicker();
        lblNameTitle = new javax.swing.JLabel();
        lblNumberTitle = new javax.swing.JLabel();
        lblNumberDetails = new javax.swing.JLabel();
        lblBooleanTitle = new javax.swing.JLabel();
        lblDateTitle = new javax.swing.JLabel();
        lblIDTitle = new javax.swing.JLabel();
        lblVallidateHeading = new javax.swing.JLabel();
        btnValidate = new javax.swing.JButton();
        lblIDDetails = new javax.swing.JLabel();
        panelError = new javax.swing.JPanel();
        bgPanelError = new javax.swing.JPanel();
        lblErrorHeading = new javax.swing.JLabel();
        lblErrorNoB = new javax.swing.JLabel();
        lblErrorNoBPressenceChk = new javax.swing.JLabel();
        lblErrorNoBTypeChk = new javax.swing.JLabel();
        lblErrorNoS = new javax.swing.JLabel();
        lblErrorNoSPressenceChk = new javax.swing.JLabel();
        lblErrorNoSRangeChk = new javax.swing.JLabel();
        lblErrorNoSTypeChk = new javax.swing.JLabel();
        lblErrorHIN = new javax.swing.JLabel();
        lblErrorHINPressenceChk = new javax.swing.JLabel();
        lblErrorHINLengthChk = new javax.swing.JLabel();
        lblErrorHINFormatChk = new javax.swing.JLabel();
        lblErrorOT = new javax.swing.JLabel();
        lblErrorDoP = new javax.swing.JLabel();
        lblErrorOTPressenceChk = new javax.swing.JLabel();
        lblErrorDoPPressenceChk = new javax.swing.JLabel();
        lblErrorDoPLogicChk = new javax.swing.JLabel();
        txtPaneError = new javax.swing.JTextPane();
        btnClose = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(660, 600));
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        bgPanelCentre.setBackground(new java.awt.Color(153, 153, 153));
        bgPanelCentre.setPreferredSize(new java.awt.Dimension(290, 600));
        bgPanelCentre.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHelp.setText("Help");
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });
        bgPanelCentre.add(btnHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        lblHeading.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        lblHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeading.setLabelFor(bgPanelCentre);
        lblHeading.setText("Boat Input");
        bgPanelCentre.add(lblHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 218, 50));

        txtInputString.setToolTipText("Enter a String");
        bgPanelCentre.add(txtInputString, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 126, 30));
        bgPanelCentre.add(txtInputNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 126, 30));
        bgPanelCentre.add(txtInputID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 126, 30));

        rbtnSculling.setBackground(new java.awt.Color(255, 255, 255));
        btnGroup1.add(rbtnSculling);
        rbtnSculling.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        rbtnSculling.setText("Sculling");
        rbtnSculling.setOpaque(false);
        bgPanelCentre.add(rbtnSculling, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 353, -1, -1));

        btnGroup1.add(rbtnSweep);
        rbtnSweep.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        rbtnSweep.setText("Sweep");
        rbtnSweep.setOpaque(false);
        bgPanelCentre.add(rbtnSweep, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 353, -1, -1));

        dateInputDate.setBackground(new java.awt.Color(204, 204, 0));
        bgPanelCentre.add(dateInputDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 408, 126, 30));

        lblNameTitle.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lblNameTitle.setLabelFor(txtInputString);
        lblNameTitle.setText("Name of boat*");
        bgPanelCentre.add(lblNameTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        lblNumberTitle.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lblNumberTitle.setLabelFor(txtInputNumber);
        lblNumberTitle.setText("Number of seats*");
        bgPanelCentre.add(lblNumberTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        lblNumberDetails.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lblNumberDetails.setLabelFor(txtInputNumber);
        lblNumberDetails.setText("(1, 2, 4 and 8 allowed)");
        bgPanelCentre.add(lblNumberDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        lblBooleanTitle.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lblBooleanTitle.setLabelFor(rbtnSculling);
        lblBooleanTitle.setText("Oar type*");
        bgPanelCentre.add(lblBooleanTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 334, -1, -1));

        lblDateTitle.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lblDateTitle.setLabelFor(dateInputDate);
        lblDateTitle.setText("Date of purchase*");
        bgPanelCentre.add(lblDateTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 385, -1, -1));

        lblIDTitle.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lblIDTitle.setLabelFor(txtInputID);
        lblIDTitle.setText("HIN of the boat*");
        bgPanelCentre.add(lblIDTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        lblVallidateHeading.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lblVallidateHeading.setLabelFor(btnValidate);
        lblVallidateHeading.setText("* Required field");
        bgPanelCentre.add(lblVallidateHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));

        btnValidate.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        btnValidate.setText("Add Boat");
        btnValidate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidateActionPerformed(evt);
            }
        });
        bgPanelCentre.add(btnValidate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, -1, -1));

        lblIDDetails.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lblIDDetails.setLabelFor(txtInputID);
        lblIDDetails.setText("(Hull Identification Number)");
        bgPanelCentre.add(lblIDDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        panelError.setLayout(new javax.swing.BoxLayout(panelError, javax.swing.BoxLayout.LINE_AXIS));
        bgPanelCentre.add(panelError, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 623, 218, -1));

        bgPanelError.setBackground(new java.awt.Color(153, 153, 153));
        bgPanelError.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblErrorHeading.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblErrorHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblErrorHeading.setText("Errors");
        bgPanelError.add(lblErrorHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 326, 43));

        lblErrorNoB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblErrorNoB.setText("Name of boat");
        bgPanelError.add(lblErrorNoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 72, 306, 16));

        lblErrorNoBPressenceChk.setText("Boat name is empty, requries input");
        bgPanelError.add(lblErrorNoBPressenceChk, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 94, -1, -1));

        lblErrorNoBTypeChk.setText("Name can't contain any numbers");
        bgPanelError.add(lblErrorNoBTypeChk, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 114, -1, -1));

        lblErrorNoS.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblErrorNoS.setLabelFor(txtInputNumber);
        lblErrorNoS.setText("Number of seats");
        bgPanelError.add(lblErrorNoS, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 147, 306, -1));

        lblErrorNoSPressenceChk.setText("Number of seats is empty, requries input");
        bgPanelError.add(lblErrorNoSPressenceChk, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 168, -1, -1));

        lblErrorNoSRangeChk.setText("Seat number is out of allowed range");
        bgPanelError.add(lblErrorNoSRangeChk, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 188, -1, -1));

        lblErrorNoSTypeChk.setText("Seat number can only be an interger");
        bgPanelError.add(lblErrorNoSTypeChk, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 208, -1, -1));

        lblErrorHIN.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblErrorHIN.setText("HIN of the boat");
        bgPanelError.add(lblErrorHIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 241, 306, -1));

        lblErrorHINPressenceChk.setText("HIN is empty, requires input");
        bgPanelError.add(lblErrorHINPressenceChk, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 262, -1, -1));

        lblErrorHINLengthChk.setText("HIN is the incorrect length, needs to be 12 characters long");
        bgPanelError.add(lblErrorHINLengthChk, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 282, -1, -1));

        lblErrorHINFormatChk.setText("HIN must have a county code, first 2 characters must be letters");
        bgPanelError.add(lblErrorHINFormatChk, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 302, -1, -1));

        lblErrorOT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblErrorOT.setText("Oar type");
        bgPanelError.add(lblErrorOT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 324, 306, -1));

        lblErrorDoP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblErrorDoP.setText("Date of purchase");
        bgPanelError.add(lblErrorDoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 377, 306, -1));

        lblErrorOTPressenceChk.setText("ERROR: Oar type is empty, one must be selected");
        bgPanelError.add(lblErrorOTPressenceChk, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 345, -1, -1));

        lblErrorDoPPressenceChk.setText("Date is empty, requries input");
        bgPanelError.add(lblErrorDoPPressenceChk, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 398, -1, -1));

        lblErrorDoPLogicChk.setText("Purchase date is in the future, must be in the past");
        bgPanelError.add(lblErrorDoPLogicChk, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 418, -1, -1));

        bgPanelCentre.add(bgPanelError, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 11, -1, 443));

        txtPaneError.setEditable(false);
        txtPaneError.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtPaneError.setMaximumSize(new java.awt.Dimension(32767, 32767));
        txtPaneError.setMinimumSize(new java.awt.Dimension(0, 0));
        txtPaneError.setPreferredSize(new java.awt.Dimension(270, 50));
        bgPanelCentre.add(txtPaneError, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 218, 50));

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        bgPanelCentre.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, -1, -1));

        getContentPane().add(bgPanelCentre);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //A helper methode that takes in a boolean and set the visablilty of the error panels and labels to the value of the boolean

    private void setErrorPaneVisable(boolean bool) {
        bgPanelError.setVisible(bool);
        lblErrorDoP.setVisible(bool);
        lblErrorDoPLogicChk.setVisible(bool);
        lblErrorDoPPressenceChk.setVisible(bool);
        lblErrorHIN.setVisible(bool);
        lblErrorHINFormatChk.setVisible(bool);
        lblErrorHINLengthChk.setVisible(bool);
        lblErrorHINPressenceChk.setVisible(bool);
        lblErrorHeading.setVisible(bool);
        lblErrorNoB.setVisible(bool);
        lblErrorNoBPressenceChk.setVisible(bool);
        lblErrorNoBTypeChk.setVisible(bool);
        lblErrorNoS.setVisible(bool);
        lblErrorNoSPressenceChk.setVisible(bool);
        lblErrorNoSRangeChk.setVisible(bool);
        lblErrorNoSTypeChk.setVisible(bool);
        lblErrorOT.setVisible(bool);
        lblErrorOTPressenceChk.setVisible(bool);
    }

    private void clearInputs() {
        txtInputString.setText(null);
        txtInputNumber.setText(null);
        dateInputDate.getModel().setValue(null);
        btnGroup1.clearSelection();
        txtInputID.setText(null);
    }

    //Calls when the validate button is pressed, it goes through all the text
    private void btnValidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidateActionPerformed
        errMsg = "Validation compleate\n";
        setErrorPaneVisable(false);
        boolean err = false;

        //Pressence check for String input
        if (txtInputString.getText().isEmpty()) {
            errMsg += "ERROR: Boat name is empty, requries input\n";
            lblErrorNoBPressenceChk.setVisible(true);
            err = true;
        }
        //Type check for String input
        for (int i = 0; i < txtInputString.getText().length(); i++) {
            if ((Character.isDigit(txtInputString.getText().charAt(i)))) {
                errMsg += "ERROR: Name can't contain any numbers\n";
                lblErrorNoBTypeChk.setVisible(true);
                err = true;
                break;
            }
        }
        if (err) {
            lblNameTitle.setForeground(Color.red);
            lblErrorNoB.setVisible(true);
        } else {
            lblNameTitle.setForeground(Color.green);
        }

        err = false;

        //Pressence check for Numerical input
        if (txtInputNumber.getText().isEmpty()) {
            errMsg += "ERROR: Number of seats is empty, requries input\n";
            lblErrorNoSPressenceChk.setVisible(true);
            err = true;
        } else {
            try {
                //Range check for Numerical input only if the input isn't empty
                switch (Integer.parseInt(txtInputNumber.getText())) {
                    case 1:
                    case 2:
                    case 4:
                    case 8:
                        break;
                    default:
                        errMsg += "ERROR: Seat number has to be 1,2,4 or 8\n";
                        lblErrorNoSRangeChk.setVisible(true);
                        err = true;
                        break;
                }
            } //Type check for Numerical input
            catch (java.lang.NumberFormatException e) {
                errMsg += "ERROR: Seat number can only be an interger\n";
                lblErrorNoSTypeChk.setVisible(true);
                err = true;
            }
        }
        if (err) {
            lblNumberTitle.setForeground(Color.red);
            lblErrorNoS.setVisible(true);
        } else {
            lblNumberTitle.setForeground(Color.green);
        }

        err = false;

        //Pressence check for Date input
        if (dateInputDate.getModel().getValue() == null) {
            errMsg += "ERROR: Date is empty, requries input\n";
            lblErrorDoPPressenceChk.setVisible(true);
            err = true;
        }

        Calendar cal = Calendar.getInstance();
        Calendar now = Calendar.getInstance();
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        cal.set(dateInputDate.getModel().getYear(), dateInputDate.getModel().getMonth(), dateInputDate.getModel().getDay());

        //Logic check for Date input
        if (cal.getTimeInMillis() > now.getTimeInMillis()) {
            errMsg += "ERROR: Purchase date is in the future, must be in the past\n";
            lblErrorDoPLogicChk.setVisible(true);
            err = true;
        }

        if (err) {
            lblDateTitle.setForeground(Color.red);
            lblErrorDoP.setVisible(true);
        } else {
            lblDateTitle.setForeground(Color.green);
        }

        err = false;

        //Pressence check for Boolean input
        if (rbtnSculling.isSelected() == false && rbtnSweep.isSelected() == false) {
            errMsg += "ERROR: Oar type is empty, one must be selected\n";
            lblErrorOTPressenceChk.setVisible(true);
            err = true;
        }
        if (err) {
            lblBooleanTitle.setForeground(Color.red);
            lblErrorOT.setVisible(true);
        } else {
            lblBooleanTitle.setForeground(Color.green);
        }

        err = false;
        //Pressence Check
        if (txtInputID.getText().isEmpty()) {
            errMsg += "ERROR: HIN is empty, requires input\n";
            lblErrorHINPressenceChk.setVisible(true);
            err = true;
        }
        //Length check for ID input
        if (txtInputID.getText().length() != 12) {
            errMsg += "ERROR: HIN is the incorrect length, needs to be 12 characters long\n";
            lblErrorHINLengthChk.setVisible(true);
            err = true;
        } else {
            for (int i = 0; i < 2; i++) {
                if (Character.isDigit(txtInputID.getText().charAt(i))) {
                    //Format check for ID input
                    errMsg += "ERROR: HIN must have a county code, first 2 characters must be letters";
                    lblErrorHINFormatChk.setVisible(true);
                    err = true;
                    break;
                }
            }
        }
        if (err) {
            lblIDTitle.setForeground(Color.red);
            lblErrorHIN.setVisible(true);
        } else {
            lblIDTitle.setForeground(Color.green);
        }

        //Output final error messages, if any
        if (!errMsg.equals("Validation compleate\n")) {
            bgPanelError.setVisible(true);
            lblErrorHeading.setVisible(true);
            txtPaneError.setText("Validation compleate\nErrors found, fix before continuing");
        } else {
            errMsg += "No errors, boat added";
            txtPaneError.setText(errMsg);
            Boats temp = new Boats(0, txtInputString.getText(), Integer.parseInt(txtInputNumber.getText()), txtInputID.getText(), rbtnSweep.isSelected(), cal, -1, user.getSchoolCode());
            db.insertBoat(temp, user);
            clearInputs();

        }

    }//GEN-LAST:event_btnValidateActionPerformed
    //Sets the current screen invisible
    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed
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
    private javax.swing.JPanel bgPanelCentre;
    private javax.swing.JPanel bgPanelError;
    private javax.swing.JButton btnClose;
    private javax.swing.ButtonGroup btnGroup1;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnValidate;
    private org.jdatepicker.JDatePicker dateInputDate;
    private javax.swing.JLabel lblBooleanTitle;
    private javax.swing.JLabel lblDateTitle;
    private javax.swing.JLabel lblErrorDoP;
    private javax.swing.JLabel lblErrorDoPLogicChk;
    private javax.swing.JLabel lblErrorDoPPressenceChk;
    private javax.swing.JLabel lblErrorHIN;
    private javax.swing.JLabel lblErrorHINFormatChk;
    private javax.swing.JLabel lblErrorHINLengthChk;
    private javax.swing.JLabel lblErrorHINPressenceChk;
    private javax.swing.JLabel lblErrorHeading;
    private javax.swing.JLabel lblErrorNoB;
    private javax.swing.JLabel lblErrorNoBPressenceChk;
    private javax.swing.JLabel lblErrorNoBTypeChk;
    private javax.swing.JLabel lblErrorNoS;
    private javax.swing.JLabel lblErrorNoSPressenceChk;
    private javax.swing.JLabel lblErrorNoSRangeChk;
    private javax.swing.JLabel lblErrorNoSTypeChk;
    private javax.swing.JLabel lblErrorOT;
    private javax.swing.JLabel lblErrorOTPressenceChk;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblIDDetails;
    private javax.swing.JLabel lblIDTitle;
    private javax.swing.JLabel lblNameTitle;
    private javax.swing.JLabel lblNumberDetails;
    private javax.swing.JLabel lblNumberTitle;
    private javax.swing.JLabel lblVallidateHeading;
    private javax.swing.JPanel panelError;
    private javax.swing.JRadioButton rbtnSculling;
    private javax.swing.JRadioButton rbtnSweep;
    private javax.swing.JTextField txtInputID;
    private javax.swing.JTextField txtInputNumber;
    private javax.swing.JTextField txtInputString;
    private javax.swing.JTextPane txtPaneError;
    // End of variables declaration//GEN-END:variables
}

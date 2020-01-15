package Models;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author ma19peza
 */
public class Boats {

    private int boatID;
    private String name;
    private int SeatNum;
    private String HIN;
    private boolean oarType;
    private Calendar dateOfPurchase;
    private int slot;
    private String schoolCode;
    private SimpleDateFormat form = new SimpleDateFormat("dd/MM/yyyy");

    //Boats constructer overloaded with inputs for all private varibles aside from SimpleDateFormat
    public Boats(int inBoatID, String inName, int inSeatNum, String inHIN, boolean inOarType, Calendar inCal, int inSlot, String inSchoolCode) {
        boatID = inBoatID;
        name = inName;
        SeatNum = inSeatNum;
        HIN = inHIN;
        oarType = inOarType;
        dateOfPurchase = inCal;
        slot = inSlot;
        schoolCode = inSchoolCode;
    }

    //Base Boats constructer with no paramiters
    public Boats() {

    }

    //Returns the private String name
    public String getName() {
        return name;
    }

    //Sets the private varible name to the given String
    public void setName(String name) {
        this.name = name;
    }

    //Returns the private int seatNum
    public int getSeatNum() {
        return SeatNum;
    }

    //Sets the private varible seatNum to the given int
    public void setSeatNum(int SeatNum) {
        this.SeatNum = SeatNum;
    }

    //Returns the private String HIN
    public String getHIN() {
        return HIN;
    }

    //Sets the private varible HIN to the given String
    public void setHIN(String HIN) {
        this.HIN = HIN;
    }

    //Returns the private boolean oarType
    public boolean isOarType() {
        return oarType;
    }

    //Sets the private varible oarType to the given boolean    
    public void setOarType(boolean oarType) {
        this.oarType = oarType;
    }

    //Returns the private int boatID
    public int getBoatID() {
        return boatID;
    }

    //Sets the private varible boatID to the given int
    public void setBoatID(int boatID) {
        this.boatID = boatID;
    }

    //Returns the private Calendar dateOfPurchase
    public Calendar getDateOfPurchase() {
        return dateOfPurchase;
    }

    //Sets the private varible dateOfPurchase to the given Calendar object
    public void setDateOfPurchase(Calendar dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    //Returns the private int slot
    public int getSlot() {
        return slot;
    }

    //Sets the private varible slot to the given int
    public void setSlot(int slot) {
        this.slot = slot;
    }

    //Returns the private String schoolCode
    public String getSchoolCode() {
        return schoolCode;
    }

    //Sets the private varible schoolCode to the given String
    public void setSchoolCode(String schoolCode) {
        this.schoolCode = schoolCode;
    }

    //Takes in a boolean and returns a a string, "Sweep" if true else "Sculling"
    private String convertOarType(boolean type) {
        if (type) {
            return "Sweep";
        } else {
            return "Sculling";
        }
    }

    //Returns a String describing the Boat object
    @Override
    public String toString() {
        return "" + boatID + "," + name + "," + SeatNum + "," + HIN + "," + convertOarType(oarType) + "," + form.format(dateOfPurchase.getTime()) + "," + slot + "," + schoolCode;
    }

}

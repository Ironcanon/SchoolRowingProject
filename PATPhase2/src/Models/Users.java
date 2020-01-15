package Models;

/**
 * @author stuff
 */
public class Users {

    private int userID;
    private String name;
    private String schoolCode;
    private boolean admin;

    //Base Users constructer with no paramiters           
    public Users() {

    }

    //Users constructer overloaded with inputs for all private varibles
    public Users(int userID, String name, String schoolCode, boolean admin) {
        userID = this.userID;
        name = this.name;
        schoolCode = this.schoolCode;
        admin = this.admin;
    }

    //Returns the private int userID
    public int getUserID() {
        return userID;
    }

    //Sets the private varible userID to the given int
    public void setUserID(int userID) {
        this.userID = userID;
    }

    //Returns the private String name
    public String getName() {
        return name;
    }

    //Sets the private varible name to the given String
    public void setName(String name) {
        this.name = name;
    }

    //Returns the private String schoolCode
    public String getSchoolCode() {
        return schoolCode;
    }

    //Sets the private varible schoolCode to the given String
    public void setSchoolCode(String schoolCode) {
        this.schoolCode = schoolCode;
    }

    //Returns the private boolean admin
    public boolean isAdmin() {
        return admin;
    }

    //Sets the private varible admin to the given boolean
    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
}

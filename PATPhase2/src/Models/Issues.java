package Models;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author stuff
 */
public class Issues {
    
    private int issueID;
    private String boatName;
    private String schoolCode;
    private String description;
    private int serverity;
    private Calendar dateFound;
    private Users userFound;
    private boolean fixed;
    private Users userFixed;
    private Calendar dateFixed;
    private SimpleDateFormat form = new SimpleDateFormat("dd/MM/yyyy");

    public Issues(int issueID, String boatName, String schoolCode, String description, int serverity, Calendar dateFound, Users userFound, boolean fixed) {
        this.issueID = issueID;
        this.boatName = boatName;
        this.schoolCode = schoolCode;
        this.description = description;
        this.serverity = serverity;
        this.dateFound = dateFound;
        this.userFound = userFound;
        this.fixed = fixed;
    }

    public Issues(int issueID, String boatName, String schoolCode, String description, int serverity, Calendar dateFound, Users userFound, boolean fixed, Users userFixed, Calendar dateFixed) {
        this.issueID = issueID;
        this.boatName = boatName;
        this.schoolCode = schoolCode;
        this.description = description;
        this.serverity = serverity;
        this.dateFound = dateFound;
        this.userFound = userFound;
        this.fixed = fixed;
        this.userFixed = userFixed;
        this.dateFixed = dateFixed;
    }
    
    
    
    public String getBoatName() {
        return boatName;
    }

    public void setBoatName(String boatName) {
        this.boatName = boatName;
    }

    public String getSchoolCode() {
        return schoolCode;
    }

    public void setSchoolCode(String schoolCode) {
        this.schoolCode = schoolCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getServerity() {
        return serverity;
    }

    public void setServerity(int serverity) {
        this.serverity = serverity;
    }

    public Calendar getDateFound() {
        return dateFound;
    }

    public void setDateFound(Calendar dateFound) {
        this.dateFound = dateFound;
    }

    public Users getUserFound() {
        return userFound;
    }

    public void setUserFound(Users userFound) {
        this.userFound = userFound;
    }

    public boolean isFixed() {
        return fixed;
    }

    public void setFixed(boolean fixed) {
        this.fixed = fixed;
    }

    public Users getUserFixed() {
        return userFixed;
    }

    public void setUserFixed(Users userFixed) {
        this.userFixed = userFixed;
    }

    public Calendar getDateFixed() {
        return dateFixed;
    }

    public void setDateFixed(Calendar dateFixed) {
        this.dateFixed = dateFixed;
    }

    @Override
    public String toString() {
        if (fixed) {
            return "boatName=" + boatName + ", schoolCode=" + schoolCode + ", description=" + description + ", serverity=" + serverity + ", dateFound=" + dateFound + ", userFound=" + userFound + ", fixed=" + fixed + ", userFixed=" + userFixed + ", dateFixed=" + dateFixed;
        }else{
            return "boatName=" + boatName + ", schoolCode=" + schoolCode + ", description=" + description + ", serverity=" + serverity + ", dateFound=" + dateFound + ", userFound=" + userFound + ", fixed=" + fixed;
        }
        
    }
    
    
}

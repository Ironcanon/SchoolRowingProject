package Java;

import Models.Boats;
import Models.Issues;
import Models.Users;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.sql.PreparedStatement;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author stuff
 */
public class DatabaseConnector {

    private Connection conn;
    private ResultSet resultSet;
    private PreparedStatement preparedStatment;

    //Database constructer loads the necessary driver for the program to connect to the database then calls getConnection to connect to the database
    public DatabaseConnector() {
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        } catch (ClassNotFoundException e) {
            System.out.println("[DB] - Error - DatabaseConnector/n" + e);
        }
        conn = getConnection();
        System.out.println("[DB] - Database connected and created");
    }

    //Attempts to connect to the database at the given address and if successful return the connection else returns null
    private Connection getConnection() {
        try {
            String url = "jdbc:ucanaccess://src/Resources/PATDatabase.mdb";
            return DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println("[DB] - Error - getConnection/n" + e);
        }
        return null;

    }

    //Queries the database for all the boats in the Boats table and returns it as a string array
    public String[] getAllBoats(Users user) {
        Boats[] boats;
        String[] modelS = new String[0];
        int count = 0;
        try {
            String query = "SELECT * FROM tblBoats WHERE SchoolCode = ?";
            preparedStatment = conn.prepareStatement(query);
            preparedStatment.setString(1, user.getSchoolCode());
            resultSet = preparedStatment.executeQuery();
            int length = 0;

            while (resultSet.next()) {
                length++;
            }

            resultSet = preparedStatment.executeQuery();

            boats = new Boats[length];
            while (resultSet.next()) {
                int boatID = resultSet.getInt(1);
                String boatName = resultSet.getString(2);
                int seatNo = resultSet.getInt(3);
                String HIN = resultSet.getString(4);
                boolean oarType = resultSet.getBoolean(5);
                Calendar cal = Calendar.getInstance();
                cal.setTime(resultSet.getDate(6));
                int slot = resultSet.getInt(7);
                String schoolCode = resultSet.getString(8);
                Boats tempBoat = new Boats(boatID, boatName, seatNo, HIN, oarType, cal, slot, schoolCode);
                boats[count] = tempBoat;
                count++;
            }

            modelS = new String[boats.length];

            for (int i = 0; i < boats.length; i++) {
                modelS[i] = boats[i].toString();
            }

        } catch (SQLException e) {
            System.out.println("[DB] - Error - getAllBoats/n" + e);
        }
        return modelS;
    }

    //Updates the database editing the boat with the boatID seting the fields to the values contained in the given boat object
    public void updateBoat(Boats boat) {
        try {
            String sql = "UPDATE tblBoats SET BoatName = ?, NumOfSeats = ?, HIN = ?, OarType = ?, DateOfPurchase = ? WHERE BoatID = ?";
            preparedStatment = conn.prepareStatement(sql);
            preparedStatment.setString(1, boat.getName());
            preparedStatment.setInt(2, boat.getSeatNum());
            preparedStatment.setString(3, boat.getHIN());
            preparedStatment.setBoolean(4, boat.isOarType());
            preparedStatment.setDate(5, new java.sql.Date(boat.getDateOfPurchase().getTimeInMillis()));
            preparedStatment.setInt(6, boat.getBoatID());
            preparedStatment.executeUpdate();
        } catch (SQLException e) {
            System.out.println("[DB] - Error - updateBoat/n" + e);
        }
    }

    //Inserts the given boat object, setting the schoolCode to the given school code into the database
    public void insertBoat(Boats boat, Users user) {
        try {
            String sql = "INSERT INTO tblBoats(BoatName,NumOfSeats,HIN,OarType,DateOfPurchase,Slot,SchoolCode) VALUES(?,?,?,?,?,-1,?)";
            preparedStatment = conn.prepareStatement(sql);
            preparedStatment.setString(1, boat.getName());
            preparedStatment.setInt(2, boat.getSeatNum());
            preparedStatment.setString(3, boat.getHIN());
            preparedStatment.setBoolean(4, boat.isOarType());
            preparedStatment.setDate(5, new java.sql.Date(boat.getDateOfPurchase().getTimeInMillis()));
            preparedStatment.setString(6, user.getSchoolCode());
            preparedStatment.executeUpdate();
        } catch (SQLException e) {
            System.out.println("[DB] - Error - insertBoat/n" + e);
        }
    }

    //Queries the database with the given String and returns a boolean depending on whether the query returns any matchs. Helper method for checkPassword
    public boolean checkUsername(String username) {
        try {
            String sql = "SELECT * FROM tblUsers WHERE Username = ?";
            preparedStatment = conn.prepareStatement(sql);
            preparedStatment.setString(1, username);
            resultSet = preparedStatment.executeQuery();
            return resultSet.isBeforeFirst();
        } catch (SQLException e) {
            System.out.println("[DB] - Error - checkUsername/n" + e);
            return false;
        }

    }

    //Queries the database with a username and a password, hashes the password with the salt from the database and returns a boolean depending on whether it matches or not
    public boolean checkPassword(String username, char[] passwordChar) {
        String pass = "";
        String salt = "";
        String password = new String(passwordChar);
        try {
            //Queries the datbase with the given username to get the associated salt
            String sql = "SELECT Password, Salt FROM tblUsers WHERE Username = ?";
            preparedStatment = conn.prepareStatement(sql);
            preparedStatment.setString(1, username);
            resultSet = preparedStatment.executeQuery();

            while (resultSet.next()) {
                pass = resultSet.getString(1);
                salt = resultSet.getString(2);
            }
            byte[] salty = salt.getBytes();
            //hashs the given password and the matching salt from the database
            MessageDigest chk = MessageDigest.getInstance("SHA-512");
            chk.update(salty);

            byte[] securePassChk = chk.digest(password.getBytes());
            //checks if the hash created equals the hash stored in the database
            return pass.equals(DatatypeConverter.printBase64Binary(securePassChk));

        } catch (SQLException | NoSuchAlgorithmException e) {
            System.out.println("[DB] - Error - checkPassword/n" + e);
            return false;
        }

    }

    //Queries the database and returns the user with the given username
    public Users getUser(String username) {
        try {
            Users temp = new Users();
            String sql = "SELECT * FROM tblUsers WHERE Username = ?";
            preparedStatment = conn.prepareStatement(sql);
            preparedStatment.setString(1, username);
            resultSet = preparedStatment.executeQuery();

            while (resultSet.next()) {
                int nameID = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String schoolCode = resultSet.getString(4);
                boolean admin = resultSet.getBoolean(5);
                temp.setUserID(nameID);
                temp.setName(name);
                temp.setSchoolCode(schoolCode);
                temp.setAdmin(admin);
            }
            return temp;
        } catch (SQLException e) {
            System.out.println("[DB] - Error - getUser/n" + e);
            return null;
        }
    }

    //Queries the database and returns a String array comprised of the toString()'s of the boats in the trailer with the same school code as the given user. It also takes in a boolean, if true returns only the name of the boats
    public String[] getBoatsInTrailer(Users user, boolean nameOnly) {
        Boats[] boats;
        String[] modelS = new String[0];
        int count = 0;

        try {
            String sql = "SELECT * FROM tblBoats WHERE SchoolCode = ? AND Slot != -1 ORDER BY Slot";
            preparedStatment = conn.prepareStatement(sql);
            preparedStatment.setString(1, user.getSchoolCode());
            resultSet = preparedStatment.executeQuery();
            int length = 0;

            while (resultSet.next()) {
                length++;
            }

            resultSet = preparedStatment.executeQuery();

            boats = new Boats[length];
            while (resultSet.next()) {
                int boatID = resultSet.getInt(1);
                String boatName = resultSet.getString(2);
                int seatNo = resultSet.getInt(3);
                String HIN = resultSet.getString(4);
                boolean oarType = resultSet.getBoolean(5);
                Calendar cal = Calendar.getInstance();
                cal.setTime(resultSet.getDate(6));
                int slot = resultSet.getInt(7);
                String schoolCode = resultSet.getString(8);
                Boats tempBoat = new Boats(boatID, boatName, seatNo, HIN, oarType, cal, slot, schoolCode);
                boats[count] = tempBoat;
                count++;
            }

            modelS = new String[boats.length];
            if (nameOnly) {
                for (int i = 0; i < boats.length; i++) {
                    modelS[i] = boats[i].getName();
                }
            } else {
                for (int i = 0; i < boats.length; i++) {
                    modelS[i] = boats[i].toString();
                }
            }

        } catch (SQLException e) {
            System.out.println("[DB] - Error - getBoatInTrailer/n" + e);
        }
        return modelS;
    }

    //Queries the database and returns a String array of the boats not in the trailer that have the same school code as the provided
    public String[] getBoatsNotInTrailer(Users user) {
        Boats[] boats;
        String[] modelS = new String[0];
        int count = 0;

        try {
            String sql = "SELECT * FROM tblBoats WHERE SchoolCode = ? AND Slot = -1";
            preparedStatment = conn.prepareStatement(sql);
            preparedStatment.setString(1, user.getSchoolCode());
            resultSet = preparedStatment.executeQuery();
            int length = 0;

            while (resultSet.next()) {
                length++;
            }

            resultSet = preparedStatment.executeQuery();

            boats = new Boats[length];
            while (resultSet.next()) {
                int boatID = resultSet.getInt(1);
                String boatName = resultSet.getString(2);
                int seatNo = resultSet.getInt(3);
                String HIN = resultSet.getString(4);
                boolean oarType = resultSet.getBoolean(5);
                Calendar cal = Calendar.getInstance();
                cal.setTime(resultSet.getDate(6));
                int slot = resultSet.getInt(7);
                String schoolCode = resultSet.getString(8);
                Boats tempBoat = new Boats(boatID, boatName, seatNo, HIN, oarType, cal, slot, schoolCode);
                boats[count] = tempBoat;
                count++;
            }

            modelS = new String[boats.length + 1];
            modelS[0] = "N/A";
            for (int i = 0; i < boats.length; i++) {
                modelS[i + 1] = boats[i].getName();
            }

        } catch (SQLException e) {
            System.out.println("[DB] - Error - getBoatsNotInTrailer/n" + e);
        }
        return modelS;
    }

    //Queries  teh database and returns a Boat object with the same name as the give name
    public Boats getBoat(String InBoatName) {
        try {
            String sql = "SELECT * FROM tblUsers WHERE BoatName = ?";
            preparedStatment = conn.prepareStatement(sql);
            preparedStatment.setString(1, InBoatName);
            resultSet = preparedStatment.executeQuery();

            int boatID = resultSet.getInt(1);
            String boatName = resultSet.getString(2);
            int seatNo = resultSet.getInt(3);
            String HIN = resultSet.getString(4);
            boolean oarType = resultSet.getBoolean(5);
            Calendar cal = Calendar.getInstance();
            cal.setTime(resultSet.getDate(6));
            int slot = resultSet.getInt(7);
            String schoolCode = resultSet.getString(8);
            Boats tempBoat = new Boats(boatID, boatName, seatNo, HIN, oarType, cal, slot, schoolCode);
            return tempBoat;

        } catch (SQLException e) {
            System.out.println("[DB] - Error - getBoat/n" + e);
            return null;
        }
    }

    //Updates the database by swaping the slots of the two boats given
    public void swapSlots(String boatName1, String boatName2) {
        try {
            int slot1 = 0;
            int boatID1 = 0;
            int slot2 = 0;
            int boatID2 = 0;

            String sql = "SELECT Slot, BoatID FROM tblBoats WHERE BoatName = ?";
            preparedStatment = conn.prepareStatement(sql);
            preparedStatment.setString(1, boatName1);
            resultSet = preparedStatment.executeQuery();
            while (resultSet.next()) {
                slot1 = resultSet.getInt(1);
                boatID1 = resultSet.getInt(2);
            }

            preparedStatment = conn.prepareStatement(sql);
            preparedStatment.setString(1, boatName2);
            resultSet = preparedStatment.executeQuery();
            while (resultSet.next()) {
                slot2 = resultSet.getInt(1);
                boatID2 = resultSet.getInt(2);
            }

            preparedStatment.close();
            sql = "UPDATE tblBoats SET Slot = ? WHERE BoatID = ?";

            preparedStatment = conn.prepareStatement(sql);
            preparedStatment.setInt(1, slot2);
            preparedStatment.setInt(2, boatID1);
            preparedStatment.executeUpdate();

            preparedStatment = conn.prepareStatement(sql);
            preparedStatment.setInt(1, slot1);
            preparedStatment.setInt(2, boatID2);
            preparedStatment.executeUpdate();
        } catch (SQLException e) {
            System.out.println("[DB] - Error - swapSlots/n" + e);
        }
    }

    //Queries the database, grabs the Boat with the given name and the same school code as the given user then sets its slot to the given slot
    public void setBoatSlot(int slot, String boatName, Users user) {
        String sql;
        String tempName = "";
        try {
            //Updates the database removing the boat at the given slot from the trailer (setting its slot to -1)
            sql = "UPDATE tblBoats SET Slot = ? WHERE Slot = ? AND SchoolCode = ?";

            preparedStatment = conn.prepareStatement(sql);
            preparedStatment.setInt(1, -1);
            preparedStatment.setInt(2, slot);
            preparedStatment.setString(3, user.getSchoolCode());
            preparedStatment.executeUpdate();
            //Checks if the boatName given is not equal to N/A which is always an option
            if (!boatName.equals("N/A")) {
                //Checks boat same to ensure database validity
                sql = "UPDATE tblBoats SET Slot = ? WHERE BoatName = ? AND SchoolCode = ?";

                preparedStatment = conn.prepareStatement(sql);
                preparedStatment.setInt(1, slot);
                preparedStatment.setString(2, boatName);
                preparedStatment.setString(3, user.getSchoolCode());
                preparedStatment.executeUpdate();
            }

        } catch (SQLException e) {
            System.out.println("[DB] - Error - setBoatSlot/n" + e);
        }

    }

    //Deletes the boat with the given ID
    public void deleteBoat(int boatID) {
        try {
            String sql = "DELETE * FROM tblBoats WHERE BoatID = ?";
            preparedStatment = conn.prepareStatement(sql);
            preparedStatment.setInt(1, boatID);

            preparedStatment.executeUpdate();
        } catch (SQLException e) {
            System.out.println("[DB] - Error - deleteBoat/n" + e);
        }
    }
    
    public Issues[] getAllIssues(){
        return null;
    }
}

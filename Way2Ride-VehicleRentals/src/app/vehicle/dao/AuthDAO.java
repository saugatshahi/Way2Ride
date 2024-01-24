package app.vehicle.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import app.vehicle.database.MySqlConnection;
import app.vehicle.model.Customer;
import app.vehicle.model.License;
import app.vehicle.model.Security;
import java.sql.SQLException;

/**
 * 
 * @author shahi
 **/
public class AuthDAO extends MySqlConnection {

    public boolean saveCustomerData(Customer customer, License license, Security security) {
        try (Connection conn = openConnection()) {
            
            String insertQuery = "INSERT INTO USER_DETAILS " +
                    "(EmailAddress, FullName, ContactNo, Country, HomeAddress, Password, " +
                    "ImageData, LicenseNumber, DateOfIssue, DateOfExpiry, SecurityAnswer1, SecurityAnswer2, SecurityAnswer3) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement ps = conn.prepareStatement(insertQuery)) {
                ps.setString(1, customer.getEmailAddress());
                ps.setString(2, customer.getFullName());
                ps.setString(3, customer.getContactNo());
                ps.setString(4, customer.getCountry());
                ps.setString(5, customer.getHomeAddress());
                ps.setString(6, customer.getPassword());
                ps.setBytes(7, license.getImageData());
                ps.setString(8, license.getLicenseNumber());
                ps.setString(9, license.getDateOfIssue());
                ps.setString(10, license.getDateOfExpiry());
                ps.setString(11, security.getSecurityAnswer1());
                ps.setString(12, security.getSecurityAnswer2());
                ps.setString(13, security.getSecurityAnswer3());

                int result = ps.executeUpdate();
                if (result > 0) {
                    return true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean isAccountExists(Connection conn, String emailAddress) throws SQLException {
        String checkQuery = "SELECT COUNT(*) FROM USER_DETAILS WHERE EmailAddress = ?";
        try (PreparedStatement checkPs = conn.prepareStatement(checkQuery)) {
            checkPs.setString(1, emailAddress);
            try (ResultSet resultSet = checkPs.executeQuery()) {
                if (resultSet.next()) {
                    int count = resultSet.getInt(1);
                    return count > 0;
                }
            }
        }
        return false;
    }
    
    public LoginStatus validateLogin(String emailAddress, String enteredPassword) {
        try (Connection conn = openConnection()) {
            String query = "SELECT * FROM USER_DETAILS WHERE EmailAddress = ?";
            try (PreparedStatement ps = conn.prepareStatement(query)) {
                ps.setString(1, emailAddress);
                try (ResultSet resultSet = ps.executeQuery()) {
                    if (resultSet.next()) {
                        String storedPassword = resultSet.getString("Password");
                        if (enteredPassword.equals(storedPassword)) {
                            return LoginStatus.SUCCESS;
                        } else {
                            return LoginStatus.INVALID_PASSWORD;
                        }
                    } else {
                        return LoginStatus.USER_NOT_FOUND;
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return LoginStatus.ERROR;
        }
    }

    public enum LoginStatus {
        SUCCESS,
        INVALID_PASSWORD,
        USER_NOT_FOUND,
        ERROR
    }
    
    public boolean updateProfilePicture(String emailAddress, byte[] newProfilePicture) {
        try (Connection conn = openConnection()) {
            String updateQuery = "UPDATE USER_DETAILS SET ProfilePicture = ? WHERE EmailAddress = ?";
            try (PreparedStatement updatePs = conn.prepareStatement(updateQuery)) {
                updatePs.setBytes(1, newProfilePicture);
                updatePs.setString(2, emailAddress);
                int updateResult = updatePs.executeUpdate();
                return updateResult > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}

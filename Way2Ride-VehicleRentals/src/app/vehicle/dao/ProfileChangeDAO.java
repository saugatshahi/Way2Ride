package app.vehicle.dao;

import app.vehicle.database.MySqlConnection;
import app.vehicle.model.FetchDataModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author shahi
 */
public class ProfileChangeDAO extends MySqlConnection {
    
    public FetchDataModel fetchCustomerData(String emailAddress) {
    FetchDataModel fetchData = null;
    
    try (Connection conn = openConnection()) {
        String selectQuery = "SELECT * FROM USER_DETAILS WHERE EmailAddress = ?";
        
        try (PreparedStatement ps = conn.prepareStatement(selectQuery)) {
            ps.setString(1, emailAddress);
            
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    fetchData = new FetchDataModel();
                    fetchData.setFullName(rs.getString("FullName"));
                    fetchData.setContactNo(rs.getString("ContactNo"));
                    fetchData.setHomeAddress(rs.getString("HomeAddress"));
                    fetchData.setLicenseNumber(rs.getString("LicenseNumber"));
                    fetchData.setIssuedDate(rs.getString("DateOfIssue"));
                    fetchData.setExpiryDate(rs.getString("DateOfExpiry"));
                    fetchData.setProfileImage(rs.getBytes("ProfilePicture"));
                    fetchData.setCountry(rs.getString("Country"));
                }
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    
    return fetchData;
}
    
    public boolean updateCustomerData(FetchDataModel fetchData) {
        String query = "UPDATE user_details SET FullName=?, ContactNo=?, LicenseNumber = ?, DateOfIssue=?, DateOfExpiry=? WHERE EmailAddress=?";

        try (Connection conn = openConnection();
             PreparedStatement statement = conn.prepareStatement(query)) {
            
            statement.setString(1, fetchData.getFullName());
            statement.setString(2, fetchData.getContactNo());
            statement.setString(3, fetchData.getLicenseNumber());
            statement.setString(4, fetchData.getIssuedDate());
            statement.setString(5, fetchData.getExpiryDate());
            statement.setString(6, fetchData.getEmailAddress());
            
            int rowsUpdated = statement.executeUpdate();
            
            return rowsUpdated > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false; 
        }
    }

}

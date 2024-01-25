package app.vehicle.dao;

import app.vehicle.database.MySqlConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author shahi
 */
public class ProfileChangeDAO extends MySqlConnection {
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

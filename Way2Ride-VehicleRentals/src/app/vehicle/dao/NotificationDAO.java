package app.vehicle.dao;

import app.vehicle.database.MySqlConnection;
import app.vehicle.model.AdmiNotification;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shahi
 */
public class NotificationDAO extends MySqlConnection {
    
    public List<AdmiNotification> fetchAllNotificationsInDescendingOrder() {
        List<AdmiNotification> notificationList = new ArrayList<>();

        try (Connection conn = openConnection()) {
            String selectQuery = "SELECT DescriptionNote FROM notification_store " +
                    "WHERE NotifyId IS NOT NULL " +
                    "ORDER BY NotifyId DESC";

            try (PreparedStatement ps = conn.prepareStatement(selectQuery)) {
                try (ResultSet resultSet = ps.executeQuery()) {
                    while (resultSet.next()) {
                        AdmiNotification notificationData = new AdmiNotification();
                        notificationData.setDescription(resultSet.getString("DescriptionNote"));

                        notificationList.add(notificationData);
                    }
                }
            }

        } catch (SQLException e) {
            System.out.println(e);
        }

        return notificationList;
    }
}

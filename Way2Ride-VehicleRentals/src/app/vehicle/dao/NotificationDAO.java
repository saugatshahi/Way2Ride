package app.vehicle.dao;

import app.vehicle.database.MySqlConnection;
import app.admin.controller.NotificationController;
import app.vehicle.model.NotificationModel;
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
    
    public List<NotificationController> fetchAllNotificationsInDescendingOrder() {
        List<NotificationController> notificationList = new ArrayList<>();

        try (Connection conn = openConnection()) {
            String selectQuery = "SELECT DescriptionNote FROM notification_store " +
                    "WHERE NotifyId IS NOT NULL " +
                    "ORDER BY NotifyId DESC";

            try (PreparedStatement ps = conn.prepareStatement(selectQuery)) {
                try (ResultSet resultSet = ps.executeQuery()) {
                    while (resultSet.next()) {
                        NotificationController notificationData = new NotificationController();
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
    
    public boolean pushNotification(NotificationModel notification) {
        try (Connection conn = openConnection()) {
            String selectNotification = "INSERT INTO notification_store (DescriptionNote) VALUES (?)";
            
            try (PreparedStatement ps = conn.prepareStatement(selectNotification)) {
                ps.setString(1, notification.getDescriptionNote());
            int result = ps.executeUpdate();
                return result > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}

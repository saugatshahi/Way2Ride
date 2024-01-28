package app.vehicle.dao;

import app.vehicle.controller.OrderTrackController;
import app.vehicle.database.MySqlConnection;
import app.vehicle.model.BillingOrders;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author shahi
 */
public class BillingDAO extends MySqlConnection {
    
    public boolean saveOrderData(BillingOrders billings) {
    try (Connection conn = openConnection()) {
        String insertQuery = "INSERT INTO OrderTrack " +
                "(OrderID, CarImage, CarName, TransactionDate) " +
                "VALUES (?, ?, ?, ?)";

        try (PreparedStatement ps = conn.prepareStatement(insertQuery)) {
            ps.setString(1, billings.getOrderID());
            ps.setBytes(2, billings.getImage());
            ps.setString(3, billings.getVehicleName());
            ps.setString(4, billings.getTransDate());

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
    
    public List<OrderTrackController> fetchAllOrdersInDescendingOrder() {
    List<OrderTrackController> orderList = new ArrayList<>();

    try (Connection conn = openConnection()) {
        String selectQuery = "SELECT OrderID, CarName, TransactionDate, CarImage FROM OrderTrack " +
                             "ORDER BY OrderID DESC";

        try (PreparedStatement ps = conn.prepareStatement(selectQuery)) {
            try (ResultSet resultSet = ps.executeQuery()) {
                while (resultSet.next()) {
                    OrderTrackController orderData = new OrderTrackController();
                    orderData.setOrderID(resultSet.getString("OrderID"));
                    orderData.setCarName(resultSet.getString("CarName"));
                    orderData.setTransactionDate(resultSet.getString("TransactionDate"));
                    orderData.setCarImage(resultSet.getBytes("CarImage"));

                    orderList.add(orderData);
                }
            }
        }
    } catch (SQLException e) {
        System.out.println(e);
    }

    return orderList;
}
    
    public boolean deleteHistory(String orderID) {
    try (Connection conn = openConnection()) {
        String deleteQuery = "DELETE FROM ordertrack WHERE orderID = ?";
        
        try (PreparedStatement ps = conn.prepareStatement(deleteQuery)) {
            ps.setString(1, orderID);
            
            int result = ps.executeUpdate();
            return result > 0;
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return false;
}

}

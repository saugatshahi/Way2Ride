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
    
    public boolean saveOrderData(String userEmail, BillingOrders billings) {
    try (Connection conn = openConnection()) {
        String insertQuery = "INSERT INTO OrderTrack " +
                "(OrderID, CarImage, CarName, TransactionDate, HolderName, HolderNumber, CVV, ExpDate, PostalCode, EmailAddress, Price) " + // Add UserEmail column
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        
        //BACKEND ARYAN BASNET AND SAUGAT SHAHI

        try (PreparedStatement ps = conn.prepareStatement(insertQuery)) {
            ps.setString(1, billings.getOrderID());
            ps.setBytes(2, billings.getImage());
            ps.setString(3, billings.getVehicleName());
            ps.setString(4, billings.getTransDate());
            ps.setString(5, billings.getHolderName());
            ps.setString(6, billings.getHolderNumber());
            ps.setString(7, billings.getcVV());
            ps.setString(8, billings.getExpDate());
            ps.setString(9, billings.getPostalCode());
            ps.setString(10, userEmail);
            ps.setString(11, billings.getPrice());

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

public List<OrderTrackController> fetchAllOrdersInDescendingOrder(String userEmail) {
    List<OrderTrackController> orderList = new ArrayList<>();

    try (Connection conn = openConnection()) {
        String selectQuery = "SELECT OrderID, CarName, TransactionDate, CarImage FROM OrderTrack " +
                             "WHERE EmailAddress = ? " + // Add condition to fetch orders for a specific user
                             "ORDER BY OrderID DESC";

        try (PreparedStatement ps = conn.prepareStatement(selectQuery)) {
            ps.setString(1, userEmail);

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

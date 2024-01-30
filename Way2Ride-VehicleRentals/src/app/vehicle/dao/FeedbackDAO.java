/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.vehicle.dao;

import app.vehicle.database.MySqlConnection;
import app.vehicle.feedback.FeedbackController;
import app.vehicle.model.FeedbackModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

/**
 *
 * @author shahi
 */
public class FeedbackDAO extends MySqlConnection {
    public boolean saveUserFeedback(String emailAddress, FeedbackModel feedback) {
    try (Connection conn = openConnection()) {
        String insertQuery = "INSERT INTO userfeedback " +
                "(emailAddress, FullName, screenshot, description, enquirytype) " +
                "VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement ps = conn.prepareStatement(insertQuery)) {
            ps.setString(1, emailAddress);
            ps.setString(2, feedback.getFullName());
            ps.setBytes(3, feedback.getImageFeed());
            ps.setString(4, feedback.getDesc());
            ps.setString(5, feedback.getEnquiryType());

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
    
    public List<FeedbackController> fetchAllFeedback() {
    List<FeedbackController> feedbackList = new ArrayList<>();

    try (Connection conn = openConnection()) {
        String selectQuery = "SELECT *FROM userfeedback " + 
                             "WHERE uid IS NOT NULL " +
                             "ORDER BY uid DESC"; 

        try (PreparedStatement ps = conn.prepareStatement(selectQuery)) {

            try (ResultSet resultSet = ps.executeQuery()) {
                while (resultSet.next()) {
                    FeedbackController feedbackData = new FeedbackController();
                    feedbackData.setTitle(resultSet.getString("FullName"));
                    feedbackData.setComment(resultSet.getString("description"));
                    feedbackData.setImg(resultSet.getBytes("screenshot"));
                    
                    feedbackList.add(feedbackData);
                }
            }
        }
    } catch (SQLException e) {
        System.out.println(e);
    }

    return feedbackList;
}
}
//
//public List<FourWheelersController> fetchAllCategoryInDescendingOrder() {
//        List<FourWheelersController> categoryVehicle = new ArrayList<>();
//        
//        try (Connection conn = openConnection()) {
//            String selectCategory = "SELECT * FROM ModelItem " +
//                    "WHERE ModelId IS NOT NULL " +
//                    "ORDER BY ModelId DESC";
//            
//            try (PreparedStatement ps = conn.prepareStatement(selectCategory)) {
//                try (ResultSet resultSet = ps.executeQuery()) {
//                    while (resultSet.next()) {
//                        FourWheelersController categoryModel = new FourWheelersController();
//                        categoryModel.setCategory(resultSet.getString("Category"));
//                        categoryModel.setBrand(resultSet.getString("Brand"));
//                        categoryModel.setPowerSource(resultSet.getString("PowerSource"));
//                        categoryModel.setLimitations(resultSet.getString("Limitations"));
//                        categoryModel.setPrice(resultSet.getString("Price"));
//                        categoryModel.setQuantity(resultSet.getString("Quantity"));
//                        categoryModel.setCarImage(resultSet.getBytes("CarImage"));
//                        
//                        categoryVehicle.add(categoryModel);
//                    }
//                }
//            }
//        } catch (SQLException e) {
//            System.out.println(e);
//        }
//        return categoryVehicle;
//    }
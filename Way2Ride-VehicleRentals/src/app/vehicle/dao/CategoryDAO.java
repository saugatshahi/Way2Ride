package app.vehicle.dao;

import app.vehicle.database.MySqlConnection;
import app.admin.controller.FourWheelersController;
import app.admin.controller.TwoWheelersController;
import app.vehicle.model.CategoryModel;
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
public class CategoryDAO extends MySqlConnection {
    
    public List<FourWheelersController> fetchAllCategoryInDescendingOrder() {
        List<FourWheelersController> categoryVehicle = new ArrayList<>();
        
        try (Connection conn = openConnection()) {
            String selectCategory = "SELECT * FROM ModelItem " +
                    "WHERE ModelId IS NOT NULL " +
                    "ORDER BY ModelId DESC";
            
            try (PreparedStatement ps = conn.prepareStatement(selectCategory)) {
                try (ResultSet resultSet = ps.executeQuery()) {
                    while (resultSet.next()) {
                        FourWheelersController categoryModel = new FourWheelersController();
                        categoryModel.setCategory(resultSet.getString("Category"));
                        categoryModel.setBrand(resultSet.getString("Brand"));
                        categoryModel.setPowerSource(resultSet.getString("PowerSource"));
                        categoryModel.setLimitations(resultSet.getString("Limitations"));
                        categoryModel.setPrice(resultSet.getString("Price"));
                        categoryModel.setQuantity(resultSet.getString("Quantity"));
                        categoryModel.setCarImage(resultSet.getBytes("CarImage"));
                        
                        categoryVehicle.add(categoryModel);
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return categoryVehicle;
    }
    
    public List<TwoWheelersController> fetchAllBikesInDescendingOrder() {
        List<TwoWheelersController> categoryBike = new ArrayList<>();
        
        try (Connection conn = openConnection()) {
            String selectCategory = "SELECT * FROM twowheelers " +
                    "WHERE ID IS NOT NULL " +
                    "ORDER BY ID DESC";
            
            try (PreparedStatement ps = conn.prepareStatement(selectCategory)) {
                try (ResultSet resultSet = ps.executeQuery()) {
                    while (resultSet.next()) {
                        TwoWheelersController twoWheelers = new TwoWheelersController();
                        twoWheelers.setBikeName(resultSet.getString("BikeName"));
                        twoWheelers.setBrand(resultSet.getString("BikeBrand"));
                        twoWheelers.setPrice(resultSet.getString("BikePrice"));
                        twoWheelers.setSpeed(resultSet.getString("BikeSpeed"));
                        twoWheelers.setBikePower(resultSet.getString("BikePower"));
                        twoWheelers.setBikeImage(resultSet.getBytes("BikeImage"));
                        
                        categoryBike.add(twoWheelers);
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return categoryBike;
    }
    
    public boolean saveCategory(CategoryModel modelItem) {
        try (Connection conn = openConnection()) {
            String insertQuery = "INSERT INTO modelitem " +
                    "(Category, Brand, PowerSource, Limitations, Price, Quantity, CarImage) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?)";
            
            try (PreparedStatement ps = conn.prepareStatement(insertQuery)) {
                ps.setString(1, modelItem.getCategory());
                ps.setString(2, modelItem.getBrand());
                ps.setString(3, modelItem.getPowerSource());
                ps.setString(4, modelItem.getMileage());
                ps.setString(5, modelItem.getPrice());
                ps.setString(6, modelItem.getCarSeats());
                ps.setBytes(7, modelItem.getCarImage());
                
                int result = ps.executeUpdate();
                return result > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean deleteCategoryByBrand(String brand) {
    try (Connection conn = openConnection()) {
        String deleteQuery = "DELETE FROM modelitem WHERE Brand = ?";
        
        try (PreparedStatement ps = conn.prepareStatement(deleteQuery)) {
            ps.setString(1, brand);
            
            int result = ps.executeUpdate();
            return result > 0;
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return false;
}
}

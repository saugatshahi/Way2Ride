package app.vehicle.dao;

import app.vehicle.database.MySqlConnection;
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
    
    public List<CategoryModel> fetchAllCategoryInDescendingOrder() {
        List<CategoryModel> categoryVehicle = new ArrayList<>();
        
        try (Connection conn = openConnection()) {
            String selectCategory = "SELECT *FROM ModelItem " +
                    "WHERE ModelId IS NOT NULL " +
                    "ORDER BY ModelId DESC";
            
            try (PreparedStatement ps = conn.prepareStatement(selectCategory)) {
                try (ResultSet resultSet = ps.executeQuery()) {
                    while (resultSet.next()) {
                        CategoryModel categoryModel = new CategoryModel();
                        categoryModel.setCategory(resultSet.getString("Category"));
                        categoryModel.setFeatures(resultSet.getString("Features"));
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
}

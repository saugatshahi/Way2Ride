package app.vehicle.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import app.vehicle.model.Customer;
import app.vehicle.database.MySqlConnection;

/**
 * @author shahi
 **/
public class AuthDAO extends MySqlConnection {
    
    public boolean saveCustomerData(Customer user){
        try{
            PreparedStatement ps = null;
            Connection conn = openConnection();
            
            String sql = "INSERT INTO useraccount(fullName, emailAddress, contactNo, country, homeAddress, password) VALUES(?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            
            ps.setString(1, user.getFullName());
            ps.setString(2, user.getEmailAddress());
            ps.setString(3, user.getContactNo());
            ps.setString(4, user.getCountry());
            ps.setString(5, user.gethomeAddress());
            ps.setString(6, user.getPassword());
            
            int result = ps.executeUpdate();
            if(result == -1){
                return false;
            }else{
                return true;
            }
            
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
    }
    
    public String getStoredPassword(String emailAddress) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String storedHashedPassword = null;

        try {
            conn = openConnection();
            String sql = "SELECT password FROM useraccount WHERE emailAddress=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, emailAddress);

            rs = ps.executeQuery();

            if (rs.next()) {
                storedHashedPassword = rs.getString("password");
            }
        } finally {
            closeResources(conn, ps, rs);
        }

        return storedHashedPassword;
    }

    private void closeResources(Connection conn, PreparedStatement ps, ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (conn != null) {
                closeConnection(conn);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
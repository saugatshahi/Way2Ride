package app.vehicle.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import app.vehicle.model.Customer;
import app.vehicle.database.MySqlConnection;
import app.vehicle.model.License;
import app.vehicle.model.Security;

/**
 * 
 * @author shahi
 **/
public class AuthDAO extends MySqlConnection {
    
    public boolean saveCustomerData(Customer user, License lc, Security sc){
        try{
            Connection conn = openConnection();
            
            String insertQuery1 = "INSERT INTO USER_DETAILS(FullName, EmailAddress, ContactNo, Country, HomeAddress, Password) VALUES(?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(insertQuery1, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, user.getFullName());
            ps.setString(2, user.getEmailAddress());
            ps.setString(3, user.getContactNo());
            ps.setString(4, user.getCountry());
            ps.setString(5, user.getHomeAddress());
            ps.setString(6, user.getPassword());
            
            int result = ps.executeUpdate();
            if (result > 0) {
                try (ResultSet generatedKey = ps.getGeneratedKeys()) {
                    if (generatedKey.next()) {
                        
                        int primaryKey = generatedKey.getInt(1);
                        
                        String insertQuery2 = "INSERT INTO LICENSE_DETAILS (LicenseNumber, DateOfIssue, DateOfExpiry, licenseEmailRef) VALUES (?, ?, ?, ?)";
                        try (PreparedStatement ps1 = conn.prepareStatement(insertQuery2)) {
                            ps1.setString(1, lc.getLicenseNumber());
                            ps1.setString(2, lc.getDateOfIssue());
                            ps1.setString(3, lc.getDateOfExpiry());
                            ps1.setInt(4, primaryKey);
                            
                            ps1.executeUpdate();
                        }
                        
                        String insertQuery3 = "INSERT INTO SECURITY_QSNS (SecurityAnswer1, SecurityAnswer2, SecurityAnswer3, securityEmailRef) VALUES (?, ?, ?, ?)";
                        try (PreparedStatement ps2 = conn.prepareStatement(insertQuery3)) {
                            ps2.setString(1, sc.getSecurityAnswer1());
                            ps2.setString(2, sc.getSecurityAnswer2());
                            ps2.setString(3, sc.getSecurityAnswer3());
                            ps2.setInt(4, primaryKey);
                            
                            ps2.executeUpdate();
                        }
                    } 
                }
            }
            
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
        return false;
    }
}
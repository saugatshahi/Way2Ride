/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.vehicle.dao;

import app.vehicle.database.MySqlConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class SecurityDAO extends MySqlConnection {
        public boolean isAccountExists(Connection conn, String emailAddress) throws SQLException {
        String checkQuery = "SELECT COUNT(*) FROM USER_DETAILS WHERE EmailAddress = ?";
        try (PreparedStatement checkPs = conn.prepareStatement(checkQuery)) {
            checkPs.setString(1, emailAddress);
            try (ResultSet resultSet = checkPs.executeQuery()) {
                if (resultSet.next()) {
                    int count = resultSet.getInt(1);
                    return count > 0;
                }
            }
        }
        return false;
    }

//    } catch (SQLException e) {
//        e.printStackTrace();
//        return ForgotPasswordStatus.ERROR;
//    }
//}
//public ForgotPasswordStatus validateSecurityQuestion(String emailAddress, String enteredAnswer) {
//    try (Connection conn = openConnection()) {
//        String query = "SELECT SecurityAnswer1, SecurityAnswer2, SecurityAnswer3, SecurityAnswer4 FROM USER_DETAILS WHERE EmailAddress = ?";
//        try (PreparedStatement ps = conn.prepareStatement(query)) {
//            ps.setString(1, emailAddress);
//            try (ResultSet resultSet = ps.executeQuery()) {
//                if (resultSet.next()) {
//                    String storedAnswer1 = resultSet.getString("SecurityAnswer1");
//                    String storedAnswer2 = resultSet.getString("SecurityAnswer2");
//                    String storedAnswer3 = resultSet.getString("SecurityAnswer3");
//                    String storedAnswer4 = resultSet.getString("SecurityAnswer4");
//
//                    if (enteredAnswer.equals(storedAnswer1) || enteredAnswer.equals(storedAnswer2)
//                            || enteredAnswer.equals(storedAnswer3) || enteredAnswer.equals(storedAnswer4)) {
//                        return ForgotPasswordStatus.SUCCESS;
//                    } else {
//                        return ForgotPasswordStatus.INVALID_SECURITY_ANSWER;
//                    }
//                } else {
//                    return ForgotPasswordStatus.USER_NOT_FOUND;
//                }
//            }
//        }
//    } catch (SQLException e) {
//        e.printStackTrace();
//        return ForgotPasswordStatus.ERROR;
//    }
//}
    public ForgotPasswordStatus validateSecurityQuestion(String emailAddress, String enteredSecurityQuestion) {
        try (Connection conn = openConnection()) {
            String query = "SELECT SecurityAnswer1, SecurityAnswer2, SecurityAnswer3 FROM USER_DETAILS WHERE EmailAddress = ?";
            try (PreparedStatement ps = conn.prepareStatement(query)) {
                ps.setString(1, emailAddress);
                try (ResultSet resultSet = ps.executeQuery()) {
                    if (resultSet.next()) {
                        String storedSecurityQuestion1 = resultSet.getString("SecurityAnswer1");
                        String storedSecurityQuestion2 = resultSet.getString("SecurityAnswer2");
                        String storedSecurityQuestion3 = resultSet.getString("SecurityAnswer3");
                      

                        if (enteredSecurityQuestion.equals(storedSecurityQuestion1)
                                || enteredSecurityQuestion.equals(storedSecurityQuestion2)
                                || enteredSecurityQuestion.equals(storedSecurityQuestion3)) {
                            return ForgotPasswordStatus.SUCCESS;
                        } else {
                            return ForgotPasswordStatus.INVALID_SECURITY_ANSWER;
                            
                        }
                        
                    } else {
                        return ForgotPasswordStatus.EMAIL_NOT_FOUND;
                        
                    }
                    
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return ForgotPasswordStatus.ERROR;
        }
    }
 
    
 
    
    public enum ForgotPasswordStatus {
        SUCCESS,
        INVALID_SECURITY_ANSWER,
        EMAIL_NOT_FOUND,
        ERROR
    }

    
}


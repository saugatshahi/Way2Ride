package app.vehicle.model;

import java.util.Date;

/**
 *
 * @author shahi
 */
public class License {
    
    private final String licenseNumber;
    private final String dateOfIssue;
    private final String dateOfExpiry;
    
    public License(String licenseNumber, String dateOfIssue, String dateOfExpiry) {
        this.licenseNumber = licenseNumber;
        this.dateOfIssue = dateOfIssue;
        this.dateOfExpiry = dateOfExpiry;
    }
    
    public String getLicenseNumber() {
        return this.licenseNumber;
    }
    
    public String getDateOfIssue() {
        return this.dateOfIssue;
    }
    
    public String getDateOfExpiry() {
        return this.dateOfExpiry;
    }
}

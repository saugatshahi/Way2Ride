package app.vehicle.model;

/**
 *
 * @author shahi
 */
public class License {
    
    private final byte[] imageData;
    private final String licenseNumber;
    private final String dateOfIssue;
    private final String dateOfExpiry;
    
    public License(byte[] imageData, String licenseNumber, String dateOfIssue, String dateOfExpiry) {
        this.imageData = imageData;
        this.licenseNumber = licenseNumber;
        this.dateOfIssue = dateOfIssue;
        this.dateOfExpiry = dateOfExpiry;
    }
    
    public byte[] getImageData() {
        return this.imageData;
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

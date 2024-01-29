package app.vehicle.profile.controller;

public class ProfileView {

    private final String fullName;
    private final String contactNo;
    private final String shippingAddress;
    private final String issuedDate;
    private final String expiryDate;
    private final byte[] profileImage;
    private final String licenseNumber;
    private final String homeAddress;
    private final String country;
    
    public ProfileView(String fullName, String country, String contactNo, String homeAddress, String shippingAddress, String licenseNumber, String issuedDate, String expiryDate, byte[] profileImage) {
        this.licenseNumber = licenseNumber;
        this.issuedDate = issuedDate;
        this.expiryDate = expiryDate;
        this.profileImage = profileImage;
        this.fullName = fullName;
        this.contactNo = contactNo;
        this.shippingAddress = shippingAddress;
        this.homeAddress = homeAddress;
        this.country = country;
    }
    
    public String getLicenseNumber() {
        return licenseNumber;
    }

    public String getIssuedDate() {
        return issuedDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public byte[] getProfileImage() {
        return profileImage;
    }
    
    public String getFullName() {
        return fullName;
    }

    public String getContactNo() {
        return contactNo;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public String getHomeAddress() {
        return homeAddress;
    }
    
    public String getCountry() {
        return country;
    }
    
}

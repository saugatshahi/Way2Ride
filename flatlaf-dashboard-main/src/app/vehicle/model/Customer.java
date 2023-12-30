package app.vehicle.model;

/**
 *@author shahi
**/

public class Customer {
    private String fullName, emailAddress, country, homeAddress, password, contactNo;

    public Customer(String fullName, String emailAddress, String contactNo, String country, String homeAddress, String password) {
        this.fullName = fullName;
        this.emailAddress = emailAddress;
        this.contactNo = contactNo;
        this.country = country;
        this.homeAddress = homeAddress;
        this.password = password;
    }
    
    public String getFullName() {
        return this.fullName;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }
    
    public String getContactNo() {
        return this.contactNo;
    }
    
    public String getCountry() {
        return this.country;
    }

    public String gethomeAddress() {
        return this.homeAddress;
    }

    public String getPassword() {
        return this.password;
    }
}

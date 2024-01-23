package app.vehicle.model;

/**
 *@author shahi
**/

public class Customer {

    private final String fullName;
    private final String emailAddress;
    private final String country;
    private final String homeAddress;
    private final String password;
    private final String contactNo;

    public Customer(String emailAddress, String fullName, String contactNo, String country, String homeAddress, String password) {
        this.emailAddress = emailAddress;
        this.fullName = fullName;
        this.contactNo = contactNo;
        this.country = country;
        this.homeAddress = homeAddress;
        this.password = password;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }
    
    public String getFullName() {
        return this.fullName;
    }
    
    public String getContactNo() {
        return this.contactNo;
    }
    
    public String getCountry() {
        return this.country;
    }

    public String getHomeAddress() {
        return this.homeAddress;
    }

    public String getPassword() {
        return this.password;
    }
}

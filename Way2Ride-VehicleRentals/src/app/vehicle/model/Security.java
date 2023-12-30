package app.vehicle.model;

/**
 *
 * @author shahi
 */
public class Security {
    
    private String SecurityAnswer1;
    private String SecurityAnswer2;
    private String SecurityAnswer3;
    
    public Security(String SecurityAnswer1, String SecurityAnswer2, String SecurityAnswer3) {
        this.SecurityAnswer1 = SecurityAnswer1;
        this.SecurityAnswer2 = SecurityAnswer2;
        this.SecurityAnswer3 = SecurityAnswer3;
    }
    
    public String getSecurityAnswer1() {
        return this.SecurityAnswer1;
    }
    public String getSecurityAnswer2() {
        return this.SecurityAnswer2;
    }
    public String getSecurityAnswer3() {
        return this.SecurityAnswer3;
    }
}

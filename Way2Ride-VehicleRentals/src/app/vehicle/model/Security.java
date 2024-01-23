package app.vehicle.model;

/**
 *
 * @author shahi
 */
public class Security {
    
    private String securityAnswer1;
    private String securityAnswer2;
    private String securityAnswer3;
    
    public Security(String securityAnswer1, String securityAnswer2, String securityAnswer3) {
        this.securityAnswer1 = securityAnswer1;
        this.securityAnswer2 = securityAnswer2;
        this.securityAnswer3 = securityAnswer3;
    }
    
    public String getSecurityAnswer1() {
        return this.securityAnswer1;
    }
    public String getSecurityAnswer2() {
        return this.securityAnswer2;
    }
    public String getSecurityAnswer3() {
        return this.securityAnswer3;
    }
}

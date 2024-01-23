package app.vehicle.model;

public class LoginResult {
    public enum LoginStatus {
        SUCCESS,
        INVALID_PASSWORD,
        USER_NOT_FOUND,
        ERROR
    }

    private final LoginStatus status;
    private final String emailAddress;

    public LoginResult(LoginStatus status, String emailAddress) {
        this.status = status;
        this.emailAddress = emailAddress;
    }

    public LoginStatus getStatus() {
        return status;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}

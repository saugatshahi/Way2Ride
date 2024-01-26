package app.admin.controller;

public class NotificationController{
    private int notifyId;
    private String description;

    // Constructor
    public NotificationController() {
    }

    // Getter and setter methods
    public int getNotifyId() {
        return notifyId;
    }

    public void setNotifyId(int notifyId) {
        this.notifyId = notifyId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

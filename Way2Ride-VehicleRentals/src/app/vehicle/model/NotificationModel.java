package app.vehicle.model;

/**
 *
 * @author shahi
 */
public class NotificationModel {
    private final String descriptionNote;
    
    public NotificationModel(String descriptionNote) {
        this.descriptionNote = descriptionNote;
    }

    public String getDescriptionNote() {
        return descriptionNote;
    }
}

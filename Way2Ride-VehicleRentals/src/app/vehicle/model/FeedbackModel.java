package app.vehicle.model;

/**
 *
 * @author shahi
 */
public class FeedbackModel {

    public String getFullName() {
        return fullName;
    }

    public String getDesc() {
        return desc;
    }

    public byte[] getImageFeed() {
        return imageFeed;
    }
    
    public String getEnquiryType() {
        return enquiryType;
    }
    
    private String fullName;
    private String desc;
    private byte[] imageFeed;
    private String enquiryType;
    
    public FeedbackModel(String fullName, String desc, byte[] imageFeed, String enquiryType) {
        this.desc = desc;
        this.enquiryType = enquiryType;
        this.fullName = fullName;
        this.imageFeed = imageFeed;
    }
}

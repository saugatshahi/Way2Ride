
package raven.modelItem;


import javax.swing.Icon;
import javax.swing.JButton;


public class ModelItem{

    /**
     * @return the carType
     */
    public String getCarType() {
        return carType;
    }

    /**
     * @param carType the carType to set
     */
    public void setCarType(String carType) {
        this.carType = carType;
    }

    /**
     * @return the carCategory
     */
    public String getCarCategory() {
        return carCategory;
    }

    /**
     * @param carCategory the carCategory to set
     */
    public void setCarCategory(String carCategory) {
        this.carCategory = carCategory;
    }

    /**
     * @return the carFeatures
     */
    public String getCarFeatures() {
        return carFeatures;
    }

    /**
     * @param carFeatures the carFeatures to set
     */
    public void setCarFeatures(String carFeatures) {
        this.carFeatures = carFeatures;
    }

    /**
     * @return the carMilage
     */
    public String getCarMilage() {
        return carMilage;
    }

    /**
     * @param carMilage the carMilage to set
     */
    public void setCarMilage(String carMilage) {
        this.carMilage = carMilage;
    }

    /**
     * @return the carPrice
     */
    public String getCarPrice() {
        return carPrice;
    }

    /**
     * @param carPrice the carPrice to set
     */
    public void setCarPrice(String carPrice) {
        this.carPrice = carPrice;
    }

    /**
     * @return the carSeats
     */
    public String getCarSeats() {
        return carSeats;
    }

    /**
     * @param carSeats the carSeats to set
     */
    public void setCarSeats(String carSeats) {
        this.carSeats = carSeats;
    }

    /**
     * @return the carName
     */
    public String getCarName() {
        return carName;
    }

    /**
     * @param carName the carName to set
     */
    public void setCarName(String carName) {
        this.carName = carName;
    }

    /**
     * @return the image1
     */
    public Icon getImage1() {
        return image1;
    }

    /**
     * @param image1 the image1 to set
     */
    public void setImage1(Icon image1) {
        this.image1 = image1;
    }

    /**
     * @return the reserveDetails
     */
    public JButton getReserveDetails() {
        return reserveDetails;
    }

    /**
     * @param reserveDetails the reserveDetails to set
     */
    public void setReserveDetails(JButton reserveDetails) {
        this.reserveDetails = reserveDetails;
    }
    
    public ModelItem(String carType,String carFeatures, String carName, String carCategory, String carMilage, String carPrice, String carSeats, Icon image1, JButton reserveDetails){
        this.carCategory = carCategory;
        this.carFeatures = carFeatures;
        this.carMilage = carMilage;
        this.carName = carName;
        this.carPrice = carPrice;
        this.carSeats = carSeats;
        this.carType = carType;
        this.image1 = image1;
        this.reserveDetails = reserveDetails;
        
        
        
    }
    private String carType;
    private String carCategory;
    private String carFeatures;
    private String carMilage;
    private String carPrice;
    private String carSeats;
    private String carName;
    private Icon image1;
    private JButton reserveDetails;
    
    
}
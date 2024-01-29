package app.vehicle.model;

/**
 *
 * @author shahi
 */
public class BikeModel {

    public String getBrand() {
        return brand;
    }

    public String getPrice() {
        return price;
    }

    public String getSpeed() {
        return speed;
    }

    public String getBikeName() {
        return bikeName;
    }

    public byte[] getBikeImage() {
        return bikeImage;
    }
    
    public String getBikePower() {
        return bikePower;
    }
    
    private final String brand;
    private final String price;
    private final String speed;
    private final String bikeName;
    private final byte[] bikeImage;
    private final String bikePower;
    
    public BikeModel(String price, String speed, String brand, String bikePower, String bikeName, byte[] bikeImage) {
        this.price = price;
        this.speed = speed;
        this.brand = brand;
        this.bikeName = bikeName;
        this.bikeImage = bikeImage;
        this.bikePower = bikePower;
    }
    
}

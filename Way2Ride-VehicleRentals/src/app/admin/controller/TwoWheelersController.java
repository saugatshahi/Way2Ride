package app.admin.controller;

public class TwoWheelersController {
    
    private String brand;
    private String price;
    private String speed;
    private String bikeName;
    private byte[] bikeImage;
    private String bikePower;

    public String getBikePower() {
        return bikePower;
    }

    public void setBikePower(String bikePower) {
        this.bikePower = bikePower;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }
    
    public TwoWheelersController() {
        
    }

    public String getBikeName() {
        return bikeName;
    }

    public void setBikeName(String bikeName) {
        this.bikeName = bikeName;
    }

    public byte[] getBikeImage() {
        return bikeImage;
    }

    public void setBikeImage(byte[] bikeImage) {
        this.bikeImage = bikeImage;
    }

    
}

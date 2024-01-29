package app.admin.controller;

public class FourWheelersController {
    
    private String category;
    private String brand;
    private String powerSource;
    private String Limitations;
    private String price;
    private String quantity;
    private byte[] CarImage;

    public byte[] getCarImage() {
        return CarImage;
    }

    public void setCarImage(byte[] CarImage) {
        this.CarImage = CarImage;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPowerSource(String powerSource) {
        this.powerSource = powerSource;
    }

    public void setLimitations(String Limitations) {
        this.Limitations = Limitations;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    
    public FourWheelersController() {
        
    }

    public String getCategory() {
        return category;
    }

    public String getBrand() {
        return brand;
    }

    public String getPowerSource() {
        return powerSource;
    }

    public String getLimitations() {
        return Limitations;
    }

    public String getPrice() {
        return price;
    }

    public String getQuantity() {
        return quantity;
    }
}

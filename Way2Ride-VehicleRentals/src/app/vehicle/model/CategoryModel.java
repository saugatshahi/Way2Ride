package app.vehicle.model;

public class CategoryModel{

    public String getCategory() {
        return category;
    }

    public String getBrand() {
        return brand;
    }

    public String getPowerSource() {
        return powerSource;
    }

    public String getMileage() {
        return mileage;
    }

    public String getPrice() {
        return price;
    }

    public String getCarSeats() {
        return carSeats;
    }

    public byte[] getCarImage() {
        return carImage;
    }
    
    private final String category;
    private final String brand;
    private final String powerSource;
    private final String mileage;
    private final String price;
    private final String carSeats;
    private final byte[] carImage;

    public CategoryModel(String category, String brand, String powerSource, String mileage, String price, String carSeats, byte[] carImage){
        this.category = category;
        this.brand = brand;
        this.powerSource = powerSource;
        this.mileage = mileage;
        this.price = price;
        this.carSeats = carSeats;
        this.carImage = carImage;
    }
}
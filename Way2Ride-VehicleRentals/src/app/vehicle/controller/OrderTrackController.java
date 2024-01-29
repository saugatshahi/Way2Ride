package app.vehicle.controller;

public class OrderTrackController {

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public byte[] getCarImage() {
        return carImage;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCarImage(byte[] carImage) {
        this.carImage = carImage;
    }
    
    private String orderID;
    private String carName;
    private String transactionDate;
    private byte[] carImage;
    private String email;
    
    public OrderTrackController() {
        
    }
}

package app.vehicle.model;

/**
 *
 * @author shahi
 */
public class BillingOrders {
    
    private final String orderID;
    private final byte[] image;
    private final String vehicleName;
    private final String transDate;

    public String getOrderID() {
        return orderID;
    }

    public byte[] getImage() {
        return image;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public String getTransDate() {
        return transDate;
    }
    
    public BillingOrders(String orderID, byte[] image, String vehicleName, String transDate) {
        this.orderID = orderID;
        this.image = image;
        this.vehicleName = vehicleName;
        this.transDate = transDate;
    }
}

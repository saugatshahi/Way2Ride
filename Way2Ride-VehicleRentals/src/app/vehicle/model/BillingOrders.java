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
    private final String holderName;
    private final String holderNumber;
    private final String cVV;
    private final String expDate;
    private final String postalCode;
    private final String price;

    public String getHolderName() {
        return holderName;
    }
    
    public String getPrice() {
        return price;
    }

    public String getHolderNumber() {
        return holderNumber;
    }

    public String getcVV() {
        return cVV;
    }

    public String getPostalCode() {
        return postalCode;
    }
    
    public String getExpDate() {
        return expDate;
    }

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
    
    public BillingOrders(String orderID, byte[] image, String vehicleName, 
                         String transDate, String holderName, 
                         String holderNumber, String cVV, String expDate,String postalCode, String price) {
        this.orderID = orderID;
        this.image = image;
        this.vehicleName = vehicleName;
        this.transDate = transDate;
        this.holderName = holderName;
        this.holderNumber = holderNumber;
        this.cVV = cVV;
        this.expDate = expDate;
        this.postalCode = postalCode;
        this.price = price;
    }
}

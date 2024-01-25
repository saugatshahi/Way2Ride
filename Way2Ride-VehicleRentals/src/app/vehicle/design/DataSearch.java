package app.vehicle.design;

/**
 *
 * @author shahi
 */
public class DataSearch {

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isVehicles() {
        return vehicles;
    }

    public void setVehicles(boolean vehicles) {
        this.vehicles = vehicles;
    }
    
    public DataSearch(String text, boolean vehicles) {
        this.text = text;
        this.vehicles = vehicles;
    }
    
    public DataSearch() {
        
    }
    
    private String text;
    private boolean vehicles;
}

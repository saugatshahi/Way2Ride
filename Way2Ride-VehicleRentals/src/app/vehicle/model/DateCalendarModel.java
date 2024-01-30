package app.vehicle.model;

/**
 *
 * @author shahi
 */
public class DateCalendarModel {
    
    private final String selectedDate1;
    private final String selectedDate2;

    public String getSelectedDate1() {
        return selectedDate1;
    }

    public String getSelectedDate2() {
        return selectedDate2;
    }
    
    public DateCalendarModel(String selectedDate1, String selectedDate2) {
        this.selectedDate1 = selectedDate1;
        this.selectedDate2 = selectedDate2;
    }
    
    
}


package raven.modelItem;

import javax.swing.Icon;

public class ModelItemNoti {

    /**
     * @return the notfication
     */
    public String getNotfication() {
        return notfication;
    }

    /**
     * @param notfication the notfication to set
     */
    public void setNotfication(String notfication) {
        this.notfication = notfication;
    }

    /**
     * @return the image
     */
    public Icon getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(Icon image) {
        this.image = image;
    }
    
    public ModelItemNoti(String notification, Icon image){
        this.notfication = notification;
        this.image = image;
        
    }
    
    private String notfication;
    private Icon image;
    
}

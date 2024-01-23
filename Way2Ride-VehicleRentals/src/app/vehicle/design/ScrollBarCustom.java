package app.vehicle.design;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;

/**
 *
 * @author shahi
 */
public class ScrollBarCustom extends JScrollBar {
    
    public ScrollBarCustom() {
        setUI(new ModernScrollBarUI());
        setPreferredSize(new Dimension(10, 10));
        setForeground(new Color(48, 144, 216));
        setBackground(Color.WHITE);
    }
}

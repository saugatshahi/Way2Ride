package app.vehicle.design;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class SearchTextField extends JTextField {
    
    private final int round = 10;

    public Icon getPrefixIcon() {
        return prefixIcon;
    }
    
    public int getRound() {
        return round;
    }

    public void setPrefixIcon(Icon prefixIcon) {
        this.prefixIcon = prefixIcon;
        initBorder();
    }

    public Icon getSuffixIcon() {
        return suffixIcon;
    }

    public void setSuffixIcon(Icon suffixIcon) {
        this.suffixIcon = suffixIcon;
        initBorder();
    }

    private Icon prefixIcon;
    private Icon suffixIcon;

    public SearchTextField() {
        setBorder(javax.swing.BorderFactory.createEmptyBorder(7, 5, 7, 5));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        paintIcon(g);
        //  paint border
        if (isFocusOwner()) {
            g.setColor(new Color(255, 92, 0));
            g.drawRect(0, 0, getWidth() - 1, getHeight() - 1);
            g.drawRect(1, 1, getWidth() - 3, getHeight() - 3);
        } else {
            g.setColor(new Color(255, 127, 62));
            g.drawRect(0, 0, getWidth() - 1, getHeight() - 1);
            g.drawRect(1, 1, getWidth() - 3, getHeight() - 3);
        }
    }

    private void paintIcon(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        if (prefixIcon != null) {
            int x = 14;
            Image prefix = ((ImageIcon) prefixIcon).getImage();
            int y = (getHeight() - prefixIcon.getIconHeight()) / 2;
            g2.drawImage(prefix, x, y, this);
        }
        if (suffixIcon != null) {
            Image suffix = ((ImageIcon) suffixIcon).getImage();
            int y = (getHeight() - suffixIcon.getIconHeight()) / 2;
            g2.drawImage(suffix, getWidth() - suffixIcon.getIconWidth() - 3, y, this);
        }
    }

    private void initBorder() {
        
        int left = 5;
        int right = 5;
        
        if (prefixIcon != null) {
            left = prefixIcon.getIconWidth() + 28;
        }
        if (suffixIcon != null) {
            right = suffixIcon.getIconWidth() + 5;
        }
        setBorder(javax.swing.BorderFactory.createEmptyBorder(7, left, 7, right));
    }
}
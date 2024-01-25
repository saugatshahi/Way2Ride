package app.vehicle.design;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class ShadowPanel extends JPanel {

    int shadowSize = 4;
    float shadowOpacity = 0.2f;
    private final Color shadowColor = Color.BLACK;
    
    private final PanelRound roundPanel;  // Instance of PanelRound

    public ShadowPanel() {
        setOpaque(false);
        roundPanel = new PanelRound();
        roundPanel.setBackground(shadowColor);
        roundPanel.setOpaque(false);
        roundPanel.setRoundTopLeft(20);
        roundPanel.setRoundTopRight(20);
        roundPanel.setRoundBottomLeft(20);
        roundPanel.setRoundBottomRight(20);
        roundPanel.setOpacity(0.8f); // Set the opacity as needed
    }

    // Getter and Setter for PanelRound properties
    public int getRoundTopLeft() {
        return roundPanel.getRoundTopLeft();
    }

    public void setRoundTopLeft(int roundTopLeft) {
        roundPanel.setRoundTopLeft(roundTopLeft);
    }

    public int getRoundTopRight() {
        return roundPanel.getRoundTopRight();
    }

    public void setRoundTopRight(int roundTopRight) {
        roundPanel.setRoundTopRight(roundTopRight);
    }

    public int getRoundBottomLeft() {
        return roundPanel.getRoundBottomLeft();
    }

    public void setRoundBottomLeft(int roundBottomLeft) {
        roundPanel.setRoundBottomLeft(roundBottomLeft);
    }

    public int getRoundBottomRight() {
        return roundPanel.getRoundBottomRight();
    }

    public void setRoundBottomRight(int roundBottomRight) {
        roundPanel.setRoundBottomRight(roundBottomRight);
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        createShadow(grphcs);
        super.paintComponent(grphcs);
    }

    private void createShadow(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        int size = shadowSize * 2;
        int x = 0;
        int y = 0;
        int width = getWidth() - size;
        int height = getHeight() - size;
        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = img.createGraphics();
        g.setBackground(roundPanel.getBackground());
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.fillRoundRect(0, 0, width, height, 10, 10);
        ShadowRenderer render = new ShadowRenderer(shadowSize, shadowOpacity, shadowColor);
        g2.drawImage(render.createShadow(img), 0, 0, null);
        g2.drawImage(img, x, y, null);
    }
}
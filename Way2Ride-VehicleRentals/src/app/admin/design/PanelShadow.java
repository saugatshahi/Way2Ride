package app.admin.design;

import app.vehicle.design.PanelRound;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;
import app.vehicle.design.ShadowRenderer;
import app.vehicle.design.WrapLayout;

public class PanelShadow extends JPanel {
    
    
    
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

    public ShadowType getShadowType() {
        return shadowType;
    }

    public void setShadowType(ShadowType shadowType) {
        this.shadowType = shadowType;
    }

    public int getShadowSize() {
        return shadowSize;
    }

    public void setShadowSize(int shadowSize) {
        this.shadowSize = shadowSize;
    }

    public float getShadowOpacity() {
        return shadowOpacity;
    }

    public void setShadowOpacity(float shadowOpacity) {
        this.shadowOpacity = shadowOpacity;
    }

    public Color getShadowColor() {
        return shadowColor;
    }

    public void setShadowColor(Color shadowColor) {
        this.shadowColor = shadowColor;
    }

    private BufferedImage renderImage;
    private ShadowType shadowType = ShadowType.CENTER;
    private int shadowSize = 6;
    private float shadowOpacity = 0.5f;
    private Color shadowColor = Color.BLACK;
    //  Gradient Option
    private GradientType gradientType = GradientType.HORIZONTAL;
    private Color colorGradient = new Color(255, 255, 255);
    private int radius;
    private final PanelRound roundPanel;

    public PanelShadow() {
        setOpaque(false);
        setBackground(Color.WHITE);
        setOpaque(false);
        roundPanel = new PanelRound();
        roundPanel.setBackground(shadowColor);
        roundPanel.setOpaque(false);
        roundPanel.setRoundTopLeft(20);
        roundPanel.setRoundTopRight(20);
        roundPanel.setRoundBottomLeft(20);
        roundPanel.setRoundBottomRight(20);
        roundPanel.setOpacity(0.8f);
        
         setLayout(new WrapLayout(WrapLayout.LEFT, 1, 1));
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        if (renderImage == null) {
            createRenderImage();
        }
        grphcs.drawImage(renderImage, 0, 0, null);
        super.paintComponent(grphcs);
    }

    @Override
    public void setBounds(int x, int y, int width, int height) {
        super.setBounds(x, y, width, height);
        createRenderImage();
    }

    private void createRenderImage() {
        renderImage = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = renderImage.createGraphics();
        int size = shadowSize * 2;
        int x;
        int y;
        int width = getWidth() - size;
        int height = getHeight() - size;
        if (null == shadowType) {
            x = shadowSize;
            y = shadowSize;
        } else switch (shadowType) {
            case TOP:
                x = shadowSize;
                y = size;
                break;
            case BOT:
                x = shadowSize;
                y = 0;
                break;
            case TOP_LEFT:
                x = size;
                y = size;
                break;
            case TOP_RIGHT:
                x = 0;
                y = size;
                break;
            case BOT_LEFT:
                x = size;
                y = 0;
                break;
            case BOT_RIGHT:
                x = 0;
                y = 0;
                break;
            default:
                x = shadowSize;
                y = shadowSize;
                break;
        }
        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = img.createGraphics();
        g.setBackground(roundPanel.getBackground());
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.fillRoundRect(0, 0, width, height, 10, 10);
        ShadowRenderer render = new ShadowRenderer(shadowSize, shadowOpacity, shadowColor);
        g2.drawImage(render.createShadow(img), 0, 0, null);
        g2.drawImage(img, x, y, null);
        g2.dispose();
    }
    
    public GradientType getGradientType() {
        return gradientType;
    }

    public void setGradientType(GradientType gradientType) {
        this.gradientType = gradientType;
        repaint();
    }

    public Color getColorGradient() {
        return colorGradient;
    }

    public void setColorGradient(Color colorGradient) {
        this.colorGradient = colorGradient;
        repaint();
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
        repaint();
    }

    public static enum GradientType {
        VERTICAL, HORIZONTAL, DIAGONAL_1, DIAGONAL_2
    }

    public static enum ShadowType {
        CENTER, TOP_RIGHT, TOP_LEFT, BOT_RIGHT, BOT_LEFT, BOT, TOP
    }
}
package app.admin.design;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Stroke;

/**
 *
 * @author shahi
 */
public class DottedPanel extends javax.swing.JPanel {

    public DottedPanel() {
        initComponents();
    }
     @Override
    protected void paintComponent(Graphics g) {
        
        int gap = 5;
        int arcWidth = 20;
        int arcHeight = 20;
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Set rendering hints for smoother drawing
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Set the stroke for dotted lines
        Stroke stroke = new BasicStroke(3, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 0, new float[]{5}, 0);
        g2d.setStroke(stroke);

        // Calculate the dimensions for the dotted rectangle with a gap from the panel's edge
        int x = gap;
        int y = gap;
        int width = getWidth() - 2 * gap;
        int height = getHeight() - 2 * gap;

        // Draw the rounded rectangle
        g2d.setColor(Color.decode("#FF5C00"));
        g2d.drawRoundRect(x, y, width, height, arcWidth, arcHeight);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

package app.admin.menu;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import javaswingdev.GoogleMaterialDesignIcon;
import javaswingdev.GoogleMaterialIcon;
import javaswingdev.GradientType;

public class Card extends javax.swing.JPanel {

    private GoogleMaterialDesignIcon icon;

    public Card() {
        initComponents();
        init();
    }

    private void init() {
        setOpaque(false);
        setBackground(Color.WHITE);
        setIcon(GoogleMaterialDesignIcon.AUTORENEW);
    }

    public void setIcon(GoogleMaterialDesignIcon icon) {
        this.icon = icon;
        lbIcon.setIcon(new GoogleMaterialIcon(icon, GradientType.DIAGONAL_1, new Color(191, 191, 191), Color.WHITE, 32).toIcon());
    }

    public GoogleMaterialDesignIcon getIcon() {
        return icon;
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        Area area = new Area(new RoundRectangle2D.Double(0, 20, getWidth(), getHeight() - 20, 10, 10));
        g2.setColor(getBackground());
        g2.fill(area);
        area.subtract(new Area(new Rectangle2D.Double(0, 20, getWidth(), getHeight() - 23)));
        g2.setPaint(new GradientPaint(0, 0, lbIcon.getColor1(), getWidth(), 0, lbIcon.getColor2()));
        g2.fill(area);
        g2.dispose();
        super.paintComponent(g);
    }

    public Color getColor1() {
        return lbIcon.getColor1();
    }

    public void setColor1(Color color1) {
        lbIcon.setColor1(color1);
    }

    public Color getColor2() {
        return lbIcon.getColor2();
    }

    public void setColor2(Color color2) {
        lbIcon.setColor2(color2);
    }

    public void setDescription(String description) {
        lbDescription.setText(description);
    }

    public String getDescription() {
        return lbDescription.getText();
    }

    public void setValues(String values) {
        lbValues.setText(values);
    }

    public String getValues() {
        return lbValues.getText();
    }

    public void setData(ModelCard data) {
        lbValues.setText(data.getValues());
        lbDescription.setText(data.getDescription());
        if (data.getColor1() != null) {
            setColor1(data.getColor1());
        }
        if (data.getColor2() != null) {
            setColor2(data.getColor2());
        }
        if (data.getIcon() != null) {
            setIcon(data.getIcon());
        }
        repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbValues = new javax.swing.JLabel();
        lbDescription = new javax.swing.JLabel();
        lbIcon = new app.admin.menu.LabelIcon();

        lbValues.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        lbValues.setForeground(new java.awt.Color(128, 128, 128));
        lbValues.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbValues.setText("$ 0.00");

        lbDescription.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        lbDescription.setForeground(new java.awt.Color(153, 153, 153));
        lbDescription.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbDescription.setText("Report Income Monthly");

        lbIcon.setText("labelIcon1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(lbValues, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addComponent(lbValues, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbDescription)
                .addGap(56, 56, 56))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbDescription;
    private app.admin.menu.LabelIcon lbIcon;
    private javax.swing.JLabel lbValues;
    // End of variables declaration//GEN-END:variables
}

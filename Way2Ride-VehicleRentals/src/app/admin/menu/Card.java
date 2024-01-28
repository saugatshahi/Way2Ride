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
    private double overallTotalAmount;
      private int numberOfUsers;
    public Card() {
        initComponents();
        init();
    }

    private void init() {
        setOpaque(false);
        setBackground(Color.WHITE);
      
        setOverallTotalAmount(0.0);
    }

  
    public void setOverallTotalAmount(double overallTotalAmount) {
        this.overallTotalAmount = overallTotalAmount;
        // Assuming lbValues is the JLabel where you want to display the overall total amount
        lbValues.setText(String.format("$ %.2f", overallTotalAmount));
    }
    public double getOverallTotalAmount() {
        return overallTotalAmount;
    }
     public void setNumberOfUsers(int numberOfUsers) {
        this.numberOfUsers = numberOfUsers;
        // Assuming lbDescription is the JLabel where you want to display the number of users
        lbValues.setText("" + numberOfUsers);
        lbDescription.setText("Number of Users");
    }
      public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public GoogleMaterialDesignIcon getIcon() {
        return icon;
    }

//    @Override
//    protected void paintComponent(Graphics g) {
//        Graphics2D g2 = (Graphics2D) g.create();
//        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//        Area area = new Area(new RoundRectangle2D.Double(0, 20, getWidth(), getHeight() - 20, 10, 10));
//        g2.setColor(getBackground());
//        g2.fill(area);
//        area.subtract(new Area(new Rectangle2D.Double(0, 20, getWidth(), getHeight() - 23)));
//        g2.setPaint(new GradientPaint(0, 0, Color.white, getWidth(), 0, c));
//        g2.fill(area);
//        g2.dispose();
//        super.paintComponent(g);
//    }

  

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
        
        
        repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbValues = new javax.swing.JLabel();
        lbDescription = new javax.swing.JLabel();

        lbValues.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        lbValues.setForeground(new java.awt.Color(128, 128, 128));
        lbValues.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbValues.setText("$ 0.00");

        lbDescription.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        lbDescription.setForeground(new java.awt.Color(153, 153, 153));
        lbDescription.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbDescription.setText("Report Income Monthly");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                .addGap(14, 14, 14))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lbValues, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(lbValues, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbDescription)
                .addGap(50, 50, 50))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbDescription;
    private javax.swing.JLabel lbValues;
    // End of variables declaration//GEN-END:variables
}

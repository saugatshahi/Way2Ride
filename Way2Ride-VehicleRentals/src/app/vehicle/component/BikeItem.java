
package app.vehicle.component;

import app.vehicle.form.PaymentGateway;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import raven.toast.Notifications;


public class BikeItem extends javax.swing.JPanel {
    public JDialog paymentDialog;
    public PaymentGateway paymentGatewayPanel;

    public BikeItem(String bikeName, String brand, String power, String speed, String price, byte[] bikeImage) {
           initComponents();
           
          bikePriceField.setText(price);
          bikeNameField.setText(bikeName);
          speedField.setText(speed);
          brandField.setText(brand);
          powerField.setText(power);
          
          if (bikeImage != null) {
              ImageIcon img = new ImageIcon(bikeImage);
              imgHolder.setImage(img);
          } else {
              Notifications.getInstance().show(Notifications.Type.ERROR, "Image can't be fetched!");
          }
          
          paymentGatewayPanel = new PaymentGateway(brand, price, bikeImage);
          
        paymentDialog = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), "Payment Details", true);
        paymentDialog.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
        paymentDialog.getContentPane().add(paymentGatewayPanel);
        paymentDialog.pack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imgHolder = new app.vehicle.design.PictureBox();
        bikeNameField = new javax.swing.JLabel();
        bikePriceField = new javax.swing.JLabel();
        rateLabel = new javax.swing.JLabel();
        powerLabel = new javax.swing.JLabel();
        speedLabel = new javax.swing.JLabel();
        brandLabel = new javax.swing.JLabel();
        powerField = new javax.swing.JLabel();
        speedField = new javax.swing.JLabel();
        brandField = new javax.swing.JLabel();
        rsvBtn = new javax.swing.JButton();

        imgHolder.setImage(new javax.swing.ImageIcon(getClass().getResource("/app/vehicle/component/image-removebg-preview.png"))); // NOI18N

        bikeNameField.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        bikeNameField.setText("Street Fighter Two");

        bikePriceField.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        bikePriceField.setText("NRs. 800");

        rateLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        rateLabel.setForeground(new java.awt.Color(102, 102, 102));
        rateLabel.setText("/Day");

        powerLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 11)); // NOI18N
        powerLabel.setForeground(new java.awt.Color(102, 102, 102));
        powerLabel.setText("POWER");

        speedLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 11)); // NOI18N
        speedLabel.setForeground(new java.awt.Color(102, 102, 102));
        speedLabel.setText("SPEED");

        brandLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 11)); // NOI18N
        brandLabel.setForeground(new java.awt.Color(102, 102, 102));
        brandLabel.setText("BRAND");

        powerField.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        powerField.setText("1000 CC");

        speedField.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        speedField.setText("80 Km/hr");

        brandField.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        brandField.setText("Ducati");

        rsvBtn.setBackground(new java.awt.Color(255, 92, 0));
        rsvBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        rsvBtn.setForeground(new java.awt.Color(255, 255, 255));
        rsvBtn.setText("RESERVE");
        rsvBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rsvBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rateLabel)
                    .addComponent(bikeNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(imgHolder, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(powerLabel)
                                    .addComponent(powerField))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(speedLabel)
                                    .addComponent(speedField))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(brandLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(brandField, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(31, 31, 31))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bikePriceField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rsvBtn)
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(bikeNameField)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bikePriceField)
                    .addComponent(rsvBtn))
                .addGap(3, 3, 3)
                .addComponent(rateLabel)
                .addGap(12, 12, 12)
                .addComponent(imgHolder, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(speedLabel)
                    .addComponent(brandLabel)
                    .addComponent(powerLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(powerField)
                    .addComponent(speedField)
                    .addComponent(brandField))
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rsvBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsvBtnActionPerformed
        showPaymentDialog();
    }//GEN-LAST:event_rsvBtnActionPerformed
 private void showPaymentDialog() {
        int centerX = (int) (this.getTopLevelAncestor().getLocationOnScreen().getX() + this.getTopLevelAncestor().getSize().getWidth() / 2 - paymentDialog.getWidth() / 2);
        int centerY = (int) (this.getTopLevelAncestor().getLocationOnScreen().getY() + this.getTopLevelAncestor().getSize().getHeight() / 2 - paymentDialog.getHeight() / 2);

        paymentDialog.setLocation(centerX, centerY);
        
        paymentDialog.setVisible(true);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bikeNameField;
    private javax.swing.JLabel bikePriceField;
    private javax.swing.JLabel brandField;
    private javax.swing.JLabel brandLabel;
    private app.vehicle.design.PictureBox imgHolder;
    private javax.swing.JLabel powerField;
    private javax.swing.JLabel powerLabel;
    private javax.swing.JLabel rateLabel;
    private javax.swing.JButton rsvBtn;
    private javax.swing.JLabel speedField;
    private javax.swing.JLabel speedLabel;
    // End of variables declaration//GEN-END:variables
}

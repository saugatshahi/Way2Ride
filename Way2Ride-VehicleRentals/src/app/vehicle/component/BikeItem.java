
package app.vehicle.component;

import app.vehicle.form.PaymentGateway;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class BikeItem extends javax.swing.JPanel {
    public JDialog paymentDialog;
    public PaymentGateway paymentGatewayPanel;

    public BikeItem() {
           initComponents();
//         bcarCategory.setText(category);
//        bcarFeatures.setText(features);
//        bcarMilage.setText(limitations);
//        bcarPrice.setText(price);
//        bcarSeats.setText(quantity);
//        bcarName.setText(brand);
//        
//        if (bikeImage != null) {
//            picture.setImage(byteArrayToImageIcon(carImage,150,100));
//        }
//        
//        paymentGatewayPanel = new PaymentGateway();

        paymentDialog = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), "Payment Details", true);
        paymentDialog.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
        paymentDialog.getContentPane().add(paymentGatewayPanel);
        paymentDialog.pack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        picture = new app.vehicle.design.PictureBox();
        bcarType = new javax.swing.JLabel();
        bcarName = new javax.swing.JLabel();
        bcarFeatures = new javax.swing.JLabel();
        pictureBox4 = new app.vehicle.design.PictureBox();
        pictureBox1 = new app.vehicle.design.PictureBox();
        bcarCategory = new javax.swing.JLabel();
        bcarSeats = new javax.swing.JLabel();
        pictureBox2 = new app.vehicle.design.PictureBox();
        bcarMilage = new javax.swing.JLabel();
        bcarPrice = new javax.swing.JLabel();
        breserveDetails = new javax.swing.JButton();

        picture.setImage(new javax.swing.ImageIcon(getClass().getResource("/app/dashboard/png/Vector (5).png"))); // NOI18N

        bcarType.setText("Sports");

        bcarName.setText("R15");

        bcarFeatures.setText("Features");

        pictureBox4.setImage(new javax.swing.ImageIcon(getClass().getResource("/app/dashboard/png/Group.png"))); // NOI18N

        pictureBox1.setImage(new javax.swing.ImageIcon(getClass().getResource("/app/vehicle/logo/Vector (5).png"))); // NOI18N

        bcarCategory.setText("Electric");

        bcarSeats.setText("5");

        pictureBox2.setImage(new javax.swing.ImageIcon(getClass().getResource("/app/vehicle/logo/Clip path group.png"))); // NOI18N

        bcarMilage.setText("Unlimited Milage");

        bcarPrice.setText("NRs. 17,000");

        breserveDetails.setBackground(new java.awt.Color(255, 102, 0));
        breserveDetails.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        breserveDetails.setForeground(new java.awt.Color(255, 255, 255));
        breserveDetails.setText("Reserve Deal");
        breserveDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                breserveDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bcarName)
                    .addComponent(bcarType, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bcarFeatures)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pictureBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bcarMilage))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(11, 11, 11)
                            .addComponent(bcarPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(breserveDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(pictureBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(bcarSeats)
                            .addGap(48, 48, 48)
                            .addComponent(pictureBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(bcarCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(picture, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(picture, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bcarType)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bcarName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bcarFeatures)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pictureBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bcarSeats)
                    .addComponent(pictureBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bcarCategory))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pictureBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bcarPrice)
                            .addComponent(breserveDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(bcarMilage))
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void breserveDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_breserveDetailsActionPerformed
        // TODO add your handling code here:
        showPaymentDialog();

        
    }//GEN-LAST:event_breserveDetailsActionPerformed
 private void showPaymentDialog() {
        int centerX = (int) (this.getTopLevelAncestor().getLocationOnScreen().getX() + this.getTopLevelAncestor().getSize().getWidth() / 2 - paymentDialog.getWidth() / 2);
        int centerY = (int) (this.getTopLevelAncestor().getLocationOnScreen().getY() + this.getTopLevelAncestor().getSize().getHeight() / 2 - paymentDialog.getHeight() / 2);

        paymentDialog.setLocation(centerX, centerY);
        
        paymentDialog.setVisible(true);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bcarCategory;
    private javax.swing.JLabel bcarFeatures;
    private javax.swing.JLabel bcarMilage;
    private javax.swing.JLabel bcarName;
    private javax.swing.JLabel bcarPrice;
    private javax.swing.JLabel bcarSeats;
    private javax.swing.JLabel bcarType;
    private javax.swing.JButton breserveDetails;
    private app.vehicle.design.PictureBox picture;
    private app.vehicle.design.PictureBox pictureBox1;
    private app.vehicle.design.PictureBox pictureBox2;
    private app.vehicle.design.PictureBox pictureBox4;
    // End of variables declaration//GEN-END:variables
}


package app.vehicle.component;

//import app.vehicle.form.CarDetails;
import app.vehicle.form.PaymentGateway;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.RenderingHints;
import java.io.IOException;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import app.vehicle.modelItem.ModelItem;



public class CarItem extends javax.swing.JPanel {
    private PaymentGateway paymentGatewayPanel;
    private JDialog paymentDialog;
    
//    private CarDetails carDetailsPanel;
    private JDialog carDetailsDialog;

    /**
     * @return the selected
     */
    public boolean isSelected() {
        return selected;
    }

    /**
     * @param selected the selected to set
     */
    public void setSelected(boolean selected) {
        this.selected = selected;
        repaint();
    }
    
    
    
    private boolean selected;
    public CarItem() {
        initComponents();
        paymentGatewayPanel = new PaymentGateway();

        // Create the dialog to hold the PaymentGateway panel
        paymentDialog = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), "Payment Details", true);
        paymentDialog.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
        paymentDialog.getContentPane().add(paymentGatewayPanel);
        paymentDialog.pack();
        
        
//        carDetailsPanel = new CarDetails();
//        carDetailsDialog = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), "Car Details", true);
//        carDetailsDialog.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
//        carDetailsDialog.getContentPane().add(carDetailsPanel);
//        carDetailsDialog.pack();
//        
        
        
        String fontFilePath = "/app/vehicle/font/Khula-SemiBold.ttf";
        try {
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream(fontFilePath));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(customFont);
            
            Font sizedFont = customFont.deriveFont(Font.BOLD,(float) 14);
            lbcarType.setFont(sizedFont);
            lbcarFeatures.setFont(sizedFont);
            Font sizedFont2 = customFont.deriveFont(Font.PLAIN,(float) 14);
            lbcarName.setFont(sizedFont2);
            lbcarSeats.setFont(sizedFont2);
            lbcarMilage.setFont(sizedFont2);
            lbcarCategory.setFont(sizedFont2);
            Font sizedFont3 = customFont.deriveFont(Font.BOLD,(float) 16);
            lbcarPrice.setFont(sizedFont3);
//            lbreserveDetails.setFont(sizedFont3);
        } catch (IOException | FontFormatException e) {
            System.out.println(e);
        }
        setOpaque(false);
    }
    private ModelItem data;
    public void setData(ModelItem data){
        this.data = data;

        pic.setImage(data.getImage1());
        lbcarType.setText(data.getCarType());
        lbcarCategory.setText(data.getCarCategory());
        lbcarFeatures.setText(data.getCarFeatures());
        lbcarMilage.setText(data.getCarMilage());
        lbcarPrice.setText(data.getCarPrice());
        lbcarSeats.setText(data.getCarSeats());
        lbcarName.setText(data.getCarName());
        
        
        
        
        
    }

    @Override
  public void paint(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        g2.setColor(new Color(242,242,242));
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
        if (selected){
            g2.setColor( new Color(94,156,255));
            g2.drawRoundRect(0,0 , getWidth()-1, getHeight()-1, 20, 20);
        }
        g2.dispose();
        super.paint(grphcs);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbcarType = new javax.swing.JLabel();
        lbcarName = new javax.swing.JLabel();
        lbcarFeatures = new javax.swing.JLabel();
        lbcarSeats = new javax.swing.JLabel();
        lbcarCategory = new javax.swing.JLabel();
        lbcarMilage = new javax.swing.JLabel();
        lbcarPrice = new javax.swing.JLabel();
        lbreserveDetails = new javax.swing.JButton();
        pic = new app.vehicle.design.PictureBox();
        pictureBox1 = new app.vehicle.design.PictureBox();
        pictureBox2 = new app.vehicle.design.PictureBox();
        pictureBox4 = new app.vehicle.design.PictureBox();

        setBackground(new java.awt.Color(255, 255, 255));
        setOpaque(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        lbcarType.setText("Luxury");

        lbcarName.setText("Pagani");

        lbcarFeatures.setText("Features");

        lbcarSeats.setText("5");

        lbcarCategory.setText("Electric");

        lbcarMilage.setText("Unlimited Milage");

        lbcarPrice.setText("NRs. 17,000");

        lbreserveDetails.setBackground(new java.awt.Color(255, 102, 0));
        lbreserveDetails.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbreserveDetails.setForeground(new java.awt.Color(255, 255, 255));
        lbreserveDetails.setText("Reserve Deal");
        lbreserveDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbreserveDetailsActionPerformed(evt);
            }
        });

        pic.setImage(new javax.swing.ImageIcon(getClass().getResource("/app/dashboard/png/Vector (5).png"))); // NOI18N

        pictureBox1.setImage(new javax.swing.ImageIcon(getClass().getResource("/app/vehicle/logo/UserIcon.png"))); // NOI18N

        pictureBox2.setImage(new javax.swing.ImageIcon(getClass().getResource("/app/vehicle/logo/UserIcon.png"))); // NOI18N

        pictureBox4.setFocusable(false);
        pictureBox4.setImage(new javax.swing.ImageIcon(getClass().getResource("/app/dashboard/png/Clip path group.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lbcarPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31)
                .addComponent(lbreserveDetails)
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(pictureBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pictureBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbcarSeats)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pictureBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbcarCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbcarMilage)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbcarType, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbcarName)
                    .addComponent(lbcarFeatures))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lbcarType)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbcarName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbcarFeatures)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pictureBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbcarSeats)
                                .addComponent(pictureBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbcarCategory, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pictureBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbcarMilage))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbreserveDetails)
                    .addComponent(lbcarPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lbreserveDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbreserveDetailsActionPerformed
        // TODO add your handling code here:
        
                showPaymentDialog();
    }//GEN-LAST:event_lbreserveDetailsActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        showCarDetailsDialog();
    }//GEN-LAST:event_formMouseClicked
 private void showPaymentDialog() {
       int centerX = (int) (this.getTopLevelAncestor().getLocationOnScreen().getX() + this.getTopLevelAncestor().getSize().getWidth() / 2 - paymentDialog.getWidth() / 2);
        int centerY = (int) (this.getTopLevelAncestor().getLocationOnScreen().getY() + this.getTopLevelAncestor().getSize().getHeight() / 2 - paymentDialog.getHeight() / 2);

        // Set the location of the dialog
        paymentDialog.setLocation(centerX, centerY);


        paymentDialog.setVisible(true);
    }
         private void showCarDetailsDialog() {
       int centerX = (int) (this.getTopLevelAncestor().getLocationOnScreen().getX() + this.getTopLevelAncestor().getSize().getWidth() / 2 - paymentDialog.getWidth() / 2);
        int centerY = (int) (this.getTopLevelAncestor().getLocationOnScreen().getY() + this.getTopLevelAncestor().getSize().getHeight() / 2 - paymentDialog.getHeight() / 2);

        // Set the location of the dialog
        carDetailsDialog.setLocation(centerX, centerY);

        // Make the dialog visible
        carDetailsDialog.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbcarCategory;
    private javax.swing.JLabel lbcarFeatures;
    private javax.swing.JLabel lbcarMilage;
    private javax.swing.JLabel lbcarName;
    private javax.swing.JLabel lbcarPrice;
    private javax.swing.JLabel lbcarSeats;
    private javax.swing.JLabel lbcarType;
    private javax.swing.JButton lbreserveDetails;
    private app.vehicle.design.PictureBox pic;
    private app.vehicle.design.PictureBox pictureBox1;
    private app.vehicle.design.PictureBox pictureBox2;
    private app.vehicle.design.PictureBox pictureBox4;
    // End of variables declaration//GEN-END:variables
}

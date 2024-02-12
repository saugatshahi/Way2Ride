package app.vehicle.controller;

import app.vehicle.dao.BillingDAO;
import app.vehicle.design.PanelItem;
import java.awt.Container;
import javax.swing.ImageIcon;
import raven.toast.Notifications;


public class BillingItem extends javax.swing.JPanel {

    public BillingItem(String orderId, byte[] vehicleImg, String nameOfVehicle, String dateTrans) {
        initComponents();
        
        orderID.setText(orderId);
        
        if (vehicleImg != null) {
            ImageIcon newImage = new ImageIcon(vehicleImg);
            pictureBox1.setImage(newImage);
        }
        
        vehicleName.setText(nameOfVehicle);
        date.setText(dateTrans);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelShadow1 = new app.admin.design.PanelShadow();
        vehicleName = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        orderID = new javax.swing.JLabel();
        cancelOrder = new javax.swing.JButton();
        pictureBox1 = new app.vehicle.design.PictureBox();

        vehicleName.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        vehicleName.setForeground(new java.awt.Color(102, 102, 102));
        vehicleName.setText("Mercedes-Benz GLE-Class");

        date.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        date.setForeground(new java.awt.Color(102, 102, 102));
        date.setText("2023-12-27");

        orderID.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        orderID.setForeground(new java.awt.Color(102, 102, 102));
        orderID.setText("#01231234");

        cancelOrder.setBackground(new java.awt.Color(255, 92, 0));
        cancelOrder.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        cancelOrder.setForeground(new java.awt.Color(255, 255, 255));
        cancelOrder.setText("Cancel Order");
        cancelOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelOrderActionPerformed(evt);
            }
        });

        pictureBox1.setImage(new javax.swing.ImageIcon(getClass().getResource("/app/dashboard/png/buggati1.png"))); // NOI18N

        javax.swing.GroupLayout panelShadow1Layout = new javax.swing.GroupLayout(panelShadow1);
        panelShadow1.setLayout(panelShadow1Layout);
        panelShadow1Layout.setHorizontalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(orderID)
                .addGap(34, 34, 34)
                .addComponent(pictureBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(vehicleName, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(cancelOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        panelShadow1Layout.setVerticalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelShadow1Layout.createSequentialGroup()
                        .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelShadow1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(orderID, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelShadow1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(vehicleName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cancelOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 28, Short.MAX_VALUE))
                    .addComponent(pictureBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cancelOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelOrderActionPerformed
        Container parentContainer = getParent();
        if (parentContainer instanceof PanelItem) {
            PanelItem panelItem = (PanelItem) parentContainer;
            panelItem.remove(this);
            panelItem.repaint();
            panelItem.revalidate();
        }
        
        String brand =  vehicleName.getText();
        
        String orderIDString = orderID.getText();
        
        BillingDAO billingDAO = new BillingDAO();
        
        boolean check = billingDAO.deleteHistory(orderIDString);
                
        if (check) {
            Notifications.getInstance().show(Notifications.Type.SUCCESS, "Your order has been cancelled!");
        }
        else {
            Notifications.getInstance().show(Notifications.Type.ERROR, "Sorry for the inconvenience!");
        }
    }//GEN-LAST:event_cancelOrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelOrder;
    private javax.swing.JLabel date;
    private javax.swing.JLabel orderID;
    private app.admin.design.PanelShadow panelShadow1;
    private app.vehicle.design.PictureBox pictureBox1;
    private javax.swing.JLabel vehicleName;
    // End of variables declaration//GEN-END:variables
}

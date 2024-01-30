package app.admin.form;

import app.vehicle.dao.CategoryDAO;
import app.vehicle.design.PanelItem;
import java.awt.Container;
import javax.swing.ImageIcon;
import raven.toast.Notifications;

/**
 *
 * @author shahi
 */
public class AdminCarCategory extends javax.swing.JPanel {

    public AdminCarCategory(String brand, String price, byte[] carImage) {
        initComponents();
        
       
        
        vehicleName.setText(brand);
        priceField.setText(price);
        
        if (carImage != null) {
            ImageIcon imageIcon = new ImageIcon(carImage);
            carImageHolder.setImage(imageIcon);
        }  
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelShadow1 = new app.admin.design.PanelShadow();
        availability = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        priceField = new javax.swing.JLabel();
        dltButton = new javax.swing.JButton();
        carImageHolder = new app.vehicle.design.PictureBox();
        jLabel1 = new javax.swing.JLabel();
        vehicleName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        availability.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        availability.setText("Availability");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Price: ");

        priceField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        priceField.setText("NRs. 45000");

        dltButton.setBackground(new java.awt.Color(255, 92, 0));
        dltButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/admin/logo/delete.png"))); // NOI18N
        dltButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dltButtonActionPerformed(evt);
            }
        });

        carImageHolder.setImage(new javax.swing.ImageIcon(getClass().getResource("/app/dashboard/png/Vector (5).png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Vehicle");

        vehicleName.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        vehicleName.setText("Mercedes Benz");

        jLabel2.setText("a");

        javax.swing.GroupLayout panelShadow1Layout = new javax.swing.GroupLayout(panelShadow1);
        panelShadow1.setLayout(panelShadow1Layout);
        panelShadow1Layout.setHorizontalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelShadow1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(availability)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelShadow1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(carImageHolder, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelShadow1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(priceField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(dltButton)
                        .addGap(23, 23, 23))
                    .addGroup(panelShadow1Layout.createSequentialGroup()
                        .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vehicleName)
                            .addComponent(jLabel1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelShadow1Layout.setVerticalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow1Layout.createSequentialGroup()
                .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelShadow1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(carImageHolder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(availability)
                            .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(priceField)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelShadow1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vehicleName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(dltButton)))
                .addGap(20, 20, 20))
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

    private void dltButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dltButtonActionPerformed
        Container parentContainer = getParent();
        if (parentContainer instanceof PanelItem) {
            PanelItem panelItem = (PanelItem) parentContainer;
            panelItem.remove(this);
            panelItem.repaint();
            panelItem.revalidate();
        }
        
        String brand =  vehicleName.getText();
        CategoryDAO delCatDAO = new CategoryDAO();
        
        boolean check = delCatDAO.deleteCategoryByBrand(brand);
        
        if (check) {
            Notifications.getInstance().show(Notifications.Type.SUCCESS, "Vehicle Deleted!");
        }
    }//GEN-LAST:event_dltButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel availability;
    private app.vehicle.design.PictureBox carImageHolder;
    private javax.swing.JButton dltButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private app.admin.design.PanelShadow panelShadow1;
    private javax.swing.JLabel priceField;
    private javax.swing.JLabel vehicleName;
    // End of variables declaration//GEN-END:variables
}

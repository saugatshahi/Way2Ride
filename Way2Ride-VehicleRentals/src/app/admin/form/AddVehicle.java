/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package app.admin.form;

import app.vehicle.authentication.RegisterDocument;
import app.vehicle.dao.CategoryDAO;
import app.vehicle.model.CategoryModel;
import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import raven.toast.Notifications;

public class AddVehicle extends javax.swing.JPanel {
    
    private File selectedFile;
    private byte[] imageData;

    public AddVehicle() {
        setSize(new Dimension(1101, 747));
        initComponents();
    }
    
    public byte[] getSelectedFile() {
        return imageData;
    }
    
    public String getCategoryField() {
        return categoryField.getText();
    }
    
    public String getVehicleNameField() {
        return vehicleNameField.getText();
    }
    
    public String getAccelerationField() {
        return accelerationField.getText();
    }
    
    public String getSpeedField() {
        return speedField.getText();
    }
    
    public String getModelYearField() {
        return modelYearField.getText();
    }
    
    public String getPriceField() {
        return priceField.getText();
    }
    
    public String getSeatsField() {
        return seatsField.getText();
    }
    
    public String getMileageField() {
        return mileageField.getText();
    }
    
    public String getVehicleTypeField() {
        return vehicleTypeField.getText();
    }
    
    public String getPowerField() {
        return powerField.getText();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelShadow2 = new app.admin.design.PanelShadow();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        categoryField = new javax.swing.JTextField();
        vehicleNameField = new javax.swing.JTextField();
        vehicleTypeField = new javax.swing.JTextField();
        mileageField = new javax.swing.JTextField();
        seatsField = new javax.swing.JTextField();
        priceField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        speedField = new javax.swing.JTextField();
        accelerationField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        modelYearField = new javax.swing.JTextField();
        powerField = new javax.swing.JTextField();
        dottedPanel1 = new app.admin.design.DottedPanel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        panelShadow2.setShadowColor(new java.awt.Color(94, 94, 94));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Vehicle Category");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Vehicle Name");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Vehicle Type");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Vehicle Mileage");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("Total Available Seats");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setText("Set Price");

        categoryField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        vehicleNameField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        vehicleTypeField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        mileageField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        mileageField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mileageFieldActionPerformed(evt);
            }
        });

        seatsField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        priceField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jButton1.setBackground(new java.awt.Color(255, 92, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Save Changes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setText("Max Speed");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setText("Acceleration");

        speedField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        accelerationField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel11.setText("Model Year");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel12.setText("Max Power");

        modelYearField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        powerField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        dottedPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton2.setBackground(new java.awt.Color(255, 92, 0));
        jButton2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Upload");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/admin/logo/Vector (6).png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Supported File .jpg, .png, .jpeg");

        javax.swing.GroupLayout dottedPanel1Layout = new javax.swing.GroupLayout(dottedPanel1);
        dottedPanel1.setLayout(dottedPanel1Layout);
        dottedPanel1Layout.setHorizontalGroup(
            dottedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dottedPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dottedPanel1Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(dottedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dottedPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dottedPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(54, 54, 54))))
        );
        dottedPanel1Layout.setVerticalGroup(
            dottedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dottedPanel1Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        jLabel1.setText("Add Vehicle");

        javax.swing.GroupLayout panelShadow2Layout = new javax.swing.GroupLayout(panelShadow2);
        panelShadow2.setLayout(panelShadow2Layout);
        panelShadow2Layout.setHorizontalGroup(
            panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(categoryField, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(vehicleNameField)
                    .addComponent(jLabel5)
                    .addComponent(vehicleTypeField)
                    .addComponent(jLabel6)
                    .addComponent(mileageField)
                    .addComponent(jLabel1))
                .addGap(26, 26, 26)
                .addGroup(panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelShadow2Layout.createSequentialGroup()
                        .addGroup(panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(modelYearField, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(speedField, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(powerField, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(accelerationField, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(12, 12, 12))
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addGroup(panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(priceField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                        .addComponent(seatsField, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(18, 18, 18)
                .addComponent(dottedPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(panelShadow2Layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelShadow2Layout.setVerticalGroup(
            panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(61, 61, 61)
                .addGroup(panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelShadow2Layout.createSequentialGroup()
                        .addComponent(dottedPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelShadow2Layout.createSequentialGroup()
                        .addGroup(panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(seatsField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(categoryField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vehicleNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vehicleTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(speedField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(accelerationField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(12, 12, 12)))
                .addGroup(panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mileageField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modelYearField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(powerField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelShadow2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelShadow2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void mileageFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mileageFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mileageFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CategoryDAO categoryDAO = new CategoryDAO();
        
        CategoryModel modelCategory = new CategoryModel(
                getCategoryField(),
                getVehicleNameField(),
                getPowerField(),
                getMileageField(),
                getPriceField(),
                getSeatsField(),
                getSelectedFile()
        );
        
        boolean check = categoryDAO.saveCategory(modelCategory);
        
        if (check) {
            Notifications.getInstance().show(Notifications.Type.INFO, "Vehicle Added!");
        } else {
            Notifications.getInstance().show(Notifications.Type.INFO, "Process Failed!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        
        FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("Image files", "png", "jpeg", "jpg", "gif");
        fileChooser.setFileFilter(imageFilter);
        
        int result = fileChooser.showOpenDialog(this);
        
        if (result == JFileChooser.APPROVE_OPTION) {
            selectedFile = fileChooser.getSelectedFile();
            String imageName = selectedFile.getName();
            if (imageFilter.accept(selectedFile)) {
                if (imageName != null) {
                    try {
                       imageData = Files.readAllBytes(selectedFile.toPath());
                    } catch (IOException ex) {
                        Logger.getLogger(RegisterDocument.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "Invalid Image Format!");
                } 
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accelerationField;
    private javax.swing.JTextField categoryField;
    private app.admin.design.DottedPanel dottedPanel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField mileageField;
    private javax.swing.JTextField modelYearField;
    private app.admin.design.PanelShadow panelShadow2;
    private javax.swing.JTextField powerField;
    private javax.swing.JTextField priceField;
    private javax.swing.JTextField seatsField;
    private javax.swing.JTextField speedField;
    private javax.swing.JTextField vehicleNameField;
    private javax.swing.JTextField vehicleTypeField;
    // End of variables declaration//GEN-END:variables
}

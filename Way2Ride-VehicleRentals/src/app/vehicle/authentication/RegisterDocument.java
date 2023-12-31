package app.vehicle.authentication;

import app.vehicle.main.Application;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import raven.toast.Notifications;

/**
 *
 * @author shahi
 */
public class RegisterDocument extends javax.swing.JPanel {
    
    private File selectedFile;
    public RegisterDocument() {
        initComponents();
    }
    
    public String getLicenseNumber() {
        return this.licenseNumber.getText();
    }
    
    public String getDateOfIssue() {
        return this.dateOfIssue.getText();
    }
    
    public String getDateOfExpiry() {
        return this.dateOfExpiry.getText();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pictureBox1 = new app.vehicle.design.PictureBox();
        panelRound1 = new app.vehicle.design.PanelRound();
        pictureBox2 = new app.vehicle.design.PictureBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dateOfExpiry = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        licenseNumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dateOfIssue = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        pictureBox1.setImage(new javax.swing.ImageIcon(getClass().getResource("/app/vehicle/logo/SignupBackground.png"))); // NOI18N

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 92, 0), 2, true));

        pictureBox2.setImage(new javax.swing.ImageIcon(getClass().getResource("/app/vehicle/logo/upload.png"))); // NOI18N
        pictureBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pictureBox2MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 92, 0));
        jLabel9.setText("Upload licensing");
        pictureBox2.add(jLabel9);
        jLabel9.setBounds(76, 130, 120, 20);

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pictureBox2, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pictureBox2, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
        );

        pictureBox1.add(panelRound1);
        panelRound1.setBounds(670, 360, 260, 180);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 92, 0));
        jLabel1.setText("Upload your license here!");
        pictureBox1.add(jLabel1);
        jLabel1.setBounds(850, 60, 270, 50);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Date of Expiry");
        pictureBox1.add(jLabel2);
        jLabel2.setBounds(970, 530, 120, 22);
        pictureBox1.add(dateOfExpiry);
        dateOfExpiry.setBounds(970, 560, 270, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("License Number");
        pictureBox1.add(jLabel3);
        jLabel3.setBounds(970, 350, 120, 22);
        pictureBox1.add(licenseNumber);
        licenseNumber.setBounds(970, 380, 270, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Date of Issue");
        pictureBox1.add(jLabel4);
        jLabel4.setBounds(970, 440, 120, 22);
        pictureBox1.add(dateOfIssue);
        dateOfIssue.setBounds(970, 470, 270, 30);

        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("example.png");
        jTextField4.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        jTextField4.setEnabled(false);
        pictureBox1.add(jTextField4);
        jTextField4.setBounds(670, 560, 260, 30);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 92, 0));
        jButton1.setText("SKIP");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 92, 0), 2, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pictureBox1.add(jButton1);
        jButton1.setBounds(670, 650, 260, 40);

        jButton2.setBackground(new java.awt.Color(255, 92, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("CONTINUE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        pictureBox1.add(jButton2);
        jButton2.setBounds(970, 650, 270, 40);

        jLabel5.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("3. In jurisdictions, the minimum age for renting a self drive vehicle is legally regulated.");
        pictureBox1.add(jLabel5);
        jLabel5.setBounds(630, 270, 670, 20);

        jLabel6.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Why do we need your licensing?");
        pictureBox1.add(jLabel6);
        jLabel6.setBounds(630, 160, 270, 21);

        jLabel7.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("1. We comply with local and national laws regarding the rental of vehicles.");
        pictureBox1.add(jLabel7);
        jLabel7.setBounds(630, 200, 500, 20);

        jLabel8.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("2. Valid driver's license are an essential part of verifying a person's ability to operate a vehicle safely.");
        pictureBox1.add(jLabel8);
        jLabel8.setBounds(630, 230, 670, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pictureBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pictureBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pictureBox2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pictureBox2MouseClicked
        JFileChooser fileChooser = new JFileChooser();
        
        FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("Image files", "png", "jpeg", "jpg", "gif");
        fileChooser.setFileFilter(imageFilter);
        
        int result = fileChooser.showOpenDialog(this);
        
        if (result == JFileChooser.APPROVE_OPTION) {
            selectedFile = fileChooser.getSelectedFile();
            String imageName = selectedFile.getName();
            if (imageFilter.accept(selectedFile)) {
                displayImage(selectedFile);
                if (imageName != null) {
                    jTextField4.setText(imageName);
                } else {
                    Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "Invalid Image Format!");
                } 
            }
        }
    }//GEN-LAST:event_pictureBox2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Application.openRegistrationForm();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.out.println("License: " + getLicenseNumber());
        System.out.println("Date: " + getDateOfIssue());
        System.out.println("Date: " + getDateOfExpiry());
        Application.openSecurityQsnForm();
    }//GEN-LAST:event_jButton2ActionPerformed
    
    public void displayImage(File selectedFile) {
        try {
            BufferedImage img = ImageIO.read(selectedFile);
            ImageIcon icon = new ImageIcon(img);
            pictureBox2.setImage(icon);
            jLabel9.setText("");
            pictureBox2.repaint();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public File getSelectedFile() {
        return selectedFile;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dateOfExpiry;
    private javax.swing.JTextField dateOfIssue;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField licenseNumber;
    private app.vehicle.design.PanelRound panelRound1;
    private app.vehicle.design.PictureBox pictureBox1;
    private app.vehicle.design.PictureBox pictureBox2;
    // End of variables declaration//GEN-END:variables
}

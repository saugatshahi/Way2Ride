package app.vehicle.authentication;

import app.vehicle.main.Application;
import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Cursor;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.nio.file.Files;
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
    
    private final Cursor buttonHandCursor;
    
    private File selectedFile;
    private byte[] imageData;
    
    public RegisterDocument() {
        
        initComponents();
        
        buttonHandCursor = new Cursor(Cursor.HAND_CURSOR);
        
        licenseNumber.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "e.g. 1234567890123456");
        dateOfIssue.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "YYYY-MM-DD, e.g., 2025-01-31");
        dateOfExpiry.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "YYYY-MM-DD, e.g., 2025-01-31");
        
        skipButton.setCursor(buttonHandCursor);
        continueButton.setCursor(buttonHandCursor);
    }
    
    public String getLicenseNumber() {
        String licenseNumberValue = licenseNumber.getText();
        return licenseNumberValue;
    }
    
    public byte[] getImageData() {
        return this.imageData;
    }
    public String getDateOfIssue() {
        String issuedDate = dateOfIssue.getText();
        return issuedDate;
    }
    
    public String getDateOfExpiry() {
        String expiryDate = dateOfExpiry.getText();
        return expiryDate;
    }
    
    private boolean isValidDateFormat(String date) {
        return date.matches("\\d{4}-\\d{2}-\\d{2}");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pictureBox1 = new app.vehicle.design.PictureBox();
        panelRound1 = new app.vehicle.design.PanelRound();
        uploadPictureBox = new app.vehicle.design.PictureBox();
        uploadText = new javax.swing.JLabel();
        uploadLicenseHeaderText = new javax.swing.JLabel();
        expiryDateLabel = new javax.swing.JLabel();
        dateOfExpiry = new javax.swing.JTextField();
        licenseLabel = new javax.swing.JLabel();
        licenseNumber = new javax.swing.JTextField();
        issuedDateLabel = new javax.swing.JLabel();
        dateOfIssue = new javax.swing.JTextField();
        disabledTextField = new javax.swing.JTextField();
        skipButton = new javax.swing.JButton();
        continueButton = new javax.swing.JButton();
        rulesHeaderText3 = new javax.swing.JLabel();
        descHeaderText = new javax.swing.JLabel();
        rulesHeaderText1 = new javax.swing.JLabel();
        rulesHeaderText2 = new javax.swing.JLabel();

        pictureBox1.setImage(new javax.swing.ImageIcon(getClass().getResource("/app/vehicle/logo/SignupBackground.png"))); // NOI18N

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 92, 0), 2, true));

        uploadPictureBox.setImage(new javax.swing.ImageIcon(getClass().getResource("/app/vehicle/logo/upload.png"))); // NOI18N
        uploadPictureBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uploadPictureBoxMouseClicked(evt);
            }
        });

        uploadText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        uploadText.setForeground(new java.awt.Color(255, 92, 0));
        uploadText.setText("Upload licensing");
        uploadPictureBox.add(uploadText);
        uploadText.setBounds(72, 130, 120, 20);

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(uploadPictureBox, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(uploadPictureBox, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
        );

        pictureBox1.add(panelRound1);
        panelRound1.setBounds(670, 360, 260, 180);

        uploadLicenseHeaderText.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        uploadLicenseHeaderText.setForeground(new java.awt.Color(255, 92, 0));
        uploadLicenseHeaderText.setText("Upload your license here!");
        pictureBox1.add(uploadLicenseHeaderText);
        uploadLicenseHeaderText.setBounds(850, 60, 270, 50);

        expiryDateLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        expiryDateLabel.setText("Date of Expiry");
        pictureBox1.add(expiryDateLabel);
        expiryDateLabel.setBounds(970, 527, 120, 22);
        pictureBox1.add(dateOfExpiry);
        dateOfExpiry.setBounds(970, 557, 270, 33);

        licenseLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        licenseLabel.setText("License Number");
        pictureBox1.add(licenseLabel);
        licenseLabel.setBounds(970, 350, 120, 22);
        pictureBox1.add(licenseNumber);
        licenseNumber.setBounds(970, 380, 270, 33);

        issuedDateLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        issuedDateLabel.setText("Date of Issue");
        pictureBox1.add(issuedDateLabel);
        issuedDateLabel.setBounds(970, 437, 120, 22);
        pictureBox1.add(dateOfIssue);
        dateOfIssue.setBounds(970, 467, 270, 33);

        disabledTextField.setBackground(new java.awt.Color(242, 242, 242));
        disabledTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        disabledTextField.setText("example.png");
        disabledTextField.setDisabledTextColor(new java.awt.Color(81, 81, 81));
        disabledTextField.setEnabled(false);
        pictureBox1.add(disabledTextField);
        disabledTextField.setBounds(670, 560, 260, 30);

        skipButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        skipButton.setForeground(new java.awt.Color(255, 92, 0));
        skipButton.setText("SKIP");
        skipButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 92, 0), 2, true));
        skipButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skipButtonActionPerformed(evt);
            }
        });
        pictureBox1.add(skipButton);
        skipButton.setBounds(670, 650, 260, 40);

        continueButton.setBackground(new java.awt.Color(255, 92, 0));
        continueButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        continueButton.setForeground(new java.awt.Color(255, 255, 255));
        continueButton.setText("CONTINUE");
        continueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueButtonActionPerformed(evt);
            }
        });
        pictureBox1.add(continueButton);
        continueButton.setBounds(970, 650, 270, 40);

        rulesHeaderText3.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 15)); // NOI18N
        rulesHeaderText3.setForeground(new java.awt.Color(102, 102, 102));
        rulesHeaderText3.setText("3. In jurisdictions, the minimum age for renting a self drive vehicle is legally regulated.");
        pictureBox1.add(rulesHeaderText3);
        rulesHeaderText3.setBounds(630, 270, 670, 20);

        descHeaderText.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 16)); // NOI18N
        descHeaderText.setForeground(new java.awt.Color(102, 102, 102));
        descHeaderText.setText("Why do we need your licensing?");
        pictureBox1.add(descHeaderText);
        descHeaderText.setBounds(630, 160, 270, 21);

        rulesHeaderText1.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 15)); // NOI18N
        rulesHeaderText1.setForeground(new java.awt.Color(102, 102, 102));
        rulesHeaderText1.setText("1. We comply with local and national laws regarding the rental of vehicles.");
        pictureBox1.add(rulesHeaderText1);
        rulesHeaderText1.setBounds(630, 200, 500, 20);

        rulesHeaderText2.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 15)); // NOI18N
        rulesHeaderText2.setForeground(new java.awt.Color(102, 102, 102));
        rulesHeaderText2.setText("2. Valid driver's license are an essential part of verifying a person's ability to operate a vehicle safely.");
        pictureBox1.add(rulesHeaderText2);
        rulesHeaderText2.setBounds(630, 230, 670, 30);

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

    private void uploadPictureBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uploadPictureBoxMouseClicked
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
                    try {
                       disabledTextField.setText(imageName); 
                       imageData = Files.readAllBytes(selectedFile.toPath());
                    } catch (IOException ex) {
                        Logger.getLogger(RegisterDocument.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "Invalid Image Format!");
                } 
            }
        }
    }//GEN-LAST:event_uploadPictureBoxMouseClicked

    private void skipButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skipButtonActionPerformed
        Application.openRegistrationForm();
    }//GEN-LAST:event_skipButtonActionPerformed

    private void continueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueButtonActionPerformed
        if (licenseNumber.getText().isEmpty() || dateOfIssue.getText().isEmpty() || dateOfExpiry.getText().isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "Please fill in all the fields!");
            return;
        } else if (licenseNumber.getText().length() != 16) {
            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "License number must be 16 characters long!");
            return;
        } else if (!isValidDateFormat(dateOfIssue.getText()) || !isValidDateFormat(dateOfExpiry.getText())) {
            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "Invalid date format. Use YYYY-MM-DD!");
            return;
        } else {
            SecurityQsnForm.registerDocument = this;
            Notifications.getInstance().show(Notifications.Type.INFO, Notifications.Location.TOP_CENTER, "License details saved successfully. Proceed to the next step");
            Application.openSecurityQsnForm();
        }
    }//GEN-LAST:event_continueButtonActionPerformed
    
    public void displayImage(File selectedFile) {
        try {
            BufferedImage img = ImageIO.read(selectedFile);
            ImageIcon icon = new ImageIcon(img);
            uploadPictureBox.setImage(icon);
            uploadText.setText("");
            uploadPictureBox.repaint();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public File getSelectedFile() {
        return selectedFile;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton continueButton;
    private javax.swing.JTextField dateOfExpiry;
    private javax.swing.JTextField dateOfIssue;
    private javax.swing.JLabel descHeaderText;
    private javax.swing.JTextField disabledTextField;
    private javax.swing.JLabel expiryDateLabel;
    private javax.swing.JLabel issuedDateLabel;
    private javax.swing.JLabel licenseLabel;
    private javax.swing.JTextField licenseNumber;
    private app.vehicle.design.PanelRound panelRound1;
    private app.vehicle.design.PictureBox pictureBox1;
    private javax.swing.JLabel rulesHeaderText1;
    private javax.swing.JLabel rulesHeaderText2;
    private javax.swing.JLabel rulesHeaderText3;
    private javax.swing.JButton skipButton;
    private javax.swing.JLabel uploadLicenseHeaderText;
    private app.vehicle.design.PictureBox uploadPictureBox;
    private javax.swing.JLabel uploadText;
    // End of variables declaration//GEN-END:variables
}

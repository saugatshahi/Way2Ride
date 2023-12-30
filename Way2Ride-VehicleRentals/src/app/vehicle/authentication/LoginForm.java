package app.vehicle.authentication;

import app.vehicle.main.Application;
import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;
import javax.swing.JOptionPane;

public class LoginForm extends javax.swing.JPanel {
    
    private Cursor buttonCursor;
    public LoginForm() {
        initComponents();
            
        String fontFilePath = "/app/vehicle/font/Khula-SemiBold.ttf";
        try {
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream(fontFilePath));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(customFont);
        } catch (IOException | FontFormatException e) {
            System.out.println(e);
        }
        
        pwdEntry.putClientProperty(FlatClientProperties.STYLE, "showRevealButton:true");
        buttonCursor = new Cursor(Cursor.HAND_CURSOR);
        
        forgotPwdButton.setCursor(buttonCursor);
        signupLbButton.setCursor(buttonCursor);
        aboutUs.setCursor(buttonCursor);
        loginValidation.setCursor(buttonCursor);
    }
    
    public String getUserEntry() {
        return this.userEntry.getText();
    }
    
    public String getPwdEntry() {
        char [] pwdChar = pwdEntry.getPassword();
        String pwdString = hashPassword(new String(pwdChar));
        
        return pwdString;
    }
    
    
    private String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(password.getBytes());
            return bytesToHex(hash);
        } catch (NoSuchAlgorithmException e) {
            System.out.print(e);
            return null;
        }
    }
    
    private String bytesToHex(byte[] bytes) {
        Formatter formatter = new Formatter();
        for (byte b : bytes) {
            formatter.format("%02x", b);
        }
        return formatter.toString();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pictureBox1 = new app.vehicle.design.PictureBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        userEntry = new javax.swing.JTextField();
        pwdLabel = new javax.swing.JLabel();
        pwdEntry = new javax.swing.JPasswordField();
        loginValidation = new javax.swing.JButton();
        remMeCheckBox = new javax.swing.JCheckBox();
        forgotPwdButton = new javax.swing.JLabel();
        signupText = new javax.swing.JLabel();
        signupLbButton = new javax.swing.JLabel();
        sloganText1 = new javax.swing.JLabel();
        sloganText2 = new javax.swing.JLabel();
        sloganText3 = new javax.swing.JLabel();
        aboutUsPanel = new app.vehicle.design.PanelRound();
        aboutUs = new javax.swing.JLabel();
        copyrightText = new javax.swing.JLabel();
        appLogo = new javax.swing.JLabel();

        pictureBox1.setImage(new javax.swing.ImageIcon(getClass().getResource("/app/vehicle/logo/LoginBackground.png"))); // NOI18N

        jLabel1.setFont(jLabel1.getFont().deriveFont(jLabel1.getFont().getStyle() | java.awt.Font.BOLD, jLabel1.getFont().getSize()+10));
        jLabel1.setForeground(new java.awt.Color(255, 92, 0));
        jLabel1.setText("Welcome to our application!");
        pictureBox1.add(jLabel1);
        jLabel1.setBounds(922, 80, 310, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/vehicle/logo/UserIcon.png"))); // NOI18N
        pictureBox1.add(jLabel2);
        jLabel2.setBounds(1044, 146, 50, 50);

        userLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        userLabel.setText("Email Address");
        pictureBox1.add(userLabel);
        userLabel.setBounds(890, 238, 110, 22);

        userEntry.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        pictureBox1.add(userEntry);
        userEntry.setBounds(890, 272, 370, 40);

        pwdLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        pwdLabel.setText("Password");
        pictureBox1.add(pwdLabel);
        pwdLabel.setBounds(890, 356, 90, 22);

        pwdEntry.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        pictureBox1.add(pwdEntry);
        pwdEntry.setBounds(890, 390, 370, 42);

        loginValidation.setBackground(new java.awt.Color(255, 92, 0));
        loginValidation.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        loginValidation.setForeground(new java.awt.Color(255, 255, 255));
        loginValidation.setText("LOGIN");
        loginValidation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginValidationActionPerformed(evt);
            }
        });
        pictureBox1.add(loginValidation);
        loginValidation.setBounds(890, 520, 370, 42);

        remMeCheckBox.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        remMeCheckBox.setText("Remember me");
        remMeCheckBox.setIconTextGap(8);
        pictureBox1.add(remMeCheckBox);
        remMeCheckBox.setBounds(890, 452, 130, 25);

        forgotPwdButton.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        forgotPwdButton.setText("Forgot Password?");
        pictureBox1.add(forgotPwdButton);
        forgotPwdButton.setBounds(1142, 453, 120, 21);

        signupText.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        signupText.setText("Don't have an account?");
        pictureBox1.add(signupText);
        signupText.setBounds(960, 620, 180, 22);

        signupLbButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        signupLbButton.setText("Signup");
        signupLbButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupLbButtonMouseClicked(evt);
            }
        });
        pictureBox1.add(signupLbButton);
        signupLbButton.setBounds(1134, 620, 70, 22);

        sloganText1.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        sloganText1.setForeground(new java.awt.Color(255, 255, 255));
        sloganText1.setText("RENT ANY");
        pictureBox1.add(sloganText1);
        sloganText1.setBounds(60, 250, 220, 60);

        sloganText2.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        sloganText2.setForeground(new java.awt.Color(255, 255, 255));
        sloganText2.setText("VEHICLES AT YOUR");
        pictureBox1.add(sloganText2);
        sloganText2.setBounds(60, 320, 430, 60);

        sloganText3.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        sloganText3.setForeground(new java.awt.Color(255, 255, 255));
        sloganText3.setText("EASE");
        pictureBox1.add(sloganText3);
        sloganText3.setBounds(60, 390, 130, 50);

        aboutUsPanel.setRoundBottomLeft(50);
        aboutUsPanel.setRoundBottomRight(50);
        aboutUsPanel.setRoundTopLeft(50);
        aboutUsPanel.setRoundTopRight(50);

        aboutUs.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        aboutUs.setForeground(new java.awt.Color(255, 92, 0));
        aboutUs.setText("About us");

        javax.swing.GroupLayout aboutUsPanelLayout = new javax.swing.GroupLayout(aboutUsPanel);
        aboutUsPanel.setLayout(aboutUsPanelLayout);
        aboutUsPanelLayout.setHorizontalGroup(
            aboutUsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aboutUsPanelLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(aboutUs, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        aboutUsPanelLayout.setVerticalGroup(
            aboutUsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutUsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aboutUs)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pictureBox1.add(aboutUsPanel);
        aboutUsPanel.setBounds(50, 510, 190, 50);

        copyrightText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        copyrightText.setForeground(new java.awt.Color(255, 255, 255));
        copyrightText.setText("Copyright © Way2Ride Vehicle Rental System");
        pictureBox1.add(copyrightText);
        copyrightText.setBounds(50, 690, 380, 25);

        appLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/vehicle/logo/LogoWhite.png"))); // NOI18N
        pictureBox1.add(appLogo);
        appLogo.setBounds(50, 40, 210, 64);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pictureBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 1366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pictureBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void signupLbButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupLbButtonMouseClicked
        Application.openRegistrationForm();
    }//GEN-LAST:event_signupLbButtonMouseClicked

    private void loginValidationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginValidationActionPerformed
//       if (Application.authenticateUser(getUserEntry(), getPwdEntry())) {
//           JOptionPane.showMessageDialog(this, "Password didn't match!");
//       }
//       else {
//           JOptionPane.showMessageDialog(this, "Login Successful!");
//           Application.getIntoApp();
//       }
    }//GEN-LAST:event_loginValidationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aboutUs;
    private app.vehicle.design.PanelRound aboutUsPanel;
    private javax.swing.JLabel appLogo;
    private javax.swing.JLabel copyrightText;
    private javax.swing.JLabel forgotPwdButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton loginValidation;
    private app.vehicle.design.PictureBox pictureBox1;
    private javax.swing.JPasswordField pwdEntry;
    private javax.swing.JLabel pwdLabel;
    private javax.swing.JCheckBox remMeCheckBox;
    private javax.swing.JLabel signupLbButton;
    private javax.swing.JLabel signupText;
    private javax.swing.JLabel sloganText1;
    private javax.swing.JLabel sloganText2;
    private javax.swing.JLabel sloganText3;
    private javax.swing.JTextField userEntry;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}

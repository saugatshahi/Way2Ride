package app.vehicle.authentication;

import app.vehicle.main.Application;
import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Cursor;
import javax.swing.JOptionPane;
import java.sql.SQLException;

/**
 *
 * @author shahi
 */
public class SecurityQsnForm extends javax.swing.JPanel {
    
    public static RegisterCustomer registerCustomer;
    public static RegisterDocument registerDocument;
    private Cursor buttonCursor;

    public SecurityQsnForm() {
        initComponents();
        
        buttonCursor = new Cursor(Cursor.HAND_CURSOR);
        
        securityAnswer1.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Example: Washington DC");
        securityAnswer2.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Example: John Doe");
        securityAnswer3.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Example: Software Developer");
        securityAnswer4.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Example: Mercedes Benz (Optional)");
        
        goBackButton.setCursor(buttonCursor);
        registerFinalBtn.setCursor(buttonCursor);
    }
    public SecurityQsnForm(RegisterCustomer registerCustomer,RegisterDocument registerDocument ) {
        initComponents();
    }
    
    public String getSecurityAnswer1() {
        String securityAns1 = securityAnswer1.getText();
        return securityAns1;
    }
    
    public String getSecurityAnswer2() {
        String securityAns2 = securityAnswer2.getText();
        return securityAns2;
    }
    
    public String getSecurityAnswer3() {
        String securityAns3 = securityAnswer3.getText();
        return securityAns3;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pictureBox1 = new app.vehicle.design.PictureBox();
        qnHeaderText = new javax.swing.JLabel();
        securityAnswer4 = new app.vehicle.design.TextField();
        qn4Label = new javax.swing.JLabel();
        qn1Label = new javax.swing.JLabel();
        securityAnswer1 = new app.vehicle.design.TextField();
        qn2Label = new javax.swing.JLabel();
        securityAnswer2 = new app.vehicle.design.TextField();
        qn3Label = new javax.swing.JLabel();
        securityAnswer3 = new app.vehicle.design.TextField();
        goBackButton = new javax.swing.JButton();
        registerFinalBtn = new javax.swing.JButton();

        pictureBox1.setImage(new javax.swing.ImageIcon(getClass().getResource("/app/vehicle/logo/SignupBackground.png"))); // NOI18N

        qnHeaderText.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        qnHeaderText.setForeground(new java.awt.Color(255, 92, 0));
        qnHeaderText.setText("Answer any 3 of these security questions.");
        pictureBox1.add(qnHeaderText);
        qnHeaderText.setBounds(670, 90, 440, 30);

        securityAnswer4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        pictureBox1.add(securityAnswer4);
        securityAnswer4.setBounds(668, 533, 560, 50);

        qn4Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        qn4Label.setText("Which is your favourite car?");
        pictureBox1.add(qn4Label);
        qn4Label.setBounds(670, 504, 290, 22);

        qn1Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        qn1Label.setText("Where is your hometown located?");
        pictureBox1.add(qn1Label);
        qn1Label.setBounds(670, 190, 260, 22);

        securityAnswer1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        pictureBox1.add(securityAnswer1);
        securityAnswer1.setBounds(668, 221, 560, 50);

        qn2Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        qn2Label.setText("What is your childhood's friend name?");
        pictureBox1.add(qn2Label);
        qn2Label.setBounds(670, 298, 290, 22);

        securityAnswer2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        pictureBox1.add(securityAnswer2);
        securityAnswer2.setBounds(668, 325, 560, 50);

        qn3Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        qn3Label.setText("What is your dream job?");
        pictureBox1.add(qn3Label);
        qn3Label.setBounds(670, 399, 290, 22);

        securityAnswer3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        pictureBox1.add(securityAnswer3);
        securityAnswer3.setBounds(668, 429, 560, 50);

        goBackButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        goBackButton.setForeground(new java.awt.Color(255, 92, 0));
        goBackButton.setText("GO BACK");
        goBackButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 92, 0), 2, true));
        goBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackButtonActionPerformed(evt);
            }
        });
        pictureBox1.add(goBackButton);
        goBackButton.setBounds(670, 660, 260, 40);

        registerFinalBtn.setBackground(new java.awt.Color(255, 92, 0));
        registerFinalBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        registerFinalBtn.setForeground(new java.awt.Color(255, 255, 255));
        registerFinalBtn.setText("CREATE ACCOUNT");
        registerFinalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerFinalBtnActionPerformed(evt);
            }
        });
        pictureBox1.add(registerFinalBtn);
        registerFinalBtn.setBounds(966, 660, 260, 40);

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

    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackButtonActionPerformed
        Application.openCustomerDocsForm();
    }//GEN-LAST:event_goBackButtonActionPerformed

    private void registerFinalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerFinalBtnActionPerformed
        try {
            boolean registrationResult = Application.registerAccount(registerCustomer, registerDocument, this);
            if (registrationResult){
               JOptionPane.showMessageDialog(null, "Account Successfully Created!");
               Application.openLoginForm();
            }
        } catch (SQLException e) {
            System.out.print(e);
        }
    }//GEN-LAST:event_registerFinalBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton goBackButton;
    private app.vehicle.design.PictureBox pictureBox1;
    private javax.swing.JLabel qn1Label;
    private javax.swing.JLabel qn2Label;
    private javax.swing.JLabel qn3Label;
    private javax.swing.JLabel qn4Label;
    private javax.swing.JLabel qnHeaderText;
    private javax.swing.JButton registerFinalBtn;
    private app.vehicle.design.TextField securityAnswer1;
    private app.vehicle.design.TextField securityAnswer2;
    private app.vehicle.design.TextField securityAnswer3;
    private app.vehicle.design.TextField securityAnswer4;
    // End of variables declaration//GEN-END:variables
}

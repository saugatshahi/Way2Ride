package app.vehicle.authentication;

import app.vehicle.main.Application;
import javax.swing.JOptionPane;

/**
 *
 * @author shahi
 */
public class SecurityQsnForm extends javax.swing.JPanel {
    
    private static RegisterCustomer rc;
    private static RegisterDocument rd;

    public SecurityQsnForm() {
        initComponents();
        
        rc = new RegisterCustomer();
        rd = new RegisterDocument();
    }
    
    public String getSecurityAnswer1() {
        return this.securityAnswer1.getText();
    }
    
    public String getSecurityAnswer2() {
        return this.securityAnswer2.getText();
    }
    
    public String getSecurityAnswer3() {
        return this.securityAnswer3.getText();
    }
    
    public String getSecurityAnswer4() {
        return this.securityAnswer4.getText();
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
        registerFinal = new javax.swing.JButton();

        pictureBox1.setImage(new javax.swing.ImageIcon(getClass().getResource("/app/vehicle/logo/SignupBackground.png"))); // NOI18N

        qnHeaderText.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        qnHeaderText.setForeground(new java.awt.Color(255, 92, 0));
        qnHeaderText.setText("Answer any 3 of these security questions.");
        pictureBox1.add(qnHeaderText);
        qnHeaderText.setBounds(670, 90, 440, 30);

        securityAnswer4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        pictureBox1.add(securityAnswer4);
        securityAnswer4.setBounds(670, 532, 560, 50);

        qn4Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        qn4Label.setText("Which is your favourite car?");
        pictureBox1.add(qn4Label);
        qn4Label.setBounds(670, 502, 290, 22);

        qn1Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        qn1Label.setText("Where is your hometown located?");
        pictureBox1.add(qn1Label);
        qn1Label.setBounds(670, 190, 260, 22);

        securityAnswer1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        pictureBox1.add(securityAnswer1);
        securityAnswer1.setBounds(670, 220, 560, 50);

        qn2Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        qn2Label.setText("What is your childhood's friend name?");
        pictureBox1.add(qn2Label);
        qn2Label.setBounds(670, 296, 290, 22);

        securityAnswer2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        pictureBox1.add(securityAnswer2);
        securityAnswer2.setBounds(670, 324, 560, 50);

        qn3Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        qn3Label.setText("What is your dream job?");
        pictureBox1.add(qn3Label);
        qn3Label.setBounds(670, 398, 290, 22);

        securityAnswer3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        pictureBox1.add(securityAnswer3);
        securityAnswer3.setBounds(670, 428, 560, 50);

        registerFinal.setBackground(new java.awt.Color(255, 92, 0));
        registerFinal.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        registerFinal.setForeground(new java.awt.Color(255, 255, 255));
        registerFinal.setText("CREATE ACCOUNT");
        registerFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerFinalActionPerformed(evt);
            }
        });
        pictureBox1.add(registerFinal);
        registerFinal.setBounds(670, 660, 560, 40);

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

    private void registerFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerFinalActionPerformed
//        Application.registerAccount();
        boolean registrationResult = Application.registerAccount(rc, rd, this);
        if (registrationResult){
            JOptionPane.showMessageDialog(null, "Okay");
            Application.openCustomerDocsForm();
        } else {
            JOptionPane.showMessageDialog(null, "Not Okay");
        }
    }//GEN-LAST:event_registerFinalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private app.vehicle.design.PictureBox pictureBox1;
    private javax.swing.JLabel qn1Label;
    private javax.swing.JLabel qn2Label;
    private javax.swing.JLabel qn3Label;
    private javax.swing.JLabel qn4Label;
    private javax.swing.JLabel qnHeaderText;
    private javax.swing.JButton registerFinal;
    private app.vehicle.design.TextField securityAnswer1;
    private app.vehicle.design.TextField securityAnswer2;
    private app.vehicle.design.TextField securityAnswer3;
    private app.vehicle.design.TextField securityAnswer4;
    // End of variables declaration//GEN-END:variables
}

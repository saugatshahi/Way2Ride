package app.vehicle.authentication;






import app.admin.main.RunAdminPanel;
import app.vehicle.database.MySqlConnection;
import app.vehicle.main.Application;
import java.awt.Window;
import java.sql.Connection;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author basne
 */
public class ForgotPassword extends javax.swing.JPanel {

    
    public ForgotPassword() {
        initComponents();
    }
public String getEmail(){
return email.getText();
}
public String getAnswer1(){
    return answer1.getText();
}
public String getAnswer2(){
    return answer2.getText();
}
public String getAnswer3(){
    return answer3.getText();
}



private boolean checkAnswers(String email, String answer1, String answer2, String answer3) {
    boolean[] answers = {
        Application.performReset(email, answer1),
        Application.performReset(email, answer2),
        Application.performReset(email, answer3),
        
    };

    // Count the number of correct answers
    int correctAnswersCount = 0;
    for (boolean answer : answers) {
        if (answer) {
            correctAnswersCount++;
        }
    }

    // Return true if at least 3 answers are correct
    return correctAnswersCount >= 2;
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pictureBox1 = new app.vehicle.design.PictureBox();
        qnHeaderText = new javax.swing.JLabel();
        qn1Label = new javax.swing.JLabel();
        email = new app.vehicle.design.TextField();
        qn2Label = new javax.swing.JLabel();
        answer2 = new app.vehicle.design.TextField();
        qn3Label = new javax.swing.JLabel();
        answer3 = new app.vehicle.design.TextField();
        submit = new javax.swing.JButton();
        answer1 = new app.vehicle.design.TextField();
        qnHeaderText1 = new javax.swing.JLabel();

        pictureBox1.setImage(new javax.swing.ImageIcon(getClass().getResource("/app/vehicle/logo/SignupBackground.png"))); // NOI18N

        qnHeaderText.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        qnHeaderText.setForeground(new java.awt.Color(255, 92, 0));
        qnHeaderText.setText("Email Address");
        pictureBox1.add(qnHeaderText);
        qnHeaderText.setBounds(670, 50, 440, 30);

        qn1Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        qn1Label.setText("Where is your hometown located?");
        pictureBox1.add(qn1Label);
        qn1Label.setBounds(670, 190, 260, 22);

        email.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        pictureBox1.add(email);
        email.setBounds(660, 90, 570, 50);

        qn2Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        qn2Label.setText("What is your childhood's friend name?");
        pictureBox1.add(qn2Label);
        qn2Label.setBounds(670, 296, 290, 22);

        answer2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        answer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer2ActionPerformed(evt);
            }
        });
        pictureBox1.add(answer2);
        answer2.setBounds(670, 324, 560, 50);

        qn3Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        qn3Label.setText("What is your dream job?");
        pictureBox1.add(qn3Label);
        qn3Label.setBounds(670, 398, 290, 22);

        answer3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        answer3.setSelectionEnd(100);
        answer3.setSelectionStart(100);
        answer3.setShadowColor(new java.awt.Color(255, 51, 51));
        answer3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer3ActionPerformed(evt);
            }
        });
        pictureBox1.add(answer3);
        answer3.setBounds(670, 428, 560, 50);

        submit.setBackground(new java.awt.Color(255, 92, 0));
        submit.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        pictureBox1.add(submit);
        submit.setBounds(670, 660, 560, 40);

        answer1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        answer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer1ActionPerformed(evt);
            }
        });
        pictureBox1.add(answer1);
        answer1.setBounds(670, 220, 570, 50);

        qnHeaderText1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        qnHeaderText1.setForeground(new java.awt.Color(255, 92, 0));
        qnHeaderText1.setText("Answer any 3 of these security questions.");
        pictureBox1.add(qnHeaderText1);
        qnHeaderText1.setBounds(670, 150, 440, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pictureBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 1366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pictureBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed

 String emailText = getEmail();
    String answer1Text = getAnswer1();
    String answer2Text = getAnswer2();
    String answer3Text = getAnswer3();
    

    // Check the answers
    boolean result = checkAnswers(emailText, answer1Text, answer2Text, answer3Text);

    // Perform actions based on the result
//    if (result) {
//        // If at least 3 answers are correct, show the "correct" message
//        System.out.println("correct");
//    } else {
//        // If less than 3 answers are correct, show an error message or handle it accordingly
//        JOptionPane.showMessageDialog(null, "Invalid answers. Please try again.");
//    }
switch (result ? "correct" : "incorrect") {
    case "correct" -> System.out.println("correct");
    case "incorrect" -> JOptionPane.showMessageDialog(null, "Invalid answers. Please try again.");
    default -> {
            }
}
        // Handle other cases if needed
                                                           
    }//GEN-LAST:event_submitActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void answer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answer2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answer2ActionPerformed

    private void answer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answer1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answer1ActionPerformed

    private void answer3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answer3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answer3ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private app.vehicle.design.TextField answer1;
    private app.vehicle.design.TextField answer2;
    private app.vehicle.design.TextField answer3;
    private app.vehicle.design.TextField email;
    private app.vehicle.design.PictureBox pictureBox1;
    private javax.swing.JLabel qn1Label;
    private javax.swing.JLabel qn2Label;
    private javax.swing.JLabel qn3Label;
    private javax.swing.JLabel qnHeaderText;
    private javax.swing.JLabel qnHeaderText1;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}




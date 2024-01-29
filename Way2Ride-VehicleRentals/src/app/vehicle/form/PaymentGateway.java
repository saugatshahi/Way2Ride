package app.vehicle.form;

//import java.awt.Color;
import app.vehicle.authentication.LoginForm;
import app.vehicle.dao.BillingDAO;
import app.vehicle.model.BillingOrders;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import javax.swing.JDialog;
import javax.swing.SwingUtilities;
import raven.toast.Notifications;


/**
 *
 * @author basne
 */
public class PaymentGateway extends javax.swing.JPanel {

    private static final int ORDER_ID_LENGTH = 7;
    private static final int MAX_ORDER_ID = 9999999;
    private static final int MIN_ORDER_ID = 1000000;
    private String brand;
    private String price;
    private byte[] vehicleImage;
    
    public PaymentGateway(String brand, String price, byte[] vehicleImage) {
        initComponents();
        this.brand = brand;
        this.price = price;
        this.vehicleImage = vehicleImage;
        
        String storedEmail = LoginForm.getStoredUserEmail();
            System.out.println("Fetched Email: " + storedEmail);
        emailAddress.setText(storedEmail);
        
       String fontFilePath = "/app/vehicle/font/Khula-SemiBold.ttf";
        try {
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream(fontFilePath));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(customFont);
            
           
        } catch (IOException | FontFormatException e) {
            System.out.println(e);
        }
        setOpaque(false);
    }
    
    public String getCardNumber() {
        return cardNumber.getText();
    }
    
    public String getCardHolderName() {
        return cardHolderName.getText();
    }
    
    public String getPostalCode() {
        return postalCode.getText();
    }
    
    public String getCvv() {
        return cvv.getText();
    }
    
    public String getExpiryDate() {
        return expiryDate.getText();
    }
    
    public String getEmailAddress() {
        return emailAddress.getText();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GuestC = new javax.swing.JLabel();
        Desc = new javax.swing.JLabel();
        cardHolderName = new javax.swing.JTextField();
        UserName = new javax.swing.JLabel();
        UserCardNumber = new javax.swing.JLabel();
        cardNumber = new javax.swing.JTextField();
        CardExpDate = new javax.swing.JLabel();
        expiryDate = new javax.swing.JTextField();
        CardCVV = new javax.swing.JLabel();
        cvv = new javax.swing.JTextField();
        goBackButton = new javax.swing.JButton();
        continueButton = new javax.swing.JButton();
        shadowRental = new app.admin.design.PanelShadow();
        jLabel2 = new javax.swing.JLabel();
        orderID = new javax.swing.JLabel();
        location = new javax.swing.JLabel();
        streetAddress = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        transactionDate = new javax.swing.JLabel();
        postalCode = new javax.swing.JTextField();
        CardExpDate1 = new javax.swing.JLabel();
        CardExpDate2 = new javax.swing.JLabel();
        emailAddress = new javax.swing.JTextField();
        CardExpDate3 = new javax.swing.JLabel();
        applyButton = new javax.swing.JButton();
        couponCode = new javax.swing.JTextField();

        GuestC.setFont(new java.awt.Font("Yu Gothic", 1, 17)); // NOI18N
        GuestC.setForeground(new java.awt.Color(255, 92, 0));
        GuestC.setText("Guest Checkout");

        Desc.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        Desc.setForeground(new java.awt.Color(66, 66, 66));
        Desc.setText("We accept the card types shown above.");

        cardHolderName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cardHolderNameKeyReleased(evt);
            }
        });

        UserName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        UserName.setText("Cardholder's Name");

        UserCardNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        UserCardNumber.setText("Card Number");

        cardNumber.setDragEnabled(true);

        CardExpDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CardExpDate.setText("Exp.Date");

        CardCVV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CardCVV.setText("CVV");

        goBackButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 16)); // NOI18N
        goBackButton.setForeground(new java.awt.Color(255, 92, 0));
        goBackButton.setText("Go Back");
        goBackButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 92, 0), 2));
        goBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackButtonActionPerformed(evt);
            }
        });

        continueButton.setBackground(new java.awt.Color(255, 92, 0));
        continueButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 16)); // NOI18N
        continueButton.setForeground(new java.awt.Color(255, 255, 255));
        continueButton.setText("Continue");
        continueButton.setFocusPainted(false);
        continueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 15)); // NOI18N
        jLabel2.setText("Rental Summary");

        orderID.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        orderID.setForeground(new java.awt.Color(102, 102, 102));
        orderID.setText("Order ID:");

        location.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        location.setForeground(new java.awt.Color(102, 102, 102));
        location.setText("Location:");

        streetAddress.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        streetAddress.setForeground(new java.awt.Color(102, 102, 102));
        streetAddress.setText("Street Address:");

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel9.setText("Scan QR Code to print the reciept");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/admin/logo/download 1 (1).png"))); // NOI18N
        jLabel10.setText("jLabel10");

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel11.setText("Tax:");

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel12.setText("Grand Total:");

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel16.setText("Discount:");

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Note: If you need to cancel the order it should");

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("have to be cancelled before ");

        transactionDate.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        transactionDate.setForeground(new java.awt.Color(102, 102, 102));
        transactionDate.setText("Transaction Date:");

        javax.swing.GroupLayout shadowRentalLayout = new javax.swing.GroupLayout(shadowRental);
        shadowRental.setLayout(shadowRentalLayout);
        shadowRentalLayout.setHorizontalGroup(
            shadowRentalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shadowRentalLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(shadowRentalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(transactionDate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addGroup(shadowRentalLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(shadowRentalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(streetAddress)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderID, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        shadowRentalLayout.setVerticalGroup(
            shadowRentalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shadowRentalLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(orderID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(transactionDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(streetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(shadowRentalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(shadowRentalLayout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        CardExpDate1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CardExpDate1.setText("Postal Code");

        CardExpDate2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CardExpDate2.setText("Email Address");

        CardExpDate3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CardExpDate3.setText("Coupon Code");

        applyButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        applyButton.setText("Apply");
        applyButton.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(GuestC, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(goBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                    .addComponent(continueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(couponCode, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29)
                                    .addComponent(applyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Desc, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(expiryDate, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                                                    .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cardHolderName)
                                                    .addComponent(CardExpDate, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(postalCode))
                                                .addComponent(CardExpDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(29, 29, 29)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(CardCVV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cardNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                                                .addComponent(cvv)
                                                .addComponent(CardExpDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(emailAddress)
                                                .addComponent(UserCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addComponent(CardExpDate3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addComponent(shadowRental, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(GuestC, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Desc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UserCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cardNumber)
                            .addComponent(cardHolderName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CardExpDate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CardCVV, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(expiryDate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cvv, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CardExpDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CardExpDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(postalCode, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(CardExpDate3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(couponCode, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(applyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(shadowRental, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(continueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackButtonActionPerformed
        JDialog dialog = (JDialog) SwingUtilities.getWindowAncestor(goBackButton);
        dialog.dispose();
    }//GEN-LAST:event_goBackButtonActionPerformed

    private void continueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueButtonActionPerformed
        Random random = new Random();
        String orderID;
        
        Set<String> generatedIDs = new HashSet<>();
        
        do {
            int randomNumber = random.nextInt(MAX_ORDER_ID - MIN_ORDER_ID + 1) + MIN_ORDER_ID;
            orderID = String.format("%0" + ORDER_ID_LENGTH + "d", randomNumber);
        } while (!generatedIDs.add(orderID));
        
        LocalDateTime currentTime = LocalDateTime.now();

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String currentDate = currentTime.format(dateFormatter);
    
        BillingDAO billings = new BillingDAO();
        
        BillingOrders billingOrders = new BillingOrders(
                orderID,
                vehicleImage,
                brand,
                currentDate,
                getCardHolderName(),
                getCardNumber(),
                getCvv(),
                getExpiryDate(),
                getPostalCode(), 
                price
        );
        
        boolean check = billings.saveOrderData(getEmailAddress(), billingOrders);
        
        if (check) {
            Notifications.getInstance().show(Notifications.Type.SUCCESS, "Your order has been placed!");
        } else {
            Notifications.getInstance().show(Notifications.Type.ERROR, "Sorry for the trouble!");
        }
    }//GEN-LAST:event_continueButtonActionPerformed

    private void cardHolderNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cardHolderNameKeyReleased
     
        
    }//GEN-LAST:event_cardHolderNameKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CardCVV;
    private javax.swing.JLabel CardExpDate;
    private javax.swing.JLabel CardExpDate1;
    private javax.swing.JLabel CardExpDate2;
    private javax.swing.JLabel CardExpDate3;
    private javax.swing.JLabel Desc;
    private javax.swing.JLabel GuestC;
    private javax.swing.JLabel UserCardNumber;
    private javax.swing.JLabel UserName;
    private javax.swing.JButton applyButton;
    private javax.swing.JTextField cardHolderName;
    private javax.swing.JTextField cardNumber;
    private javax.swing.JButton continueButton;
    private javax.swing.JTextField couponCode;
    private javax.swing.JTextField cvv;
    private javax.swing.JTextField emailAddress;
    private javax.swing.JTextField expiryDate;
    private javax.swing.JButton goBackButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel location;
    private javax.swing.JLabel orderID;
    private javax.swing.JTextField postalCode;
    private app.admin.design.PanelShadow shadowRental;
    private javax.swing.JLabel streetAddress;
    private javax.swing.JLabel transactionDate;
    // End of variables declaration//GEN-END:variables
}

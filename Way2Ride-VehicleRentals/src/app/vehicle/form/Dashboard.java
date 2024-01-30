package app.vehicle.form;

import app.admin.design.ScrollBar;
import app.vehicle.component.CarItem;
import app.vehicle.dao.CategoryDAO;
import app.vehicle.main.Application;
import app.admin.controller.FourWheelersController;
import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import java.util.List;
import java.awt.Component;
import java.awt.Cursor;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import raven.glasspanepopup.DefaultOption;
import raven.glasspanepopup.GlassPanePopup;

public final class Dashboard extends javax.swing.JPanel {
    
    private Notification notify;
    private static SearchBar searchBar;
    private CouponFrame couponFrame;
    

    public Dashboard() {
        initComponents();
        
        dateChooserCombo1.addSelectionChangedListener(event -> {
        updateSelectedDates();
    });

    updateSelectedDates();
        
        jLabel3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jLabel4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        scroll.setVerticalScrollBar(new ScrollBar());
        String fontFilePath = "/app/vehicle/font/Khula-SemiBold.ttf";
        try {
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream(fontFilePath));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(customFont);
            
            Font sizedFont = customFont.deriveFont((float) 13);
            jLabel2.setFont(sizedFont);
            jLabel5.setFont(sizedFont);
            jLabel6.setFont(sizedFont);
            jLabel7.setFont(sizedFont);
            jTextField1.setFont(sizedFont);
            jTextField1.setFont(sizedFont);
            jTextField1.setFont(sizedFont);
            jLabel8.setFont(sizedFont);
            jLabel2.putClientProperty(FlatClientProperties.STYLE, "");
        } catch (IOException | FontFormatException e) {
            System.out.println(e);
        }
        
        dateChooserCombo1.setBackground(Color.decode("#EDEDED"));
        dateChooserCombo2.setBackground(Color.decode("#EDEDED"));
       
        addCategory();
    }
    
    public Date convertCalendarToDate(Calendar calendar) {
        long timeInMillis = calendar.getTimeInMillis();
        Date date = new Date(timeInMillis);
        
        return date;
    }
     
    private void addCategory() {
    CategoryDAO categoryDAO = new CategoryDAO();
    List<FourWheelersController> categoryVehicle = categoryDAO.fetchAllCategoryInDescendingOrder();

    for (FourWheelersController categoryData : categoryVehicle) {
        panelItem1.add(new CarItem(categoryData.getCategory(), "Features", categoryData.getBrand(),
                       categoryData.getPowerSource(), categoryData.getLimitations(), 
                       "NRs." + categoryData.getPrice(), categoryData.getQuantity(), categoryData.getCarImage()));
    }
    }
    
    private void updateSelectedDates() {
    Calendar selectedCalendar1 = dateChooserCombo1.getSelectedDate();
    Date selectedDate1 = convertCalendarToDate(selectedCalendar1);

    Calendar selectedCalendar2 = dateChooserCombo2.getSelectedDate();
    Date selectedDate2 = convertCalendarToDate(selectedCalendar2);
    SimpleDateFormat dateFormatter = new SimpleDateFormat("E MMM dd");
    String extractedDate1 = dateFormatter.format(selectedDate1);
    String extractedDate2 = dateFormatter.format(selectedDate2);
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textBox1 = new app.vehicle.design.PanelRound();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        textBox2 = new app.vehicle.design.PanelRound();
        jLabel5 = new javax.swing.JLabel();
        dateChooserCombo2 = new datechooser.beans.DateChooserCombo();
        textBox3 = new app.vehicle.design.PanelRound();
        jLabel6 = new javax.swing.JLabel();
        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();
        textBox4 = new app.vehicle.design.PanelRound();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        textBox5 = new app.vehicle.design.PanelRound();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        panelItem1 = new app.vehicle.design.PanelItem();
        jButton2 = new javax.swing.JButton();

        textBox1.setBackground(new java.awt.Color(237, 237, 237));
        textBox1.setRoundBottomLeft(12);
        textBox1.setRoundBottomRight(12);
        textBox1.setRoundTopLeft(12);
        textBox1.setRoundTopRight(12);

        jLabel2.setText("Leaving from");
        textBox1.add(jLabel2);
        jLabel2.setBounds(20, 0, 80, 20);

        jTextField2.setBackground(new java.awt.Color(237, 237, 237));
        jTextField2.setBorder(null);
        textBox1.add(jTextField2);
        jTextField2.setBounds(20, 20, 160, 30);

        textBox2.setBackground(new java.awt.Color(237, 237, 237));
        textBox2.setRoundBottomLeft(12);
        textBox2.setRoundBottomRight(12);
        textBox2.setRoundTopLeft(12);
        textBox2.setRoundTopRight(12);

        jLabel5.setText("Pick Up Date");
        textBox2.add(jLabel5);
        jLabel5.setBounds(20, 0, 80, 20);
        textBox2.add(dateChooserCombo2);
        dateChooserCombo2.setBounds(10, 20, 155, 22);

        textBox3.setBackground(new java.awt.Color(237, 237, 237));
        textBox3.setRoundBottomLeft(12);
        textBox3.setRoundBottomRight(12);
        textBox3.setRoundTopLeft(12);
        textBox3.setRoundTopRight(12);

        jLabel6.setText("Dropoff date");
        textBox3.add(jLabel6);
        jLabel6.setBounds(20, 0, 80, 20);

        dateChooserCombo1.setCalendarPreferredSize(new java.awt.Dimension(262, 246));
        textBox3.add(dateChooserCombo1);
        dateChooserCombo1.setBounds(10, 20, 155, 22);

        textBox4.setBackground(new java.awt.Color(237, 237, 237));
        textBox4.setRoundBottomLeft(12);
        textBox4.setRoundBottomRight(12);
        textBox4.setRoundTopLeft(12);
        textBox4.setRoundTopRight(12);

        jLabel7.setText("Pickup location");
        textBox4.add(jLabel7);
        jLabel7.setBounds(20, 0, 110, 20);

        jTextField3.setBackground(new java.awt.Color(237, 237, 237));
        jTextField3.setBorder(null);
        textBox4.add(jTextField3);
        jTextField3.setBounds(20, 20, 150, 30);

        textBox5.setBackground(new java.awt.Color(237, 237, 237));
        textBox5.setRoundBottomLeft(12);
        textBox5.setRoundBottomRight(12);
        textBox5.setRoundTopLeft(12);
        textBox5.setRoundTopRight(12);

        jLabel8.setText("Dropoff Location");
        textBox5.add(jLabel8);
        jLabel8.setBounds(20, 0, 100, 20);

        jTextField1.setBackground(new java.awt.Color(237, 237, 237));
        jTextField1.setBorder(null);
        textBox5.add(jTextField1);
        jTextField1.setBounds(20, 20, 150, 30);

        jButton1.setBackground(new java.awt.Color(255, 92, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/dashboard/png/Vector (3).png"))); // NOI18N
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/dashboard/png/logo.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/dashboard/png/Clip path group.png"))); // NOI18N
        jLabel3.setText("Notifications");
        jLabel3.setIconTextGap(8);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/dashboard/png/Group.png"))); // NOI18N
        jLabel4.setText("Logout");
        jLabel4.setIconTextGap(8);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        scroll.setBorder(null);
        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panelItem1.setOpaque(false);
        scroll.setViewportView(panelItem1);

        jButton2.setBackground(new java.awt.Color(255, 102, 0));
        jButton2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("RewardPoint");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(63, 63, 63)
                .addComponent(jLabel4)
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        notify = new Notification();
        GlassPanePopup.showPopup(notify, new DefaultOption() {
            @Override
            public float opacity() {
                return 0.05f;
            }

            @Override
            public String getLayout(Component parent, float animate) {
                float xOffset = 0.81f;
                float yOffset = 0.19f;

                return "pos " + xOffset + "al " + yOffset + "al";
            }
        });
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        Application.logout();
    }//GEN-LAST:event_jLabel4MouseClicked
  
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        searchBar = new SearchBar();
        
        GlassPanePopup.showPopup(searchBar, new DefaultOption() {
            @Override
            public float opacity() {
                return 0.05f;
            }
            
            @Override
            public String getLayout(Component parent, float animate) {
                float xOffset = 0.764f;
                float yOffset = 0.145f;

                return "pos " + xOffset + "al " + yOffset + "al";
            }
        });
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        couponFrame = new CouponFrame();
        GlassPanePopup.showPopup(couponFrame, new DefaultOption() {
            @Override
            public float opacity() {
                return 0.05f;
            }
            
            @Override
            public String getLayout(Component parent, float animate) {
                float xOffset = 0.764f;
                float yOffset = 0.145f;

                return "pos " + xOffset + "al " + yOffset + "al";
            }
        });
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private datechooser.beans.DateChooserCombo dateChooserCombo2;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private app.vehicle.design.PanelItem panelItem1;
    private javax.swing.JScrollPane scroll;
    private app.vehicle.design.PanelRound textBox1;
    private app.vehicle.design.PanelRound textBox2;
    private app.vehicle.design.PanelRound textBox3;
    private app.vehicle.design.PanelRound textBox4;
    private app.vehicle.design.PanelRound textBox5;
    // End of variables declaration//GEN-END:variables

}

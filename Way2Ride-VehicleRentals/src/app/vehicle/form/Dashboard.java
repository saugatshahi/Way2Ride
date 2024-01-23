package app.vehicle.form;

import app.admin.menu.ScrollBar;
import app.vehicle.component.CarItem;
import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingUtilities;
import raven.glasspanepopup.DefaultOption;
import raven.glasspanepopup.GlassPanePopup;
import app.vehicle.modelItem.ModelItem;

public final class Dashboard extends javax.swing.JPanel {
       private List<ModelItem> itemList;
    
    private Notification notify;

    public Dashboard() throws FontFormatException {
        initComponents();
         scroll.setVerticalScrollBar(new ScrollBar());
        itemList = new ArrayList<>(); // Initialize the list
        
        // Add some sample items for testing
        
        for (int i = 0; i < 10; i++) {
            addItem(new ModelItem("Luxury","Features","Buggati","Non-Elecrtric","Unlimited","NRS.29,000","2",new ImageIcon(getClass().getResource("/app/dashboard/png/buggati1.png")),new JButton("Reserve")));
            addItem(new ModelItem("Standard","Features","Tesla","Elecrtric","Unlimited","NRS.22,000","5",new ImageIcon(getClass().getResource("/app/dashboard/png/Tesla1.png")),new JButton("Reserve")));
            addItem(new ModelItem("Standard","Features","Jeep","Non-Elecrtric","Unlimited","NRS.25,000","5",new ImageIcon(getClass().getResource("/app/dashboard/png/Jeep1.png")),new JButton("Reserve")));
            addItem(new ModelItem("Luxury","Features","Car","Non-Elecrtric","Unlimited","NRS.20,000","5",new ImageIcon(getClass().getResource("/app/dashboard/png/Uniquecar1.png")),new JButton("Reserve")));
        }
        
        String fontFilePath = "/app/vehicle/font/Khula-SemiBold.ttf";
        try {
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream(fontFilePath));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(customFont);
            
            Font sizedFont = customFont.deriveFont((float) 13);
            jLabel2.setFont(sizedFont);
            jLabel2.putClientProperty(FlatClientProperties.STYLE, "");
        } catch (IOException | FontFormatException e) {
            System.out.println(e);
        }
    }
    public void addItem(ModelItem data){
        CarItem caritem = new CarItem();
        caritem.setData(data);
        caritem.addMouseListener(new MouseAdapter(){
        @Override
        public void mousePressed(MouseEvent me) {
            if(SwingUtilities.isLeftMouseButton(me)){
                
            }
        }
         });
        panelItem1.add(caritem);
        panelItem1.repaint();
        panelItem1.revalidate();
    }
      public void printLoopData() {
        System.out.println("Loop Data:");
        for (ModelItem item : itemList) {
            System.out.println(item);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textBox1 = new app.vehicle.design.PanelRound();
        jLabel2 = new javax.swing.JLabel();
        textBox2 = new app.vehicle.design.PanelRound();
        textBox3 = new app.vehicle.design.PanelRound();
        textBox4 = new app.vehicle.design.PanelRound();
        textBox5 = new app.vehicle.design.PanelRound();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        panelItem1 = new app.vehicle.design.PanelItem();

        textBox1.setBackground(new java.awt.Color(237, 237, 237));
        textBox1.setRoundBottomLeft(12);
        textBox1.setRoundBottomRight(12);
        textBox1.setRoundTopLeft(12);
        textBox1.setRoundTopRight(12);

        jLabel2.setText("Leaving from");
        textBox1.add(jLabel2);
        jLabel2.setBounds(20, 10, 80, 16);

        textBox2.setBackground(new java.awt.Color(237, 237, 237));
        textBox2.setRoundBottomLeft(12);
        textBox2.setRoundBottomRight(12);
        textBox2.setRoundTopLeft(12);
        textBox2.setRoundTopRight(12);

        textBox3.setBackground(new java.awt.Color(237, 237, 237));
        textBox3.setRoundBottomLeft(12);
        textBox3.setRoundBottomRight(12);
        textBox3.setRoundTopLeft(12);
        textBox3.setRoundTopRight(12);

        textBox4.setBackground(new java.awt.Color(237, 237, 237));
        textBox4.setRoundBottomLeft(12);
        textBox4.setRoundBottomRight(12);
        textBox4.setRoundTopLeft(12);
        textBox4.setRoundTopRight(12);

        textBox5.setBackground(new java.awt.Color(237, 237, 237));
        textBox5.setRoundBottomLeft(12);
        textBox5.setRoundBottomRight(12);
        textBox5.setRoundTopLeft(12);
        textBox5.setRoundTopRight(12);

        jButton1.setBackground(new java.awt.Color(255, 92, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/dashboard/png/Vector (3).png"))); // NOI18N
        jButton1.setFocusable(false);

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

        scroll.setBorder(null);
        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panelItem1.setOpaque(false);
        scroll.setViewportView(panelItem1);

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
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 826, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
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
                .addGap(26, 26, 26)
                .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        notify = new Notification();
        GlassPanePopup.showPopup(notify, new DefaultOption() {
            @Override
            public float opacity() {
                return 0.03f;
            }

            @Override
            public String getLayout(Component parent, float animate) {
                float xOffset = 0.83f;
                float yOffset = 0.16f;

                return "pos " + xOffset + "al " + yOffset + "al";
            }
        });
    }//GEN-LAST:event_jLabel3MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private app.vehicle.design.PanelItem panelItem1;
    private javax.swing.JScrollPane scroll;
    private app.vehicle.design.PanelRound textBox1;
    private app.vehicle.design.PanelRound textBox2;
    private app.vehicle.design.PanelRound textBox3;
    private app.vehicle.design.PanelRound textBox4;
    private app.vehicle.design.PanelRound textBox5;
    // End of variables declaration//GEN-END:variables
}

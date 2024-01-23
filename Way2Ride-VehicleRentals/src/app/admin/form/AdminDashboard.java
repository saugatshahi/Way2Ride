package app.admin.form;

import java.awt.Color;
import java.awt.Dimension;

/**
 *
 * @author shahi
 */
public class AdminDashboard extends javax.swing.JPanel {

    public AdminDashboard() {
        initComponents();
        setBackground(Color.RED);
        setSize(new Dimension(1101, 747));
        init();
    }
    
    private void init() {
        table.fixTable(jScrollPane1);
        table.addRow(new Object[]{"1", "Saugat Shahi", "shahisaugat2022@gmail.com", "9866291003", "Kharibot, Hattiban", "IP: 192.168.1.1"});
        table.addRow(new Object[]{"1", "Saugat Shahi", "shahisaugat2022@gmail.com", "9866291003", "Kharibot, Hattiban", "IP: 192.168.1.1"});
        table.addRow(new Object[]{"1", "Saugat Shahi", "shahisaugat2022@gmail.com", "9866291003", "Kharibot, Hattiban", "IP: 192.168.1.1"});
        table.addRow(new Object[]{"1", "Saugat Shahi", "shahisaugat2022@gmail.com", "9866291003", "Kharibot, Hattiban", "IP: 192.168.1.1"});
        table.addRow(new Object[]{"1", "Saugat Shahi", "shahisaugat2022@gmail.com", "9866291003", "Kharibot, Hattiban", "IP: 192.168.1.1"});
        table.addRow(new Object[]{"1", "Saugat Shahi", "shahisaugat2022@gmail.com", "9866291003", "Kharibot, Hattiban", "IP: 192.168.1.1"});
        table.addRow(new Object[]{"1", "Saugat Shahi", "shahisaugat2022@gmail.com", "9866291003", "Kharibot, Hattiban", "IP: 192.168.1.1"});
        table.addRow(new Object[]{"1", "Saugat Shahi", "shahisaugat2022@gmail.com", "9866291003", "Kharibot, Hattiban", "IP: 192.168.1.1"});
        table.addRow(new Object[]{"1", "Saugat Shahi", "shahisaugat2022@gmail.com", "9866291003", "Kharibot, Hattiban", "IP: 192.168.1.1"});
        table.addRow(new Object[]{"1", "Saugat Shahi", "shahisaugat2022@gmail.com", "9866291003", "Kharibot, Hattiban", "IP: 192.168.1.1"});
        table.addRow(new Object[]{"1", "Saugat Shahi", "shahisaugat2022@gmail.com", "9866291003", "Kharibot, Hattiban", "IP: 192.168.1.1"});
        table.addRow(new Object[]{"1", "Saugat Shahi", "shahisaugat2022@gmail.com", "9866291003", "Kharibot, Hattiban", "IP: 192.168.1.1"});
        table.addRow(new Object[]{"1", "Saugat Shahi", "shahisaugat2022@gmail.com", "9866291003", "Kharibot, Hattiban", "IP: 192.168.1.1"});
        table.addRow(new Object[]{"1", "Saugat Shahi", "shahisaugat2022@gmail.com", "9866291003", "Kharibot, Hattiban", "IP: 192.168.1.1"});
        table.addRow(new Object[]{"1", "Saugat Shahi", "shahisaugat2022@gmail.com", "9866291003", "Kharibot, Hattiban", "IP: 192.168.1.1"});
        table.addRow(new Object[]{"1", "Saugat Shahi", "shahisaugat2022@gmail.com", "9866291003", "Kharibot, Hattiban", "IP: 192.168.1.1"});
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new app.vehicle.design.PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new app.vehicle.table.Table();
        card1 = new app.admin.menu.Card();
        card2 = new app.admin.menu.Card();
        card3 = new app.admin.menu.Card();
        card4 = new app.admin.menu.Card();

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(20);
        panelRound1.setRoundBottomRight(20);
        panelRound1.setRoundTopLeft(20);
        panelRound1.setRoundTopRight(20);

        table.setAutoCreateRowSorter(true);
        table.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SN", "Name", "Email Address", "Contact", "Location", "Geo-Location"
            }
        ));
        table.setFocusable(false);
        table.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1002, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(card4, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private app.admin.menu.Card card1;
    private app.admin.menu.Card card2;
    private app.admin.menu.Card card3;
    private app.admin.menu.Card card4;
    private javax.swing.JScrollPane jScrollPane1;
    private app.vehicle.design.PanelRound panelRound1;
    private app.vehicle.table.Table table;
    // End of variables declaration//GEN-END:variables
}

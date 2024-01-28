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
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private app.vehicle.design.PanelRound panelRound1;
    private app.vehicle.table.Table table;
    // End of variables declaration//GEN-END:variables
}

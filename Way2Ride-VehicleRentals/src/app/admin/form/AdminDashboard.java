package app.admin.form;

import app.vehicle.database.MySqlConnection;
import java.awt.Color;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Arrays;
import javax.swing.table.DefaultTableModel;

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
     loadDataFromDatabase();
    }
    private void loadDataFromDatabase() {
    MySqlConnection mySqlConnection = new MySqlConnection();
    Connection connection = mySqlConnection.openConnection();

    if (connection != null) {
        try {
            String query = "SELECT EmailAddress,FullName,ContactNo,Country,HomeAddress FROM user_details "
                    + "WHERE EmailAddress IS NOT NULL "
                    + "ORDER BY EmailAddress DESC";
            ResultSet resultSet = mySqlConnection.runQuery(connection, query);

            // Get metadata for column names
            java.sql.ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            String[] columnNames = new String[columnCount];

            for (int i = 1; i <= columnCount; i++) {
                columnNames[i - 1] = metaData.getColumnName(i);
                System.out.println("Column Name: " + metaData.getColumnName(i));
            }

            // Set column names to the table model
            DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
            table.setModel(tableModel);

            // Populate table with data
            while (resultSet.next()) {
                Object[] rowData = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    rowData[i - 1] = resultSet.getObject(i);
                }
                tableModel.addRow(rowData);
                System.out.print(Arrays.toString(rowData));
            }

            mySqlConnection.closeConnection(connection);

        } catch (Exception e) {
            e.printStackTrace();
        }
    } else {
        System.out.println("Database connection is null. Unable to retrieve data.");
    }
    double overallTotalAmount = calculateOverallTotalAmount(); // Implement this method
        card1.setOverallTotalAmount(overallTotalAmount);
        int numberOfUsers = calculateNumberOfUsers(); // Implement this method
        card2.setNumberOfUsers(numberOfUsers);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new app.vehicle.design.PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new app.vehicle.table.Table();
        card1 = new app.admin.menu.Card();
        card2 = new app.admin.menu.Card();

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
        table.setEnabled(false);
        table.setFocusable(false);
        table.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        table.getTableHeader().setResizingAllowed(false);
        table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1045, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(13, Short.MAX_VALUE)
                        .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

private double calculateOverallTotalAmount() {
        double overallTotalAmount = 0.0;

        // Implement the logic to calculate the overall total amount from the database
        // You may need to query your user_totals table or another relevant table for this information

        MySqlConnection mySqlConnection = new MySqlConnection();
        Connection connection = mySqlConnection.openConnection();

        if (connection != null) {
            try {
                String query = "SELECT SUM(total_amount) FROM user_totals";
                ResultSet resultSet = mySqlConnection.runQuery(connection, query);

                if (resultSet.next()) {
                    overallTotalAmount = resultSet.getDouble(1);
                }

                mySqlConnection.closeConnection(connection);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return overallTotalAmount;
    }
private int calculateNumberOfUsers() {
        int numberOfUsers = 0;

        MySqlConnection mySqlConnection = new MySqlConnection();
        Connection connection = mySqlConnection.openConnection();

        if (connection != null) {
            try {
                String query = "SELECT COUNT(*) FROM user_details";
                ResultSet resultSet = mySqlConnection.runQuery(connection, query);

                if (resultSet.next()) {
                    numberOfUsers = resultSet.getInt(1);
                }

                mySqlConnection.closeConnection(connection);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return numberOfUsers;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private app.admin.menu.Card card1;
    private app.admin.menu.Card card2;
    private javax.swing.JScrollPane jScrollPane1;
    private app.vehicle.design.PanelRound panelRound1;
    private app.vehicle.table.Table table;
    // End of variables declaration//GEN-END:variables
}

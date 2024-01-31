package app.vehicle.form;

import app.admin.controller.TwoWheelersController;
import app.vehicle.component.BikeItem;
import app.vehicle.dao.CategoryDAO;
import java.util.List;

public class TwoWheeler extends javax.swing.JPanel {

    public TwoWheeler() {
        initComponents();
        int i = 0;
        do {
            addBikeCategory(); 
            i++;
        }while(i <= 5);
        
       
    }
    
    private void addBikeCategory() {
    CategoryDAO categoryDAO = new CategoryDAO();
    List<TwoWheelersController> categoryBikes = categoryDAO.fetchAllBikesInDescendingOrder();

    for (TwoWheelersController categoryData : categoryBikes) {
        panelItem1.add(new BikeItem(categoryData.getBikeName(), categoryData.getBrand(), categoryData.getSpeed(), categoryData.getBikePower(), categoryData.getPrice(), categoryData.getBikeImage()));
    }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        panelItem1 = new app.vehicle.design.PanelItem();

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panelItem1.setOpaque(false);
        jScrollPane1.setViewportView(panelItem1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1067, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private app.vehicle.design.PanelItem panelItem1;
    // End of variables declaration//GEN-END:variables
}

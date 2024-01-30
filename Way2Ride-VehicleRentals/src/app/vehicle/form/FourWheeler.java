package app.vehicle.form;

import app.admin.controller.FourWheelersController;
import app.vehicle.component.CarItem;
import app.vehicle.dao.CategoryDAO;
import java.util.List;


public final class FourWheeler extends javax.swing.JPanel {

    public FourWheeler() {
        initComponents();
        addCategory();
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

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        panelItem1 = new app.vehicle.design.PanelItem();

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setViewportView(panelItem1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private app.vehicle.design.PanelItem panelItem1;
    // End of variables declaration//GEN-END:variables
}

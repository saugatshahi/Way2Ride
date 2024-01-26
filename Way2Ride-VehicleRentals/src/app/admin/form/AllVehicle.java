package app.admin.form;

import app.vehicle.component.CarItem;
import app.vehicle.dao.CategoryDAO;
import app.admin.controller.CategoryController;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author shahi
 */
public final class AllVehicle extends javax.swing.JPanel {
    /**
     * Creates new form AllVehicle
     */
    public AllVehicle() {
        initComponents();
        addCategory();
    }
    
    private void addCategory() {
    CategoryDAO categoryDAO = new CategoryDAO();
    List<CategoryController> categoryVehicle = categoryDAO.fetchAllCategoryInDescendingOrder();

    for (CategoryController categoryData : categoryVehicle) {
        panelItem1.add(new AdminCarCategory(categoryData.getCategory(), categoryData.getBrand(),
                       categoryData.getPowerSource(), categoryData.getLimitations(), 
                       "NRs." + categoryData.getPrice(), categoryData.getQuantity(), categoryData.getCarImage()));
    }
    repaint();
    revalidate();
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        panelItem1 = new app.vehicle.design.PanelItem();

        jScrollPane1.setViewportView(panelItem1);
        panelItem1.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 979, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private app.vehicle.design.PanelItem panelItem1;
    // End of variables declaration//GEN-END:variables

}

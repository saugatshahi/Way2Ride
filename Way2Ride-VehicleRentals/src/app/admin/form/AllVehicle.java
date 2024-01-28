package app.admin.form;

import app.vehicle.dao.CategoryDAO;
import app.admin.controller.CategoryController;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

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
        setSize(new Dimension(1101, 747));
        addCategory();
    }
    
    private void addCategory() {
    CategoryDAO categoryDAO = new CategoryDAO();
    List<CategoryController> categoryVehicle = categoryDAO.fetchAllCategoryInDescendingOrder();

    if (categoryVehicle.isEmpty()) {
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/app/admin/logo/13315296_5206507-removebg-preview.png"));
        JLabel contentNotFoundLabel = new JLabel("", imageIcon, JLabel.CENTER);
        panelItem1.setLayout(new BorderLayout());
        panelItem1.add(contentNotFoundLabel, BorderLayout.CENTER);
    } else {
        for (CategoryController categoryData : categoryVehicle) {
            panelItem1.add(new AdminCarCategory(categoryData.getBrand(), categoryData.getPrice(), categoryData.getCarImage()));
        }
    }
    repaint();
    revalidate();
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        panelItem1 = new app.vehicle.design.PanelItem();

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private app.vehicle.design.PanelItem panelItem1;
    // End of variables declaration//GEN-END:variables

}

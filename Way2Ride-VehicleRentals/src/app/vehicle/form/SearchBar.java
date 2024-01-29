package app.vehicle.form;

import app.admin.controller.CategoryController;
import app.vehicle.dao.CategoryDAO;
import app.vehicle.design.DataSearch;
import app.vehicle.design.EventClick;
import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JPopupMenu;

/**
 *
 * @author shahi
 */
public class SearchBar extends javax.swing.JPanel {
    
    private JPopupMenu menu;
    private PanelSearch search;
    
    public SearchBar() {
        initComponents();
        menu = new JPopupMenu();
        search = new PanelSearch();
        search.setFocusable(false);
        menu.setBorder(BorderFactory.createLineBorder(Color.decode("#FF5C00")));
        menu.add(search);
        menu.setFocusable(false);
        
        textSearch.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Search your favourite vehicles here");
        
        textSearch.addKeyListener(new java.awt.event.KeyAdapter() {
        @Override
        public void keyPressed(java.awt.event.KeyEvent evt) {
            if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                textSearchActionPerformed(null); // Call the search action method
            }
        }
        });
        
        search.addEventClick(new EventClick() {
            @Override
            public void itemClick(DataSearch data) {
                menu.setVisible(false);
                textSearch.setText(data.getText());
                System.out.println("Item Clicked: " + data.getText());
            }
            
            @Override
            public void itemRemove(Component com, DataSearch data) {
                search.remove(com);
                repaint();
                revalidate();
                removeHistory(data.getText());
                menu.setPopupSize(menu.getWidth(), (search.getItemSize()* 38) + 6);
                if (search.getItemSize() == 0) {
                    menu.setVisible(false);
                }
                System.out.println("Item Removed: " + data.getText());
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textSearch = new app.vehicle.design.SearchTextField();

        textSearch.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        textSearch.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/app/dashboard/png/Search.png"))); // NOI18N
        textSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textSearchMouseClicked(evt);
            }
        });
        textSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSearchActionPerformed(evt);
            }
        });
        textSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textSearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 956, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSearchActionPerformed
        String enteredText = textSearch.getText().trim();
    if (!enteredText.isEmpty()) {
        String[] newDataStory = new String[dataStory.length + 1];
        System.arraycopy(dataStory, 0, newDataStory, 0, dataStory.length);
        newDataStory[dataStory.length] = enteredText;
        dataStory = newDataStory;
        System.out.println("Added to dataStory: " + enteredText);
    }
    menu.setVisible(false);
    }//GEN-LAST:event_textSearchActionPerformed

    private void textSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textSearchMouseClicked
        menu.setVisible(false);
    }//GEN-LAST:event_textSearchMouseClicked

    private void textSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textSearchKeyReleased
        String text = textSearch.getText().trim().toLowerCase();
        search.setData(search(text));
        if (!text.isBlank() && search.getItemSize() > 0) {
            menu.show(textSearch, 0, textSearch.getHeight());
            menu.setPopupSize(menu.getWidth(), (search.getItemSize()* 38) + 6);
        } else {
            menu.setVisible(false);
        }
    }//GEN-LAST:event_textSearchKeyReleased
    
    private List<DataSearch> search(String search) {
    int limitData = 7;
    List<DataSearch> list = new ArrayList<>();
    
    CategoryDAO categoryDAO = new CategoryDAO();
    List<CategoryController> categoryVehicle = categoryDAO.fetchAllCategoryInDescendingOrder();

    for (CategoryController categoryData : categoryVehicle) {
        String vehicleName = categoryData.getBrand(); 
        
        if (vehicleName.toLowerCase().contains(search.toLowerCase())) {
            boolean story = isVehicles(vehicleName); 
            
            if (story) {
                list.add(0, new DataSearch(vehicleName, story));
            } else {
                list.add(new DataSearch(vehicleName, story));
            }
            if (list.size() == limitData) {
                break;
            }
        }
    }
    return list;
}
    
    String dataStory[] = {};
    
    private void removeHistory(String text) {
       for (int i = 0; i < dataStory.length; i++) {
           String d = dataStory[i];
            if (d.toLowerCase().equals(text.toLowerCase())) {
                dataStory[i] = "";
            }
        } 
    }
    
    private boolean isVehicles(String text) {
        
        for (String d: dataStory) {
            if (d.toLowerCase().equals(text.toLowerCase())) {
                return true;
            }
        }
        return false;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private app.vehicle.design.SearchTextField textSearch;
    // End of variables declaration//GEN-END:variables
}

package app.admin.main;

import app.admin.form.AddNotification;
import app.admin.form.AdminDashboard;

import app.admin.form.AllVehicle;
import app.admin.menu.Menu1;
import app.admin.menu.MenuEvent1;
import app.vehicle.main.Application;
import java.awt.BorderLayout;
import java.awt.Component;

/**
 *
 * @author shahi
 */
public class RunAdminPanel extends javax.swing.JFrame {
//
//    private AllVehicle allVehicle;
//   
//    private AddNotification addNotification;
//    
//    public RunAdminPanel() {
//        initComponents();
//        
//        
//        allVehicle = new AllVehicle();
//       
//        
//        addNotification = new AddNotification();
//        setContentPane(addNotification);
//        
//    }
    
     private static RunAdminPanel adminMain;
    private AdminDashboard adminDashboard;
    public RunAdminPanel() {
        initComponents();
        adminDashboard = new AdminDashboard();
//        setContentPane(adminDashboard);
//        init();
       menu11.setEvent1(new MenuEvent1(){
        @Override
        public void selected(int index, int subIndex){
            System.out.println(index+" "+ subIndex);
            if (index == 0 && subIndex == 0) {
                showForm(new AddNotification());
                System.out.println("Hello");
            } else if (index == 7) {
                Application.openLoginForm();
//                this.dispose();
            }
            else {
                showForm(new AllVehicle());
            }
        }
       });
    }
//    private void init() {
//        adminMain = this;
//        menu11.setEvent1(int index, int indexSubMenu) -> {
//            if (index == 0 && indexSubMenu == 0) {
//                showForm(new AddNotification());
//                System.out.print("Hello");
//            } else if (index == 7) {
//                Application.openLoginForm();
////                this.dispose();
//            }
//            else {
//                showForm(new AdminPanel());
//            }
//        });
//        menuAdmin1.setSelectedIndex(0, 0);
//    }
    
    public void showForm(Component com) {
        body.removeAll();
        body.add(com);
        body.repaint();
        body.revalidate();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        menu11 = new app.admin.menu.Menu1();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1032, Short.MAX_VALUE)
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8316, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu11, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menu11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new RunAdminPanel().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private app.admin.menu.Menu1 menu11;
    // End of variables declaration//GEN-END:variables
}

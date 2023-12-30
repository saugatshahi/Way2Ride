package app.vehicle.main;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.extras.FlatAnimatedLafChange;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import app.vehicle.authentication.LoginForm;
import app.vehicle.sticky.MainForm;
import app.vehicle.authentication.RegisterCustomer;
import app.vehicle.authentication.RegisterDocument;
import app.vehicle.authentication.SecurityQsnForm;
import raven.toast.Notifications;
import app.vehicle.dao.AuthDAO;
import app.vehicle.model.Customer;
import app.vehicle.model.License;
import app.vehicle.model.Security;
import java.sql.SQLException;

/**
 * 
 *@author shahi
**/


public class Application extends javax.swing.JFrame {

    private static Application application;
    private final MainForm mainForm;
    private final LoginForm loginForm;
    private final RegisterCustomer signupForm;
    private final RegisterDocument customerDocs;
    private final SecurityQsnForm securityQsnForm;

    public Application() {
        initComponents();
        setSize(new Dimension(1366, 768));
        setLocationRelativeTo(null);
        mainForm = new MainForm();
        loginForm = new LoginForm();
        signupForm = new RegisterCustomer();
        customerDocs = new RegisterDocument();
        securityQsnForm = new SecurityQsnForm();
        
        setContentPane(loginForm);
        Notifications.getInstance().setJFrame(this);
    }

    public static void changeContentPane(Component component) {
        component.applyComponentOrientation(application.getComponentOrientation());
        application.mainForm.changeContentPane(component);
    }
    
    public static void openRegistrationForm() {
        FlatAnimatedLafChange.showSnapshot();
        application.setContentPane(application.signupForm);
        application.signupForm.applyComponentOrientation(application.getComponentOrientation());
        SwingUtilities.updateComponentTreeUI(application.signupForm);
        FlatAnimatedLafChange.hideSnapshotWithAnimation();
    }
    
    public static void openCustomerDocsForm() {
        FlatAnimatedLafChange.showSnapshot();
        application.setContentPane(application.customerDocs);
        application.customerDocs.applyComponentOrientation(application.getComponentOrientation());
        SwingUtilities.updateComponentTreeUI(application.customerDocs);
        FlatAnimatedLafChange.hideSnapshotWithAnimation();
    }
    
    public static void openSecurityQsnForm() {
        FlatAnimatedLafChange.showSnapshot();
        application.setContentPane(application.securityQsnForm);
        application.securityQsnForm.applyComponentOrientation(application.getComponentOrientation());
        SwingUtilities.updateComponentTreeUI(application.securityQsnForm);
        FlatAnimatedLafChange.hideSnapshotWithAnimation();
    }
    
    public static void openLoginForm() {
        FlatAnimatedLafChange.showSnapshot();
        application.setContentPane(application.loginForm);
        application.loginForm.applyComponentOrientation(application.getComponentOrientation());
        SwingUtilities.updateComponentTreeUI(application.loginForm);
        FlatAnimatedLafChange.hideSnapshotWithAnimation();
    }

    public static void getIntoApp() {
        FlatAnimatedLafChange.showSnapshot();
        application.setContentPane(application.mainForm);
        application.mainForm.applyComponentOrientation(application.getComponentOrientation());
        setSelectedMenu(0, 0);
        application.mainForm.hideMenu();
        SwingUtilities.updateComponentTreeUI(application.mainForm);
        FlatAnimatedLafChange.hideSnapshotWithAnimation();
    }

    public static void logout() {
        FlatAnimatedLafChange.showSnapshot();
        application.setContentPane(application.loginForm);
        application.loginForm.applyComponentOrientation(application.getComponentOrientation());
        SwingUtilities.updateComponentTreeUI(application.loginForm);
        FlatAnimatedLafChange.hideSnapshotWithAnimation();
    }

    public static void setSelectedMenu(int index, int subIndex) {
        application.mainForm.setSelectedMenu(index, subIndex);
    }
    
    public static boolean registerAccount(RegisterCustomer signup, RegisterDocument rd, SecurityQsnForm sqf) {
        AuthDAO auth = new AuthDAO();
        Customer customer = new Customer(
                signup.getFullNameTextField(),
                signup.getEmailTextField(),
                signup.getContactTextField(),
                signup.getCountryTextField(),
                signup.getAddressTextField(),
                signup.getPwdTextField()   
        );
        
//        RegisterDocument rd = new RegisterDocument();
        License license = new License(
                rd.getLicenseNumber(),
                rd.getDateOfIssue(),
                rd.getDateOfExpiry()
        );
        
//        SecurityQsnForm sqf = new SecurityQsnForm();
        Security security = new Security(
                sqf.getSecurityAnswer1(),
                sqf.getSecurityAnswer2(),
                sqf.getSecurityAnswer3()
        );
        
        boolean check = auth.saveCustomerData(customer, license, security);
        
        if(check == true) {
            JOptionPane.showMessageDialog(null, "Register Successfull");
        }
        else {
            JOptionPane.showMessageDialog(null, "Register UnSuccessfull");
        }
        return check;
    }  
    
//    public static boolean authenticateUser(String emailAddress, String enteredPwd) {
////        AuthDAO authDAO = new AuthDAO();
////        try {
////            String user = authDAO.getStoredPassword(emailAddress);
////            
////            if (user != null) {
////                String storedHashedPassword = authDAO.getStoredPassword(emailAddress);
////                if(enteredPwd.equals(storedHashedPassword)) {
////                    return true;
////                }
////            }
////        } catch (SQLException e) {
////            
////        }
////        return false;
//    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu1 = new app.vehicle.menu.Menu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        menu1.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu1, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        
        FlatRobotoFont.installSemiBold();
        FlatLaf.registerCustomDefaultsSource("app.vehicle.theme");
        UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 13));
        FlatLightLaf.setup();
        
        java.awt.EventQueue.invokeLater(() -> {
            application = new Application();
            application.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private app.vehicle.menu.Menu menu1;
    // End of variables declaration//GEN-END:variables
}

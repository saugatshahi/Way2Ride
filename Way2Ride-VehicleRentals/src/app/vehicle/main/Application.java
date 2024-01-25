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
import app.vehicle.menu.Menu;
import app.vehicle.model.Customer;
import app.vehicle.model.License;
import app.vehicle.model.Security;
import java.sql.SQLException;
import raven.glasspanepopup.GlassPanePopup;

/**
 * 
 *@author shahi
**/


public class Application extends javax.swing.JFrame {

    private static Application application;
    private final MainForm mainForm;
    private final LoginForm loginForm;
    private final RegisterCustomer registerCustomer;
    private final RegisterDocument registerDocument;
    private final SecurityQsnForm securityQsn;
    private final Menu menu;

    public Application() {
        initComponents();
        setSize(new Dimension(1366, 768));
        setLocationRelativeTo(null);
        mainForm = new MainForm();
        loginForm = new LoginForm();
        registerCustomer = new RegisterCustomer();
        registerDocument = new RegisterDocument();
        securityQsn = new SecurityQsnForm();
        menu = new Menu();
        
        setContentPane(loginForm);
        Notifications.getInstance().setJFrame(this);
        GlassPanePopup.install(this);
    }

    public static void changeContentPane(Component component) {
        component.applyComponentOrientation(application.getComponentOrientation());
        application.mainForm.changeContentPane(component);
    }
    
    public static void openRegistrationForm() {
        FlatAnimatedLafChange.showSnapshot();
        application.setContentPane(application.registerCustomer);
        application.registerCustomer.applyComponentOrientation(application.getComponentOrientation());
        SwingUtilities.updateComponentTreeUI(application.registerCustomer);
        FlatAnimatedLafChange.hideSnapshotWithAnimation();
    }
    
    public static void openCustomerDocsForm() {
        FlatAnimatedLafChange.showSnapshot();
        application.setContentPane(application.registerDocument);
        application.registerDocument.applyComponentOrientation(application.getComponentOrientation());
        SwingUtilities.updateComponentTreeUI(application.registerDocument);
        FlatAnimatedLafChange.hideSnapshotWithAnimation();
    }
    
    public static void openSecurityQsnForm() {
        FlatAnimatedLafChange.showSnapshot();
        application.setContentPane(application.securityQsn);
        application.securityQsn.applyComponentOrientation(application.getComponentOrientation());
        SwingUtilities.updateComponentTreeUI(application.securityQsn);
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
    
    public static boolean registerAccount(RegisterCustomer registerCustomer, RegisterDocument registerDocument, SecurityQsnForm securityQsn) throws SQLException {
        
        AuthDAO auth = new AuthDAO();
        Customer customer = new Customer(
                registerCustomer.getEmailTextField(),
                registerCustomer.getFullNameTextField(),
                registerCustomer.getContactTextField(),
                registerCustomer.getCountryTextField(),
                registerCustomer.getAddressTextField(),
                registerCustomer.getPwdTextField()
        );
        
        License license = new License(
                registerDocument.getImageData(),
                registerDocument.getLicenseNumber(),
                registerDocument.getDateOfIssue(),
                registerDocument.getDateOfExpiry()
        );
        
        Security security = new Security(
                securityQsn.getSecurityAnswer1(),
                securityQsn.getSecurityAnswer2(),
                securityQsn.getSecurityAnswer3()
        );
        boolean check = auth.saveCustomerData(customer, license, security);
        return check;
    } 
    
    public static boolean performLogin(String emailAddress, String enteredPassword) {
        AuthDAO auth = new AuthDAO();

        AuthDAO.LoginStatus loginStatus = auth.validateLogin(emailAddress, enteredPassword);

        switch (loginStatus) {
            case SUCCESS -> {
                Notifications.getInstance().show(Notifications.Type.INFO, Notifications.Location.TOP_CENTER, "Successfully logged in");
//                application.menu.setHeaderText(emailAddress);
                return true;
            }
            case INVALID_PASSWORD -> JOptionPane.showMessageDialog(null, "Invalid password. Please try again.");
            case USER_NOT_FOUND -> JOptionPane.showMessageDialog(null, "User does not exist. Please register first.");
            case ERROR -> JOptionPane.showMessageDialog(null, "An error occurred. Please try again later.");
            default -> {
            }
        }
        return false;
    }
    
    public static boolean performProfileUpdate(String emailAddress, byte[] profilePicture) {
        AuthDAO auth = new AuthDAO();
        boolean success = auth.updateProfilePicture(application.loginForm.getUserEntry(), application.menu.getProfileImage());
        return success;
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu1 = new app.vehicle.menu.Menu();
        dashboard1 = new app.vehicle.form.Dashboard();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        menu1.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dashboard1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dashboard1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        
//        FlatRobotoFont.install();
        FlatLaf.registerCustomDefaultsSource("app.vehicle.theme");
        UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 13));
        FlatLightLaf.setup();
        
        java.awt.EventQueue.invokeLater(() -> {
            application = new Application();
            application.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private app.vehicle.form.Dashboard dashboard1;
    private app.vehicle.menu.Menu menu1;
    // End of variables declaration//GEN-END:variables
}

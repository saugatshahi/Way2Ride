package trialapp.main;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
//import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.UIManager;
import trialapp.forms.MainForm;

public class App extends javax.swing.JFrame {
    
    private static App mainApp;
    private final MainForm mainForm;

    public App() {
        initComponents();
        setSize(new Dimension(1366, 768));
        setLocationRelativeTo(null);
        mainForm = new MainForm();
        setContentPane(mainForm);
//        Notifications.getInstance().setJFrame(this);
    }
    
    public static void showForm(Component component) {
        component.applyComponentOrientation(mainApp.getComponentOrientation());
        mainApp.mainForm.showForm(component);
    }
    
    public static void setSelectedMenu(int index, int subIndex) {
        mainApp.mainForm.setSelectedMenu(index, subIndex);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        FlatRobotoFont.install();
        FlatLaf.registerCustomDefaultsSource("trialapp.property");
        UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 13));
        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(() -> {
            mainApp = new App();
            mainApp.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

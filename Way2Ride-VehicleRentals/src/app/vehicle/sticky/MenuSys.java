import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuSys extends JPanel {

    private final JButton[][] buttons;

    public MenuSys() {
        setLayout(new AdminDashboardLayout());

        // Create buttons with submenus
        String[][] buttonLabels = {
                {"Manage Vehicles", "Add Vehicle", "Remove Vehicle"},
                {"Manage Users", "Add User", "Remove User"},
                {"View Reports", "Generate Report"},
                {"User Management", "View & Manage", "Verify & Update", "User History"},
                {"Vehicle Management", "Add, Edit, Remove", "Track Availability", "Monitor Performance"},
                {"Booking Management", "View & Manage Requests", "Confirm or Reject", "Monitor Booking History"},
                {"Financial Tracking", "Monitor Revenue", "Generate Reports", "Track Payments"},
                {"Dashboard Analytics", "Display KPIs", "User Behavior Insights", "Visualize Data"},
                {"Notifications and Alerts", "Critical Event Alerts", "User Notifications", "Notification Preferences"}
        };

        buttons = new JButton[buttonLabels.length][];

        for (int i = 0; i < buttonLabels.length; i++) {
            buttons[i] = new JButton[buttonLabels[i].length];
            for (int j = 0; j < buttonLabels[i].length; j++) {
                buttons[i][j] = createButton(buttonLabels[i][j]);
                add(buttons[i][j]);
                addSubMenu(buttons[i][j], buttonLabels[i][j]);
            }
        }

        // Add action listeners or any other initialization as needed
    }

    private JButton createButton(String text) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.PLAIN, 16));

        // Set null border and align text to the left
        button.setBorder(null);
        button.setHorizontalAlignment(JButton.LEFT);

        return button;
    }

    private void addSubMenu(JButton button, String buttonLabel) {
        JPopupMenu subMenu = new JPopupMenu();
        for (int i = 0; i < 3; i++) {
            JMenuItem item = new JMenuItem("SubMenu " + i);
            subMenu.add(item);
        }

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (subMenu.isVisible()) {
                    subMenu.setVisible(false);
                } else {
                    subMenu.show(button, 0, button.getHeight());
                }
            }
        });
    }

    private class AdminDashboardLayout implements LayoutManager {

        private static final int BUTTON_HEIGHT = 40;
        private static final int BUTTON_GAP = 5; // Adjust as needed

        @Override
        public void addLayoutComponent(String name, Component comp) {
        }

        @Override
        public void removeLayoutComponent(Component comp) {
        }

        @Override
        public Dimension preferredLayoutSize(Container parent) {
            synchronized (parent.getTreeLock()) {
                return new Dimension(500, 300);
            }
        }

        @Override
        public Dimension minimumLayoutSize(Container parent) {
            synchronized (parent.getTreeLock()) {
                return new Dimension(200, 150);
            }
        }

        @Override
        public void layoutContainer(Container parent) {
            synchronized (parent.getTreeLock()) {
                Insets insets = parent.getInsets();
                int x = insets.left;
                int y = insets.top;
                int width = parent.getWidth() - (insets.left + insets.right);
                int height = parent.getHeight() - (insets.top + insets.bottom);

                int buttonWidth = width - 40; // Adjust as needed
                int startY = y; // No gap at the top

                for (int i = 0; i < buttons.length; i++) {
                    for (int j = 0; j < buttons[i].length; j++) {
                        buttons[i][j].setBounds(x + 20, startY + (i * (BUTTON_HEIGHT + BUTTON_GAP)), buttonWidth, BUTTON_HEIGHT);
                    }
                }
            }
        }
    }
}
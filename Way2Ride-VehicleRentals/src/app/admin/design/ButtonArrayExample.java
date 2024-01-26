package app.admin.design;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonArrayExample extends JPanel {
    private JButton[] mainMenuButtons;
    private JPanel[] subMenuPanels;

    public ButtonArrayExample() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        String[] mainMenuNames = {
            "Dashboard",
            "Manage Vehicle",
            "Manage Bookings",
            "User management",
            "Analytics",
            "Settings",
            "Logout"
        };

        String[][] subMenuNames = {
            {}, // Dashboard
            {"Add Vehicle", "All Vehicle", "Edit details"}, // Manage Vehicle
            {"View all bookings", "History"}, // Manage Bookings
            {}, // User management
            {"Sales analytics"}, // Analytics
            {"Notification preferences", "Security"}, // Settings
            {} // Logout
        };

        mainMenuButtons = new JButton[mainMenuNames.length];
        subMenuPanels = new JPanel[mainMenuNames.length];

        for (int i = 0; i < mainMenuNames.length; i++) {
            mainMenuButtons[i] = new JButton(mainMenuNames[i]);
            mainMenuButtons[i].addActionListener(new MainMenuButtonClickListener(i));
            add(mainMenuButtons[i]);

            JPanel subMenuPanel = new JPanel();
            subMenuPanel.setLayout(new BoxLayout(subMenuPanel, BoxLayout.Y_AXIS));
            subMenuPanels[i] = subMenuPanel;

            for (int j = 0; j < subMenuNames[i].length; j++) {
                JButton subMenuButton = new JButton(subMenuNames[i][j]);
                subMenuPanel.add(subMenuButton);
            }

            // Initially hide all submenus
            subMenuPanel.setVisible(false);
            add(subMenuPanel);
        }
    }

    @Override
    public Dimension getPreferredSize() {
        int totalHeight = 757;
        int gap = 15 * (mainMenuButtons.length + 1); // 15 pixels gap between each button and at the top and bottom
        int buttonHeight = (totalHeight - gap) / mainMenuButtons.length;
        return new Dimension(200, totalHeight); // Adjust width as needed
    }

    private class MainMenuButtonClickListener implements ActionListener {
        private int index;

        public MainMenuButtonClickListener(int index) {
            this.index = index;
        }

        public void actionPerformed(ActionEvent e) {
            toggleSubMenuVisibility(index);
        }
    }

    private void toggleSubMenuVisibility(int index) {
        boolean isVisible = subMenuPanels[index].isVisible();
        subMenuPanels[index].setVisible(!isVisible);
        revalidate();
    }
}

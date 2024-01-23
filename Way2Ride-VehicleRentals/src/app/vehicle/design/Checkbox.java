package app.vehicle.design;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Checkbox extends JPanel {
    private final JRadioButton[] radioButtons;
    private final ButtonGroup buttonGroup;
    private final String[] buttonText = {
            "Mini",
            "Standard",
            "Compact",
            "Van",
            "Economy",
            "Other"
    };

    public Checkbox() {
        // Set the custom layout manager
        setLayout(new ColumnLayoutManager(10));

        buttonGroup = new ButtonGroup();
        radioButtons = new JRadioButton[buttonText.length];

        // Initialize radio buttons and add ActionListener
        for (int i = 0; i < buttonText.length; i++) {
            radioButtons[i] = new JRadioButton(buttonText[i]);
            radioButtons[i].setFont(new Font("Yu Gothic UI Light", Font.BOLD, 13));
            radioButtons[i].setForeground(new Color(81, 81, 81));

            // Set the custom icon for the selected state (tick mark)
            radioButtons[i].setSelectedIcon(new TickIcon());

            buttonGroup.add(radioButtons[i]);
            radioButtons[i].addActionListener(new RadioButtonListener(i));
            add(radioButtons[i]);
        }
    }

    // Custom LayoutManager for arranging components in a column with a gap
    private static class ColumnLayoutManager implements LayoutManager {
        private int gap;

        public ColumnLayoutManager(int gap) {
            this.gap = gap;
        }

        @Override
        public void addLayoutComponent(String name, Component comp) {
        }

        @Override
        public void removeLayoutComponent(Component comp) {
        }

        @Override
        public Dimension preferredLayoutSize(Container parent) {
            return layoutSize(parent, true);
        }

        @Override
        public Dimension minimumLayoutSize(Container parent) {
            return layoutSize(parent, false);
        }

        private Dimension layoutSize(Container parent, boolean preferred) {
            synchronized (parent.getTreeLock()) {
                int n = parent.getComponentCount();
                int width = 0;
                int height = 0;

                for (int i = 0; i < n; i++) {
                    Component comp = parent.getComponent(i);
                    Dimension dim = preferred ? comp.getPreferredSize() : comp.getMinimumSize();
                    height += dim.height;
                    width = Math.max(width, dim.width);
                }

                height += (n - 1) * gap;
                Insets insets = parent.getInsets();
                return new Dimension(width + insets.left + insets.right, height + insets.top + insets.bottom);
            }
        }

        @Override
        public void layoutContainer(Container parent) {
            synchronized (parent.getTreeLock()) {
                int n = parent.getComponentCount();
                Insets insets = parent.getInsets();
                int x = insets.left;
                int y = insets.top;

                for (int i = 0; i < n; i++) {
                    Component comp = parent.getComponent(i);
                    Dimension dim = comp.getPreferredSize();
                    comp.setBounds(x, y, dim.width, dim.height);
                    y += dim.height + gap;
                }
            }
        }
    }

    // ActionListener to handle radio button events
    private class RadioButtonListener implements ActionListener {
        private int index;

        public RadioButtonListener(int index) {
            this.index = index;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            // Do something when a radio button is selected (if needed)
        }
    }

    // Custom Icon for the selected state (tick mark)
    private static class TickIcon implements Icon {
        private static final int SIZE = 15;

        @Override
        public void paintIcon(Component c, Graphics g, int x, int y) {
            ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            g.setColor(Color.BLACK);
            g.drawLine(x + 2, y + SIZE / 2, x + SIZE / 2, y + SIZE - 2);
            g.drawLine(x + SIZE / 2, y + SIZE - 2, x + SIZE - 2, y + 2);
        }

        @Override
        public int getIconWidth() {
            return SIZE;
        }

        @Override
        public int getIconHeight() {
            return SIZE;
        }
    }
}

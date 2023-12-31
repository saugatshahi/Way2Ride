package trialapp.other;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.ui.FlatUIUtils;
import com.formdev.flatlaf.util.UIScale;


import javax.swing.JButton;
import javax.swing.JPanel;
//import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import trialapp.theme.LightDarkMode;
import trialapp.theme.ToolBarAccentColor;

public class NewMenu extends JPanel {

    private final String[][] buttonLabels = {
        {"MAIN"},
        {"Dashboard"},
        {"WEB-APP"},
        {"Email", "Inbox", "Read"},
        {"Chat"},
        {"Calendar"},
        {"COMPONENT"}
    };

    private final List<MenuEvent> events = new ArrayList<>();

    public NewMenu() {
        init();
    }

    private void init() {
        setLayout(new CustomLayout());
        
        putClientProperty(FlatClientProperties.STYLE, ""
                + "border:20,2,2,2;"
                + "background:$Menu.background;"
                + "arc:10");
        panelMenu = new JPanel(new MenuItemLayout(this));
        panelMenu.putClientProperty(FlatClientProperties.STYLE, ""
                + "border:5,5,5,5;"
                + "background:$Menu.background");
        
        createMenu();
        
        lightDarkMode = new LightDarkMode();
        toolBarAccentColor = new ToolBarAccentColor(this);
        
        toolBarAccentColor.setVisible(FlatUIUtils.getUIBoolean("AccentControl.show", false));
        
        add(lightDarkMode);
//        add(toolBarAccentColor);
        
        Component[] components = panelMenu.getComponents();
for (Component comp : components) {
    System.out.println(comp.getClass().getSimpleName());
}
    }
    
    private void createMenu() {
        int index = 0;
        for (int i = 0; i < buttonLabels.length; i++) {
                MenuItem menuItem = new MenuItem(this, buttonLabels[i], index++, events);
                panelMenu.add(menuItem);
                System.out.println("Button Added: " + Arrays.toString(buttonLabels[i]));
        }
        for (Component com : panelMenu.getComponents()) {
            if (com instanceof MenuItem) {
                ((MenuItem) com).setFull(true);
            }
        }
    }
    
    
    public void setSelectedMenu(int index, int subIndex) {
        runEvent(index, subIndex);
    }
    
    protected void setSelected(int index, int subIndex) {
        int size = panelMenu.getComponentCount();
        for (int i = 0; i < size; i++) {
            Component com = panelMenu.getComponent(i);
            if (com instanceof MenuItem) {
                MenuItem item = (MenuItem) com;
                if (item.getMenuIndex() == index) {
                    item.setSelectedIndex(subIndex);
                } else {
                    item.setSelectedIndex(-1);
                }
            }
        }
    }

    protected void runEvent(int index, int subIndex) {
        MenuAction menuAction = new MenuAction();
        for (MenuEvent event : events) {
            event.menuSelected(index, subIndex, menuAction);
        }
        if (!menuAction.isCancel()) {
            setSelected(index, subIndex);
        }
    }
    
    public void addMenuEvent(MenuEvent event) {
        events.add(event);
    }
    
    private JPanel panelMenu;
    private LightDarkMode lightDarkMode;
    private ToolBarAccentColor toolBarAccentColor;

    private class CustomLayout implements LayoutManager {

        @Override
        public void addLayoutComponent(String name, Component comp) {
        }

        @Override
        public void removeLayoutComponent(Component comp) {
        }

        @Override
        public Dimension preferredLayoutSize(Container parent) {
            synchronized (parent.getTreeLock()) {
                return new Dimension(5, 5);
            }
        }

        @Override
        public Dimension minimumLayoutSize(Container parent) {
            synchronized (parent.getTreeLock()) {
                return new Dimension(5, 5);
            }
        }

        @Override
public void layoutContainer(Container parent) {
    synchronized (parent.getTreeLock()) {
        Insets insets = parent.getInsets();
        int x = insets.left;
        int y = insets.top;
        int gap = UIScale.scale(5);
        int ldgap = UIScale.scale(10);
        int width = parent.getWidth() - (insets.left + insets.right);
        int height = parent.getHeight() - (insets.top + insets.bottom);
        
        int ldWidth = width - ldgap * 2;
        int ldHeight = lightDarkMode.getPreferredSize().height;
        int ldx = x + ldgap;
        int ldy = y + height - ldHeight - ldgap;

        lightDarkMode.setBounds(ldx, ldy, ldWidth, ldHeight);

        if (toolBarAccentColor.isVisible()) {
            int tbheight = toolBarAccentColor.getPreferredSize().height;
            int tbwidth = Math.min(toolBarAccentColor.getPreferredSize().width, ldWidth);
            int tby = y + height - tbheight - ldgap;
            int tbx = ldx + ((ldWidth - tbwidth) / 2);
            toolBarAccentColor.setBounds(tbx, tby, tbwidth, tbheight);
        }
    }
}

    }
}


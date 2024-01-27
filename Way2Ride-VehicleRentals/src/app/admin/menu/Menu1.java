package app.admin.menu;



import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.io.IOException;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

public class Menu1 extends JComponent {
    private Font khulaSemiBold;

    public MenuEvent1 getEven1() {
        return event;
    }

    public void setEvent1(MenuEvent1 event) {
        this.event = event;
    }

    
    private MenuEvent1 event;
    private MigLayout layout;
    private String[][] menuItems = new String[][]{
        {"Dashboard"},
        {"Vehicle Management", "AddVehicle", "AllVehicle"},
        {"User Management"},
        {"Received Orders"},
        {"Statistics"},
        {"Customer Feedback"},
        {"Notification Preference"},
      
        {"LOGOUT"}    
            
    };

    public Menu1() {
          khulaSemiBold = applyKhulaSemiBoldFont();
        init();
        

       
    }

    private void init() {
        layout = new MigLayout("wrap 1, fillx, gapy 0, inset 2", "fill");
        setLayout(layout);
        setOpaque(true);
        //  Init MenuItem
        for (int i = 0; i < menuItems.length; i++) {
           addMenu(menuItems[i][0], i);
        }

    }
    private Font applyKhulaSemiBoldFont() {
        String fontFilePath = "/app/vehicle/font/Khula-SemiBold.ttf";

        try {
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream(fontFilePath));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(customFont);

            return customFont.deriveFont(Font.BOLD, 15);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    private Icon getIcon(int index) {
        URL url = getClass().getResource("/app/admin/logo/" + index + ".png");

        if (url != null) {
            return new ImageIcon(url);
        } else {
           System.out.print("Error");
           return null;
        }
    }

    private void addMenu(String menuName, int index) {
        int length = menuItems[index].length;
        MenuItem1 item = new MenuItem1(menuName, index, length > 1);
        Icon icon = getIcon(index);
        if (icon != null) {
            item.setIcon(icon);
        }else if(icon==null){
            System.out.print("null here");
        }

        item.setFocusPainted(false);

        item.setFont(khulaSemiBold);
        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (length > 1) {
                    if (!item.isSelected()) {
                        item.setFont(khulaSemiBold);
                        item.setSelected(true);
                        addSubMenu(item, index, length, getComponentZOrder(item));
                    } else {
                        //  Hide menu
                        hideMenu(item, index);
                        item.setSelected(false);
                    }
                } else {
                    if (event != null) {
                        event.selected(index, 0);
                    }
                }
            }
        });
    if (menuName.equals("LOGOUT")) {
        add(item, "wrap, height 20, gapbottom 50");  // Use "wrap" to start a new row
    } else {
        add(item,"gapbottom 30");
    }
    
      
//        add(item, "wrap");
        revalidate();
        repaint();
    }

    private void addSubMenu(MenuItem1 item, int index, int length, int indexZorder) {
        JPanel panel = new JPanel(new MigLayout("wrap 1, fillx, inset 0, gapy 0", "fill"));
        panel.setName(index + "");
        panel.setBackground(new Color(253, 106, 2)); //change the sub menu color

        for (int i = 1; i < length; i++) {
            MenuItem1 subItem = new MenuItem1(menuItems[index][i], i, false);
           subItem.setFont(khulaSemiBold.deriveFont(15f));
           subItem.setFocusPainted(false);
            subItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    if (event != null) {
                        event.selected(index, subItem.getIndex());
                    }
                }
            });
            subItem.initSubMenu(i, length);
            panel.add(subItem);
        }
        add(panel, "h 0!", indexZorder + 1);
        revalidate();
        repaint();
        MenuAnimation1.showMenu(panel, item, layout, true);
    }

    private void hideMenu(MenuItem1 item, int index) {
        for (Component com : getComponents()) {
            if (com instanceof JPanel && com.getName() != null && com.getName().equals(index + "")) {
                com.setName(null);
                MenuAnimation1.showMenu((JPanel) com, item, layout, false);
                break;
            }
        }
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
//        g2.setColor(new Color(179,64,0));
      g2.setColor(new Color(253, 106, 2)); // RGB values for #FD6A02

        g2.fill(new Rectangle2D.Double(0, 0, getWidth(), getHeight()));
        super.paintComponent(grphcs);
    }

}


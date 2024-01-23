# Java Dashboard Light and Dark mode
This dashboard build by using java swing with flatlaf look and feel

### Library use
- flatlaf-3.2.jar
- flatlaf-extras-3.2.jar
- jsvg-1.2.0.jar
- flatlaf-fonts-roboto-2.137.jar
- swing-toast-notifications-1.0.1.jar

### Sample code to show form
``` java
//  Application class from package raven.application
//  Parameter as java.awt.Component

Application.showForm(new PanelForm());

//  Set menu selection by index and subIndex

Application.setSelectedMenu(0, 0);
```
### Menu Items
``` java
//  Modify this code in raven.menu.Menu.java

private final String menuItems[][] = {
    {"~MAIN~"}, //  Menu title
    {"Dashboard"},
    {"Email", "Inbox", "Read", "Compost"},
};
```
### Menu Event
``` java
menu.addMenuEvent(new MenuEvent() {
    @Override
    public void menuSelected(int index, int subIndex, MenuAction action) {
        if (index == 1) {
            if (subIndex == 1) {
                Application.showForm(new FormInbox());
            } else if (subIndex == 2) {
                Application.showForm(new FormRead());
            }
        } else {
            action.cancel();
        }
    }
});
```

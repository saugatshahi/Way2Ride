package app.vehicle.form;

/**
 *
 * @author Raven
 */
public final class FourWheeler extends javax.swing.JPanel {

    public FourWheeler() {
        initComponents();
        
//        for (int i = 0; i < 10; i++) {
//            addItem(new ModelItem("Luxury","Features","Buggati","Non-Elecrtric","Unlimited","NRS.29,000","2",new ImageIcon(getClass().getResource("/app/dashboard/png/buggati1.png")),new JButton("Reserve")));
//            addItem(new ModelItem("Standard","Features","Tesla","Elecrtric","Unlimited","NRS.22,000","5",new ImageIcon(getClass().getResource("/app/dashboard/png/Tesla1.png")),new JButton("Reserve")));
//            addItem(new ModelItem("Standard","Features","Jeep","Non-Elecrtric","Unlimited","NRS.25,000","5",new ImageIcon(getClass().getResource("/app/dashboard/png/Jeep1.png")),new JButton("Reserve")));
//            addItem(new ModelItem("Luxury","Features","Car","Non-Elecrtric","Unlimited","NRS.20,000","5",new ImageIcon(getClass().getResource("/app/dashboard/png/Uniquecar1.png")),new JButton("Reserve")));
//        }
    }

    @SuppressWarnings("unchecked")
    
//    public void addItem(ModelItem data){
////        CarItem caritem = new CarItem();
//        caritem.setData(data);
//        caritem.addMouseListener(new MouseAdapter(){
//        @Override
//        public void mousePressed(MouseEvent me) {
//            if(SwingUtilities.isLeftMouseButton(me)){
//                
//            }
//        }
//         });
//        panelItem1.add(caritem);
//        panelItem1.repaint();
//        panelItem1.revalidate();
//    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        panelItem1 = new app.vehicle.design.PanelItem();

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setViewportView(panelItem1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1051, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 133, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private app.vehicle.design.PanelItem panelItem1;
    // End of variables declaration//GEN-END:variables
}

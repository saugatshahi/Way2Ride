/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package app.vehicle.component;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import raven.modelItem.ModelDesc;

/**
 *
 * @author basne
 */
public class CarDesc extends javax.swing.JPanel {
    
    
   
    public boolean isSelected() {
        return selected;
    }

    
    public void setSelected(boolean selected) {
        this.selected = selected;
        repaint();
    }
      private boolean selected;


    public CarDesc() {
        initComponents();
    }
private ModelDesc data1;
        public void setData1(ModelDesc data1){
        this.data1 = data1;

          CarPic.setImage(data1.getImage2());
          CarName1.setText(data1.getCarName1());
          CarDesc1.setDocument(data1.getCarDesc().getDocument());
          Dimension.setText(data1.getDimension());
          DimensionDesc.setDocument(data1.getDimensionDesc().getDocument());
          Performance.setText(data1.getPerformance());
          PerformanceDesc.setDocument(data1.getPerformanceDesc().getDocument());
          Engine.setText(data1.getEngine());
          EngineDesc.setDocument(data1.getEngineDesc().getDocument());


          
          


        }
  
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CarPic = new app.vehicle.design.PictureBox();
        CarName1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CarDesc1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        EngineDesc = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        PerformanceDesc = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        DimensionDesc = new javax.swing.JTextArea();
        Engine = new javax.swing.JLabel();
        Performance = new javax.swing.JLabel();
        Dimension = new javax.swing.JLabel();

        CarPic.setImage(new javax.swing.ImageIcon(getClass().getResource("/app/dashboard/png/img1bg.png"))); // NOI18N

        CarName1.setText("Buggati Veyron");

        CarDesc1.setColumns(20);
        CarDesc1.setLineWrap(true);
        CarDesc1.setRows(5);
        CarDesc1.setText("The Bugatti Veyron is a high-performance sports car produced by the French automotive manufacturer Bugatti. Launched in 2005, the Veyron gained widespread acclaim for its extraordinary speed and engineering prowess, setting several records at the time. ");
        jScrollPane1.setViewportView(CarDesc1);

        EngineDesc.setColumns(20);
        EngineDesc.setLineWrap(true);
        EngineDesc.setRows(5);
        EngineDesc.setText("The Bugatti Veyron boasts an extraordinary 8.0-liter quad-turbocharged W16 engine, a unique configuration combining two V8 engines. With a power output often exceeding 1,000 horsepower, it stands as one of the most potent production car engines. The quad-turbocharging system ensures rapid acceleration and impressive torque. This powerhouse contributes to the Veyron's remarkable top speed, surpassing 250 mph, solidifying its status as a technological masterpiece in high-performance automobiles.");
        jScrollPane2.setViewportView(EngineDesc);

        PerformanceDesc.setColumns(20);
        PerformanceDesc.setLineWrap(true);
        PerformanceDesc.setRows(5);
        PerformanceDesc.setText("The Bugatti Veyron, a pinnacle of automotive performance, houses a remarkable 8.0-liter quad-turbocharged W16 engine, often exceeding 1,000 horsepower. Achieving mind-boggling top speeds, some models surpass 250 mph, with the Super Sport variant setting a record at 267.856 mph. Rapid acceleration, going from 0 to 60 mph in seconds, showcases its prowess. The aerodynamic design, adjustable rear wing, and carbon-ceramic brakes ensure stability and precision at high speeds. Produced in limited numbers, the Veyron's exclusivity solidifies its status as both a hypercar and a symbol of engineering excellence.");
        jScrollPane3.setViewportView(PerformanceDesc);

        DimensionDesc.setColumns(20);
        DimensionDesc.setLineWrap(true);
        DimensionDesc.setRows(5);
        DimensionDesc.setText("The Bugatti Veyron features compact dimensions for a hypercar, with a length of around 175 inches, a width of approximately 78 inches, and a height of about 48 inches. These proportions contribute to its aerodynamic design and high-speed stability, making it a unique and striking presence on the road.");
        jScrollPane4.setViewportView(DimensionDesc);

        Engine.setText("Engine");

        Performance.setText("Performance");

        Dimension.setText("Dimension");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CarPic, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CarName1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(Engine, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(200, 200, 200)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Performance, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Dimension, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CarName1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CarPic, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Engine, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Performance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Dimension))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane4))
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents
   @Override
  public void paint(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        g2.setColor(new Color(242,242,242));
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
        if (selected){
            g2.setColor( new Color(94,156,255));
            g2.drawRoundRect(0,0 , getWidth()-1, getHeight()-1, 20, 20);
        }
        g2.dispose();
        super.paint(grphcs);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea CarDesc1;
    private javax.swing.JLabel CarName1;
    private app.vehicle.design.PictureBox CarPic;
    private javax.swing.JLabel Dimension;
    private javax.swing.JTextArea DimensionDesc;
    private javax.swing.JLabel Engine;
    private javax.swing.JTextArea EngineDesc;
    private javax.swing.JLabel Performance;
    private javax.swing.JTextArea PerformanceDesc;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}

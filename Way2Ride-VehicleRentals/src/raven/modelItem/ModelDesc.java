/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raven.modelItem;

import javax.swing.Icon;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author basne
 */
public class ModelDesc {

    /**
     * @return the CarName1
     */
    public String getCarName1() {
        return CarName1;
    }

    /**
     * @param CarName1 the CarName1 to set
     */
    public void setCarName1(String CarName1) {
        this.CarName1 = CarName1;
    }

    /**
     * @return the Performance
     */
    public String getPerformance() {
        return Performance;
    }

    /**
     * @param Performance the Performance to set
     */
    public void setPerformance(String Performance) {
        this.Performance = Performance;
    }

    /**
     * @return the Engine
     */
    public String getEngine() {
        return Engine;
    }

    /**
     * @param Engine the Engine to set
     */
    public void setEngine(String Engine) {
        this.Engine = Engine;
    }

    /**
     * @return the Dimension
     */
    public String getDimension() {
        return Dimension;
    }

    /**
     * @param Dimension the Dimension to set
     */
    public void setDimension(String Dimension) {
        this.Dimension = Dimension;
    }

    /**
     * @return the CarDesc
     */
    public JTextArea getCarDesc() {
        return CarDesc;
    }

    /**
     * @param CarDesc the CarDesc to set
     */
    public void setCarDesc(JTextArea CarDesc) {
        this.CarDesc = CarDesc;
    }

    /**
     * @return the PerformanceDesc
     */
    public JTextArea getPerformanceDesc() {
        return PerformanceDesc;
    }

    /**
     * @param PerformanceDesc the PerformanceDesc to set
     */
    public void setPerformanceDesc(JTextArea PerformanceDesc) {
        this.PerformanceDesc = PerformanceDesc;
    }

    /**
     * @return the DimensionDesc
     */
    public JTextArea getDimensionDesc() {
        return DimensionDesc;
    }

    /**
     * @param DimensionDesc the DimensionDesc to set
     */
    public void setDimensionDesc(JTextArea DimensionDesc) {
        this.DimensionDesc = DimensionDesc;
    }

    /**
     * @return the EngineDesc
     */
    public JTextArea getEngineDesc() {
        return EngineDesc;
    }

    /**
     * @param EngineDesc the EngineDesc to set
     */
    public void setEngineDesc(JTextArea EngineDesc) {
        this.EngineDesc = EngineDesc;
    }

    /**
     * @return the image2
     */
    public Icon getImage2() {
        return image2;
    }

    /**
     * @param image2 the image2 to set
     */
    public void setImage2(Icon image2) {
        this.image2 = image2;
    }

    public ModelDesc(String CarName1, String Performance, String Engine, String Dimension, JTextArea CarDesc, JTextArea PerformanceDesc, JTextArea DimensionDesc, JTextArea EngineDesc, Icon image2) {
        this.CarName1 = CarName1;
        this.Performance = Performance;
        this.Engine = Engine;
        this.Dimension = Dimension;
        this.CarDesc = CarDesc;
        this.PerformanceDesc = PerformanceDesc;
        this.DimensionDesc = DimensionDesc;
        this.EngineDesc = EngineDesc;
        this.image2 = image2;
    }
    
    
    private String CarName1;
    private String Performance;
    private String Engine;
    private String Dimension;
    private JTextArea CarDesc;
    private JTextArea PerformanceDesc;
    private JTextArea DimensionDesc;
    private JTextArea EngineDesc;
    private Icon image2;
    
}

package app.vehicle.modelItem;

import javax.swing.Icon;
import javax.swing.JTextArea;

/**
 *
 * @author basne
 */
public class ModelDesc {

    public String getCarName1() {
        return CarName1;
    }

    public void setCarName1(String CarName1) {
        this.CarName1 = CarName1;
    }

    public String getPerformance() {
        return Performance;
    }

    public void setPerformance(String Performance) {
        this.Performance = Performance;
    }

    public String getEngine() {
        return Engine;
    }

    public void setEngine(String Engine) {
        this.Engine = Engine;
    }

    public String getDimension() {
        return Dimension;
    }

    public void setDimension(String Dimension) {
        this.Dimension = Dimension;
    }

    public JTextArea getCarDesc() {
        return CarDesc;
    }

    public void setCarDesc(JTextArea CarDesc) {
        this.CarDesc = CarDesc;
    }

    public JTextArea getPerformanceDesc() {
        return PerformanceDesc;
    }

    public void setPerformanceDesc(JTextArea PerformanceDesc) {
        this.PerformanceDesc = PerformanceDesc;
    }

    public JTextArea getDimensionDesc() {
        return DimensionDesc;
    }

    public void setDimensionDesc(JTextArea DimensionDesc) {
        this.DimensionDesc = DimensionDesc;
    }

    public JTextArea getEngineDesc() {
        return EngineDesc;
    }

    public void setEngineDesc(JTextArea EngineDesc) {
        this.EngineDesc = EngineDesc;
    }

    public Icon getImage2() {
        return image2;
    }

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

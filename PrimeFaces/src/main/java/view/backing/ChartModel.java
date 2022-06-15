package view.backing;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;

/**
 *
 * @author Mierzej
 */
@Named(value = "ChartModel")
@RequestScoped
public class ChartModel
{
    private LineChartModel myChartModel;

    /**
     * Creates a new instance of ChartModel
     */
    public ChartModel()
    {
        myChartModel = new LineChartModel();
        

        LineChartSeries sineVal = new LineChartSeries();
        LineChartSeries cosineVal = new LineChartSeries();
       
        for (int i = 0; i <= 360; i = i+10)
        {
            sineVal.set(i, Math.sin(Math.toRadians(i)));
            cosineVal.set(i, Math.cos(Math.toRadians(i)));
        }
        
        Axis xAxis = myChartModel.getAxis(AxisType.X);
        Axis yAxis = myChartModel.getAxis(AxisType.Y);
        
        xAxis.setMin(0);
        xAxis.setMax(360);
        yAxis.setMin(-1.0);
        yAxis.setMax(1.0);

        myChartModel.addSeries(sineVal);
        myChartModel.addSeries(cosineVal);

        sineVal.setLabel("sine");
        cosineVal.setLabel("cosine");
        myChartModel.setLegendPosition("se");
        myChartModel.setSeriesColors("0000FF,FF0000");
        
        myChartModel.setZoom(true);
    }
    /**
     * @return the model
     */
    public LineChartModel getMyChartModel()
    {
        return myChartModel;
    }

    /**
     * @param myChartModel the model to set
     */
    public void setMyChartModel(LineChartModel myChartModel)
    {
        this.myChartModel = myChartModel;
    }
    
    public void resetZoom()
    {
        myChartModel.setZoom(false);
    }

}

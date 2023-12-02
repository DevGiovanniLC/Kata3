package software.ulpgc.Kata3;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import java.util.Map;

public class BarChartPanel extends ChartPanel implements ChartCreator {

    public BarChartPanel(Map<String, Integer> data, String title) {
        super(null);
        setChart(createChart(createDataset(data), title));
        setVisible(true);
    }

    public DefaultCategoryDataset createDataset(Map<String, Integer> dataset) {
        DefaultCategoryDataset histogramDataset = new DefaultCategoryDataset();

        for (Map.Entry<String, Integer> entry : dataset.entrySet()) {
            histogramDataset.addValue(entry.getValue(), "", entry.getKey());
        }
        
        return histogramDataset;
    }

    public JFreeChart createChart(CategoryDataset dataset, String title){
          return  ChartFactory.createBarChart(
                  title,
                  "",
                  "Frequency",
                  dataset,
                  PlotOrientation.VERTICAL,
                  true,
                  true,
                  false
          );
    }

}


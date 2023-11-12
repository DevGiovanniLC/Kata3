package software.ulpgc.kata3;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import java.awt.*;
import java.util.Map;

public class HistogramPanel extends ChartPanel {

    public HistogramPanel(Map<String, Integer> data) {
        super(null);
        setChart(createChart(createDataset(data)));
        //setPreferredSize(new Dimension(500, 500));
        setVisible(true);
    }

    private CategoryDataset createDataset(Map<String, Integer> dataset) {
        DefaultCategoryDataset histogramDataset = new DefaultCategoryDataset();

        // Agregar datos al conjunto de datos
        for (Map.Entry<String, Integer> entry : dataset.entrySet()) {
            histogramDataset.addValue(entry.getValue(), "Organizations", entry.getKey());
        }


        return histogramDataset;
    }

    private JFreeChart createChart(CategoryDataset dataset){
          return  ChartFactory.createBarChart(
                  "Histogram",
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


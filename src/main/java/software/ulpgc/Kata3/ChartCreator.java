package software.ulpgc.Kata3;

import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import java.util.Map;

public interface ChartCreator {
    DefaultCategoryDataset createDataset(Map<String, Integer> dataset);
    JFreeChart createChart(CategoryDataset dataset, String title);
}

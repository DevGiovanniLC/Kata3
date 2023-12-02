package software.ulpgc.Kata3;

import java.util.List;
import software.ulpgc.Kata2.*;
import software.ulpgc.Interfaces.*;

public class Main {
    public static void main(String[] args) {
        Window window = new Window();

        OrganizationLoader tsvOrganizationLoader = new TsvOrganizationLoader("dataset.tsv");
        List<Organization> load = tsvOrganizationLoader.load();
        ObjectProcessor countryOrganizationProcessor = new CountryOrganizationProcessor(load);
        BarChartPanel BarChartPanel = new BarChartPanel(countryOrganizationProcessor.process(), "Number of organizations in countries");
        window.setContentPane(BarChartPanel);
        window.setVisible(true);
    }
}

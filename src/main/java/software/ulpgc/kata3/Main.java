package software.ulpgc.kata3;

import software.ulpgc.Kata2.CountryOrganizationProcessor;
import software.ulpgc.Kata2.Organization;
import software.ulpgc.Kata2.TsvOrganizationLoader;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Window window = new Window();

        TsvOrganizationLoader tsvOrganizationLoader = new TsvOrganizationLoader("dataset.tsv");
        List<Organization> load = tsvOrganizationLoader.load();
        CountryOrganizationProcessor countryOrganizationProcessor = new CountryOrganizationProcessor(load);
        System.out.println(countryOrganizationProcessor.process());
        HistogramPanel histogramPanel = new HistogramPanel(countryOrganizationProcessor.process());
        window.setContentPane(histogramPanel);
        window.setVisible(true);
    }
}

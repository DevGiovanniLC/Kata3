package software.ulpgc.Kata2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TsvOrganizationLoader tsvOrganizationLoader = new TsvOrganizationLoader("dataset.tsv");
        List<Organization> load = tsvOrganizationLoader.load();
        for (Organization organization : load){
            System.out.println(organization);
        }

        CountryOrganizationProcessor countryOrganizationProcessor = new CountryOrganizationProcessor(load);
        System.out.println("\n\n"+countryOrganizationProcessor.process());
    }
}

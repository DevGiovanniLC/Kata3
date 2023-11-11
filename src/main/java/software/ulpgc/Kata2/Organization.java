package software.ulpgc.Kata2;

public class Organization {
    private final String Id;
    private final String Name;

    @Override
    public String toString() {
        return "Organization{" +
                "Id='" + Id + '\'' +
                ", Name='" + Name + '\'' +
                ", WebSite='" + WebSite + '\'' +
                ", Country='" + Country + '\'' +
                ", Description='" + Description + '\'' +
                ", Founded='" + Founded + '\'' +
                ", Industry='" + Industry + '\'' +
                ", NumberEmployees=" + NumberEmployees +
                '}';
    }

    private final String WebSite;
    private final String Country;
    private final String Description;
    private final String Founded;
    private final String Industry;
    private final int NumberEmployees;

    public Organization(String id, String name, String webSite, String country, String description, String founded, String industry, int numberEmployees) {
        Id = id;
        Name = name;
        WebSite = webSite;
        Country = country;
        Description = description;
        Founded = founded;
        Industry = industry;
        NumberEmployees = numberEmployees;
    }

    public String getCountry(){
        return Country;
    }




}

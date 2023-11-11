package software.ulpgc.Kata2;

import java.io.FileNotFoundException;
import java.util.List;

public interface OrganizationLoader {
    List<Organization> load() throws FileNotFoundException;
}

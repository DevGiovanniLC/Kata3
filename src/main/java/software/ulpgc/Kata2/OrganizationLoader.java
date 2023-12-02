package software.ulpgc.Kata2;

import software.ulpgc.Interfaces.ObjectLoader;
import java.util.List;

public interface OrganizationLoader extends ObjectLoader {
    @Override
    List<Organization> load();
}

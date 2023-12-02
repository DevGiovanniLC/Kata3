package software.ulpgc.Kata2;

import software.ulpgc.Interfaces.ObjectProcessor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountryOrganizationProcessor implements ObjectProcessor {
    private final List<Organization> list;

    public CountryOrganizationProcessor(List<Organization> list) {
        this.list = list;
    }

    @Override
    public Map<String, Integer> process() {
        return process(new HashMap<>());
    }

    private Map<String, Integer> process(Map<String, Integer> result) {
        list.forEach(o->
                result.put(
                    o.getCountry(),
                    result.getOrDefault(o.getCountry(),0) + 1
                )
        );
        return result;
    }
}

package software.ulpgc.Kata2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TsvOrganizationLoader implements OrganizationLoader{

    private final File file;

    public TsvOrganizationLoader(String file) {
        this.file = new File(file);
    }

    @Override
    public List<Organization> load(){
        try {
            return loader(new FileReader(file));
        } catch (FileNotFoundException e) {
            return Collections.emptyList();
        }
    }

    private List<Organization> loader(FileReader fileReader) {
        return loader (new BufferedReader(fileReader));
    }

    private List<Organization> loader(BufferedReader bufferedReader) {
        return bufferedReader.lines().
                skip(1).
                map(this::toOrganization).
                collect(Collectors.toList());
    }

    private Organization toOrganization(String s) {
        return toOrganization(s.split("\t"));
        
    }

    private Organization toOrganization(String[] split) {
        return new Organization(
                split[0],
                split[1],
                split[2],
                split[3],
                split[4],
                split[5],
                split[6],
                Integer.parseInt(split[7])
        );
    }
}

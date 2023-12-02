package software.ulpgc.Kata4;

import software.ulpgc.Interfaces.ObjectProcessor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlbumTrackProcessor implements ObjectProcessor {

    private final List<Track> list;

    public AlbumTrackProcessor(List<Track> list) {
        this.list = list;
    }

    @Override
    public Map<String, Integer> process() {
        return process(new HashMap<String, Integer>());
    }

    private Map<String, Integer> process(HashMap<String, Integer> result) {
        list.forEach( o->
                result.put(
                        o.getAlbum(),
                        result.getOrDefault(o.getAlbum(),0)+1
                )
        );
        return result;
    }
}

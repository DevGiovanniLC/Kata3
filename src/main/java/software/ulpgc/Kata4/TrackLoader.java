package software.ulpgc.Kata4;

import software.ulpgc.Interfaces.ObjectLoader;

import java.util.List;

public interface TrackLoader extends ObjectLoader {
    @Override
    List<Track> load();
}

package software.ulpgc.Kata4;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SqlTrackLoader implements TrackLoader{
    private final Connection connection;
    private final static String sql = "select tracks.name as track, composer, Milliseconds, title, artists.Name as artist from tracks, albums, artists, genres where tracks.AlbumId = albums.AlbumId and albums.ArtistId = artists.ArtistId and tracks.GenreId = genres.GenreId";

    public SqlTrackLoader(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<Track> load() {
        try {
            return load(queryAll());
        } catch (SQLException e) {
            return Collections.emptyList();
        }
    }

    private List<Track> load(ResultSet set) throws SQLException {
         List<Track> result = new ArrayList<>();
         while(set.next()){
             result.add(toTrack(set));
         }
         return result;
    }

    private Track toTrack(ResultSet set) throws SQLException {
        return new Track(
           set.getString("track"),
           set.getString("composer"),
           set.getString("title"),
           set.getString("artist"),
           set.getInt("milliseconds")/1000
        ) ;
    }

    private ResultSet queryAll() throws SQLException {
        return this.connection.createStatement().executeQuery(sql);
    }
}

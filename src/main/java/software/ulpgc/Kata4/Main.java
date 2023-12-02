package software.ulpgc.Kata4;

import software.ulpgc.Interfaces.ObjectProcessor;
import software.ulpgc.Kata3.BarChartPanel;
import software.ulpgc.Kata3.Window;

import java.sql.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        Window window = new Window();
        try(Connection connection = DriverManager.getConnection("jdbc:sqlite:chinook.db")){
            TrackLoader trackLoader = new SqlTrackLoader(connection);
            List<Track> tracks = trackLoader.load();
            ObjectProcessor albumTrackProcessor = new AlbumTrackProcessor(tracks);
            BarChartPanel BarChartPanel = new BarChartPanel(albumTrackProcessor.process(), "Number of tracks in album");
            window.setContentPane(BarChartPanel);
            window.setVisible(true);
        }
    }
}

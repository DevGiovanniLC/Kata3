package software.ulpgc.Kata4;

public record Track(String name, String composer, String album, String artist, int duration) {
    public String getAlbum() {
        return this.album;
    }
}

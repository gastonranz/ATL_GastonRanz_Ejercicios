package Class12.Spotify;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Song> songs = new ArrayList<>();
        Song song = new Song();
        Song song2 = new Song();
        Song song3 = new Song();
        Song song4 = new Song();
        songs.add(song);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);

        Playlist playlist = new Playlist(songs);
    }
}

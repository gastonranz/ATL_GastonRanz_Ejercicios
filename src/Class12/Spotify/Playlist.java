package Class12.Spotify;

import java.util.List;

public class Playlist {
    private List<Song> songs;

    public Playlist(List<Song> songs) {
        this.songs = songs;
        this.songPlaying(songs);
    }

    public void songPlaying(List<Song> song) {
        System.out.println("\n\nThe currently Song you're playing is:");
        System.out.println("---- " + song.get(0).getArtist() + " - " + song.get(0).getTitle() + " | " +
                song.get(0).getDuration() + " ----\n       ---------------------------------------        ");
        System.out.println("Your entire Playlist is:");
        for(int i = 0; i < song.size(); i++) {
            if(i == 1) {
                System.out.println("Your next song is:");
            } else if(i == song.size() - 1) {
                System.out.println("Your last song is:");
            }
            System.out.println("---- " + song.get(i).getArtist() + " - " + song.get(i).getTitle() + " | " +
                    song.get(i).getDuration() + " ----");
        }
    }
}

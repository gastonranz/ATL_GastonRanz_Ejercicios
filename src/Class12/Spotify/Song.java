package Class12.Spotify;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Song {
    private String title;
    private String artist;
    private String duration;

    public Song() throws IOException {
        this.setTitle();
        this.setArtist();
        this.setDuration();
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle() throws IOException {
        System.out.println("Type the name of the song:");
        String title = this.input();
        this.validation(title);
        this.title = title;
    }

    public String getArtist() {
        return this.artist;
    }

    public void setArtist() throws IOException {
        System.out.println("Type the name of the Artist:");
        String artist = this.input();
        this.validation(artist);
        this.artist = artist;
    }

    public String getDuration() {
        return this.duration;
    }

    public void setDuration() throws IOException {
        System.out.println("Type the Duration of the song you're listening to:");
        String duration = this.input();
        this.validation(duration);
        this.duration = duration;
    }

    private String input() throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(input);
        return buffer.readLine();
    }

    private String validation(String data) throws IOException {
        while(data.equalsIgnoreCase("null")) {
            System.out.println("Please use another value than a \"null\" value: ");
            data = this.input();
        }
        return data;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }
}

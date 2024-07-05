package structural_patterns.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SongGroup implements SongInterface {
    private List<SongInterface> songs = new ArrayList<>();
    private String name;
    private int durationInSeconds;

    public SongGroup(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getDuration() {
        return durationInSeconds;
    }

    public void addSongs(SongInterface... song) {
        songs.addAll(Arrays.asList(song));
        for (SongInterface currentSong : song) {
            durationInSeconds += currentSong.getDuration();
        }
    }

    public void removeSongs(SongInterface... song) {
        songs.removeAll(Arrays.asList(song));
        for (SongInterface currentSong : songs) {
            durationInSeconds -= currentSong.getDuration();
        }
    }

    @Override
    public void display() {
        System.out.println("==================================================");
        System.out.printf("Album Name: %s | Album Duration: %d \n", name, durationInSeconds);
        System.out.println("==================================================");

        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i) instanceof Song) {
                System.out.printf("%d - ", i);
            }
            songs.get(i).display();
            System.out.println();
        }

    }

}

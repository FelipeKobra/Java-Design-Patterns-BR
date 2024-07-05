package structural_patterns.composite;

public class Song implements SongInterface {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getDuration() {
        return durationInSeconds;
    }

    @Override
    public void display() {
        System.out.printf("Name: %s | Artist: %s | Duration: %d", name, artist, durationInSeconds);
    }

}

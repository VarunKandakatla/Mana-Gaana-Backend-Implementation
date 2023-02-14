import java.util.ArrayList;
import java.util.List;

public class Song {
    private String name;
    private double duration;
    private String singer;
    static List<String> allSongs=new ArrayList<>();
    public Song(String name, double duration){
        this.name = name;
        this.duration = duration;
        allSongs.add(name);
    }

    public Song(String name, double duration, String singer) {
        this.name = name;
        this.duration = duration;
        this.singer = singer;
        allSongs.add(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }
}

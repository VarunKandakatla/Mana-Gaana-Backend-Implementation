import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Album {
    private String albumName;
    private String Composer;
    static Map<String,List<Song>> albumSongs= new HashMap<>();


    public Album(String albumName, String composer) {
        this.albumName = albumName;
        Composer = composer;

        if(albumSongs.containsKey(albumName)){
            System.out.println("Album is Already Created!");
        }
        else {
            System.out.println("New Album Created!");
            albumSongs.put(albumName,new ArrayList<>());
        }
    }

    public Map<String, List<Song>> getAlbumSongs() {
        return albumSongs;
    }

    public void setAlbumSongs(Map<String, List<Song>> albumSongs) {
        this.albumSongs = albumSongs;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getComposer() {
        return Composer;
    }

    public void setComposer(String composer) {
        Composer = composer;
    }


    public boolean findSong(String name){
        for(String str: Song.allSongs)
        {
            if(str.equals(name))
            {
                return true;
            }
        }
        return false;
    }

    public void addSongtoAlbum(String name,double duration){
        if(!findSong(name))
        {
            albumSongs.get(albumName).add(new Song(name,duration));
            System.out.println( "Successfully Added to Album : "+getAlbumName());

            return;
        }
        System.out.println("Song is Already Added to the Album : "+getAlbumName());
    }

    @Override
    public String toString() {
        return "Album{" +
                "albumName='" + albumName + '\'' +
                ", Composer='" + Composer + '\'' +
                ", songs=" + albumSongs +
                '}';
    }
}

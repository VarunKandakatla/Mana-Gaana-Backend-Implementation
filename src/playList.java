import java.util.LinkedList;

public class playList {
   static LinkedList<String> playList;

    playList(){
        playList=new LinkedList<>();
    }

    public void addSongtoPlayList(String name){
        if(!Song.allSongs.contains(name)){
            System.out.println("No Song is found!");
            return;
        }
        for(String s: playList){
            if(s.equals(name)){
                System.out.println("Already in playList");
                return;
            }
        }
        System.out.println("Added to playList");
        playList.add(name);

    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello world!");
        Scanner sc=new Scanner(System.in);
        playList p=new playList();

        //Album 1
        Album mass=new Album("mass","DSP");
        mass.addSongtoAlbum("Natho Vastava",5.0);
        mass.addSongtoAlbum("Mass Mama Mass",3.5);
        mass.addSongtoAlbum("Vaalu vaalu",4);
        //Album 2
        Album Orange=new Album("Orange","HJ");
        Orange.addSongtoAlbum("Chilipiga Chusthav",3.5);
        Orange.addSongtoAlbum("Orange lo",4.4);
        Orange.addSongtoAlbum("Sydney",5.0);
        Orange.addSongtoAlbum("Ola Olala",4.6);



        //shows all songs
//        listOfAllSongs();
//        listOfAllAlbums();

        //Songs adding to the playList to listen
        p.addSongtoPlayList("Dada");
        p.addSongtoPlayList("Orange lo");
        p.addSongtoPlayList("Sydney");
        p.addSongtoPlayList("Mass Mama Mass");
        p.addSongtoPlayList("Vaalu vaalu");

        //OPERATION IMPLEMENTATION
//        ListIterator<String> itr=Song.allSongs.listIterator();
        ListIterator<String> itr=playList.playList.listIterator();


        showMenu();
        boolean f=true;
        String currSong="null";
        boolean isNext=true;
        while(f){

           switch(sc.nextInt()){
               case (1):
                   if(!isNext){
                       itr.next();
                       isNext=true;
                   }

                   if(itr.hasNext())
                   {
                       currSong= itr.next();
                       System.out.println("Now Playing: "+currSong);
                   }
                   else{
                       System.out.println("You are at end of the PlayList");
                   }
                   break;
               case (2):
                   if(isNext){
                       itr.previous();
                       isNext=false;
                   }
                   if(itr.hasPrevious()){
                       currSong= itr.previous();
                       System.out.println("Now Playing: "+currSong);
                   }
                   else {
                       System.out.println("You are at Starting of the PlayList");
                   }
                   break;
               case (3):
                   if(!currSong.equals("null"))
                   System.out.println("Repeating Song: "+currSong);
                   else{
                       System.out.println("please play the song first");
                   }
                   break;
               case (4):
                   System.out.println("Removing Song");
                   itr.remove();
                   break;
               case (5):
                   System.out.println(playList.playList);
                   break;
               case (6): showMenu();
                    break;
               case (7):
                   System.out.println("Thank You! Hope U have Enjoyed a Lot!");
                   f=false;
                   break;
               default:
                   System.out.println("Invalid Entry! Try Another");
           }


        }

    }

    public static void listOfAllSongs(){
        System.out.println("HERE IS THE LIST OF ALL SONGS :-");

        for(String str: Song.allSongs){
            System.out.println(Song.allSongs.indexOf(str)+". "+str);
        }
    }

    public static void listOfAllAlbums(){
        System.out.println("HERE IS THE LIST OF ALL ALBUMS :-");
        int i=0;
        for(String str: Album.albumSongs.keySet()){
            System.out.println(i+". "+str+" ");
            i++;
        }
    }

    public static void showMenu(){
        System.out.println("MENU");
        System.out.println("1.Play Next Song");
        System.out.println("2.Play Previous Song");
        System.out.println("3.Repeat Current Song");
        System.out.println("4.Delete this song from PlayList");
        System.out.println("5.Show all Songs in the PlayList");
        System.out.println("6.Show this menu");
        System.out.println("7.Exit");
    }


}
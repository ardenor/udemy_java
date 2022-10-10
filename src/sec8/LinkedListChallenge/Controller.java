package sec8.LinkedListChallenge;

import java.util.*;


public class Controller {
    private static ArrayList<Song> songsToPlay = new ArrayList<Song>();
    private static ArrayList<Playlist> playlists = MusicManager.getPlaylists();
    private static Playlist currentPlaylist;


    public static void selectPlaylist(String playlistName){

        for(Playlist p : playlists){
            if(p.getName().equals(playlistName)){
                for(Song song : p.getPlaylistSongs()){
                    songsToPlay.add(song);
                }
                currentPlaylist = p;
                System.out.println(p.getName() + ": SELECTED");
            }
        }

    }
    private static void printMenu(){
        System.out.println("Available actions:\nPress ");
        System.out.println("0 - quit\n1 - next song\n2 previous song\n3 - print menu");
    }
    public static void songSelect(String action){
        songSelect(currentPlaylist.getPlaylistSongs(), action);
    }
    public static void songSelect(ArrayList<Song> songs, String action){

        boolean quit = false;
        boolean goingForward = true;
        ListIterator<Song> songListIterator = songs.listIterator();

        if(songs.isEmpty()){
            System.out.println("No cities in the itinerary");
            return;
        } else {
            System.out.println("Now visiting " + songListIterator.next().getTitle());
            printMenu();
        }

        while(!quit){
            String action1 = action;

            switch(action1){
                case "exit":
                    System.out.println("Stopping playlist");
                    quit = true;
                    break;
                case "for": //next city
                    if(!goingForward){
                        if(songListIterator.hasNext()){
                            songListIterator.next();
                        }
                        goingForward = true;
                    }
                    if(songListIterator.hasNext()){
                        System.out.println("Now visiting " + songListIterator.next().getTitle());

                    } else{
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;
                case "prev": //previous city
                    if(goingForward){
                        if(songListIterator.hasPrevious()){
                            songListIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(songListIterator.hasPrevious()){
                        System.out.println("Returning to " + songListIterator.previous().getTitle());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;
                case "menu":
                    printMenu();
                    break;
                default:
                    System.out.println("default");
                    break;
            }


        }

    }

}

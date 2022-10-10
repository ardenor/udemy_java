package sec8.LinkedListChallenge;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Album {
    private ArrayList<Song> songs = new ArrayList<Song>();
    private String name;

    public Album(String name) {
        this.name = name;
        this.songs = new ArrayList<Song>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addSongToAlbum(String songName, double songDuration){
        Song song = new Song(songName, songDuration);
        songs.add(song);
        System.out.println("Added " + songName + " to album " + this.name);
    }

    public ArrayList<Song> getAlbumSongs(){
        return songs;
    }
}

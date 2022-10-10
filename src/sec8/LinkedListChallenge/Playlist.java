package sec8.LinkedListChallenge;

import java.util.ArrayList;
import java.util.LinkedList;

public class Playlist {
    private ArrayList<Song> playlist;

    private String name;

    public Playlist(String name) {
        this.playlist = new ArrayList<Song>();
        this.name = name;
    }

    public void addSongToPlaylist(String songName){
        for(Album a : MusicManager.getAlbums()){
            for(Song s : a.getAlbumSongs()){
                if(s.getTitle().equals(songName)){
                    playlist.add(s);
                }
            }
        }
    }
    public void removeSongFromPlaylist(String songName){
        for(Album a : MusicManager.getAlbums()){
            for(Song s : a.getAlbumSongs()){
                if(s.getTitle().equals(songName)){
                    playlist.remove(s);
                }
            }
        }
    }
    public ArrayList<Song> getPlaylistSongs(){
        return playlist;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package sec8.LinkedListChallenge;

import java.util.ArrayList;

public class MusicManager {

    private static ArrayList<Album> albums= new ArrayList<Album>();
    private static ArrayList<Playlist> playlists = new ArrayList<Playlist>();

    public static ArrayList<Album> getAlbums() {
        return albums;
    }

    public static ArrayList<Playlist> getPlaylists() {
        return playlists;
    }

    public static void listAllPlaylists(){
        for(Playlist p : playlists){
            listPlaylistAndSongs(p.getName());
        }
    }

    public static void listPlaylistAndSongs(String playlistName){
        for(Playlist p : playlists){
            if(p.getName().equals(playlistName)){
                System.out.println(p.getName() + ":");
                for(Song s : p.getPlaylistSongs()){
                    System.out.println(s.getTitle());
                }
                System.out.println("===\n");
            }
        }
    }

    public static void listAllAlbums(){
        System.out.println("\n");
        for(Album a : albums){
            listAlbumAndSongs(a.getName());
        }
    }
    public static void listAlbumAndSongs(String albumName){
        for(Album a : albums){
            if(a.getName().equals(albumName)){
                System.out.println(a.getName() + ":");
                for(Song s : a.getAlbumSongs()){
                    System.out.println(s.getTitle());
                }
                System.out.println("___\n");
            }
        }
    }
    public static void createPlaylist(String name){
        Playlist playlist = new Playlist(name);
        playlists.add(playlist);
    }
    public static void createAlbum(String name){
        Album newalbum = new Album(name);
        albums.add(newalbum);
    }
    public static void addSongToPlaylist(String songName, String playlistName){
        for(Playlist p : playlists){
            if(p.getName().equals(playlistName)){
                p.addSongToPlaylist(songName);
            }
        }
    }
    public static void removeSongFromPlaylist(String songName, String playlistName){
        for(Playlist p : playlists){
            if(p.getName().equals(playlistName)){
                p.removeSongFromPlaylist(songName);
            }
        }
    }
    public static void addSongToAlbum(String songName, double songDuration, String albumName){
        for(Album a : albums){
            if(a.getName().equals(albumName)){
                a.addSongToAlbum(songName, songDuration);
            }
        }
    }
}

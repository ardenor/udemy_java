package sec8.LinkedListChallenge;

import java.util.ArrayList;

import static sec8.LinkedListChallenge.MusicManager.*;

public class Main {


    public static void main(String[] args) {

        createAlbum("TestAlbum1");

        addSongToAlbum("Song1", 2.0, "TestAlbum1");
        addSongToAlbum("Song2", 4.0, "TestAlbum1");
        addSongToAlbum("Song3", 4.0, "TestAlbum1");

        createAlbum("TestAlbum2");

        //listAllAlbums();

        createPlaylist("Playlist1");
        addSongToPlaylist("Song1", "Playlist1");

        createPlaylist("Playlist2");
        addSongToPlaylist("Song2", "Playlist2");
        addSongToPlaylist("Song3", "Playlist2");
//        removeSongFromPlaylist("Song3", "Playlist2");

        listAllPlaylists();

        Controller.selectPlaylist("Playlist2");
        Controller.songSelect("for");
//        Controller.songSelect("for");
//

    }



}

package streamapi;

import java.util.List;

public interface ISongService {
    List<Song> getSortedListSongs(List<Song> listSongs);
    List<String> saveSortedListSongsTitle(List<Song> listSongs);
}

package streamapi;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SongService implements ISongService {

    @Override
    public List<Song> getSortedListSongs(List<Song> listSongs) {
        return listSongs.stream()
                .filter(song -> song.getDuration()>300)
                .sorted(Comparator.comparingInt(Song::getDuration).reversed())
                .collect(Collectors.toList());
    }

    @Override
    public List<String> saveSortedListSongsTitle(List<Song> listSongs) {
        return listSongs.stream().map(song -> song.getTitle()).collect(Collectors.toList());
    }
}

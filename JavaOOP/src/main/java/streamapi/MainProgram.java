package streamapi;

import java.util.Arrays;
import java.util.List;

public class MainProgram {
    public static void main(String[] args) {
        List<Song> listSongs = Arrays.asList(
                new Song("Title1",400),
                new Song("Title2",250),
                new Song("Title3",500),
                new Song("Title4",450),
                new Song("Title5",200));
        System.out.println("Your first list songs:\n" + listSongs);
        List<Song> sortedListSongs = new SongService().getSortedListSongs(listSongs);
        System.out.println("Your list songs after sorted:\n"+sortedListSongs.toString());
        System.out.println("Sort your songs successfully");
        System.out.println("Your list songs title after sorted" + new SongService().saveSortedListSongsTitle(sortedListSongs));
    }

}

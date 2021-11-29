package streamapi;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SongServiceTest {

    @Test
    public void given_ListSongs_when_ItsValid_then_returnSortItByDuration() {
        List<Song> listSongs = Arrays.asList(
                new Song("Title1",400),
                new Song("Title2",250),
                new Song("Title3",500),
                new Song("Title4",450),
                new Song("Title5",200));
        List<Song> sortedListSongsExpected = Arrays.asList(
                new Song("Title3",500),
                new Song("Title4",450),
                new Song("Title1",400));

        List<Song> sortedListSongsActual = new SongService().getSortedListSongs(listSongs);

        Assert.assertEquals(sortedListSongsExpected.toString(), sortedListSongsActual.toString());
    }

    @Test(expected = NullPointerException.class)
    public void given_ListSongs_when_ItsNull_then_throwNullPointerException() {
        List<Song> listSongs = null;
        new SongService().getSortedListSongs(listSongs);

    }


}
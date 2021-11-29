package streamapi;

import util.Validator;

import java.util.ArrayList;
import java.util.List;

public class SongMenu {
    List<Song> listSongs = new ArrayList<>();
    List<Song> sortedListSongs = new ArrayList<>();
    List<String> listSongsTitle = new ArrayList<>();

    public void action() {
        int selection;
        while (true) {
            do {
                System.out.println("1.Add song");
                System.out.println("2.Sort your list songs");
                System.out.println("3.View your list songs");
                System.out.println("Enter your selection:");
                selection = Validator.inputTypeInt();
                switch (selection) {
                    case 1: {
                        System.out.println("Enter song title you want to add:");
                        String title = Validator.inputTypeString();
                        System.out.println("Enter its duration:");
                        int duration = Validator.inputTypeInt();
                        listSongs.add(new Song(title, duration));
                    }
                    break;
                    case 2: {
                        sortedListSongs = new SongService().getSortedListSongs(listSongs);
                        System.out.println("Sort your songs successfully");
                    }
                    break;
                    case 3: {
                        listSongsTitle = new SongService().saveSortedListSongsTitle(sortedListSongs);
                        System.out.println("Your list songs title: " + listSongsTitle);
                    }
                }

            } while (selection != 3);

        }


    }
}

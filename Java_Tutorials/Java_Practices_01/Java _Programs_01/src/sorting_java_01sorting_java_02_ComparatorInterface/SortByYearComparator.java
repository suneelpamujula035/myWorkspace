package sorting_java_01sorting_java_02_ComparatorInterface;

import java.util.Comparator;

public class SortByYearComparator implements Comparator<Song> {

	@Override
	public int compare(Song song, Song anotherSong) {

		// sort all the song object by the year in ascending order
		if (song.getYear() > anotherSong.getYear()) {

			return +1;
		}
		if (song.getYear() < anotherSong.getYear()) {

			return -1;
		}

		return 0;
	}

}

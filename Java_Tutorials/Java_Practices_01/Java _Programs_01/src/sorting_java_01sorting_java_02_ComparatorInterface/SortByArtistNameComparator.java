package sorting_java_01sorting_java_02_ComparatorInterface;

import java.util.Comparator;

public class SortByArtistNameComparator implements Comparator<Song> {

	@Override
	public int compare(Song song1, Song song2) {

		return song1.getArtist().compareTo(song2.getArtist());//Sorting By Artists in descending order
	}

}

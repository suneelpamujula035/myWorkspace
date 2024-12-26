package sorting_java_01sorting_java_02_ComparatorInterface;

import java.util.ArrayList;
import java.util.Collections;

import sorting_java_01_ComparableInterface.MyUtil;

public class SongApp {

	public static void main(String[] args) {

		ArrayList<Song> musicList = new ArrayList<>();
		musicList.add(new Song("tum hi ho", "arjith aingh", 2012));
		musicList.add(new Song("kal ho na ho", "sonu nigam", 2004));
		musicList.add(new Song("zara sa dil mein", "arman malik", 2008));
		musicList.add(new Song("avi avi tum mile ho", "kk", 2015));
		musicList.add(new Song("jina isika naam hai", "thaman", 1995));

		MyUtil.iterateList(musicList);
		//SortByYearComparator yearComparator = new SortByYearComparator();
		//Collections.sort(musicList, yearComparator);
		SortByArtistNameComparator artistComparator = new SortByArtistNameComparator();
		Collections.sort(musicList, artistComparator.reversed());
		System.out.println("-----------------------After sorting-----------------------");
		MyUtil.iterateList(musicList);
		
	}

}

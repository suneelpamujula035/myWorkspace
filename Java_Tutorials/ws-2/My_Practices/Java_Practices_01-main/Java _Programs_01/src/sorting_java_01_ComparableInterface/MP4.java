package sorting_java_01_ComparableInterface;

import java.util.ArrayList;
import java.util.Collections;

public class MP4 {

	public static void main(String[] args) {

		Song song1 = new Song("take me to your heart", "Michael Learn to Rock", 2014);
		Song song2 = new Song("see you again", "Wiz Khalifa", 2015);
		Song song3 = new Song("love me like you do", "Ellie Goulding", 2013);
		Song song4 = new Song("just a dream", "Michael Learn to Rock", 2010);
		Song song5 = new Song("as long as you love me", "Backstreet Boys", 2008);

		ArrayList<Song> musicList = new ArrayList<>();
		musicList.add(song1);
		musicList.add(song2);
		musicList.add(song3);
		musicList.add(song4);
		musicList.add(song5);
		
		MyUtil.iterateList(musicList);
		System.out.println("-----------------------After sorting-----------------------");
		Collections.sort(musicList);
		MyUtil.iterateList(musicList);

	}

}

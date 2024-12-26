package sorting_java_01sorting_java_02_ComparatorInterface;

public class Song implements Comparable<Song> {

	private String title;
	private String artist;
	private Integer year;
	
	public Song(String title, String artist, Integer year) {
		super();
		this.title = title;
		this.artist = artist;
		this.year = year;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", year=" + year + "]";
	}
	@Override
	public int compareTo(Song anotherSong) {

		//Sorting based on the year
//		if(this.getYear()>anotherSong.getYear())
//		{
//			return +1;//We can write any number here
//		}
//		if(this.getYear()<anotherSong.getYear())
//		{
//			return -1;//We can write any number here
//		}
//		return 0;
		//Sorting based on the title
		//return this.getTitle().compareTo(anotherSong.getTitle());//Ascending order
		
		//Sorting based on the title
		return -this.getTitle().compareTo(anotherSong.getTitle());//Descending order
	}
	//return this.getYear().compareTo(anotherSong.getYear());By default integer class comparision
	
	
}

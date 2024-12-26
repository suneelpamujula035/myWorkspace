package assignments;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class ListOfFiles {

	public static void main(String[] args) throws IOException {

//		File f = new File("abc.txt");
//		System.out.println(f.exists());
//		f.createNewFile();
//		System.out.println(f.exists());

		
//		File f1 = new File("suneel123");
//		f1.mkdir();
//		File f2 = new File("suneel123","ss.txt");
//		f2.createNewFile();
		
		File f1 = new File("C:\\Simpli Learn\\Files");
		String[] l = f1.list();
		int count = 0;
		System.out.println("Before sort");
		for(String s : l)
		{
			count++;
			System.out.println(s);
		}
		System.out.println("Number of Files : "+count);

		
		Arrays.sort(l);
		System.out.println("After sort");

		for(String s : l)
		{
			count++;
			System.out.println(s);
		}
		System.out.println("Number of Files : "+count);
		
	}

}

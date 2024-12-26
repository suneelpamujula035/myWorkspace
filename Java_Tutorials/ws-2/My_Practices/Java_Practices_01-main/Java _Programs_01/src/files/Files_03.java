package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Files_03 {

	public static void main(String[] args) throws FileNotFoundException {

		File myObj = new File("C:\\Demo.txt");
		Scanner myReader = new Scanner(myObj);
		while(myReader.hasNextLine())
		{
			String data = myReader.nextLine();
			System.out.println(data);
		}
		myReader.close();
	}

}

package java_programs_06;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileHandling_08 {

	public static void main(String[] args) {

		try {
			File obj = new File("C:\\JEE_Jars\\file-handling\\file2.txt");
			Scanner reader = new Scanner(obj);
			while(reader.hasNext())
			{
				String data = reader.nextLine();
				System.out.println(data);
			}
			reader.close();
		}
		catch(Exception e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}

}

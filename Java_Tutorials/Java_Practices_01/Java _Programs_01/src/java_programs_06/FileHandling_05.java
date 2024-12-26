package java_programs_06;

import java.io.File;

public class FileHandling_05 {

	public static void main(String[] args) {

		try {
			File obj = new File("C:\\JEE_Jars\\file-handling\\file2.txt");
			if(obj.createNewFile())//For creating new file
			{
				System.out.println("File created : "+obj.getName());
				System.out.println("File is successfully created");
			}
			else
			{
				System.out.println("File already exists");
			}
		}
		catch(Exception e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}

}

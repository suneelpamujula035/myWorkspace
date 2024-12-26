package java_programs_06;

import java.io.File;
import java.io.FileWriter;

public class FileHandling_07 {

	public static void main(String[] args) {

		try {
			FileWriter myWriter = new FileWriter("C:\\JEE_Jars\\file-handling\\file1.txt");
			myWriter.write("Java is an Object Orientd Programming Language");
			myWriter.append("  Hiii suneel How are you??");
			myWriter.close();
			System.out.println("Successfully wrote to the file");	
		}
		catch(Exception e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}

}

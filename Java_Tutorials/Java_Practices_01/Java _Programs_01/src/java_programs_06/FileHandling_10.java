package java_programs_06;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileHandling_10 {

	public static void main(String[] args) {

		FileOutputStream fos = null;
		byte b1[] = {'A', 'B'};
		try {
			fos = new FileOutputStream("C:\\JEE_Jars\\file-handling\\file1.txt");
			fos.write(b1);
			System.out.println("Successfully written");
			fos.close();
		}
		catch(Exception e)
		{
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}

}

package java_programs_06;

import java.io.File;

public class FileHandling_06 {

	public static void main(String[] args) {

		
			File obj = new File("C:\\JEE_Jars\\file-handling\\file2.txt");
			if(obj.exists())//For creating new file
			{
				System.out.println("File Name : "+obj.getName());
				System.out.println("Absolute path : "+obj.getAbsolutePath());
				System.out.println("Writable : "+obj.canWrite());
				System.out.println("Readable : "+obj.canRead());
				System.out.println("File size in bytes : "+obj.length());
			}
			else
			{
				System.out.println("File does not exists");
			}
	}

}

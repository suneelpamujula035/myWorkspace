package files;

import java.io.File;
import java.io.IOException;

public class Files_01 {

	public static void main(String[] args) throws IOException {

		File obj = new File("C:\\Demo1.txt");
		if(obj.createNewFile())
		{
			System.out.println("File is created");
		}
		else
		{
			System.out.println("File already exists");
		}
		
	}

}

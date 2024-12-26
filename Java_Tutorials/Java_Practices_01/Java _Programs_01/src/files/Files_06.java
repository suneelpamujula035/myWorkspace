package files;

import java.io.FileInputStream;
import java.io.IOException;

public class Files_06 {

	public static void main(String[] args) throws IOException {

		FileInputStream fin = new FileInputStream("C:\\Demo.txt");
		int i=0;
		while((i=fin.read())!=-1)
		{
			System.out.println((char)i);
		}
		fin.close();
		
		
	}

}

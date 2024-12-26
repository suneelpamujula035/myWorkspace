package files;

import java.io.FileReader;
import java.io.IOException;

public class Files_03 {

	public static void main(String[] args) throws IOException {

//		File myObj = new File("C:\\\\GitPractices\\\\prac.text");
//		Scanner myReader = new Scanner(myObj);
		FileReader fr = new FileReader("C:\\GitPractices\\prac.text");
		int read = fr.read();
		while(read != -1)
		{
			System.out.print((char)read);
			read = fr.read();
		}
		fr.close();
	}

}

package files;

import java.io.FileOutputStream;
import java.io.IOException;

public class Files_04 {

	public static void main(String[] args) throws IOException {

		FileOutputStream fout = new FileOutputStream("C:\\GitPractices\\prac.text");
		fout.write(1099);
		fout.close();
		
	}

}

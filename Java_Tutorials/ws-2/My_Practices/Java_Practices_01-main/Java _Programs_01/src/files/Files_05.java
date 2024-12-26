package files;

import java.io.FileOutputStream;
import java.io.IOException;

public class Files_05 {

	public static void main(String[] args) throws IOException {

		FileOutputStream fout = new FileOutputStream("C:Suneel.txt");
		String s = "Hiiii friends";
		byte b [] = s.getBytes();
		fout.write(b);
		fout.close();
		System.out.println("success");
		
	}

}

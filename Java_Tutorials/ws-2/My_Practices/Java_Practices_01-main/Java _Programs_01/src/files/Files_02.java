package files;

import java.io.FileWriter;
import java.io.IOException;

public class Files_02 {

	public static void main(String[] args) throws IOException {

		FileWriter mywriter = new FileWriter("C:\\Doc.txt");
		mywriter.write("Welcome to Java");
		mywriter.close();
		System.out.println("Successfully updated");
	}

}

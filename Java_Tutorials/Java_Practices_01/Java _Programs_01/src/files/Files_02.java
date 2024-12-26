package files;

import java.io.FileWriter;
import java.io.IOException;

public class Files_02 {

	public static void main(String[] args) throws IOException {

		FileWriter mywriter = new FileWriter("C:\\GitPractices\\prac.text");
		mywriter.write("Welcome to Java");
		mywriter.write("\n");
		mywriter.write("Hii friends How are you");
		mywriter.close();
		System.out.println("Successfully updated");
	}

}

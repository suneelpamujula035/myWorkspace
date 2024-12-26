package assignments;

import java.io.File;

public class DeleteFiles {

	public static void main(String[] args) {

		File f1 = new File("C:\\Simpli Learn\\Files\\ngn.txt");
		System.out.println(f1.delete());
	}

}

package date_api;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date1 {

	public static void main(String[] args) {
		
		Date date = new Date();
		SimpleDateFormat dateForm = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(dateForm.format(date));
	}
}

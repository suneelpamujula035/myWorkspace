package date_api;

import java.time.LocalDate;
import java.time.ZoneId;

public class LocalDateExample {

	public static void main(String[] args) {

		LocalDate localDateToday = LocalDate.now();
		System.out.println("Todays's date : "+localDateToday);
		LocalDate localDateZone = LocalDate.now(ZoneId.of("America/Los_Angeles"));
		System.out.println("Todays's at Zone id  America/Los_Angeles : "+localDateZone);
	}

}

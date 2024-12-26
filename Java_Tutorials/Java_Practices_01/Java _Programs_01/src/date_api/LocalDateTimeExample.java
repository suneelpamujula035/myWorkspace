package date_api;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class LocalDateTimeExample {

	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("CurrentDateTime : "+localDateTime);
		LocalDateTime localDateTimeZone = LocalDateTime.now(ZoneId.of("America/Los_Angeles"));
		System.out.println("CurrentDateTime at Zone id  America/Los_Angeles : "+localDateTimeZone);
	}

}

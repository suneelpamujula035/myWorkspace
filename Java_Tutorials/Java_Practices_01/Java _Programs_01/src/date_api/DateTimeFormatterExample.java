package date_api;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {

	public static void main(String[] args) {

		DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy/mm/dd hh:mm:ssz");
		DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy/mm/dd");
		DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("dd/mm/yyyy");
		
		ZonedDateTime zoneDateTime = ZonedDateTime.now();
		String formatter1 = dateTimeFormatter1.format(zoneDateTime);
		String formatter2 = dateTimeFormatter2.format(zoneDateTime);
		String formatter3 = dateTimeFormatter3.format(zoneDateTime);
		
		System.out.println(formatter1);
		System.out.println(formatter2);
		System.out.println(formatter3);

	}

}

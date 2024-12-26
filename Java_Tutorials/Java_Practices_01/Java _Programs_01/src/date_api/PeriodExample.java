package date_api;

import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {

	public static void main(String[] args) {

		LocalDate localDate1 = LocalDate.of(1997, 12, 27);
		LocalDate localDate2 = LocalDate.of(2021, 9, 02);
		Period period = Period.between(localDate1, localDate2);
		System.out.println("1997-12-27 to 2021-9-02 : Years ("+period.getYears()+"),Months ("+period.getMonths()+"),Days ("+period.getDays()+"),");
		
	}

}

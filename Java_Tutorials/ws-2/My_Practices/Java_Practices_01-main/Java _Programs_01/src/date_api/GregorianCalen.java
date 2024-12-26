package date_api;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalen {

	public static void main(String[] args) {

		Calendar calender = new GregorianCalendar();
		int year = calender.get(Calendar.YEAR);
		int month = calender.get(Calendar.MONTH);
		int dayOfMonth = calender.get(Calendar.DAY_OF_MONTH);
        int dayOfWeek = calender.get(Calendar.DAY_OF_WEEK);
		int weekOfYear = calender.get(Calendar.WEEK_OF_YEAR);
		int weekOfMonth = calender.get(Calendar.WEEK_OF_MONTH);
		System.out.println(year);
		System.out.println(month);
		System.out.println(dayOfMonth);
		System.out.println(dayOfWeek);
		System.out.println(weekOfYear);
		System.out.println(weekOfMonth);
		
	}

}

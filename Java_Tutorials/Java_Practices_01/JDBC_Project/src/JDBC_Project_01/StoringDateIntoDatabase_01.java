package JDBC_Project_01;

public class StoringDateIntoDatabase_01 {

	public static void main(String[] args) {

		java.util.Date date1 = new java.util.Date();
		System.out.println(date1);
		long date2 = date1.getTime();
		java.sql.Date date3 = new java.sql.Date(date2);
		System.out.println(date3);
	}

}

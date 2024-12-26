package java_programs_07;

public class LongNumbers_15 {

	public static void main(String[] args) {

		long longNumberWithoutL = 1000*60*60*24*365;
		long longNumberWithL = 1000*60*60*24*365L;
		
		System.out.println(longNumberWithoutL);//1471228928
		System.out.println(longNumberWithL);//31536000000
	}

}

package strings;

public class StringBuilder_01 {

	public static void main(String[] args) {

		StringBuilder s = new StringBuilder("Hello suneel kumar");
		System.out.println(s);
		
		//StringBuilder also works same as StringBuffer
		
		//StringBuffer(Synchronized) access only one thread at a time
		//StringBuilder(Non-Synchronized) access more than one threads at same time
	}

}

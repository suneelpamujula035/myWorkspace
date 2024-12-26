package strings;

public class StringBuffer_01 {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Hello suneel kumar");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.append(" pamujula"));
		
//		System.out.println(sb.delete(0, 3));//Deleting from Starting position index to Ending position index
//		System.out.println(sb.deleteCharAt(8));//Deleting particular charter
		
//		System.out.println(sb.substring(2));
//		System.out.println(sb.substring(1, 4));
		
		System.out.println(sb.insert(6, "welcome "));//Adding string at particular index position
		
		System.out.println(sb.replace(0, 5, "Hai"));//Replace text from starting index to ending index
		
		System.out.println(sb.reverse());//For reversing string
		
		//StringBuffer(Synchronized) access only one thread at a time
		//StringBuilder(Non-Synchronized) access more than one threads at same time
	}

}

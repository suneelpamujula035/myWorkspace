package java_programs_01;

public class ReverseString {
	
//public static String reverse(String str)
//{
//	if (str==null)
//	{
//		throw new IllegalArgumentException("Null is not a valid input");
//	}
//	else
//	{
//		StringBuilder sb = new StringBuilder();
//		char[] c = str.toCharArray();
//		for(int i=str.length()-1; i>=0;i--)
//		{
//			sb.append(c[i]);
//		}
//		return sb.toString();
//	}
//	
//}
	public static void main(String[] args) {

		//System.out.println(reverse("Hello"));
		String str = "Java";
		StringBuffer sf = new StringBuffer();
		sf = sf.append(str);
		System.out.println(sf.reverse());
		
	}

}

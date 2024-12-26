package java_programs_01;

public class ReverseEveryWordUsingArray {

	public static void main(String[] args) {

		String str = "Hello Welcoome to Java online Classes";
		String arr[] = str.split(" ");
		System.out.println(str);
		
		StringBuilder sb = new StringBuilder();
		for(int i=arr.length-1; i>=0; i--)
		{
			sb.append(arr[i]);
			if(i!=0)
			{
				sb.append(" ");
			}
		}
		
		System.out.println(sb);
	}

}

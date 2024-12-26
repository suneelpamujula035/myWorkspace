package java_programs_01;

public class Array_String_Example_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s[]=new String[4];
		
		s[0]="Good morning Students";
		s[1]="Welcome";
		s[2]="To";
		s[3]="Training";
		
		System.out.println(s.length);
		
		for(String i:s)
		{
			System.out.println(i);
		}

	}

}

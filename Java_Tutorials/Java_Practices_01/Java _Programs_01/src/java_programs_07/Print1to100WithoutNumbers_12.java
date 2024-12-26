package java_programs_07;

public class Print1to100WithoutNumbers_12 {

	public static void main(String[] args) {

		int one = 'A'/'A';//65/65=1
		String s1 = "..........";//10
		
		for(int i=one; i<=(s1.length()*s1.length()); i++)
		{
			System.out.println(i);
		}
		System.out.println("-----------------------------------------");
		
		//a-97 b-98 c-99 d-100
		for(int i=one; i<='d'; i++)
		{
			System.out.println(i);
		}
	}

}

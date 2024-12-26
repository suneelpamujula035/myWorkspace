package java_programs_07;

public class PrintWithoutSemicolon_13 {

	public static void main(String[] args) {

		// 1
		if(System.out.printf("Hello world"+"\n")==null)
		{
			
		}
		
		// 2
		if(System.out.append("Hello world"+"\n")==null)
		{
			
		}
		
		// 3
		if(System.out.append("Hello world"+"\n").equals(null))
		{
			
		}
		
		// 4
		for(int i=0; i<1; System.out.println("Hello world"))
		{
			i++;
		}
	}

}

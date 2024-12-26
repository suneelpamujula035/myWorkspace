package java_programs_01;


public class Enum_02 {
	enum Level
	{
		LOW,
		MEDIUM,
		HIGH
	}

	public static void main(String[] args) {

		Level myvar = Level.MEDIUM;
		System.out.println(myvar);
		
		for(Level x:Level.values())
		{
			System.out.println(x);
		}
	}

}

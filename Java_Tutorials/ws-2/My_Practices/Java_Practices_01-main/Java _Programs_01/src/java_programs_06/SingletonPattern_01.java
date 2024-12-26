package java_programs_06;

public class SingletonPattern_01 {

	private static SingletonPattern_01 s1= null;
	private SingletonPattern_01()
	{
		
	}
	public static SingletonPattern_01 getPattern()
	{
		if(s1==null)
		{
			s1 = new SingletonPattern_01();
		}
		return s1;
	}
	public static void main(String[] args) {

		System.out.println(SingletonPattern_01.getPattern().hashCode());//JVM creates unique code for each object
		System.out.println(SingletonPattern_01.getPattern().hashCode());
		System.out.println(SingletonPattern_01.getPattern().hashCode());
		System.out.println(SingletonPattern_01.getPattern().hashCode());
		System.out.println(SingletonPattern_01.getPattern().hashCode());
		
SingletonPattern_01 s2 = new SingletonPattern_01();
System.out.println("Hiiiii "+s2.hashCode());
SingletonPattern_01 s3 = new SingletonPattern_01();
System.out.println(s3.hashCode());


	}

}

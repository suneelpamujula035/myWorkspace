package innerClasses;

public class StaticInnerClass {
	static class Inner{
		void innerMethod()
		{
			System.out.println("From inner method");
		}
	}

	public static void main(String[] args) {

		Inner i = new Inner();
		i.innerMethod();
	}

}

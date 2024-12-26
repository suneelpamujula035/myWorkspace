package innerClasses;

public class MethodLocalInnerClass {
	
	void outerMethod()
	{
		class Inner{
			void innerMethod()
			{
				System.out.println("Inner class method");
			}
		}
		Inner i = new Inner();
		i.innerMethod();
	}

	public static void main(String[] args) {

		MethodLocalInnerClass m = new MethodLocalInnerClass();
		m.outerMethod();
	}

}

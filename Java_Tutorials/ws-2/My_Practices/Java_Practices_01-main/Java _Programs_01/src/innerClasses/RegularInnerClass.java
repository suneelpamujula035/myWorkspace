package innerClasses;

class RegularInnerClass {
	
	class Inner{
		void innerMethod()
		{
			System.out.println("Inner class method");
		}
	}
	
	void outerMethod()
	{
		System.out.println("Outer class method");
		Inner i = new Inner();
		i.innerMethod();
	}

	public static void main(String[] args) {

		RegularInnerClass r = new RegularInnerClass();
		r.outerMethod();
	}

}

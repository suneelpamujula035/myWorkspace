package innerClasses;

class InnerClass_FromStaticMethod {
	
	class Inner{
		void innerMethod()
		{
			System.out.println("Inner class method");
		}
	}
	
	void outerMethod()
	{
		System.out.println("Outer class method");
	}

	public static void main(String[] args) {

		InnerClass_FromStaticMethod r = new InnerClass_FromStaticMethod();
		r.outerMethod();
		InnerClass_FromStaticMethod.Inner i = new InnerClass_FromStaticMethod(). new Inner();
		i.innerMethod();
	}

}

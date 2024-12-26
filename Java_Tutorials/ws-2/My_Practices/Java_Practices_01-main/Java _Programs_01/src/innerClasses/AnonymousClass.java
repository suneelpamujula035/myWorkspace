package innerClasses;

public class AnonymousClass {

	void msg()
	{
		System.out.println("Hello friends");
	}
	public static void main(String[] args) {

		AnonymousClass a1 = new AnonymousClass();
		a1.msg();
		AnonymousClass a2 = new AnonymousClass() {
		
			void msg()
			{
				System.out.println("Hello world");
			}
		};
		a2.msg();

	}

}

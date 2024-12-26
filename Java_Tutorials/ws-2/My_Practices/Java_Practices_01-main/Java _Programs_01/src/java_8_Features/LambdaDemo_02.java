package java_8_Features;

interface B {
	void show();
}

//class Xyz implements A
//{
//	@Override
//	public void show()
//	{
//		System.out.println("Hello");
//	}
//	
//}
public class LambdaDemo_02 {

	public static void main(String[] args) {
//		A obj = new Xyz();
//		obj.show();

		B obj = new B() { //Anonymous Inner Class
			@Override
			public void show() {
				System.out.println("Hello");
			}

		};
		obj.show();
	}

}

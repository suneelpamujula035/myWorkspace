package java_programs_03;

public class SingletonClassLazy_Instantiation_21 {

	public static void main(String[] args) {

		Abc1 obj = Abc1.getInstance();
		Abc1 obj1 = Abc1.getInstance();
	}

}

class Abc1 {
	// Eagerly instance creation
	static Abc1 obj;
	int i;

	private Abc1()// Changing constructor to private
	{

		System.out.println("Instance created");
	}

	public static Abc1 getInstance() {
		if (obj == null) {
			obj = new Abc1();
		}
		return obj;
	}
}

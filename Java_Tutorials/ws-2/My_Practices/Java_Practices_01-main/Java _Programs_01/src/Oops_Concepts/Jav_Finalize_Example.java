package Oops_Concepts;

public class Jav_Finalize_Example {

	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("Finalize method called");
	}

	public static void main(String[] args) {
		
		Jav_Finalize_Example obj = new Jav_Finalize_Example();
		System.out.println(obj.hashCode());
		obj = null;
		System.gc();
		System.out.println("End of Garbbage Collection");

	}
}

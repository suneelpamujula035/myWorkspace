package java_programs_03;

public class SingletonClass_20 {

	private static SingletonClass_20 s = null;

	private SingletonClass_20() {

	}

	public static SingletonClass_20 getInstance() {
		if (s == null) {
			s = new SingletonClass_20();
		}
		return s;
	}
	
	public static void main(String[] args) {
		System.out.println(SingletonClass_20.getInstance().hashCode());
		System.out.println(SingletonClass_20.getInstance().hashCode());
		System.out.println(SingletonClass_20.getInstance().hashCode());
		System.out.println(SingletonClass_20.getInstance().hashCode());
	}
}

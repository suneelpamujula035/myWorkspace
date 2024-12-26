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
		SingletonClass_20 instance1 = SingletonClass_20.getInstance();System.out.println(instance1.hashCode());
		SingletonClass_20 instance2 = SingletonClass_20.getInstance();System.out.println(instance2.hashCode());
		SingletonClass_20 instance3 = SingletonClass_20.getInstance();System.out.println(instance3.hashCode());
		SingletonClass_20 instance4 = SingletonClass_20.getInstance();System.out.println(instance4.hashCode());
	}
}

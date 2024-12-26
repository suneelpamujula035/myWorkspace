package java_programs_03;

public class SingletoneClass_21 {

	public static void main(String[] args) {

		SingletoneClass_21 s1 = new SingletoneClass_21();System.out.println(s1.hashCode());
		SingletoneClass_21 s2 = new SingletoneClass_21();System.out.println(s2.hashCode());
		SingletoneClass_21 s3 = new SingletoneClass_21();System.out.println(s3.hashCode());
		SingletoneClass_21 s4 = new SingletoneClass_21();System.out.println(s4.hashCode());
		
	}

}

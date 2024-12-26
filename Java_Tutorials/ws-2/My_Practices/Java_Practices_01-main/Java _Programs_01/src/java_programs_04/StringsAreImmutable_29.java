package java_programs_04;

public class StringsAreImmutable_29 {

	public static void main(String[] args) {

		String str = "SUNEEL";		
//		String b = "KUMAR";
//		str.concat(b);
//		System.out.println(str);
		
		StringBuffer a = new StringBuffer("SUNEEL");
		StringBuffer b = new StringBuffer("PAMUJULA");
		a.append(b);
		//a.append(" KUMAR");
		System.out.println(a);
		System.out.println(a.reverse());
		
		// 1)Strings created by using String class are Immutable
		// 2)Strings created by using StringBuffer class or StringBuilder class are mutable
	}

}

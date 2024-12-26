package sorting_java_01_ComparableInterface;

public class Test {

	public static void main(String[] args) {

		// -ve integer, if the current object is lesser than the specified object
		System.out.println("a".compareTo("x"));

		// +ve integer
		System.out.println("b".compareTo("d"));

		// +ve integer, if the current object is greater than the specified object
		System.out.println("d".compareTo("a"));

		// +ve integer
		System.out.println("g".compareTo("c"));

		// zero, if the current object is equal to the specified object
		System.out.println("d".compareTo("d"));

	}

}

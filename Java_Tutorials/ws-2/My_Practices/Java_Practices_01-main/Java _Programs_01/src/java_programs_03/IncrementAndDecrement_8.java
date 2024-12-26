package java_programs_03;

public class IncrementAndDecrement_8 {

	public static void main(String[] args) {

		int a;                      // pre(first)-------------------post(later)
		int b;                      // increment                    use
		a=5;                        // use                          increment
		b = ++a;    // increment then use
		System.out.println(b);
		
		int a1;
		int b1;
		a1=5;
		b1 = a1++;  // use then increment
		int b2 = a1++;
		System.out.println(b1);
		System.out.println(b2);
	}

}

package java_programs_05;

abstract class ABDemo{
	
	int i;
	int j;
	
	public ABDemo(int i, int j) {
		super();
		this.i = i;
		this.j = j;
	}
	
}
public class AbstractClassNeedsConstructor_22 extends ABDemo{

	int j;
	int k;
	
	public AbstractClassNeedsConstructor_22(int i, int j, int k, int l) {
		super(i, j);
		this.j = j;
		this.k = k;
	}

	public static void main(String[] args) {

		AbstractClassNeedsConstructor_22 e = new AbstractClassNeedsConstructor_22(32, 56, 77, 87);
		
	}

}
//public class Demo44 extends ABDemo{
//
//	int l;
//	int m;
//	public Demo44(int i, int j, int l, int m) {
//		super(i, j);
//		this.l = l;
//		this.m = m;
//	}
//	
//	public static void main(String[] args) {
//		
//	}
	
//}

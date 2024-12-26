package constructorInsideAbstractClass;

public abstract class AbDemo {

	int i;
	int j;
	public AbDemo(int i, int j) {
		this.i = i;
		this.j = j;
		System.out.println("Super constructor called");
	}
	
	
}

package constructorInsideAbstractClass;

public class Demo  extends AbDemo{

	int k;
	int l;
	public Demo(int i, int j, int k, int l) {
		super(i,j);
		this.k = k;
		this.l = l;
	}
	public static void main(String[] args) {
		Demo d = new Demo(1, 2, 5, 8);
		System.out.println(d.i+" "+d.j+" "+d.k+" "+d.l);
	}
	
	
}

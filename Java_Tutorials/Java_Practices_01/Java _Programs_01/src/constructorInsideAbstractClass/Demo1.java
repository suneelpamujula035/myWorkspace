package constructorInsideAbstractClass;

public class Demo1 extends AbDemo{

	int x;
	int y;
	
	
	
	public Demo1(int i, int j, int x, int y) {
		super(i,j);
		this.x = x;
		this.y = y;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

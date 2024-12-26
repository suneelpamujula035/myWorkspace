package Inheritance_Concepts;

class Ex1
{
	int k;
	public void add(int i, int j)
	{
	k=i+j;
	System.out.println(k);
	}
}
class Ex2 extends Ex1
{
	public void sub(int i, int j)
	{
	k=i-j;
	System.out.println(k);
	}
}

public class Multi_Level_Inheritance extends Ex2
{
	public void multi(int i, int j)
	{
	k=i*j;
	System.out.println(k);
	}

	public static void main(String[] args) {
		//int i=2;
		//int j=5;
		
		 Multi_Level_Inheritance m1 = new Multi_Level_Inheritance();
		 m1.add(50, 60);
		 m1.sub(40, 25);
		 m1.multi(2, 5);

	}

}

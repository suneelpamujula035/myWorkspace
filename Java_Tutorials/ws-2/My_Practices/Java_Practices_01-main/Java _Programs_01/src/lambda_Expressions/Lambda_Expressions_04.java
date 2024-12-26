package lambda_Expressions;

interface Addable
{
	int add(int x, int y);
}
public class Lambda_Expressions_04 {

	public static void main(String[] args) {

		Addable a = (x,y)->(x+y);
		System.out.println(a.add(10, 30));
		
		Addable a1 = (x,y)->{
			return x-y;
		};
		System.out.println(a1.add(100, 50));
	}

}

package java_programs_03;

public class IncrementAndDecrement_9 {

	public static void main(String[] args) {

		int a;
		int b;
		a=5;
		b = ++a + ++a;//6 + 7
		System.out.println(b);//13
		
		int x;
		int y;
		x = 5;
		y = x++ + x++;// 5 + 6
		System.out.println(y);//11
		
		int i;
		int j;
		i = 5;
		j = ++i + i++;// 6 + 6
		System.out.println(j);//12
		
		int p;
		int q;
		p = 5;
		q = p++ + ++p;// 5 + 7
		System.out.println(q);//12
		
	}

}

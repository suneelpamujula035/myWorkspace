package java_programs_01;

public class Array_Object_Example_04{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object a[]=new Object[5];
		
		a[0]=10;
		a[1]=25.7;
		a[2]="Welcome";
		a[3]='G';
		a[5]=true;
		
		for(Object i:a)
		{
			System.out.println(i);
		}
		
	}

}

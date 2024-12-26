package java_programs_01;

public class Prime_Numbers_Example_04 {

	public static void main(String[] args) {
		
		int num = 59;
		int count = 0;
		
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				count++;
		}
		if(count==2)
		{
			System.out.println("Entered number is Prime Number");
		}
		else
		{
			System.out.println("Entered number is not a Prime Number");
		}

	}

}

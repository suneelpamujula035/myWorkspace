package java_programs_06;

public class PrintingTables_04 {

	public void printTable(int n)
	{
		int i, sum;
		for(i=1; i<=10; i++)
		{
			sum = n*i;
			System.out.println(n+" x "+i+" = "+sum);
		}
	}
	public static void main(String[] args) {

		PrintingTables_04 p = new PrintingTables_04();
		p.printTable(9);
	}

}

package java_programs_06;

public class FindingTax {

	int a[], n;
	double tax = 0;
	public double findTax(int arr[])
	{
		for(int i=0; i<n; i++)
		{
			if(arr[i]>100)
			{
				tax = tax + ((arr[i]-100)*0.1);
			}
		}
		return tax;
	}
	public static void main(String[] args) {

		int a[] = {100,200,300,400,500};
		int n = a.length;
		FindingTax f = new FindingTax();
		System.out.println(f.findTax(a));
	}

}

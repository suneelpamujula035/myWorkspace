package java_programs_01;

public class StaticAndNonStaticVariables_01 {

	String bankName = "State Bank of India";//Instance or Non-static variables
	String branch   = "Gudur";
	String IFSCcode = "SBIN0000843";
	
	public void Suneel()
	{
		String accountHolderName = "PAMUJULA SUNEEL KUMAR";//Local variables
		int accountNumber = 101;
		int balance = 32000;
		
		System.out.println(accountHolderName);
		System.out.println(accountNumber);
		System.out.println(balance);
		
	}
	
	public void Pawan()
	{
		String accountHolderName = "PAWAN KALYAN";
		int accountNumber = 102;
		int balance = 85000;
		
		System.out.println(accountHolderName);
		System.out.println(accountNumber);
		System.out.println(balance);
	}
	
	public void Tiru()
	{
		String accountHolderName = "PALA TIRUMALESH";
		int accountNumber = 103;
		int balance = 42000;
		
		System.out.println(accountHolderName);
		System.out.println(accountNumber);
		System.out.println(balance);
	}
	public static void main(String[] args) {

		StaticAndNonStaticVariables_01 b = new StaticAndNonStaticVariables_01();
		System.out.println(b.bankName);
		System.out.println(b.branch);
		System.out.println(b.IFSCcode);
		b.Suneel();
		
		StaticAndNonStaticVariables_01 b1 = new StaticAndNonStaticVariables_01();
		System.out.println(b1.bankName);
		System.out.println(b1.branch);
		System.out.println(b1.IFSCcode);
		b.Pawan();
		
		StaticAndNonStaticVariables_01 b2 = new StaticAndNonStaticVariables_01();
		System.out.println(b2.bankName);
		System.out.println(b2.branch);
		System.out.println(b2.IFSCcode);
		b2.Tiru();
	}

}

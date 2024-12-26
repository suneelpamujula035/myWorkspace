package java_programs_05;

interface RBI{
	void withdraw();
	void deposit();
	public default void aadharLink() 
	{
		System.out.println("Customer should link their aadhar with the bank");
	}
	public default void miniumBalance()
	{
		System.out.println("Connect your bank to know the minium balance that you need to maintain");
	}
}
class SBI implements RBI{

	@Override
	public void withdraw() {
		System.out.println("SBI withdraw...");
	}

	@Override
	public void deposit() {	
		System.out.println("SBI deposit...");
	}
	
	public void aadharLink()
	{
		System.out.println("Your aadhar has been linked with sbi");
	}
	public void miniumBalance()
	{
		System.out.println("Minimum balance you need to maintain is 2000 for sbi");
	}
	
}
class AXIS implements RBI{
	
	@Override
	public void withdraw() {
		System.out.println("AXIS withdraw...");
	}

	@Override
	public void deposit() {	
		System.out.println("AXIS deposit...");
	}
}
class PNB implements RBI{
	
	@Override
	public void withdraw() {
		System.out.println("PNB withdraw...");
	}

	@Override
	public void deposit() {	
		System.out.println("PNB deposit...");
	}
}
public class InterfaceUsingDefaultMethod_26 {

	public static void main(String[] args) {

		RBI sbiUser = new SBI();
		sbiUser.deposit();
		sbiUser.withdraw();
		sbiUser.aadharLink();
		sbiUser.miniumBalance();
		
		RBI axisUser = new AXIS();
		axisUser.deposit();
		axisUser.withdraw();
		axisUser.aadharLink();//When you not override this methods then parent class methods will execute
		axisUser.miniumBalance();
	}

}

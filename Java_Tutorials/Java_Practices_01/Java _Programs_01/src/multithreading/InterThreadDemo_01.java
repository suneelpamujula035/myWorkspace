package multithreading;

class Customer
{
	int Balance = 10000;
	
	public synchronized void withdraw(int amount) throws InterruptedException
	{
		System.out.println("Going to withdraw");
		if(this.Balance<amount)
		{
			System.out.println("Less balance waiting to deposit");
			wait();
		}
		
		this.Balance= this.Balance-amount;
		System.out.println("Withdraw completed");
	}
	public synchronized void deposit(int amount)
	{
		System.out.println("Going to deposit");
		this.Balance=this.Balance+amount;
		System.out.println("Deposit completed");
		notify();
	}
}
public class InterThreadDemo_01 {

	public static void main(String[] args) {

		Customer c = new Customer();
		new Thread()
		{
			public void run()
			{
				try {
					c.withdraw(15000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();
		new Thread()
		{
			public void run()
			{
				c.deposit(5000);
			}
		}.start();

}
}

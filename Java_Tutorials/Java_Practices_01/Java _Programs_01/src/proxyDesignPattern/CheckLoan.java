package proxyDesignPattern;

public class CheckLoan extends CarLoan{

	public void checkLoan()
	{
		//business logic to check valid customer
		//security checks before checking loan
		super.loanDetails();
	}
}

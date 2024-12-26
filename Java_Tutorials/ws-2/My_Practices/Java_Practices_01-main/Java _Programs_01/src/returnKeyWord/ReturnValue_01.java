package returnKeyWord;

public class ReturnValue_01 {

	public int returnNumber()
	{
		int empID = 218;
		return empID;
	}
	public static void main(String[] args) {

		ReturnValue_01 r = new ReturnValue_01();
		int empid = r.returnNumber();
		System.out.println(empid);
	}

}

package coderpad;

public class PowerOf10 {

	public static void main(String[] args) {

		int number = 1000; // Example number to test
        boolean result = isPowerOfTen(number);
        
        if (result) {
            System.out.println(number + " is a power of 10.");
        } else {
            System.out.println(number + " is not a power of 10.");
        }
	}

	private static boolean isPowerOfTen(int number) {
		if(number<=0)
		{
			return false;
		}
		
		while(number>1)
		{
			if(number%10!=0)
			{
				return false;
			}
			number /=10;
		}
		return true;
	}

}

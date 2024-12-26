package java_programs_04;

public class OTP_Generation {

	public static String generateOTP()
	{
		String str = "";
		for(int i=0; i<6; i++)
		{
			str = str + (int)(Math.random()*10);
		}
		return str;
	}
	public static void main(String[] args) {

		OTP_Generation o = new OTP_Generation();
		System.out.println(generateOTP());
		System.out.println(generateOTP());
		System.out.println(generateOTP());
		System.out.println(generateOTP());
		System.out.println(generateOTP());
		System.out.println(generateOTP());
		System.out.println(generateOTP());
		System.out.println(generateOTP());
		System.out.println(generateOTP());
	}

}

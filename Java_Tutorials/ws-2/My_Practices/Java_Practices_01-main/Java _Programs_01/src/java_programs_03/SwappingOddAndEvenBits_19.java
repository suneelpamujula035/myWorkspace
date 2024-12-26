package java_programs_03;

public class SwappingOddAndEvenBits_19 {

	public static void main(String[] args) {

		int num = 43
				;
		int newnum;
		newnum = ((num & 0X55)<<1 | (num & 0XAA)>>1);
		System.out.println("Before swapping : "+num);
		System.out.println("After swapping : "+newnum);
	}

}

package java_programs_03;

public class SwappingNibblesInAByte_18 {

	public static void main(String[] args) {

		int num = 25;
		int newnum;
		newnum = ((num & 0X0F)<<4 | (num & 0X0F)>>4);
		System.out.println("Before swapping : "+num);
		System.out.println("After swapping : "+newnum);
	}

}

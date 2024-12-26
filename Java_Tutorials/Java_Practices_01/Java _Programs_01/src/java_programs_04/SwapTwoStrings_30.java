package java_programs_04;

public class SwapTwoStrings_30 {

	public static void main(String[] args) {

		String x = "SUNEEL";
		String y = "KUMAR";
		String temp = "";
		
		System.out.println("Before Swapping x : "+x);
		System.out.println("Before Swapping y : "+y);
		//In swapping of strings we don't swap strings we swap references
		temp = x;// let temp point to the same place where x is pointing
		x = y;   // let x point to the same place where y is pointing
		y = temp;// let y point to the same place where temp is pointing
		
		System.out.println("After Swapping x : "+x);
		System.out.println("After Swapping y : "+y);
	}

}

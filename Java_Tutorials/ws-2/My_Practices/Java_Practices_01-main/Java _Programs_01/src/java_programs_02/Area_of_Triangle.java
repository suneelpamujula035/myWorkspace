package java_programs_02;

import java.util.Scanner;

public class Area_of_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int base,height,a;
		Scanner ic=new Scanner(System.in);
		
		System.out.println("Enter base value");
		base=ic.nextInt();
		
		System.out.println("Enter height value");
		height=ic.nextInt();
		
		
		ic.close();
		a=(base*height)/2;
		System.out.println("Area of triangle: "+a);
				

	}

}

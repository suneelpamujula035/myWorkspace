package java_programs_02;

import java.util.Scanner;

public class Area_of_circle {

	public static void main(String[] args) {
		
		Double r,PI,a;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the radius");
		r=sc.nextDouble();
		
		System.out.println("Enter PI value");
		PI=sc.nextDouble();
		
		
		sc.close();
		a=PI*r*r;
		
		System.out.println("Area of circle: "+a );
		
		

	}

}

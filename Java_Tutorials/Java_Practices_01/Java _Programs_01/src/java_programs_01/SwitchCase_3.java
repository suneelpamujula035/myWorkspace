package java_programs_01;

import java.util.Scanner;

public class SwitchCase_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to select which block you want");
		
		int ch = sc.nextInt();
		
		switch(ch)//ch can be int family, char or String
		{
		case 1 : System.out.println("This is block 1");break;
		
		case 2 : System.out.println("This is block 2");break;
		
		case 3 : System.out.println("This is block 3");break;
		
		default : System.out.println("Wrong block");break;
		}

}
}

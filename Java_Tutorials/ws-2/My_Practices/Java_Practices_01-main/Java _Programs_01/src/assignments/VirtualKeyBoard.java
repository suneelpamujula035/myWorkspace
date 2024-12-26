package assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class VirtualKeyBoard {

	String headLine = "Welcome to Virtual Key Application";
	String developerName;
	
	ArrayList<String> menu = new ArrayList<String>();
	List<String> sunny = new ArrayList<String>();
	//sunny.add("HELLO");
	//TreeSet<String> files = new TreeSet<String>();
	
	public VirtualKeyBoard(String developerName) {
		this.developerName = developerName;
	}
	
		
	
//	public void showOptions()
//	{
//		System.out.println("Show main Menu");
//		for(String displayOptions:options)
//		{
//			System.out.println(displayOptions);
//		}
//	}
	
	public void showMenu()
	{
		int option = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("====================================================================================================");
		System.out.println(headLine);
		System.out.println("====================================================================================================");
		System.out.println("Developer Name is : "+developerName);
		option = sc.nextInt();
		do
		{
			switch(option)
			{
			case 1:
			{
				System.out.println("List of Files");
				showFiles();
				break;
			}
			case 2:
			{
				System.out.println("Sub-Menu");
				subMenu();
				break;
			}
			case 3:
			{
				System.out.println("***********************************************************************************************");
				break;
			}
			default:
				System.out.println("Invalid option. Please enter again");
			}
		}while(option !=3);
		System.out.println("Thank you for using our application");
	}
	
	public void showFiles()
	{
		System.out.println("Show files method executed");
	}
	public void subMenu()
	{
		System.out.println("Sub-Menu method executed");
	}
	

}

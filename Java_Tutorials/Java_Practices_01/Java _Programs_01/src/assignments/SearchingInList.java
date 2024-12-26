package assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SearchingInList {

	static String result;

	public static void main(String[] args) {

		List<String> colors = new ArrayList<String>();
		colors.add("blue");
		colors.add("yellow");
		colors.add("pink");
		colors.add("black");
		colors.add("green");
		colors.add("red");

		System.out.println(colors);

		System.out.println(colors.contains("white"));
		System.out.println(colors.contains("Red"));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your favourate color name : ");
		String favColor = sc.nextLine();
		
		for(int i=0; i<colors.size(); i++)
		{
			if(colors.contains(favColor))
			{
				System.out.println("Available");
				break;
			}
			else
			{
				System.out.println("Not available");
				break;
			}
		}
	}
}

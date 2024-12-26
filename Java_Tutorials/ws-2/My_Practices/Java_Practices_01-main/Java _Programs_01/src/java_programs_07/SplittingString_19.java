package java_programs_07;

import java.awt.PrintGraphics;
import java.util.ArrayList;

public class SplittingString_19 {

	public static void main(String[] args) {

		String s = "suneel,pawan341,100,300,suresh,500,785,sathish";
		//String s = "H,F,a,P,B,9,Y,70,G,4";
		String[] arr = s.split(",");
		ArrayList<Integer> integerList = new ArrayList<Integer>();
		ArrayList<String> stringList = new ArrayList<String>();
		
		for(String temp : arr)
		{
			if(temp.matches("[0-9]+"))
			{
				integerList.add(Integer.parseInt(temp));	
				//integerList.add(Integer.valueOf(temp));
			}
			else
			{
				stringList.add(temp);
			}
		}
		
		System.out.println("IntegersList : "+integerList);
		System.out.println("StringsList : "+stringList);
	}

}

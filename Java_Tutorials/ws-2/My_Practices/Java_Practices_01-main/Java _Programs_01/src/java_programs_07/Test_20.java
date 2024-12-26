package java_programs_07;

import java.util.ArrayList;

public class Test_20 {

	public static void main(String[] args) {

		String s = "suneel,pawan,100,300,suresh,500,785,sathish";
		//String s = "H,F,a,P,B,9,Y,70,G,4";
		
		String[] arr = s.split(",");
		
		ArrayList<Integer> numbersList = new ArrayList<Integer>();
		ArrayList<String> stringList = new ArrayList<String>();
		
		for(String temp : arr)
		{
			if(temp.matches("[0-9]+"))
			{
				numbersList.add(Integer.parseInt(temp));
			}
			else
			{
				stringList.add(temp);
			}
		}
		System.out.println(numbersList);
		System.out.println(stringList);
	}

}

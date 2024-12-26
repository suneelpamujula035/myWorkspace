package assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToList {
	public static void main(String[] args) {

//		String arr[] = {"Suneel","Hari","Ravi","Rajesh","Santhosh","Vinod"};
//		List<String> listOfNames = Arrays.asList(arr);
//		listOfNames.stream().forEach(x->System.out.println(x));
		
		ArrayList<String> namesList = new ArrayList<>();
		namesList.add("Pawan");
		List<String> listOfNames = Arrays.asList("Suneel","Hari","Ravi","Rajesh","Santhosh","Vinod");
		namesList.addAll(listOfNames);
		namesList.stream().forEach(System.out::println);
		System.out.println("Ascending Order : --------------------------------");
		Collections.sort(namesList);
		namesList.stream().forEach(System.out::println);
	}

}

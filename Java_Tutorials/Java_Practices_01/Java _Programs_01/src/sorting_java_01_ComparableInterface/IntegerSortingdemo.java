package sorting_java_01_ComparableInterface;

import java.util.ArrayList;
import java.util.Collections;

public class IntegerSortingdemo {

	public static void main(String[] args) {

		ArrayList<Integer> integerList = new ArrayList<>();
		integerList.add(9);
		integerList.add(3);
		integerList.add(12);
		integerList.add(8);
		integerList.add(4);
		integerList.add(15);
		
		MyUtil.iterateList(integerList);
		System.out.println("-----------------------After sorting-----------------------");
		Collections.sort(integerList);
		MyUtil.iterateList(integerList);

	}

}

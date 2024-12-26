package sorting_java_01_ComparableInterface;

import java.util.ArrayList;
import java.util.Collections;

public class StringSortingDemo {

	public static void main(String[] args) {

		ArrayList<String> stringList = new ArrayList<>();
		stringList.add("zara zara");
		stringList.add("besabriyaan");
		stringList.add("kaise hua");
		stringList.add("aeisa desh hai mera");
		stringList.add("koi lauta de woh pyare pyare din");
		
		MyUtil.iterateList(stringList);
		System.out.println("-----------------------After sorting-----------------------");
		Collections.sort(stringList);
		MyUtil.iterateList(stringList);
		
	}

}

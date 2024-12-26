package java_programs_07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Keygeneration {

	public static int keyGeneration(Integer num)
	{
		int temp = num;
		ArrayList<Integer> l = new ArrayList<>();
		do{
		    l.add(temp % 10);
		    temp /= 10;
		} while  (temp > 0);

		//List<Integer> l = Arrays.asList(num);
		Integer maxVal = l.stream().max((i1,i2)->i1.compareTo(i2)).get();
		return maxVal;
	}
	public static void main(String[] args) {

		System.out.println(keyGeneration(23567434));
	}

}

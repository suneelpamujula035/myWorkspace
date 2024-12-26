package coderpad;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {

		String x = "sillyspiders";
		HashMap<Character, Integer> map = new HashMap<>();
		for(char data : x.toCharArray())
		{
			if(map.containsKey(data))
			{
				map.put(data, map.get(data)+1);
			}else {
				map.put(data, 1);
			}
		}
		for(Map.Entry<Character, Integer> data : map.entrySet())
		{
			if(data.getValue()==1)
			{
				System.out.println(data.getKey()+" - "+data.getValue());
				System.exit(0);
			}
		}
	}

}

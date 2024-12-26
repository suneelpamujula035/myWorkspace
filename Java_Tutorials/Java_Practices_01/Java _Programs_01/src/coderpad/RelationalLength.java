package coderpad;

import java.util.Arrays;

public class RelationalLength {

	public static void main(String[] args) {

		String[] strings = {"apple", "banana", "cherry", "date"};
        int referenceLength = 5; // Reference length to compare against

        String[] results = compareLengthsWithStreams(strings, referenceLength);

        System.out.println("Relational Lengths with Streams: " + Arrays.toString(results));
	}

	private static String[] compareLengthsWithStreams(String[] strings, int referenceLength) {
		String result[] = new String[strings.length];
		for(int i=0; i<strings.length; i++)
		{
			int length = strings[i].length();
			if(length<referenceLength)
			{
				result[i] = "shorter";
			}else if(length==referenceLength) {
				result[i] = "equal";
			}else {
				result[i] = "longer";
			}
		}
		return result;
	}

}

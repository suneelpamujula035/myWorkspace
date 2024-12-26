package coderpad;

public class LongestUniformSubstring {

	public static void main(String[] args) {

		String input = "aaabbbbccddddd";
        String encoded = runLengthEncode(input);
        System.out.println("Encoded String: " + encoded);

        int[] result = findLongestUniformSubstring(encoded);
        System.out.println("Longest Uniform Substring Character: " + input.charAt(result[0]));
        System.out.println("Start Index: " + result[0]);
        System.out.println("Length: " + result[1]);
	}

	private static String runLengthEncode(String input) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < input.length(); i++) {
            if (i < input.length() - 1 && input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                sb.append(input.charAt(i)).append(count);
                count = 1;
            }
        }
        return sb.toString();
    }
	
	private static int[] findLongestUniformSubstring(String encoded) {
		
		int currentLength=0;
		int maxLength=0;
		int currentIndex=0;
		int maxStartIndex=0;
		
		for(int i=0; i<encoded.length(); i+=2)
		{
			currentLength = Character.getNumericValue(encoded.charAt(i+1));
			if(currentLength>maxLength)
			{
				maxLength=currentLength;
				maxStartIndex=currentIndex;
			}
			currentIndex+=currentLength;
		}
		return new int[] {maxStartIndex,maxLength};
	}
}

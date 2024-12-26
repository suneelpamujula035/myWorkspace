package coderpad;

public class RunLengthEncoding {

	public static void main(String[] args) {

		String input = "aaaabbbcc";
        String encoded = runLengthEncode(input);
        System.out.println("Encoded String: " + encoded);
	}

	private static String runLengthEncode(String input) {
		StringBuilder sb = new StringBuilder();
		int count=1;
		for(int i=0; i<input.length(); i++)
		{
			if(i<input.length()-1 && input.charAt(i)==input.charAt(i+1))
			{
				count++;
			}else {
				sb.append(input.charAt(i)).append(count);
				count=1;
			}
		}
		return sb.toString();
	}

}

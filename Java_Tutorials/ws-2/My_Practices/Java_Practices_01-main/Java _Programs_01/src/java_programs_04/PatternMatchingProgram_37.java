package java_programs_04;

public class PatternMatchingProgram_37 {

	public static void main(String[] args) {

		String text = "suneelkumar";
		String pattern = "kum";
		int count = 0;
		// boolean result = false;

		int tlen = text.length();
		int plen = pattern.length();
		char c, p;

		for (int i=0; i<=tlen-plen; i++)
		{
			c = text.charAt(i);
			p = pattern.charAt(0);

			if (c == p)
			{
				for (int j=i, k=0; j<i+plen; j++, k++)
				{
					c = text.charAt(j);
					p = pattern.charAt(k);
					if (c == p) {
						count++;
					}
				}
			}
		}

		if (count == plen) 
		{
			System.out.println("Pattern found");
		} else
		{
			System.out.println("Pattern not found");
		}
	}

}

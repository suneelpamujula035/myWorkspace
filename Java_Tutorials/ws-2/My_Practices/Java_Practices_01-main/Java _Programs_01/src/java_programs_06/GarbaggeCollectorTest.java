package java_programs_06;

public class GarbaggeCollectorTest {

	public void finalize()
	{
		System.out.println("Garbbage colector called....");
	}
	public static void main(String[] args) {

		GarbaggeCollectorTest g1 = new GarbaggeCollectorTest();
		GarbaggeCollectorTest g2 = new GarbaggeCollectorTest();
		
		g1 = null;
		g2 = null;
				
		System.gc();
	}
	// We can accheiving garbbage collection by
	// 1. By nulling the reference
	// 2. By assigning reference to another
	// 3. By anonymous object etc,.

}

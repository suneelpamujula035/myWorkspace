package java_8_Features;

interface A {
	void show(int i);
}

public class LambdaDemo_01 {

	public static void main(String[] args) {

		//A obj = (int i) ->System.out.println("Hello"+i);
		//A obj = (i) ->System.out.println("Hello"+i);
		A obj = x ->System.out.println("Hello "+x);

		obj.show(19);
	}

}

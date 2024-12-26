package lambda_Expressions;

interface Drawable
{
	public abstract void draw();
}
public class Lambda_Expressions_01 {

	public static void main(String[] args) {

		int width=10;
		
		//with lambda expression
		Drawable d2=()->{
			System.out.println("Drawing "+width);
		};
		d2.draw();
	}

}
//Lambda Expression provides implementation of functional interface. An interface which has only one abstract method is called functional interface.
//Less coding.

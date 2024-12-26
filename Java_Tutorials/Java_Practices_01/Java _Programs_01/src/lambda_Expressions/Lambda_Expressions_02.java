package lambda_Expressions;

interface Sayable
{
	public abstract String say();
}
public class Lambda_Expressions_02 {

	public static void main(String[] args) {

		
		//with lambda expression
		Sayable s=()->{
			return "Hiiiii friends";
		};
		System.out.println(s.say());
	}

}
//Lambda Expression provides implementation of functional interface. An interface which has only one abstract method is called functional interface.
//Less coding.

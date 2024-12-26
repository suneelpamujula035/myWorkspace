package lambda_Expressions;

interface Sayable2
{
	public abstract String say(String name);
}
public class Lambda_Expressions_03 {

	public static void main(String[] args) {

		
		//with lambda expression
		Sayable2 s1=(name)->{
			return "Hiiiii "+name;
		};
		System.out.println(s1.say("Suneel"));
		
		Sayable2 s2=(name)->{
			return "Hiiiii "+name;
		};
		System.out.println(s2.say("Tiru"));
	}

}
//Lambda Expression provides implementation of functional interface. An interface which has only one abstract method is called functional interface.
//Less coding.

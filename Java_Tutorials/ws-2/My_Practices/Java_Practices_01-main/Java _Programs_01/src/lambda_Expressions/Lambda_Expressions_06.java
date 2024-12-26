package lambda_Expressions;

interface Wishes {
	public void sayMorning();
//	public void sayAfternoon();
//	public void sayEvening();
//	public void sayNight();
}

public class Lambda_Expressions_06 {

	public static void main(String[] args) {

		Wishes w1 = () -> {
			System.out.println("Good morning!!");
		};
//		Wishes w2 = () -> {
//			System.out.println("Good afternoon!!");
//		};
		w1.sayMorning();
	}
	// We can't use Lambda expressions for Multiple methods in interface

}

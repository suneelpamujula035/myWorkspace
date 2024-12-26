package KeyWords;
class This
{
	int a = 10;                       //Instance variable
	void display()
	{
		int a = 150;                  //Local variable
		System.out.println("Local variable:   "+a);        //150
		System.out.println("Instance variable:   "+this.a);   //10
	}
}

public class This_Keyword {

	public static void main(String[] args) {
		
		This t = new This();
		t.display();

	}

}

package Inheritance_Concepts;

class Calculation
{
int z;

public void addition(int x, int y)
{
z=x+y;
System.out.println(z);
}

public void subtraction(int x, int y)
{
z=x-y;
System.out.println(z);
}
}

public class Inheritence2 extends Calculation
{
	 public void multipliction (int x, int y)
     {
        z=x*y;
        System.out.println(z);
           }

 public static void main(String[] args) {
      
            int a=20;
            int b=10;
      
            Inheritence2 d1 = new Inheritence2();

                         d1.addition(a, b);

                         d1.subtraction(a, b);

                         d1.multipliction(a, b);

     }

}

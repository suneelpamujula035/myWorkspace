package Constructors;

public class Copy_Values_Without_Constructor {
	int age;
	String name;
	int salary;
	double hike;
	
	Copy_Values_Without_Constructor(int a,String n,int s,double h)
	{
		age=a;
		name=n;
		salary=s;
		hike=h;
	}
	Copy_Values_Without_Constructor()
	{
		
	}
	public void display4()
	{
		System.out.println(age);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(hike);
	}
	

	public static void main(String[] args) {
		
		Copy_Values_Without_Constructor c1 = new Copy_Values_Without_Constructor(30,"Raveendra",36000,18.56);
		c1.display4();
		Copy_Values_Without_Constructor c2 = new Copy_Values_Without_Constructor();
		c2.age=c1.age;
		c2.name=c1.name;
		c2.salary=c1.salary;
		c2.hike=c1.hike;
		c2.display4();
		

	}

}

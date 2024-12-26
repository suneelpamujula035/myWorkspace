package Inheritance_Concepts;

class emp56
{
	int salary=60000;
}
class Permanenet_Employee extends emp56
{
	double hike=25.7;
}
class Temporary_Employee extends emp56
{
	double hike=22.4;
}
public class Employee_Salary {

	public static void main(String[] args) {
		
		Permanenet_Employee p = new Permanenet_Employee();
		System.out.println("Permanent Employee salary : "+p.salary);
		System.out.println("Permanent Employee hike : "+p.hike);
		
		Temporary_Employee t = new Temporary_Employee();
		System.out.println("Temporary Employee salary : "+t.salary);
		System.out.println("Temporary Employee hike : "+t.hike);

		

	}

}

package java_programs_05;

public class ConstructorChaining_04 {

	int id;
	String name;
	String city;
	
	ConstructorChaining_04(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	ConstructorChaining_04(int id, String name, String city)
	{
		this(id,name);
		this.city = city;
	}
	void display()
	{
		System.out.println("id : "+id+" name : "+name+ " city : "+city);
	}
	
	public static void main(String[] args) {

		ConstructorChaining_04 c = new ConstructorChaining_04(101, "Suneel");
		ConstructorChaining_04 d = new ConstructorChaining_04(102, "Vinod","Hyderbad");
		c.display();
		d.display();
		
	}

}

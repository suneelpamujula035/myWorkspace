package immutable_class;

import Collections_HashSet.Add;

public class App {

	public static void main(String[] args) {

		Address homeAddress = new Address("Bangalore","Karnataka","India");
		System.out.println("Address object 1 : "+homeAddress.hashCode());
		Student suneel = new Student(101, "Suneel", homeAddress);
		System.out.println(suneel);
		
		Address address = suneel.getAddress();
		System.out.println("Address object 2 : "+address.hashCode());
		System.out.println(suneel);
	}

}

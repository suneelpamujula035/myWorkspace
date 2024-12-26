package builderDesignFactory;

public class TestCustomer {

	public static void main(String[] args) {

		Customer c1 = new Customer.CustomerBuilder("suneel", "kumar").setAddress("nellore").build();
		System.out.println(c1);
		
		Customer c2 = new Customer.CustomerBuilder("mahesh", "babu").build();
		System.out.println(c2);
		
		Customer c3 = new Customer.CustomerBuilder("pamujula", "suneel").setPhone("9160980881").build();
		System.out.println(c3);
	}

}

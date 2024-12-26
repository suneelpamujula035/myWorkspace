package builderDesignFactory;

public class Customer {

	private String firstName;
	private String lastName;
	private String age;
	private String dob;
	private String phone;
	private String address;
	
	

	public Customer(CustomerBuilder customerBuilder) {
		super();
		this.firstName = customerBuilder.firstName;
		this.lastName = customerBuilder.lastName;
		this.age = customerBuilder.age;
		this.dob = customerBuilder.dob;
		this.phone = customerBuilder.phone;
		this.address = customerBuilder.address;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAge() {
		return age;
	}

	public String getDob() {
		return dob;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", dob=" + dob
				+ ", phone=" + phone + ", address=" + address + "]";
	}
	
	
	
	public static class CustomerBuilder{
		
		private String firstName;
		private String lastName;
		private String age;
		private String dob;
		private String phone;
		private String address;
		
		public CustomerBuilder(String firstName, String lastName) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public CustomerBuilder setAge(String age) {
			this.age = age;
			return this;
		}

		public CustomerBuilder setDob(String dob) {
			this.dob = dob;
			return this;
		}

		public CustomerBuilder setPhone(String phone) {
			this.phone = phone;
			return this;
		}

		public CustomerBuilder setAddress(String address) {
			this.address = address;
			return this;
		}
		
		public Customer build()
		{
			return new Customer(this);
		}
	}
}

package java_programs_01;

class EmployeeBean {
	private int eid;
	private String ename;
	private Address address;
	public EmployeeBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeBean(int eid, String ename, Address address) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.address = address;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "EmployeeBean [eid=" + eid + ", ename=" + ename + ", address=" + address + "]";
	}
	
	
}

class Address {
	private String city;
	private String state;
	private int zipcode;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String city, String state, int zipcode) {
		super();
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", zipcode=" + zipcode + "]";
	}

}

public class DependencyInjection {

	public static void main(String[] args) {

		Address a1 = new Address("Banglore", "Karnataka", 543760);
		EmployeeBean e1 = new EmployeeBean(101, "Suneel", a1);

		System.out.println(e1);
	}

}

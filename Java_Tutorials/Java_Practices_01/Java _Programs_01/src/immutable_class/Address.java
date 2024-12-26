package immutable_class;

public class Address {

	private final String city;
	private final String state;
	private final String country;

	public Address(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getCountry() {
		return country;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + "]";
	}

	public static Address getInstance(Address address) {
		return new Address(address.getCity(), address.getState(), address.getCountry());
	}

}

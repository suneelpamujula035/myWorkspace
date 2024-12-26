package builderDesignFactory;

public class Shop {

	public static void main(String[] args) {

		Phone p = new PhoneBuilder().setOs("IOS").setBattery(2200).setProcessor("snapdragon").getPhone();
		System.out.println(p);
	}

}

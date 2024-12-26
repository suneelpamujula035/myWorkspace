package couplings;

public class ToStringMethod {

	private int id;
	private String name;
	private int age;
	
	public ToStringMethod(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "ToStringMethod [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {

		ToStringMethod t1 = new ToStringMethod(101, "suneel", 23);
		ToStringMethod t2 = new ToStringMethod(102, "pawan", 26);
		System.out.println(t1);
		System.out.println(t2);

	}

}

package hashcodeAndEquals;

import java.util.HashMap;
import java.util.Map;

public class Demo {

	public static void main(String[] args) {

		Employee emp1 = new Employee(1);
		Employee emp2 = new Employee(1);
		
		Map<Employee, String> map = new HashMap<>();
		map.put(emp1, "Jack");
		map.put(emp2, "Jack");
		
		System.out.println(map.size());//2 -> 1
		System.out.println(map.entrySet());
		
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);
		
		Map<Integer, String> map1 = new HashMap<Integer, String>();//Because all wrapper classes are overriding hashcode and equals methods
		map1.put(i1, "One");
		map1.put(i2, "One");
		
		System.out.println(map1.size());//1 -> 1
		System.out.println(map1.entrySet());
		
		
	}

}
class Employee
{
	int id;

	public Employee(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
}

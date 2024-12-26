package java_programs_05;

import java.util.HashMap;
import java.util.Map;

class Employee{
	int id;

	public Employee(int id) {
		super();
		this.id = id;
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
public class HashCodeAndEquals_20 {

	public static void main(String[] args) {

		Employee emp1 = new Employee(1);
		Employee emp2 = new Employee(1);
		
		Map<Employee, String> map = new HashMap<Employee, String>();
		map.put(emp1, "Suneel");
		map.put(emp2, "Suneel");
		System.out.println(map.size());//2
		System.out.println(map.get(emp1));//Suneel
		
		System.out.println("******************************************");
		Integer i = new Integer(1);
		Integer i1 = new Integer(1);
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(i, "One");
		map1.put(i1, "One");
		System.out.println(map1.size());//1
		System.out.println(map1.get(i));//One
	}

}

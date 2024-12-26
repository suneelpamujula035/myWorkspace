package java_programs_07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMap_01 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(34);
		list.add(19);
		list.add(16);
		list.add(45);
		list.add(98);
		list.add(67);
		
		System.out.println(list);
		
		ArrayList<Hashmap_02> javaDev = new ArrayList<>();
		javaDev.add(new Hashmap_02("Suneel", "India", "Fresher"));
		javaDev.add(new Hashmap_02("Pawan", "UK", "2"));
		javaDev.add(new Hashmap_02("Naresh", "US", "5"));
		javaDev.add(new Hashmap_02("Avilash", "France", "10"));
		javaDev.add(new Hashmap_02("Rakesh", "Germany", "7"));
		
		System.out.println(javaDev);
		
		Map<Integer, Hashmap_02> javaDevMap = new HashMap<>();
		javaDevMap.put(1,new Hashmap_02("Suneel", "India", "Fresher"));
		javaDevMap.put(2,new Hashmap_02("Pawan", "UK", "2"));          
		javaDevMap.put(3,new Hashmap_02("Naresh", "US", "5"));         
		javaDevMap.put(4,new Hashmap_02("Avilash", "France", "10"));   
		javaDevMap.put(5,new Hashmap_02("Rakesh", "Germany", "7"));  
		
		System.out.println(javaDevMap);


	}

}

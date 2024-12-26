package com.streams1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex_13 {

	public static void main(String[] args) {
		List<Employee> empList = Arrays.asList(new Employee(101, "suneel", 35000), new Employee(102, "Praveen", 45000),
				new Employee(103, "Charan", 18000), new Employee(104, "Sandeep", 22500),
				new Employee(105, "Akbar", 27000), new Employee(106, "Balu", 42600));
		//second highest salary of Employee
		double salary = empList.stream().distinct().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst().get().getSalary();
		System.out.println(salary);
		
		empList.stream().distinct().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).limit(1).forEach(System.out::println);
		// empList.stream().filter(e->e.getSalary()>25000).forEach(System.out::println);
		
		//select distinct salary from employee order by salary desc offset 1 limit 1
		
		// Top 3 highest paid Employees
		empList.stream().distinct().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(3).forEach(System.out::println);
		// Top 3 highest paid Employees and if salary is same sort based on names
		empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed().thenComparing(Employee::getName)).limit(3).forEach(System.out::println);
	}

}

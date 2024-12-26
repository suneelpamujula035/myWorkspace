package com.meetingscheduler.service;

import java.util.List;

import org.springframework.data.domain.PageRequest;

import com.meetingscheduler.entity.Employee;


public interface EmployeeService {

	List<Employee> fetchAllEmployees();

	void saveEmployee(Employee employee);
	
	Employee getEmployee(long id);

	void updateEmployee(Employee employee);

	void deleteEmployee(long id);
	
	List<Employee> fetchAllEmployees(PageRequest pageRequest);
	
	List<Employee> findByFirstName(String firstName);
}

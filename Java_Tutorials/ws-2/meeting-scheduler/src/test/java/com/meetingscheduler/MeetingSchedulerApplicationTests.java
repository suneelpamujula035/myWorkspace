package com.meetingscheduler;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.meetingscheduler.entity.Employee;
import com.meetingscheduler.repository.EmployeeRepository;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class MeetingSchedulerApplicationTests {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Test
	@Order(1)
	public void testCreateEmployee()
	{	
		Employee employee = new Employee();
		employee.setFirstName("mahesh");
		employee.setLastName("babu");
		employee.setPhone(9887898897L);
		employee.setEmail("mahesh@gmail.com");
		employee.setDesignation("SE");
		employee.setDepartment("Engineering");
		employee.setEmploymentType("Full-Time");
		
		employeeRepository.save(employee);
		assertNotNull(employeeRepository.findEmployeeByEmail("mahesh@gmail.com"));
	}
	
	@Test
	@Order(2)
	public void testGetAllEmployees()
	{
		List<Employee> employees = employeeRepository.findAll();
		assertThat(employees).size().isGreaterThan(0);
	}
	
	@Test
	@Order(3)
	public void testSearchEmployee()
	{
	List<Employee> employees = employeeRepository.findByFirstName("suneel");
		assertThat(employees).size().isGreaterThan(0);
	}
	
	@Test
	@Order(4)
	public void testGetOneEmployee()
	{
		Employee employee = employeeRepository.findEmployeeByEmail("mahesh@gmail.com");
		assertEquals("Full-Time", employee.getEmploymentType());
	}
	
	@Test
	@Order(5)
	public void testUpdateEmployee()
	{
		Employee employee = employeeRepository.findEmployeeByEmail("mahesh@gmail.com");
		employee.setDesignation("TL");
		employeeRepository.save(employee);
		assertNotEquals("SE", employeeRepository.findEmployeeByEmail("mahesh@gmail.com").getDesignation());
	}
	
	@Test
	@Order(6)
	public void testDeleteEmployee()
	{
		Employee employee = employeeRepository.findEmployeeByEmail("mahesh@gmail.com");
		Long id = employee.getId();
		employeeRepository.deleteById(id);
		assertThat(employeeRepository.existsById(id)).isFalse();
	}

}

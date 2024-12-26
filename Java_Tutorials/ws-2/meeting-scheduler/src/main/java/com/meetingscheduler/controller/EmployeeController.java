package com.meetingscheduler.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.meetingscheduler.entity.Employee;
import com.meetingscheduler.repository.EmployeeRepository;
import com.meetingscheduler.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private EmployeeService employeeService;
	
	private static final int PAGE_SIZE = 3;
	private long totalEmployeeCount;

	private PageRequest gotoPage(int page) {
		PageRequest request = PageRequest.of(page, PAGE_SIZE);
		return request;
	}
	
	@GetMapping("/")
	public String showEmployeeList(Model model, @RequestParam(value = "pageNo", required = false, defaultValue = "0") String pageNo) 
	{
		int lastPageNo;
		int gotoPageNo = Integer.parseInt(pageNo);
		List<Employee> employeeList = new ArrayList<Employee>();
		int count = employeeList.size();
		for (Employee i : employeeService.fetchAllEmployees(gotoPage(gotoPageNo))) {
			employeeList.add(i);
		}

		totalEmployeeCount = employeeRepository.count();
		if (totalEmployeeCount % PAGE_SIZE != 0) {
			lastPageNo = (int) (totalEmployeeCount / PAGE_SIZE) + 1;
		} else {
			lastPageNo = (int) (totalEmployeeCount / PAGE_SIZE);
		}
		model.addAttribute("lastPageNo", lastPageNo);
		model.addAttribute("pageNo", pageNo);
		model.addAttribute("totalEmployeeCount", totalEmployeeCount);
		model.addAttribute("lastPageNo", lastPageNo);
		model.addAttribute("employees", employeeList);
		return "employee-list";
	}

	@GetMapping("/showAddEmployeePage")
	public String addEmployee(Model model) {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "add-employee";
	}

	@PostMapping("/saveEmployee")
	public String saveEmployee(Employee employee) {
		if(employee.getId() == null)
		{
			employeeService.saveEmployee(employee);
		}
		else
		{
			employeeService.updateEmployee(employee);
		}
		return "redirect:/";
	}

	@GetMapping("/updateEmployee")
	public String updateEmployee(@RequestParam("employeeId") long id, Model model) {
		Employee employee = employeeService.getEmployee(id);
		model.addAttribute("employee", employee);
		return "add-employee";
	}
	
	@GetMapping("/deleteEmployee")
	public String deleteEmployee(@RequestParam("employeeId") long id) {
		employeeService.deleteEmployee(id);
		return "redirect:/";
	}
	
	@GetMapping("/searchEmployee")
	public String searchEmployee(Model model, HttpServletRequest request) {
		String firstName = request.getParameter("search");
		if (firstName == "" || firstName == null) {
			return "redirect:/";
		}
		List<Employee> employees = employeeService.findByFirstName(firstName);
		model.addAttribute("employees", employees);
		model.addAttribute("firstName", firstName);
		return "success-results";
	}
	
	//Employee myEmployee;
	@GetMapping("/showCalendar")
	public String showCalendar(@RequestParam("employeeId") long id)
	{
		System.out.println("Employee ID : "+id);
		//myEmployee = employeeService.getEmployee(id);
		
		return "show-calendar";
	}
	
//	@GetMapping("/showCreateMeetingPage")
//	public String showCreateMeetingPage(Model model)
//	{
//		Employee employee = new Employee();
//		model.addAttribute("employee", employee);
//		return "create-meeting";
//	}
//	
//	
//	@PostMapping("/saveMeeting")
//	public String saveMeeting(@ModelAttribute("employee") Employee employee)
//	{
//		employee.setFirstName(myEmployee.getFirstName());
//		employee.setLastName(myEmployee.getLastName());
//		employee.setEmail(myEmployee.getEmail());
//		employee.setPhone(myEmployee.getPhone());
//		employee.setDesignation(myEmployee.getDesignation());
//		employee.setDepartment(myEmployee.getDepartment());
//		employee.setEmploymentType(myEmployee.getDepartment());
//		employeeService.saveEmployee(employee);
//		return "redirect:/show-calendar";
//	}
	
}

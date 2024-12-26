package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/details")
	public List<Student> getStudentDetails()
	{
		ArrayList<Student> arrayList = new ArrayList<Student>();
		Student student1 = new Student(1, "Suneel", "MEC");
		Student student2 = new Student(2, "Praveen", "CSE");
		Student student3 = new Student(3, "Syam", "CIVIL");
		Student student4 = new Student(4, "Prasad", "CSE");
		
		arrayList.add(student1);
		arrayList.add(student2);
		arrayList.add(student3);
		arrayList.add(student4);

		return arrayList;
	}
	
	@RequestMapping("professordetails")
	public List<Professor> getProfessorDetails()
	{
		List<Professor> professorsList = new ArrayList<>();
		professorsList.add(new Professor(101, "Venkatesh", "Java"));
		professorsList.add(new Professor(101, "Hareesh", "Python"));
		professorsList.add(new Professor(101, "Jagadheesh", "React JS"));
		professorsList.add(new Professor(101, "Karthik", "Angular"));
		professorsList.add(new Professor(101, "Fahim", "AWS"));
		return professorsList;
	}
}

package com.dependency.constructorArg;

public class Student {

	private int id;
	private String name;
	private char gender;
	
	
	
	public Student(int id) {
		super();
		this.id = id;
	}


	public Student(int id, String name, char gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
	}


	@Override
	public String toString() {
		return name+" [id=" + id + ", name=" + name + ", gender=" + gender + "]";
	}
	
	
}

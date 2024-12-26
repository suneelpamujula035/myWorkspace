package com.dependencyInjection;

public class AnotherStudent {

	private int id;
	private String name;
	private MathsCheat mathscheat;
	

	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public MathsCheat getMathscheat() {
		return mathscheat;
	}



	public void setMathscheat(MathsCheat mathscheat) {
		this.mathscheat = mathscheat;
	}



	public void cheat()
	{
		mathscheat.mathscheat();
		System.out.println("My id is : "+id);
		System.out.println("My name is : "+name);
	}
}

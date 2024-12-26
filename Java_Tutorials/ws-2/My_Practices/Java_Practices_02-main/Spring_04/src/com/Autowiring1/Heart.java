package com.Autowiring1;

public class Heart {

	private String nameOfAnimal;//Autowiring is not possible for primitive data type like String, int
	private int noOfHeart;
	
	public String getNameOfAnimal() {
		return nameOfAnimal;
	}
	public void setNameOfAnimal(String nameOfAnimal) {
		this.nameOfAnimal = nameOfAnimal;
	}
	public int getNoOfHeart() {
		return noOfHeart;
	}
	public void setNoOfHeart(int noOfHeart) {
		this.noOfHeart = noOfHeart;
	}
	public void pump()
	{
		System.out.println("Your heart is pumping blood");
		System.out.println("You are alive");
	}
}

package com.Autowiring1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

	@Autowired//In this case it does not call any constructors and setter methods
	@Qualifier("octpousHeart")
    private Heart heart;

    
//    public Human() {
//    	
//	}
//	
//    //@Autowired//Whenever we use @Autowired annotation to constructor ----- constructor called----@Qualifier not supported for constructors
//	public Human(Heart heart) {
//		super();
//		this.heart = heart;
//		System.out.println("Constructor called");
//	}
//
//	public Heart getHeart() {
//		return heart;
//	}
//
//	//@Autowired//Whenever we use @Autowired annotation to setter method ----- Setter method called
//	//@Qualifier("octpousHeart")
//	public void setHeart(Heart heart) {
//		this.heart = heart;
//		System.out.println("Setter method called");
//	}
	
	
	public void startPumping()
	{
		if(heart != null)
		{
			heart.pump();
			System.out.println("Name of the animal is : "+heart.getNameOfAnimal()+" No of hearts present "+heart.getNoOfHeart());
		}
		else
		{
			System.out.println("You are dead");
		}
	}
}

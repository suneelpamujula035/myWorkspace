package com.autowiring1;

public class Human {

	private Heart heart;

	
	public Human(Heart heart) {
		super();
		this.heart = heart;
		System.out.println("Constructor called");
	}

	public Heart getHeart() {
		return heart;
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("Setter method called");
	}
	
	
	public void startPumping()
	{
		if(heart != null)
		{
			heart.pump();
		}
		else
		{
			System.out.println("You are dead");
		}
	}
}

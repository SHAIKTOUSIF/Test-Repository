package com.inheritance;

public class CI extends Intrest {
	CI()
	{
		
	}
	CI(double time,double rate,double principle)
	
	{
		super( time, rate, principle);
	}
	void ai()
	{
		amount=principle +Math.pow(((rate+1)/100),time);
		System.out.println("Amount:"+amount);
	}
}

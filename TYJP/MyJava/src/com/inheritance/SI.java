package com.inheritance;

public class SI extends Intrest {
	void ai()
	{
		amount=principle+(rate*principle*time)/100;
		System.out.println("Amount is ="+amount);
	}

}

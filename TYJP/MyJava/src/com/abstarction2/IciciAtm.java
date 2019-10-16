package com.abstarction2;

public class IciciAtm implements ATM{
	int balance;
	@Override
	public void depositing(int depositeAmount) {
		balance =balance+depositeAmount;
		System.out.println("SUCCESSFULLY DEPOSITED!!!!");
	}

	@Override
	public void withdrawing(int withdrawalAmount) {
		if(withdrawalAmount<=balance)
		{
			balance=balance-withdrawalAmount;
		}
		else
			System.out.println("Insufficient balance please retry");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("Balance amount is "+balance);
		
	}	
}

package com.abstarction2;

public class Transaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM a=new IciciAtm();
		a.depositing(10000);
		a.checkBalance();
		a.withdrawing(2000);
		a.checkBalance();

	}

}

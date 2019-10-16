package com.polymorphism;

public class P2 extends P1 {
	void bulletPrakash()
	{
		System.out.println("From BulletPrakas of P2");
	}
	static void kLRahul()
	{
		System.out.println("From KLRahul of P2");
	}
	public static void main(String[] args) {
		P1.kLRahul();//From KLRahul of P1
		P2.kLRahul();//From KLRahul of P2
		P1 ob1=new P2();
		ob1.kLRahul();//From KLRahul of P1
		ob1.bulletPrakash();//From BulletPrakas of P2
		P1 ob2 =new P1();
		ob2.kLRahul();//From KLRahul of P1
		ob2.bulletPrakash();//From BulletPrakas of P1
		P2 ob =new P2();
		ob.kLRahul();//From KLRahul of P2
		ob.bulletPrakash();//From BulletPrakas of P2
		
	}

}

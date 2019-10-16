package com.inheritance;

public class Road1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b1=new Bike ("Red","Kawaasaki",25.0);
		Bike b2=new Bike ("Red","ZMR",25.0);
		TwoWheeler t1=new TwoWheeler("Green","HD");
		Vehicl v1=new Vehicl("Orange");
		display(b1);
		display(t1);
		display(v1);
		display(b2);
	}
 static void display(Vehicl x)
 {
	 System.out.println("color is:"+x.color);
	 if(x instanceof TwoWheeler)
		 System.out.println("Name is:"+((TwoWheeler)x).name);
	 if(x instanceof Bike)
		 System.out.println("Mileageis:"+((Bike)x).mileage);
	 System.out.println("_________________");
 }
}

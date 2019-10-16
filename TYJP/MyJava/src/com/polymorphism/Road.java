package com.polymorphism;

public class Road {

	public static void main(String[] args) {
		Vehicle[] vehicle =new Vehicle[5];
		vehicle[0]=new Vehicle("Red");
		vehicle[1]=new Car("Black", "Jaguar");
		vehicle[2]=new Car("Black mate","Bugatti");
		vehicle[3]=new Audi("White", "Q6", "SUV");
		vehicle[4]=new Audi("Blue", "A8", "Sedan");
		for(Vehicle v : vehicle);
		{
			System.out.println("Vehicle Number"+v.vno);
			System.out.println("color"+v.color);
			if (v instanceof Car)
			System.out.println("Name"+((Car)v).name);
			if(v instanceof Audi)
				System.out.println("Type"+((Audi)v).type);
			v.move();
			v.move("Switzerland");
			System.out.println("______________");
		}
		
	}

}

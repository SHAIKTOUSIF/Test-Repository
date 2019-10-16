package com.inheritance;

public class Parking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicl[] v = new Vehicl[5];
		v[0]=new Bike ("Red","CBZ",30);
		v[1]=new TwoWheeler ("Yellow","BUS");
		v[2]=new Vehicl ("Red");
		v[3]=new TwoWheeler ("Blue","Scooty");
		v[4]=new Bike ("Red","CBZ",30);
		for(Vehicl vehicle:v)
		{
			System.out.println("Colour is:"+vehicle.color);
			if (vehicle instanceof TwoWheeler)
			System.out.println("Name is:"+((TwoWheeler)vehicle).name);
			if (vehicle instanceof Bike)
				System.out.println("Mileage is:"+((Bike)vehicle).mileage);
			System.out.println("**************");
		}
	}

}

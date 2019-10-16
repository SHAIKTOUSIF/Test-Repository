package com.inheritance;

public class MainRoad {
	public static void display(Vehicl v, TwoWheeler Vehicl)
	{
		System.out.println("Colour is:"+v.color);
		if (Vehicl instanceof TwoWheeler)
		System.out.println("Name is:"+((TwoWheeler)v).name);
		if (Vehicl instanceof Bike)
			System.out.println("Mileage is:"+((Bike)v).mileage);
		System.out.println("_______________________");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b1 =new Bike ("Red","CBZ -Xtream",50);
		TwoWheeler t1=new TwoWheeler("Black","Harley Davidson");
		Vehicl v1 =new Vehicl ("Green");
		Bike b2=new Bike ("Orange","KTM",25);
	}

}

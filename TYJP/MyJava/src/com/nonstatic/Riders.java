package com.nonstatic;

public class Riders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1 =  new Vehicle();
		Vehicle v2 =  new Vehicle();
		v1.colour = "Black";
		v1.name = "Bike:Kawasaki Ninja";
		v1.speed = 400;
		
		v2.colour = "Black and Blue ";
		v2.name = "Car:Bugatti Chiron";
		v2.speed = 480;
		
		System.out.println("Vehicle Name:"+ v1.name + " with color "+ v1.colour + " Has Got  Highest Speed oF:"+ v1.speed);
		System.out.println("Vehicle Name:"+ v2.name + " with color "+ v2.colour + " Has Got  Highest Speed oF:"+ v2.speed);
		
		v1.colour = "Red";
		v1.name = "Suzuki HayaBusa";
		v1.speed = 500;
		
		v2.colour = "Ferrari";
		v2.name = "Red and Black";
		v2.speed = 390;
		
		System.out.println("Vehicle Name:"+ v1.name + " with color "+ v1.colour + " Has Got  Highest Speed oF:"+ v1.speed);
		System.out.println("Vehicle Name:"+ v2.name + " with color "+ v2.colour + " Has Got  Highest Speed oF:"+ v2.speed);
				
				

	}

}

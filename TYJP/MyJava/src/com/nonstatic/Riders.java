package com.nonstatic;

public class Riders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle V1 =  new Vehicle();
		Vehicle V2 =  new Vehicle();
		V1.colour = "Black";
		V1.name = "Bike:Kawasaki Ninja";
		V1.speed = 400;
		
		V2.colour = "Black and Blue ";
		V2.name = "Car:Bugatti Chiron";
		V2.speed = 480;
		
		System.out.println("Vehicle Name:"+ V1.name + " with color "+ V1.colour + " Has Got  Highest Speed oF:"+ V1.speed);
		System.out.println("Vehicle Name:"+ V2.name + " with color "+ V2.colour + " Has Got  Highest Speed oF:"+ V2.speed);
		
		V1.colour = "Red";
		V1.name = "Suzuki HayaBusa";
		V1.speed = 500;
		
		V2.colour = "Ferrari";
		V2.name = "Red and Black";
		V2.speed = 390;
		
		System.out.println("Vehicle Name:"+ V1.name + " with color "+ V1.colour + " Has Got  Highest Speed oF:"+ V1.speed);
		System.out.println("Vehicle Name:"+ V2.name + " with color "+ V2.colour + " Has Got  Highest Speed oF:"+ V2.speed);
				
				

	}

}

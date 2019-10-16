package com.polymorphism;

class Audi extends Car {
	String type;
	Audi()
	{
		
	}
	Audi(String color, String name ,String type)
	{
		super(color,name);
		this.type=type;
		
	}
	@Override
	void move (String location) {
		System.out.println(type+"Car is moving toward "+location);
	}

}

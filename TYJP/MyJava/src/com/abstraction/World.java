package com.abstraction;

public class World {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1=new Dog();
		d1.talk();//functionality is provide by concrete class dog
		System.out.println("______________");
		Cat c1=new Cat();
		c1.talk();//functionality is provide by concrete class cat
		System.out.println("______________");
		Animal a;
		a=new Dog();
		a.talk();//functionality is provide by concrete class Animal
		System.out.println("______________");
		a=new Cat();
		a.talk();//functionality is provide by concrete class Animal
		
	}

}

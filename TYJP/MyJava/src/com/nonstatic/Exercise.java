package com.nonstatic;

public class Exercise {
		static int i;
		int j;
		void test()
		{
			//accessing static inside  non static context
			System.out.println(i); //directly
			Exercise.i=200; // using class name
			System.out.println(this.j);
			//accessing non static member from non static context
			System.out.println(i);// directly // 10
			System.out.println(this.i); // using this //10
		 	
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//accessing static  member  inside static context
		System.out.println(i);
		Exercise.i=20;
		System.out.println(i);
		//accessing non static member
		Exercise ob =new Exercise();
		ob.j=10;
		ob.test();
		System.out.println(ob.i);//10
		System.out.println(Exercise.i);
	
		

	}

}

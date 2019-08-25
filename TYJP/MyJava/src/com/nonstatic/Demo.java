/*create a class having an integer property design a method which is used to initialize the integer property
 * the method should accept the value which is to be initialised 
 * to the property
*/
package com.nonstatic;

public class Demo {
	int i;
	void initializer(int a)
	{
		i=a;
		System.out.println("i:"+i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo ob =new Demo();
		ob.initializer(10);

	}

}

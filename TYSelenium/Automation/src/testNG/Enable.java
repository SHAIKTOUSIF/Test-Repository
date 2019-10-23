package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enable {
	@Test(enabled = false)
	public void demo1() {
		System.out.println("hi");
	}
	@Test()
	public void demo2() {
		System.out.println("hi1");
	}
	@Test
	public void demo3() {
		Reporter.log("Hello",true);// to print on console instead of S.o.pln
		Reporter.log("Hello Bhai" ,false);// it will not print
	}
}

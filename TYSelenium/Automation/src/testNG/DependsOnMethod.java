package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethod {
	@Test(dependsOnMethods = "output")
	public void demom() {
		System.out.println("hi");
	}
	@Test
	public void demom1() {
		System.out.println("hi1");
	}
	@Test
	public void output() {
		Reporter.log("Hello",true);// to print on console instead of S.o.pln
		Reporter.log("Hello Bhai" ,false);// it will not print
	}
}

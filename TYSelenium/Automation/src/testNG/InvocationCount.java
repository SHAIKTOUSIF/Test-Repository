package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount {
@Test(invocationCount = 1, priority =1)// if we give invocation count as 0 then  it will not execute.
public void demom() {
	System.out.println("hi");
}
@Test(invocationCount = 3 ,priority = -2)
public void demom1() {
	System.out.println("hi1");
}
@Test
public void output() {
	Reporter.log("Hello",true);// to print on console instead of S.o.pln
	Reporter.log("Hello Bhai" ,false);// it will not print
}
}

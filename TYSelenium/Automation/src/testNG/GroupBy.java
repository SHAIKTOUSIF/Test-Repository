package testNG;

import org.apache.poi.sl.usermodel.GroupShape;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupBy {
	@Test(dependsOnGroups = "smoke")
	public void demo1() {
		System.out.println("hi");
	}
	@Test(groups = "smoke")
	public void demo2() {
		System.out.println("hi1");
	}
	@Test(groups = "smoke")
	public void demo3() {
		Reporter.log("Hello",true);// to print on console instead of S.o.pln
		Reporter.log("Hello Bhai" ,false);// it will not print
	}
}

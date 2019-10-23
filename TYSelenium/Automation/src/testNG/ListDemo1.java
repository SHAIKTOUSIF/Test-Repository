package testNG;

import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners (ListDemo.class)
public class ListDemo1 {
@Test
public void test() {
	System.out.println("Tousif Bhai");
	
}
@Test
public void test2() {
	System.out.println("Tousif"); 
	Assert.fail();
}

}

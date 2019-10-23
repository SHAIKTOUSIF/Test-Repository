package testNG;


import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(Listgmail.class)
public class AssertList {

	
	
	@Test
	public void test1() throws InterruptedException {
		
		ArrayList<Integer>ls=new ArrayList<>();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		ls.add(70);
		System.out.println(ls);
		
		ArrayList<Integer>ls2=new ArrayList<>();
		ls2.add(10);
		ls2.add(2);
		ls2.add(30);
		ls2.add(40);
		ls2.add(50);
		System.out.println(ls2);
		
		
		//Assert.assertEquals(ls,ls2);
		
		SoftAssert sa=new SoftAssert();
		sa.assertAll();


	
}
}
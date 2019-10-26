package com.tyss;

import org.openqa.selenium.WebDriver;

public class DemoB {
	static void test(WebDriver driver ) throws InterruptedException{
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.close();
		
	}
}

package com.tyss;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	}

	public static void main(String[] args) {
		System.out.print("Hello world Welcome to Test Yantra\n");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://github.com/SHAIKTOUSIF/Test-Repository");
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}

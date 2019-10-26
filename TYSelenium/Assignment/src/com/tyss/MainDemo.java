package com.tyss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MainDemo {
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");	
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		DemoB.test(driver);
		
	}

}

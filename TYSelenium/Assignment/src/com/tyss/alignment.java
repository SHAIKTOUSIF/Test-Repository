package com.tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alignment {
	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/ChromeDriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();//open the Browser
		driver.get("https://demo.actitime.com/login.do");
		//get the X axis of the user name textBox.
		int unlocation = driver.findElement(By.id("username")).getLocation().getX();
		//get the X axis of the Password textBox.
		int pwdlocation = driver.findElement(By.name("pwd")).getLocation().getX();
		System.out.println(unlocation);
		System.out.println(pwdlocation);
		if(unlocation==pwdlocation) {
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
	}

}

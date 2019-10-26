package com.tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Size {
	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/ChromeDriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();//open the Browser
		driver.get("https://demo.actitime.com/login.do");
		//int unheight=unsizee.getheight; int unwidth =unsize.getwidth
		int unheight = driver.findElement(By.id("username")).getSize().getHeight();
		int unwidth = driver.findElement(By.id("username")).getSize().getWidth();
		int pwdheight = driver.findElement(By.name("pwd")).getSize().getHeight();
		int pwdwidth = driver.findElement(By.name("pwd")).getSize().getWidth();
		System.out.println(unheight);
		System.out.println(unwidth);
		System.out.println(pwdheight);
		System.out.println(pwdwidth);
		if(unheight==pwdheight && unwidth==pwdwidth)
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}

	}

}

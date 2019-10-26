package com.tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {
	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/ChromeDriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();//open the Browser
		driver.get("https://demo.actitime.com/login.do");//enter the URL
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		String expecttitle=" Enter Time-Track";
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		if(actualtitle.contains(expecttitle)) {
			driver.findElement(By.id("logoutLink")).click();
			System.out.println("Title is displayed and Logged out");
		}
		else
		{
			System.out.println("Title is not displayed and not logged out");
		}	
	}
}

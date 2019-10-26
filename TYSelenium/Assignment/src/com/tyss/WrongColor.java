package com.tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WrongColor {
	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/ChromeDriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();//open the Browser
		driver.get("https://demo.actitime.com/login.do");//enter the URL
		driver.findElement(By.name("username")).sendKeys("aadmin");
		driver.findElement(By.name("pwd")).sendKeys("manage");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(8000);
		String color=driver.findElement(By.xpath("//[contains(text(),'Username or Password is invalid')]")).getCssValue("color");
		System.out.println(color);
		driver.close();
	}
}

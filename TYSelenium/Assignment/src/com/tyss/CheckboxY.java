package com.tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxY {
	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/ChromeDriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();//open the Browser
		driver.get("file:///C:/Users/Tousif/Desktop/clear.html");
		int check1 = driver.findElement(By.xpath("//input[@type='checkbox'][1]")).getLocation().getY(); 
		int check2 = driver.findElement(By.xpath("//input[@type='checkbox'][2]")).getLocation().getY();
		System.out.println(check1);
		System.out.println(check2);
		if (check1==check2) {
			System.out.println("Pass");
		}
		else
			System.out.println("Fail");
		
	}
}

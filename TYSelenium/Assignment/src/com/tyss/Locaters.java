package com.tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locaters {
	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/ChromeDriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1/login.do;jsessionid=3df016gbarkv");
		//WebElement link =  driver.findElement(By.tagName("a"));
		//link.click(); or with code optimization
		driver.findElement(By.tagName("a")).click();
		driver.navigate().back();
		driver.findElement(By.id("loginButton")).click();
		driver.navigate().back();
		driver.findElement(By.className("initial")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Log")).click();
		driver.quit();
		
	}


}

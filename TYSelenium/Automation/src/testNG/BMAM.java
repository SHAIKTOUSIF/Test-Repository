package testNG;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BMAM {
	WebDriver driver;
	@BeforeClass
	public void beforeC() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.out.println("BC");
	}
	@AfterClass
	public void afterC() {
		System.out.println("AC");
	}
	@BeforeMethod
	public void BeforeM() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		System.out.println("BM");
	}
	@AfterMethod
	public void AfterM() {
		System.out.println("success");
		driver.quit();
		System.out.println("AM");
	}
	@Test(priority = 2)
	public void  demoM(){

		driver.findElement(By.name("email")).sendKeys("shaiktousif56");
		driver.findElement(By.name("pass")).sendKeys("12345");
		driver.findElement(By.id("u_0_b")).click();
		System.out.println("Hi1");
	}
	@Test(priority = 1)
	public void  demoM1(){

		driver.findElement(By.name("email")).sendKeys("shaiktousif56");
		driver.findElement(By.name("pass")).sendKeys("12345");
		driver.findElement(By.id("u_0_b")).click();
		System.out.println("Hi");
	}



}

package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Google {
	 @Test
	    public void  demoM(){
	    	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.google.com");
			driver.findElement(By.name("q")).sendKeys("Mobiles",Keys.ENTER);
			System.out.println("Mobiles are displaying");
			driver.close();
	    }
	    @Test
	    public void  demoM1(){
	    	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.google.com");
			driver.findElement(By.name("q")).sendKeys("Laptop",Keys.ENTER);
			System.out.println("laptops are displaying");
			driver.close();
	    }
}

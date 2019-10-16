package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locaters {
	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/ChromeDriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Tousif/Desktop/Demo.html");
		//WebElement link =  driver.findElement(By.tagName("a"));
		//link.click(); or with code optimization
		driver.findElement(By.tagName("a")).click();
		driver.navigate().back();
		driver.findElement(By.id("d1")).click();
		driver.navigate().back();
		driver.findElement(By.name("n1")).click();
		driver.navigate().back();
		driver.findElement(By.className("C1")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Jspider")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Qsp")).click();
		driver.quit();
		
	}

}

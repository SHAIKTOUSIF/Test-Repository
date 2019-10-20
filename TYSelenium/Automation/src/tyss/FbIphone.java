package tyss;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbIphone {
	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/ChromeDriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("Iphone",Keys.ENTER);
		driver.findElement(By.xpath("//img[@src=\"https://rukminim1.flixcart.com/image/312/312/k12go7k0/mobile/7/e/e/apple-iphone-7-mn8x2hn-a-original-imafkqcqhzxuvcpd.jpeg?q=70\"]")).click();
		Set<String> sabTab=driver.getWindowHandles();
		for (String tab : sabTab) {
			driver.switchTo().window(tab);
		}
		
	}
		
}

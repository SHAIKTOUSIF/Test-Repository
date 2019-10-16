package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/ChromeDriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Google.com");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@class=\'gLFyf gsfi\']")).sendKeys("java",Keys.ENTER);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//div[@class=\'r\']/a/h3[@class=\'LC20lb\']")).click();
		System.out.println(driver.getTitle());
	}
	
}

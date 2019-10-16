package tyss;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Suggestion {
	static {
		System.setProperty("webdriver.chrome.driver", "./Drivers/ChromeDriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class=\'gLFyf gsfi\']")).sendKeys("java");
		Thread.sleep(2000);
		List<WebElement> menu = driver.findElements(By.xpath("//div[@class=\"aajZCb\"]"));
		for(WebElement name:menu) {
			System.out.println(name.getText());
		}
		driver.findElement(By.xpath("//li[4]/div/div[2]/div[@class=\"sbl1\"]")).click();
		
	}
}

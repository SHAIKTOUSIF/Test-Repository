package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSearch {
	static {
		System.setProperty("webdriver.chrome.driver", "./Drivers/ChromeDriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org/");
		WebElement search = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		search.sendKeys("java",Keys.ENTER);
		Thread.sleep(1000);
		driver.navigate().back();
		search.clear();
		Thread.sleep(1000);
		search.sendKeys("TestNG",Keys.ENTER);
	}
}

package tyss;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeaderText {
	static {
		System.setProperty("webdriver.chrome.driver", "./Drivers/ChromeDriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class=\'gLFyf gsfi\']")).sendKeys("java",Keys.ENTER);
		Thread.sleep(5000);
		List<WebElement> text = driver.findElements(By.xpath("//h3"));
		for(WebElement name:text)
		System.out.println(name.getText());
	}
}

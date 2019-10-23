package tyss;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonele {
	static {
		System.setProperty("webdriver.chrome.driver", "./Drivers/ChromeDriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("https://amazon.com/");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement ele=driver.findElement(By.xpath("//span[text()='Back to top']"));
		js.executeScript("arguments[0].scrollIntoView()",ele);
		Thread.sleep(2000);
		//js.executeScript("window.scrollBy(0,-100)");
		driver.findElement(By.xpath("//span[text()='Back to top']")).click();
	}
}

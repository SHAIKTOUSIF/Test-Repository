package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FbExplicitWait {
	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/ChromeDriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Shaiktousif56@gmail.com");
		WebDriverWait ww =new WebDriverWait(driver, 10);
		ww.until(ExpectedConditions.textToBePresentInElementValue(By.id("email"), "Shaiktousif56@gmail.com"));
		driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("12334",Keys.ENTER);
		
	}
}

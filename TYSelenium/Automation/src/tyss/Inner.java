package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Inner {
	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/ChromeDriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Tousif/Desktop/Selenium/Inner.html");
		(new WebDriverWait (driver, 10)).until(new ExpectedCondition<Boolean>() {
			public java.lang.Boolean apply(WebDriver driver){
				return driver.findElement(By.xpath("//input[@name='textB']")).isDisplayed();
			}
		});
		driver.findElement(By.xpath("//input[@name='textA']")).sendKeys("Bhai");
	}
}

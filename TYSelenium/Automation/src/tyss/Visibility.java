package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Visibility {
	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/ChromeDriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Tousif/Desktop/Selenium/JS.html");
		driver.findElement(By.id("iamtextbox"));
		WebDriverWait ww =new WebDriverWait(driver, 10);
		ww.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("iamtextbox")))).sendKeys("abcd",Keys.ENTER);

	}
}

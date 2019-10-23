package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb {
	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/ChromeDriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
//		driver.findElement(By.id("email")).sendKeys("abc12@gmail.com");
//		driver.findElement(By.id("pass")).sendKeys("123df87655");
//		driver.findElement(By.id("u_0_b")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('email').value=('Shaiktousif@gmail.com')");
		Thread.sleep(2000);
		
	}
}

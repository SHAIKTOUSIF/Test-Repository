package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/ChromeDriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/");
		driver.findElement(By.name("email")).sendKeys("shaiktousif56@gmail.com");
		driver.findElement(By.name("password")).sendKeys("1a2b3c4d5e");
		driver.findElement(By.className("login-login-button-container")).click();
	}
}

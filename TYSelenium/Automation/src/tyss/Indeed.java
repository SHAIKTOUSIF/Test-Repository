package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Indeed {
	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/ChromeDriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://secure.indeed.com/account/login?hl=en_IN&co=IN&continue=https%3A%2F%2Fwww.indeed.co.in%2F&tmpl=desktop&service=my&from=gnav-util-homepage&_ga=2.2800244.5775848.1570776414-858746216.1570776414");
		Thread.sleep(3000);
		driver.findElement(By.id("login-email-input")).sendKeys("shaiktousif56@gmail.com");
		driver.findElement(By.id("login-password-input")).sendKeys("12345");
		driver.findElement(By.id("login-submit-button")).click();
	}
}

package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/ChromeDriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/?source=auth_switcher");
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("20198827368782");
		driver.findElement(By.name("password")).sendKeys("1a2b3c4d5e");
		driver.findElement(By.className("sqdOP  L3NKy   y3zKF     ")).click();
	}
}

package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/ChromeDriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Gmail.com/");
		driver.findElement(By.id("identifierId")).sendKeys("tousifshaik07@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(10000);
		driver.findElement(By.name("password")).sendKeys("123df87655");
		driver.findElement(By.id("passwordNext")).click();
	}
}

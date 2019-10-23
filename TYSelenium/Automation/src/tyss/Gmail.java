package tyss;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/ChromeDriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Gmail.com/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.id("identifierId")).sendKeys("tousifshaik07@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		//Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.name("password")).sendKeys("TousifGmail@123");
		driver.findElement(By.id("passwordNext")).click();
		WebElement txt = driver.findElement(By.xpath("//a[@title=\"Inbox\"]"));
		if(txt.getText().equalsIgnoreCase("Inbox"))
		{
			System.out.println("Test is passed");
		}
		else
		{
			System.out.println("Test is fail");
		}
	}
	
}

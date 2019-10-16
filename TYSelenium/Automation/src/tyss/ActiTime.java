package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {
	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/ChromeDriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Tousif/Desktop/ActiTime.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/a")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}

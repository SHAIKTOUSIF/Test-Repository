package tyss;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UploadPopup {
	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/ChromeDriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, IOException{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.demo.guru99.com/test/upload");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class=\"upload_txt\"]")).click();
	
		Runtime r =Runtime.getRuntime();
		Thread.sleep(3000);
		r.exec("C:\\Users\\Tousif\\Desktop\\Selenium\\AutoIT.exe");
		
	}
}

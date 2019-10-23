package TestPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.AmazonHome;
import tyss.AmazonScroll;

public class AmazonTest {
	static {
		System.setProperty("webdriver.chrome.driver", "./Drivers/ChromeDriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();  
		driver.get("https://www.amazon.in/");
		AmazonHome ah= new AmazonHome(driver);
		ah.sendText("Iphone");
		ah.goClick();
		Thread.sleep(2000);
		ah.iPhClick();
		Thread.sleep(2000);
		ah.AmzClick();
		Thread.sleep(2000);
		ah.clearText();
		ah.sendText("Oneplus");
		ah.goClick();
		Thread.sleep(2000);
		ah.opClick();
	}
}

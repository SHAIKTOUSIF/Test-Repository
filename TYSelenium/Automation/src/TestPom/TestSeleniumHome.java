package TestPom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.SeleniumHome;

public class TestSeleniumHome {
	static {
		System.setProperty("webdriver.chrome.driver", "./Drivers/ChromeDriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org/");
		SeleniumHome sh=new SeleniumHome(driver);
		sh.sendText("java");
		Thread.sleep(2000);
		sh.goClick();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		sh.clearText();
		sh.sendText("TestNg");
		sh.goClick();
		
	}
}

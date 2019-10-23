package tyss;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ExecuteScript;

public class SeleniumUpDownLeftRight {
	static {
		System.setProperty("webdriver.chrome.driver", "./Drivers/ChromeDriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org/");
		Thread.sleep(10000);
		JavascriptExecutor js = (JavascriptExecutor) driver;// JS casting
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,500)");// for some index//scroll down
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-500)");// scroll up
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(500,0)");// scroll
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");// up to down end
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");// down to up at top
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(document.body.scroollWidth,0)");// Left to right
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(-document.body.scroollWidth,0)");// Right to left

	}
}

package tyss;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class FlipkartScroll {
	static {
		System.setProperty("webdriver.chrome.driver", "./Drivers/ChromeDriver.exe");
	}
	static int count=0;
	public static void screenShot(WebDriver driver, String name) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File sc = ts.getScreenshotAs(OutputType.FILE);
		File ff = new File("./ScreenShot/" + name + ".png");
		Files.copy(sc, ff);
		count++;
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.get("http://flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		FlipkartScroll.screenShot(driver, "FShot1");
		JavascriptExecutor js = (JavascriptExecutor) driver;// JS casting
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,600)");
		FlipkartScroll.screenShot(driver, "FShot2");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,600)");
		FlipkartScroll.screenShot(driver, "FShot3");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		FlipkartScroll.screenShot(driver, "FShot4");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		FlipkartScroll.screenShot(driver, "FShot5");

		
	}
	
}

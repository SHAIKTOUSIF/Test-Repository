package tyss;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class AmazonScroll {
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
		driver.get("https://amazon.in/");
		AmazonScroll.screenShot(driver, "AShot1");
		JavascriptExecutor js = (JavascriptExecutor) driver;// JS casting
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,600)");
		AmazonScroll.screenShot(driver, "AShot2");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,600)");
		AmazonScroll.screenShot(driver, "AShot3");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		AmazonScroll.screenShot(driver, "AShot4");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		AmazonScroll.screenShot(driver, "AShot5");
	}
	
}

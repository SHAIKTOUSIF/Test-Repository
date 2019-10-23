package tyss;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class BlueStoneScroll {
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
		driver.get("https://www.bluestone.com/");
		FlipkartScroll.screenShot(driver, "BShot1");
		JavascriptExecutor js = (JavascriptExecutor) driver;// JS casting
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,600)");
		FlipkartScroll.screenShot(driver, "BShot2");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,600)");
		FlipkartScroll.screenShot(driver, "BShot3");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		FlipkartScroll.screenShot(driver, "BShot4");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		FlipkartScroll.screenShot(driver, "BShot5");

		
	}

}

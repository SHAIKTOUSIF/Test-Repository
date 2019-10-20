package tyss;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class UrbanSCreenShot {
	static {
		System.setProperty("webdriver.chrome.driver", "./Drivers/ChromeDriver.exe");
	}
	static int count=0;
	public static void screen(WebDriver driver, String name) throws IOException
	{

		TakesScreenshot ts=(TakesScreenshot)driver;
		File sc=ts.getScreenshotAs(OutputType.FILE);
		File ff=new File("./Screenshot/"+name+".png");
		Files.copy(sc,ff);
		count++;
		
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		List<WebElement> menu = driver.findElements(By.xpath("//div[@id='topnav_wrapper']/ul/li"));
		Actions a = new Actions(driver);
		Thread.sleep(3000);
		for (WebElement name : menu) {

			String menuName = name.getText();
			System.err.println((menuName));
			a.moveToElement(name).build().perform();
			UrbanSCreenShot.screen(driver, menuName);

		}
	}
}

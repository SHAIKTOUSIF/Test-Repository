package tyss;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;
public class Scenario7Shot {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
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
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		Scenario7Shot.screenShot(driver, "S7p0");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 

		List<WebElement>menu=driver.findElements(By.xpath("//nav[@class='wh-navbar']/ul/li[6]"));//x path for getting mouse over action
		Actions a=new Actions(driver);
		Scenario7Shot.screenShot(driver, "S7p1");	
		for(WebElement name:menu)
		{		
			String menuName = name.getText();
			a.moveToElement(name).build().perform();
			Scenario7Shot.screenShot(driver, menuName);
		}
		driver.findElement(By.xpath("//a[contains(.,'Kadas')]")).click();
		Scenario7Shot.screenShot(driver, "S7p2");
		driver.findElement(By.xpath("//div[@id='grid-view-result']/ul/li[1]")).click();
		Scenario7Shot.screenShot(driver,"S7p3");
		driver.findElement(By.xpath("//span[@class=\"icon-ion-android-arrow-dropdown\"]")).click();
		Scenario7Shot.screenShot(driver,"S7p4");
		driver.findElement(By.xpath("//div[@class='scrollable-list active']/ul/li[4]")).click();
		Scenario7Shot.screenShot(driver,"S7p5");
		driver.findElement(By.id("buy-now")).click();
		Scenario7Shot.screenShot(driver,"S7p6");	
		System.out.println("Success");	
	}
}


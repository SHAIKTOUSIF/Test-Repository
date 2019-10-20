package tyss;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class Scenario5Shot {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	static int count=0;
	public static void screenShot(WebDriver driver,String name) throws IOException
	{

		TakesScreenshot ts=(TakesScreenshot)driver;
		File sc=ts.getScreenshotAs(OutputType.FILE);
		File ff=new File("./ScreenShot/"+name+".png");
		Files.copy(sc,ff);
		count++;
		
	}
	public static void main(String[] args) throws InterruptedException,IOException{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		screenShot(driver,"S5p0");
		Thread.sleep(4000);
		List<WebElement> menu = driver.findElements(By.xpath("//nav[@class=\"wh-navbar\"]/descendant::li[2]"));	
		screenShot(driver,"S5p1");
		Actions a = new Actions(driver);
		Thread.sleep(4000);

		for (WebElement name : menu) {

			a.moveToElement(name).build().perform();
			Thread.sleep(1000);

		}
		driver.findElement(By.xpath("//li[2]/a[@title='Diamond Rings']")).click();
		screenShot(driver,"S5p2");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='top-filter']/descendant::section[1]")).click();
		screenShot(driver,"S5p3");
		List<WebElement> menu1 = driver.findElements(By.xpath("//form[@id=\"price\"]/div/div/span"));
		screenShot(driver,"S5p4");
		for (WebElement name : menu1) {
			String price = name.getText();

			System.out.println(price);
		}

		driver.findElement(By.xpath("//span[@class='view-by-wrap title style-outline i-right']")).click();
		screenShot(driver,"S5p5");
	}
}

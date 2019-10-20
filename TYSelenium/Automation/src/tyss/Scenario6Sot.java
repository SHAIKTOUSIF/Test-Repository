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

public class Scenario6Sot{

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

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		Thread.sleep(4000);
		List<WebElement>menu=driver.findElements(By.xpath("//nav[@class='wh-navbar']/descendant::li[2]"));
		Actions a=new Actions(driver);	
		for(WebElement name:menu)
		{		
			String menuName=name.getText();
			System.out.println(menuName);
			a.moveToElement(name).build().perform();
			Scenario6Sot.screenShot(driver, menuName);
			Thread.sleep(1000);
	}
}
}


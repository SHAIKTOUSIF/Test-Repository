package tyss;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dropable {
	static {
		System.setProperty("webdriver.chrome.driver", "./Drivers/ChromeDriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		//driver.findElement(By.id("draggable"));
		WebElement frame= driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(frame);
		WebElement slider = driver.findElement(By.id("draggable"));
		Actions drag=new Actions(driver);
		drag.dragAndDropBy(slider, 180, 60).perform();
		//drag.doubleClick(slider).perform();
		
		boolean b =driver.findElement(By.id("droppable")).isDisplayed();
		if (b)
		{
			System.out.println("Droppped");
		}
		else
		{
			System.out.println("Not Dropped");
		}
		
	}
}

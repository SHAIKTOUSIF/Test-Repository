package tyss;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnePlus {
	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/ChromeDriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class=\'gLFyf gsfi\']")).sendKeys("OnePlus",Keys.ENTER);
		JavascriptExecutor js = (JavascriptExecutor) driver;// JS casting
		Thread.sleep(2000);
		List<WebElement> nxt = driver.findElements(By.xpath("//td[@class='cur']/following::td"));
		for(int i=0;i<=nxt.size()+1;i++) {
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");// up to down end
			Thread.sleep(2000);
			System.out.println(i+1);
			driver.findElement(By.xpath("//span[@style=\"display:block;margin-left:53px\"]")).click();
			List<WebElement> lnk = driver.findElements(By.xpath("//h3"));
			for(WebElement name:lnk)
				System.out.println(name.getText());
		}
		
	}
}

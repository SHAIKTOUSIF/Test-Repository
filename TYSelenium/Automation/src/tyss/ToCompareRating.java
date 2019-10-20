package tyss;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCompareRating {
	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/ChromeDriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		double big=0;
		double i;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("Java Books",Keys.ENTER);
		 List<WebElement> rate = driver.findElements(By.xpath("//div[@class=\"hGSR34\"]"));
			for(WebElement rating:rate) {
				String rate1=rating.getText();
				System.out.println(rate1);
				i=Double.parseDouble(rate1);
				if(big<i)
					big=i;
			}
			System.out.println("***************\n\n");
			System.out.println("Highest Rating "+big);
			
		
		
		
	}
}

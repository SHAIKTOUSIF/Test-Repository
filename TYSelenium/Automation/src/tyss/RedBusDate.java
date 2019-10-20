package tyss;
 
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBusDate {
	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/ChromeDriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@data-message=\"Please enter a source city\"]")).sendKeys("Banglore");
		driver.findElement(By.xpath("//li[@data-no=\"3\"]")).click();
		driver.findElement(By.xpath("//input[@data-message=\"Please enter a destination city\"]")).sendKeys("Goa");
		driver.findElement(By.xpath("//ul/li[@data-no=\"1\"]")).click();
		
		List<WebElement> elements = driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[2]"));
		for (int i=0; i<elements.size();i++)
		{
			System.out.println(elements.get(i).getText());
			int monthyear = 0;
			if(elements.get(i).getText().equals(monthyear))
			{				
				List<WebElement> days = driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']/table/tbody/tr/td"));
				
				for (WebElement d:days)
				{					
					System.out.println(d.getText());
					if(d.getText().equals(days))
					{
						d.click();
						Thread.sleep(10000);
						return;
					}
				}								
			}
		
		}
	
	}
}
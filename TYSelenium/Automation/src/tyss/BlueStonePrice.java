package tyss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStonePrice {
	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/ChromeDriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		List<WebElement> menu = driver.findElements(By.xpath("//li[2]/a[@title='Rings']"));
		Actions a=new Actions(driver);
		for(WebElement name:menu) {
			//System.out.println(name.getText());
			a.moveToElement(name).build().perform();
		}
		driver.findElement(By.xpath("//li[2]/a[@title=\"Diamond Rings\"]")).click();
		//driver.findElement(By.xpath("//div[2]/section/span/i[@class=\"icon-ion-chevron-down\"]")).click();
		List<WebElement> price = driver.findElements(By.xpath(
				"//div[3]/a[contains(.,\"Price\")]"));
		Actions a1=new Actions(driver);
		for(WebElement name1:price) {
			
			a1.moveToElement(name1).build().perform();
			System.out.println(name1.getText());
		}
	}
}

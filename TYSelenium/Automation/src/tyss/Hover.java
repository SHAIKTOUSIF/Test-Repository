package tyss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover {
	static {
		System.setProperty("webdriver.chrome.driver", "./Drivers/ChromeDriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
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
			Thread.sleep(3000);
			List<WebElement> submenu = driver.findElements(By.xpath(
					"//span[contains(.,'" + menuName + "')]/parent::li/descendant::ul[@class=\"taxonslist\"]/li"));
			Thread.sleep(3000);
			for (WebElement item : submenu) {
				System.out.println(item.getText());
			}
		}
	}
}

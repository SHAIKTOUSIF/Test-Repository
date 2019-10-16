package tyss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mhovar {
	static {
		System.setProperty("webdriver.chrome.driver", "./Drivers/ChromeDriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		List<WebElement> menu = driver.findElements(By.xpath("//div[@class=\"desktop-navLinks\"]/descendant::div[@class=\"desktop-navLink\"]"));
		Actions a = new Actions(driver);
		for (WebElement name : menu) {

			String menuName = name.getText();
			System.err.println((menuName));
			a.moveToElement(name).build().perform();
			Thread.sleep(3000);
			List<WebElement> submenu = driver.findElements(By.xpath(
					"//a[contains(.,"+ menuName + ")]/ancestor::nav/descendant::div[@class='desktop-navLinks']/div"));
			Thread.sleep(3000);
			for (WebElement item : submenu) {
				System.out.println(item.getText());
			}
			
		}
		
	}
}

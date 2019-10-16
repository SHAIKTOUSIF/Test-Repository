package tyss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FHover {
	static {
		System.setProperty("webdriver.chrome.driver", "./Drivers/ChromeDriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		List<WebElement> menu = driver.findElements(By.xpath("//div[@class=\'_3zdbog _3Ed3Ub\']/descendant::li[@class=\'Wbt_B2 _1YVU3_\']"));
		Actions a = new Actions(driver);
		for (WebElement name : menu) {

			String menuName = name.getText();
			System.err.println((menuName));
			a.moveToElement(name).build().perform();
			Thread.sleep(3000);
			List<WebElement> submenu = driver.findElements(By.xpath(
					"//span[contains(.,'" + menuName + "')]/ancestor::div/descendant::ul[@class=\'_114Zhd\']/li"));
			Thread.sleep(3000);
			for (WebElement item : submenu) {
				System.out.println(item.getText());
			}
		}
	}
}

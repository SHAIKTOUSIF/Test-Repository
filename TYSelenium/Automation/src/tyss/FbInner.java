package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FbInner {
	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/ChromeDriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		(new WebDriverWait (driver, 10)).until(new ExpectedCondition<Boolean>() {
			public java.lang.Boolean apply(WebDriver driver){
				return driver.findElement(By.xpath("//input[@id='u_0_b']")).isEnabled();
			}
		});
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("ShaikTousif");
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("Bhai",Keys.ENTER);
			
	}
}

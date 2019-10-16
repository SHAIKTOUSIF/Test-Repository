package tyss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; //fully qualified pack name
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class DemoA {
	static void test(WebDriver driver ) throws InterruptedException{
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.close();
	}

	
	
}

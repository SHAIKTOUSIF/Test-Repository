package tyss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;

public class Demo1 {
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");	
	}
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver1=new ChromeDriver();
		DemoA.test(driver1);
		driver1.get("https://github.com/SHAIKTOUSIF/Test-Repository");
		System.out.println(driver1.getTitle());
		driver1.quit();
		
	}

}

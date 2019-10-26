package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class ParallelBrowsers {
WebDriver driver;
@BeforeTest
@Parameters("browser")//help me to fetch from xml file
public void setup(String browser)throws Exception{
	if(browser.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		driver =new FirefoxDriver();
	}
	else if(browser.equalsIgnoreCase("Chrome")){
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver =new ChromeDriver();
	}
	
	
}
@Test
public void testParameterWithXML() throws InterruptedException{
	driver.get("https://www.Google.com");
	Thread.sleep(2000);
	driver.close();
	
}
}

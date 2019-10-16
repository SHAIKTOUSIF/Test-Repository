package tyss;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.remote.RemoteWebDriver;
public class Demo {
	static 
	{
		//set the path for chrome driver
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Welcome to TYSS");
		// open the browser
		ChromeDriver driver=new ChromeDriver();
		GeckoDriverInfo driver1=new GeckoDriverInfo();
		RemoteWebDriver r;
		JavascriptExecutor j;
		WebDriver w;
		
		
		//Enter the URL
		driver.get("http://127.0.0.1/login.do;jsessionid=960mbmbj7qjj");
		((WebDriver) driver1).get("https://www.facebook.com/");
		// Getting the title and printing on the console
		System.out.println(driver.getTitle());
		
		//close the   browser
		//driver.close();
	}
}

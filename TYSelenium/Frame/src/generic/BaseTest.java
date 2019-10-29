package generic;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements IAutoConst{
	public static Properties con;
	public static FileInputStream fis;
	public static WebDriver driver;
	static String browser_name =""; 
	static {
		try {
			fis=new FileInputStream("H:\\\\TYSelenium\\\\Frame\\\\Config.properties");
			con=new Properties();
			con.load(fis);
			browser_name = con.getProperty("browser");
			if(browser_name.contains("chrome"))
			{
				System.setProperty(CHROME_KEY, CHROME_VALUE);
			}else
			{
				System.setProperty(FIREFOX_KEY,FIREFOX_VALUE);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	@BeforeMethod()
	public static void beforeM() {
		if(browser_name.contains("chrome")) {
			driver=new ChromeDriver();
		}
		else 
		{
			driver= new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		driver.get(URL);
	}
	@AfterMethod
	public static void afterM(ITestResult result) 
	{
		int status  =result.getStatus();
		String testCase= result.getName();
		if(status ==1)
		{
			try {
				ScreenShot.getScreenShot(driver,testCase);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			Reporter.log(testCase +"is fail" ,true);
		}
		driver.close();
	}
}




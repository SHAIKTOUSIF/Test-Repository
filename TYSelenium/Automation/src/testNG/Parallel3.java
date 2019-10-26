package testNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel3 {

	
		WebDriver driver;
		
		@BeforeClass
		
		public void BeforeClass()
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		}
		
		
//		@BeforeTest
//		@Parameters("browser")
//		public void setUp(String browser)throws Exception
//		{
//			if(browser.equalsIgnoreCase("firefox"))
//			{
//				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
//				driver=new FirefoxDriver();
//				driver.manage().window().maximize();
//			}
//			else if(browser.equalsIgnoreCase("chrome"))
//			{
//				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//				driver=new ChromeDriver();
//				driver.manage().window().maximize();
//			}
//		}
		@BeforeMethod
		
		public void beforeM()
		{

			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://www.gmail.com/");//load the url
		}

			
		
		
	@Test
	
	public void test1()throws InterruptedException
	{
		
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	
//		driver.findElement(By.xpath("//div[text()='Use another account']")).click();
		driver.findElement(By.id("identifierId")).sendKeys("tousifshaik07@gmail.com",Keys.ENTER);
		
		driver.findElement(By.name("password")).sendKeys("TousifGmail@123",Keys.ENTER);
		
		
//		driver.findElement(By.xpath("//a[@class='gb_B']")).click();
//		driver.findElement(By.id("ogbkddg:6")).click();
		Thread.sleep(4000);

		List<WebElement> txt = driver.findElements(By.xpath("//div[@class=\"yW\"]"));
	
		for (WebElement name : txt) {
			String subjects = name.getText();

			Reporter.log(subjects,true);
		}

		
		
				
		
		Thread.sleep(1000);
		
		
//		Thread.sleep(2000);
//		driver.findElement(By.name("to")).sendKeys("sawantsuraj743@gmail.com",Keys.ENTER);
//		Thread.sleep(1000);
//		driver.findElement(By.name("subjectbox")).sendKeys("aditi");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//table[@class='aoP aoC']/descendant::table[4]/descendant::div[4]")).sendKeys("aditi");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[@class='aDh']/table/tbody/tr/td/div/div/div")).click();
		

		
	}
}
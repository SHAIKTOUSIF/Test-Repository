package testNG;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listgmail.class)
public class Secenario6Compare {
	WebDriver driver ;
	@BeforeClass


	public void beforeC()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	@BeforeMethod
	public void beforeM()
	{
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");// load the url



	}


	@Test
	public void test1() throws InterruptedException {


		List<WebElement> menu = driver.findElements(By.xpath("//nav[@class=\"wh-navbar\"]/descendant::li[2]"));

		Actions a = new Actions(driver);
		Thread.sleep(4000);

		for (WebElement name : menu) {

			a.moveToElement(name).build().perform();// to mouse over
			Thread.sleep(1000);

		}
		driver.findElement(By.xpath("//li[2]/a[@title='Diamond Rings']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='top-filter']/descendant::section[1]")).click();


		List<WebElement> menu1 = driver.findElements(By.xpath("//form[@id=\"price\"]/div/div/span"));

		for (WebElement name : menu1) {
			String price = name.getText();

			Reporter.log(price);
		}

		driver.findElement(By.xpath("//span[@class='view-by-wrap title style-outline i-right']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='view-by-wrap title style-outline i-right']/following::div[6]/a")).click();
		Thread.sleep(1000);



		List<WebElement> price = driver.findElements(By.xpath("//div[@class='grid-view browse-page-var2 g34 row grid-view-result-active']/ul/li/div[1]/div/div/a/img/following::span[4]"));
		ArrayList<WebElement>sortedArray=new ArrayList<>(price);
		Thread.sleep(2000);

		List<WebElement> priceSorted = driver.findElements(By.xpath("//div[@class='grid-view browse-page-var2 g34 row grid-view-result-active']/ul/li/div[1]/div/div/a/img/following::span[4]"));
		ArrayList<WebElement>sortedArray1=new ArrayList<>(priceSorted);
		Thread.sleep(1000);
		//Collections.sort()(( priceSorted));


		Assert.assertEquals(sortedArray,sortedArray1,"pass");
	}
}



package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GmailDraft {
	WebDriver driver;
	@BeforeClass
	public void beforeC() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	} 
	@BeforeMethod
	public void BeforeM() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.Gmail.com");
	}
	@Test
	public void  Gmail() throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.id("identifierId")).sendKeys("tousifshaik07@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("TousifGmail@123");
		driver.findElement(By.id("passwordNext")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
     	Thread.sleep(1000);
     	driver.findElement(By.xpath("//textarea[@aria-label='To']")).sendKeys("pavandv9@gmail.com");
     	String sub = "Wishing Diwali wishes";
     	driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys(sub);
     	driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("Happy Diwali In Advance");
     	driver.findElement(By.xpath("//img[@aria-label=\"Save & close\"]")).click();
     	Thread.sleep(2000);
     	driver.findElement(By.xpath("//div[@class='TK']/div[5]//span/a[@class='J-Ke n0']")).click();
     	String draft = driver.findElement(By.xpath("//div[@class='Tm aeJ']/descendant::table[5]/tbody/tr[1]/td[6]/div/div/div/span/span")).getText();
     	
     	Assert.assertEquals(sub,draft ,"Success" );
     	driver.quit();
	}
}//
package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fbdate {
	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/ChromeDriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
//		driver.findElement(By.xpath("//span[1]/select[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[1]/select[1]/option[12]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/span[1]/select[3]/option[@value='1997']")).click();
		WebElement day=driver.findElement(By.id("day"));
		Select s=new Select(day);
		s.selectByIndex(12);
		WebElement month=driver.findElement(By.id("month"));
		Select s1=new Select(month);
		s1.selectByIndex(6);
		WebElement year=driver.findElement(By.id("year"));
		Select s2=new Select(year);
		s2.selectByValue("1997");
		
	}
}

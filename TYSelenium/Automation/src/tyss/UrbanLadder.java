package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrbanLadder {
	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/ChromeDriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Sofa",Keys.ENTER);
//		String txt = driver.findElement(By.xpath("//li[@class=\"topnav_item saleunit\"]/span[@class=\"topnav_itemname\"]")).getText();
//		System.out.println(txt);
	}
}

package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrbanLadderpurchase {
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
		driver.findElement(By.xpath("//img[@src=\"https://www.ulcdn.net/images/products/173062/product/FNSF53WLCL3_-_category.jpg?1520235867\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class=\"icofont-cross\"]")).click();
		driver.findElement(By.xpath("//a[@data-gacategory=\"Sofa_Prod_Page\"]")).click();
		driver.findElement(By.xpath("//button[@data-event=\"add_to_cart\"]")).click();
		driver.findElement(By.xpath("//div[@class=\"large-4 columns btn_wrap\"]/button[@name=\"checkout\"]")).click();
	}
}

package tyss;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStone {
	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/ChromeDriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/jewellery/rings.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name=\'search_query\']")).sendKeys("Rings",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class=\'p-image\']/a/img[@src=\'https://kinclimg5.bluestone.com/f_webp,c_scale,w_515,b_rgb:f0f0f0/giproduct/BIVS0451R19_WAA18DIG6XXXXXXXX_ABCD00-PICS-00001-1024-33305.png\']")).click();	
		driver.findElement(By.xpath("//span[@class=\'icon-ion-android-arrow-dropdown\']")).click();
		driver.findElement(By.xpath("//li[@data-key=\'6\']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class=\'buynow-block col-xs-7\']")).click();
		System.out.println(driver.getTitle());
	}
}

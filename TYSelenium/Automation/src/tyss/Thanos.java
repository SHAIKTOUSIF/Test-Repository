package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Thanos {
	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/ChromeDriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Google.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class=\'gLFyf gsfi\']")).sendKeys("Thanos",Keys.ENTER);
		Thread.sleep(3000);
//		driver.get("https://www.google.com/search?q=thanos&rlz=1C1CHBF_enIN865IN865&oq=Tha&aqs=chrome.1.69i57j35i39j0l4.2286j0j8&sourceid=chrome&ie=UTF-8");
		driver.findElement(By.xpath("//canvas[@class=\"c3yYr\"]")).click();
//		Thread.sleep(10000);
		String txt = driver.findElement(By.xpath("//div[@id=\"resultStats\"]")).getText();
		System.out.println(txt);
	}
}
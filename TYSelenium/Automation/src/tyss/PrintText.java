package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintText {
	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/ChromeDriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement txt = driver.findElement(By.xpath("//table[1]/tbody/tr[1]/td/label[@for=\"email\"]"));
		System.out.println(txt.getText());
		driver.findElement(By.xpath("name=\'email\'"));
	}
}

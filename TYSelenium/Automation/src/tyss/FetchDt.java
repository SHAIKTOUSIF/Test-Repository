package tyss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FetchDt {
	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/ChromeDriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//span[1]/select[1]")).click();
		//List<WebElement> day = driver.findElements(By.xpath("//select[1]/option"));
		WebElement day=driver.findElement(By.id("day"));
		Select s=new Select(day);
		List<WebElement> days = s.getOptions();
		for(WebElement dy :days)
			System.out.println(dy.getText());
	}
}

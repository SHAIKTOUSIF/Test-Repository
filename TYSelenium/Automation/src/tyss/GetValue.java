package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetValue {
	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/ChromeDriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();//open the Browser
		driver.get("https://demo.actitime.com/login.do");//enter the URL
		String av=driver.findElement(By.id("username")).getAttribute("placeholder");
		System.out.println(av);
		String cssv=driver.findElement(By.xpath("//div[text()='Login ']")).getCssValue("border-top");
		System.out.println(cssv);
		String ff=driver.findElement(By.xpath("//div[text()='Login ']")).getCssValue("font-family");
		System.out.println(ff);
		
	}
}

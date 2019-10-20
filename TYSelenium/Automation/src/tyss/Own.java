package tyss;

import java.awt.AWTException;
import java.awt.List;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Own {
	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/ChromeDriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Tousif/Desktop/Selenium/Script.html");
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_A);
		WebElement tx=driver.findElement(By.id("b"));
		Select s=new Select(tx);
		java.util.List<WebElement> num = s.getOptions();
		if(s.isMultiple()) {
			for(WebElement nums: num) {
				s.selectByValue(nums.getText());
				System.out.println(nums.getText());
			}
		}
		java.util.List<WebElement> list = s.getAllSelectedOptions();
		for(WebElement op: list) {
			s.selectByValue(op.getText());
		}
		System.out.println(s.getFirstSelectedOption().getText());
		s.deselectAll();
		
	}
}
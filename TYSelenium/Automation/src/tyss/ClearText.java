package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearText {

	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/ChromeDriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();//Open the browser
		driver.get("file:///C:/Users/Tousif/Desktop/clear.html");//enter the link
		//Clear the text or value present in TextBox
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@type='text' and @value='A']")).clear();
		//Get the text off the link.
		String value=driver.findElement(By.id("D1")).getText();
		System.out.println("Text of the Link: "+value);
		//Check wheather Button A is Enabled or Not 
		if(driver.findElement(By.xpath("//input[@type='button'and @value='A']")).isEnabled())
				{
					System.out.println("Button A is Enabled");
				}
		//Check Wheather Button Login is Displayed or not 
		if(driver.findElement(By.xpath("//input[@value='Login']")).isDisplayed())
		{
			System.out.println("Button is Displayed ");
			
		}
		//Check wheather C1 CheckBox is Checked or not
		if(driver.findElement(By.xpath("//input[@checked]")).isSelected())
		{
			System.out.println("CheckBox is Selected");
		}
		driver.close();
	}
}

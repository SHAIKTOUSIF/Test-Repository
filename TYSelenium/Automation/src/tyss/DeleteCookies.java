package tyss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DeleteCookies {
	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/ChromeDriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//how to delete all cookies
		driver.navigate().to("https://www.amazon.in/b?node=14311960031&pf_rd_p=196fa093-ffea-4f85-8269-c31543051d43&pf_rd_r=N1D9KQ571A8JK0533WRB");
		driver.manage().deleteAllCookies();
		//Maximize the Window
		driver.getTitle();
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.quit();

	}

}

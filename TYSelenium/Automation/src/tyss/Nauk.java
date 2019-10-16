package tyss;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nauk {
	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/ChromeDriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		String parent =driver.getWindowHandle();
		System.out.println(parent);
		Set<String> wins = driver.getWindowHandles();
		//wins.remove(parent);
		ArrayList<String >al=new ArrayList<String>(wins);
		
		for(int i=al.size()-1;i>=0;i--) {
			driver.switchTo().window(al.get(i)).close();
		}
//		for(String win:wins) {
//			System.out.println(win);
//			driver.switchTo().window(win).close();
//		}
	}

}

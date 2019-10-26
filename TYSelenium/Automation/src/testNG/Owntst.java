package testNG;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Owntst {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	@BeforeMethod
	public void beforeM() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Tousif/Desktop/Selenium/sites.html");// load the url
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void test1() throws InterruptedException, IOException {
		List<WebElement> link = driver.findElements(By.xpath("//div/a"));
		for (WebElement link1 : link) {
			String link2 = link1.getAttribute("href");
			System.out.println(link2);
			URL u = new URL(link2);
			HttpsURLConnection con = (HttpsURLConnection) u.openConnection();
			int rcode = con.getResponseCode();
			if (rcode >= 200) {
				System.out.println(rcode);
				System.out.println("Link is not broken");
				// System.out.println(con.getResponseCode());
			} else {
				System.out.println(rcode);
				System.out.println("Link is broken");
				// System.out.println(con.getResponseCode());
			}
		}
	}
}

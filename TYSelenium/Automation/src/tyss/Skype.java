package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Skype {
	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/ChromeDriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.live.com/ppsecure/post.srf?wa=wsignin1.0&rpsnv=13&ct=1570777037&rver=7.1.6819.0&wp=MBI_SSL&wreply=https%3A%2F%2Flw.skype.com%2Flogin%2Foauth%2Fproxy%3Fclient_id%3D360605%26redirect_uri%3Dhttps%253A%252F%252Fsecure.skype.com%252Fportal%252Flogin%253Freturn_url%253Dhttps%25253A%25252F%25252Fsecure.skype.com%25252Fportal%25252Foverview%26response_type%3Dpostgrant%26state%3D44b0a319fae4a67d796f6841%26site_name%3Dlw.skype.com&lc=1033&id=293290&mkt=en-US&psi=skype&lw=1&cobrandid=2befc4b5-19e3-46e8-8347-77317a16a5a5&contextid=A2CBD9944A06B16F&bk=1570777039&uaid=6c68c27c7b92442d866630c0cb2cf48b&client_flight=ReservedFlight33,ReservedFligh&pid=0");
		driver.findElement(By.id("i0116")).sendKeys("shaiktousif56@gmail.com");
		driver.findElement(By.id("idSIButton9")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("i0118")).sendKeys("1a2b3c4d5e");
		driver.findElement(By.id("idSIButton9")).click();
	}
}

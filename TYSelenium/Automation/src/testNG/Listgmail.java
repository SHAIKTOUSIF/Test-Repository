package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Listgmail implements ITestListener{
	 @Test
	    public void  demoM(){
	    	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.gmail.com");
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			driver.findElement(By.id("identifierId")).sendKeys("tousifshaik07@gmail.com");
			driver.findElement(By.id("identifierNext")).click();
			//Thread.sleep(3000);
			//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			driver.findElement(By.name("password")).sendKeys("TousifGmail@123");
			driver.findElement(By.id("passwordNext")).click();
			WebElement txt = driver.findElement(By.xpath("//a[@title=\"Inbox\"]"));
			if(txt.getText().equalsIgnoreCase("Inbox"))
			{
				System.out.println("Test is passed");
			}
			else
			{
				System.out.println("Test is fail");
			}
	 }
}

//	@Override
//	public void onTestStart(ITestResult result) {
//		System.out.println(result.getName() +"on test start");
//		System.out.println(result.getStatus() +"ontest start status");
//	}
//
//	@Override
//	public void onTestSuccess(ITestResult result) {
//		System.out.println(result.getName());
//		System.out.println(result.getStatus());
//		
//	}
//
//	@Override
//	public void onTestFailure(ITestResult result) {
//		System.out.println(result.getName());
//		System.out.println(result.getStatus());
//				
//	}
//
//	@Override
//	public void onTestSkipped(ITestResult result) {
//		System.out.println(result.getName());
//		System.out.println(result.getStatus());
//		
//	}
//
//	@Override
//	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//		System.out.println(result.getName());
//	
//		
//		
//	}
//
//	@Override
//	public void onStart(ITestContext context) {
//		System.out.println(context.getOutputDirectory()+"99");
//		System.out.println(context.getStartDate());
//		ITestNGMethod[] tests = context.getAllTestMethods();
//		System.out.println(tests);
//		
//	}
//
//	@Override
//	public void onFinish(ITestContext context) {
//		System.out.println(context.getEndDate());
//		System.out.println(context.getFailedTests() +"failed test");
//		System.out.println(context.getPassedTests() +"passed test");
//		
//		
//	}
//	
//	
//	

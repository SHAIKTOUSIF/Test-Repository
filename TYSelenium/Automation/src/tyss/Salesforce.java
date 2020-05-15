package tyss;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Salesforce {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		System.setProperty("webdriver.chrome.driver","./Drivers/ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("localhost:9998");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.id("login-email")).sendKeys("shaik.t@testyantra.in");
		driver.findElement(By.id("login-password")).sendKeys("Tousif@123");
		driver.findElement(By.name("submitBtn")).click();
		driver.findElement(By.id("userProject")).click();
		driver.findElement(By.xpath("//option[text()='SalsforceTest ']")).click();//Change the Project as per Selection of Project.
		driver.findElement(By.xpath("//a[text()='Repository']")).click();
		//driver.findElement(By.xpath(" //button[text()=' + Create Page']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Salesforce']")).click();// change the name of page when page has to change.
		{
		// Right CLick on Element.
		WebElement RClick = driver.findElement(By.xpath("//span[text()='Login']"));//Change the sub page name when page has to be changed.
		Actions a=new Actions(driver);
		a.contextClick(RClick).perform();
		
		driver.findElement(By.xpath("//div[text()='Add WebElement ']")).click();
		//Writing Data from Excel to TestOptimize.
		FileInputStream fis = new FileInputStream("C:\\Users\\Tousif\\Desktop\\TY SF\\Salesforforce Module by Module xpath\\Home.xlsx");
		Workbook w = WorkbookFactory.create(fis);
		Sheet sh = w.getSheet("Sheet1");
		driver.findElement(By.xpath("//input[@id='input-small ']")).sendKeys(sh.getRow(1).getCell(1).toString());
		WebElement type = driver.findElement(By.xpath("//label[text()='Type']/following-sibling::div"));
		type.click();
		driver.findElement(By.xpath("//input[@formcontrolname=\"LocatorValue\"]")).sendKeys(sh.getRow(1).getCell(4).toString());
		driver.findElement(By.xpath(" //button[text()=' Create & Continue']")).click();
		}
		
		//driver.close();
	}
}

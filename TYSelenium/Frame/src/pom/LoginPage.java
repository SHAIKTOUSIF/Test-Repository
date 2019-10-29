package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="username")
	private WebElement un;
	@FindBy(name="pwd")
	private WebElement pwd;	
	@FindBy(xpath="//a[@id='loginButton']")
	private WebElement loginBtn;	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void inputUN(String text)
	{
		un.sendKeys(text);	
	}
	public void inputPWD(String text)
	{
		pwd.sendKeys(text);	
	}
	public void loginClick()
	{
		loginBtn.click();
	}
}

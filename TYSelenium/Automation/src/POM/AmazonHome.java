package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHome {
	@FindBy(id="twotabsearchtextbox")
	private WebElement search;
	@FindBy(xpath ="//input[@value='Go']")
	private WebElement go;
	@FindBy(xpath="//img[@src=\"https://m.media-amazon.com/images/I/519KIlHA2wL._AC_SX200_SY200_.jpg\"]")
	private WebElement phClick;
	@FindBy(xpath = "//span[@class=\"nav-sprite nav-logo-base\"]")
	private WebElement amz;
	@FindBy(xpath="//img[@src=\"https://m.media-amazon.com/images/I/61FRLa8IFTL._AC_UY218_ML3_.jpg\"]")
	private WebElement opClick;
	public AmazonHome(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void sendText(String text) {
	search.sendKeys(text);
	}
	public void goClick() { 
		go.click();
	}
	public void iPhClick() {
		phClick.click();
	}
	public void AmzClick() {
		amz.click();
	}
	public void clearText() {
		search.clear();
	}
	public void opClick() {
		opClick.click();
	}
	

}

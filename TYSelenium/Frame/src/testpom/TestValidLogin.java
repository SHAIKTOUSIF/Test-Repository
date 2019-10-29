package testpom;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;
import generic.BaseTest;
import generic.Excel;
import pom.EnterTimeTrack;
import pom.LoginPage;

public class TestValidLogin extends BaseTest{
	@Test
	public static void validLogin() throws EncryptedDocumentException, InvalidFormatException
	{
	String un = Excel.getData(XL_PATH,SHEET_NAME,2,0);
	String pwd = Excel.getData(XL_PATH,SHEET_NAME,2,1);
	String title= Excel.getData(XL_PATH,SHEET_NAME,2,2);
	Excel.storeValue(XL_PATH, SHEET_NAME, 0, 3, "Status");
	LoginPage lp = new LoginPage(driver);
	lp.inputUN(un);
	lp.inputPWD(pwd);
	lp.loginClick();
	EnterTimeTrack ett = new EnterTimeTrack(driver);
	ett.verifyHomePageIsDisplayed(driver, 5, title);
	}

}

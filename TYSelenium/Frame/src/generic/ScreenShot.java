package generic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class ScreenShot implements IAutoConst {
	public static void getScreenShot(WebDriver driver, String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File imgSource = ts.getScreenshotAs(OutputType.FILE);
		File imgDestination = new File(IMG_PATH+ name +".png");
		Files.copy(imgSource, imgDestination);
	}
}

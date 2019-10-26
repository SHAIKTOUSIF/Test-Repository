package testNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ConfigDemo {
@Test
public void demo() throws IOException{
	Properties con=new Properties();
	FileInputStream fis=new FileInputStream("H:\\TYSelenium\\Frame\\Config.properties");
	con.load(fis);
	String name=con.getProperty("browser");
	System.out.println(name);
}
}

package testNG;

import org.testng.annotations.Test;

public class TestDatap {
@Test(dataProviderClass = ReadDtExl.class, dataProvider="CreateUser")
void test(String user,String pass) {
	System.out.println(user);
	System.out.println(pass);
}
}

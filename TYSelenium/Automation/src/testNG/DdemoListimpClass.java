

package testNG;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Listgmail.class)
public class DdemoListimpClass {


	@Test
	public void test1() {
		System.out.println("Tousif Bhai");
		Assert.fail();
	}


	@Test
	public void test2() {
		System.out.println("Tousif");
		//Assert.fail();
	}

}


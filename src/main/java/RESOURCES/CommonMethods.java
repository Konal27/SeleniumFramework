package RESOURCES;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class CommonMethods {

	public static void handleselect(WebElement a, int b) {
		Select s=new Select(a);
		s.selectByIndex(b);	
	}
	public static void handleassert(String a,String b,String c) {
		SoftAssert assertion=new SoftAssert();
		assertion.assertEquals(a,b,c);
		assertion.assertAll();
	}
	
	
}

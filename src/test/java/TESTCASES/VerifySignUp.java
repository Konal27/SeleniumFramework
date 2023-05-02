package TESTCASES;

import java.io.IOException; 
import java.time.Duration;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PAGEOBJECTMODULE.LoginPageObject;
import PAGEOBJECTMODULE.SignUpPage;
import RESOURCES.BaseClass;
import RESOURCES.CommonMethods;
import RESOURCES.Constant;

public class VerifySignUp extends BaseClass {

	@Test
	public void signup() throws IOException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		LoginPageObject LPO = new LoginPageObject(driver);
		LPO.tryforfree().click();

		SignUpPage sup = new SignUpPage(driver);
		sup.firstname().sendKeys(Constant.username);
		sup.lastname().sendKeys(Constant.lastname);
		sup.email().sendKeys(Constant.email);
		 sup.jobtitle().sendKeys(Constant.jobtitle);
		sup.company().sendKeys(Constant.company);
		sup.phone().sendKeys(Constant.mobile);
       CommonMethods.handleselect(sup.employees(), 1);
	   CommonMethods.handleselect(sup.companycountry(), 2);
		sup.checkbox().click();
		driver.close();
	}

}

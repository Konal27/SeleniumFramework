package TESTCASES;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PAGEOBJECTMODULE.LoginPageObject;
import RESOURCES.BaseClass;
import RESOURCES.CommonMethods;
import RESOURCES.Constant;

public class VerifyLogin extends BaseClass {
 
	@Test
	public void login() throws IOException {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		 LoginPageObject  LPO=new LoginPageObject(driver);  
		  LPO.enterusername().sendKeys(Constant.username);  
		  LPO.enterpassword().sendKeys(Constant.password);
		  LPO.enterlogin().click();
		  LPO.tryforfree();
		  
		  String actualText=LPO.errorText().getText();
	        String expectedText="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		 CommonMethods.handleassert(actualText, expectedText, "not matching data");
		 driver.close();
		    }
	}



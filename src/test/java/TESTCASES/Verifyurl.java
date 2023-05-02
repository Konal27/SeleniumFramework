package TESTCASES;

import java.io.IOException;

import org.testng.annotations.Test;

import RESOURCES.BaseClass;

public class Verifyurl extends BaseClass {

	
	 @Test
	 public void login() throws IOException {
	  
	  initializeDriver() ;
	  driver.get("https://login.salesforce.com/");
	  
	  
	  
	 }

	
}

package TESTCASES;

import java.io.IOException;  
import java.time.Duration;



import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PAGEOBJECTMODULE.MMTPageObject;
import RESOURCES.BaseClass;

public class MMTTFlightModule extends BaseClass{
     @Test
	public void flight() throws IOException, InterruptedException {
		
		initializeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		MMTPageObject mpo=new MMTPageObject(driver);
		
		mpo.from().click();
		mpo.fromcity().click();
		mpo.to().sendKeys("raipur");
		mpo.tocity().click();
		String a="";
		while (!(a.equals("June 2023"))) {
        mpo.date().click();
         a=mpo.Month().getText();
		}
		for(WebElement k:mpo.Day()) {
		if(k.getText().equalsIgnoreCase("10")) {
			k.click();
		}
		}
		Thread.sleep(5000);
        mpo.traveller().click();  
		mpo.apply().click();
		mpo.search().click();
		
	}
	
}

package TESTCASES;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import RESOURCES.BaseClass;

public class OpenUrl extends BaseClass {

	@Test
	public  void url() throws IOException{
		initializeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("kunal");	
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("kunal21");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
}

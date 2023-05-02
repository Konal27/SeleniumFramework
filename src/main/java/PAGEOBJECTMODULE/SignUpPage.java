package PAGEOBJECTMODULE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SignUpPage {

	public WebDriver driver;

	private By firstname = By.xpath("(//input[@type='text'])[2]");
	private By lastname = By.xpath("(//input[@type='text'])[3]");
	private	By email = By.xpath("(//input[@type='email'])");
	private By company = By.xpath("(//input[@type='text'])[5]");
	private By phone = By.xpath("(//input[@type='tel'])");
	private By jobtitle = By.xpath("(//input[@type='text'])[4]");
	private	By employees = By.xpath("(//select[@name='CompanyEmployees'])");
	private By companycountry = By.xpath("(//select[@name='CompanyCountry'])");
	private By checkbox = By.xpath("(//div[@class='checkbox-ui'])[1]");
    
	public SignUpPage(WebDriver driver2) {
	this.driver=driver2;
	}

	public WebElement firstname() {

		return driver.findElement(firstname);

	}

	public WebElement lastname() {

		return driver.findElement(lastname);

	}

	public WebElement email() {

		return driver.findElement(email);

	}

	public WebElement company() {

		return driver.findElement(company);

	}

	public WebElement phone() {

		return driver.findElement(phone);

	}

	public WebElement jobtitle() {

		return driver.findElement(jobtitle);
		
		

	}

	public WebElement employees() {

		return driver.findElement(employees);

	}

	public WebElement companycountry() {

		return driver.findElement(companycountry);

	}

	public WebElement checkbox() {

		return driver.findElement(checkbox);

	}

}

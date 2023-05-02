package PAGEOBJECTMODULE;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MMTPageObject {

	public WebDriver driver;

	private By from = By.xpath("(//input[@type='text'])[1]");
	private By fromcity = By.xpath("//p[contains(text(),'Pune, India')][1]");
	private By to = By.xpath("(//input[@type='text'])[2]");
	private By tocity = By.xpath("//p[contains(text(),'Raipur, India')]");
	private By date = By.xpath("//span[@aria-label='Next Month']");
	private By month = By.xpath("//div[contains(text(),'June 2023')]");
	private By day = By.xpath("(//div[@class='DayPicker-Body'])[2]//div//p");
	private By traveller = By.xpath("//input[@data-cy='travellers']");
	private By apply = By.xpath("//button[@type='button'][1]");
	private By search = By.xpath("//a[contains(text(),'Search')]");

	public MMTPageObject(WebDriver driver2) {
		this.driver = driver2;
	}

	public WebElement from() {
		return driver.findElement(from);
	}

	public WebElement fromcity() {
		return driver.findElement(fromcity);
	}

	public WebElement to() {
		return driver.findElement(to);
	}

	public WebElement tocity() {
		return driver.findElement(tocity);
	}

	public WebElement date() {

		return driver.findElement(date);
	}

	public WebElement Month() {

		return driver.findElement(month);
	}

	public List<WebElement> Day() {

		return driver.findElements(day);
	}

	public WebElement traveller() {
		return driver.findElement(traveller);
	}

	public WebElement apply() {
		return driver.findElement(apply);
	}

	public WebElement search() {
		return driver.findElement(search);
	}

}

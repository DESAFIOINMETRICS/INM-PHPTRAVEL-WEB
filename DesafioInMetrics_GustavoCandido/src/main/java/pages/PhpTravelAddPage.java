package pages; 

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class PhpTravelAddPage {
	
	private WebDriver driver;
	
	public PhpTravelAddPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void closePhpTravel() { 
	      driver.close(); 
	}
	
	private WebElement headerDiv() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		return driver.findElement(By.xpath("//form/div/div[@class='panel-heading']"));
	}
	
	private WebElement firstName() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		return driver.findElement(By.name("fname"));
	}
	
	private WebElement lastName() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		return driver.findElement(By.name("lname"));
	}
	
	private WebElement email() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		return driver.findElement(By.name("email"));
	}
	
	private WebElement password() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		return driver.findElement(By.name("password"));
	}
	
	private WebElement mobileNumber() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		return driver.findElement(By.name("mobile"));
	}
	
	private WebElement country() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		return driver.findElement(By.id("s2id_autogen1"));
	}
	
	private WebElement countrySearch() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		return driver.findElement(By.xpath("//div[@id='select2-drop']/div/input"));
	}
	
	private WebElement address1() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		return driver.findElement(By.name("address1"));
	}
	
	private WebElement address2() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		return driver.findElement(By.name("address2"));
	}
	
	private WebElement submitButton() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		return driver.findElement(By.xpath("//div[@class='panel-footer']/button"));
	}
	
	public void typeFirstName(String fName) {
		firstName().sendKeys(fName);
	}
	
	public void typeLastName(String lName) {
		lastName().sendKeys(lName);
	}
	
	public void typeEmail(String email) {
		email().sendKeys(email);
	}
	
	public void typePassword(String password) {
		password().sendKeys(password);
	}
	
	public void typeMobileNumber(String number) {
		mobileNumber().sendKeys(number);
	}
	
	public void country(String country) {
		country().click();
		countrySearch().sendKeys(country);
		countrySearch().sendKeys(Keys.ENTER);
	}
	
	public void typeAddress1(String adress) {
		address1().sendKeys(adress);
	}
	
	public void typeAddress2(String adress) {
		address2().sendKeys(adress);
	}
	
	public void submit() {
		
		// click with offset to avoid the chat popup
		Actions clicker = new Actions(driver);
		
		clicker.moveToElement(submitButton(), 10, 5).click().build().perform();
	}
	
	public boolean isAddGuestPage() {
		 
		WebElement header = headerDiv();
		
		if(!header.getText().equals("Add Guest"))
			return true;
		else
			return false;
		
	}
	
}
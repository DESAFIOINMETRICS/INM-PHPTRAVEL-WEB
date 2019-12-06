package pages; 

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PhpTravelGuestManagementPage {
	
	private WebDriver driver;
	
	public PhpTravelGuestManagementPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void closePhpTravel() { 
	      driver.close(); 
	}
	 
	private WebElement addButton() {
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		return driver.findElement(By.xpath("//form[@class='add_button']/button"));
	}
	
	private WebElement table() {
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		return driver.findElement(By.cssSelector("table > tbody"));
	}
	
	public void clickAddButton() {
		 
		addButton().click();
		 
	}
	
	public boolean isGuestRegistered(String fName, String lName, String email) {
		
		WebElement tab = table();
		
		// finds the cell inside the table with the names and email registered
		if(!tab.findElement(By.xpath("//tr/td[text()='"+fName+"']")).equals(null) &&
				!tab.findElement(By.xpath("//tr/td[text()='"+lName+"']")).equals(null) &&
				!tab.findElement(By.xpath("//tr/td/a[@href='mailto:"+email+"']")).equals(null))
			return true;
		else
			return false;
		
	}
	
	public boolean addButtonExists() {
		 
		WebElement button = addButton();
		
		if(!button.getAttribute("class").equals(null))
			return true;
		else
			return false;
		
	}
	
	
	
}
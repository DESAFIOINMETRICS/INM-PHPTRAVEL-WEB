package pages; 

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PhpTravelNavigationPage {
	
	private WebDriver driver;
	
	public PhpTravelNavigationPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void closePhpTravel() { 
	      driver.close(); 
	}
	 
	private WebElement accountsTab() {
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		return SideBar().findElement(By.xpath("//a[@href='#ACCOUNTS']"));
	}
	
	private WebElement SideBar() {
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		return driver.findElement(By.id("sidebar"));
	}
	
	private WebElement guestCustomerSubTab() {
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		return accountsTab().findElement(By.xpath("//a[@href='https://www.phptravels.net/admin/accounts/guest/']"));
	}
	
	public void clickAccountsTab() {
		 
		accountsTab().click();
		 
	}
	
	public void clickGuestCustomersSubTab() {
		 
		guestCustomerSubTab().click();
		
	}
	
	public boolean sideBarExists() {
		 
		WebElement sidebar = SideBar();
		
		if(!sidebar.getAttribute("id").equals(null))
			return true;
		else
			return false;
		
	}
	
}
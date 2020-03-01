package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import config.PageBase;
import utils.Utils;

public class HomePage extends PageBase{
	
	Utils utils = new Utils();
	
	WebElement expandedAccounts = driver.findElement(By.xpath("//ul[@id='social-sidebar-menu']/li[5]/a"));
	WebElement guestCustomers 	= driver.findElement(By.xpath("//ul[@id='ACCOUNTS']/li/a[contains(text(), 'GuestCustomers')]"));
	
	public void accountClick() throws InterruptedException {
		utils.click(expandedAccounts, 10);
	}
	
	public void acessaGuestCustomers() throws InterruptedException {
		utils.click(guestCustomers, 10);
	}
}

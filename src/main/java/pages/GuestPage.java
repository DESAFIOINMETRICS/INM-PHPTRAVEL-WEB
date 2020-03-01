package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import config.PageBase;

public class GuestPage extends PageBase{
	
	public WebElement buttonAdd = driver.findElement(By.xpath("//form[@class='add_button']/button"));
	
	public void clickButtonAdd() {
		buttonAdd.click();
	}

	public void validaEmail() {
		Assert.assertTrue("validacao do email cadastrado", driver.getPageSource().contains("oliveira_roberts@hotmail.com"));
	}

}

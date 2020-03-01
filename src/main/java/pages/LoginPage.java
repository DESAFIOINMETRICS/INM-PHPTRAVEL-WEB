package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import config.PageBase;

public class LoginPage extends PageBase {
		
	public WebElement textBox 	= driver.findElement(By.name("email"));
	public WebElement password 	= driver.findElement(By.name("password"));
	public WebElement button 	= driver.findElement(By.xpath("/html/body/div[2]/form[1]/button"));

	public void login() {
		textBox.sendKeys("admin@phptravels.com");
		password.sendKeys("demoadmin");
		button.click();
	}
}
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import config.PageBase;
import utils.Utils;

public class CadastroPage extends PageBase{
	
	Utils utils = new Utils();
	
	public WebElement firstName 	= driver.findElement(By.xpath("//input[@name='fname']"));
	public WebElement lastName 		= driver.findElement(By.xpath("//input[@name='lname']"));
	public WebElement email 		= driver.findElement(By.xpath("//input[@name='email']"));
	public WebElement password_2 	= driver.findElement(By.xpath("//input[@name='password']"));
	public WebElement mobile 		= driver.findElement(By.xpath("//input[@name='mobile']"));
	public WebElement country 		= driver.findElement(By.xpath("//label[text()='Country']/..//a"));
	public WebElement inputCountry;
	public WebElement selectCountry;
	public WebElement address1 		= driver.findElement(By.xpath("//input[@name='address1']"));
	public WebElement address2 		= driver.findElement(By.xpath("//input[@name='address2']"));
	public WebElement bottonSubmit 	= driver.findElement(By.xpath("/html/body/div[3]/div/form/div[1]/div/div[3]/button"));
	
	public void novoCadastro() throws InterruptedException {
		firstName.sendKeys("Robert");
		lastName.sendKeys("Silva");
		email.sendKeys("oliveira_roberts@hotmail.com");
		password_2.sendKeys("123456");
		mobile.sendKeys("11 99999 9999");
		utils.click(country, 10);
		String countryName = "Brazil";
		inputCountry 	= driver.findElement(By.xpath("//div[@id='select2-drop']//input"));
		inputCountry.sendKeys(countryName);
		selectCountry = driver.findElement(By.xpath("//div[@class='select2-result-label']/span[text()='"+countryName+"']"));
		utils.click(selectCountry, 10);
		address1.sendKeys("Av. Ana Felicia Mendes");
		address2.sendKeys("Final da rua");
		bottonSubmit.click();	
	}

}

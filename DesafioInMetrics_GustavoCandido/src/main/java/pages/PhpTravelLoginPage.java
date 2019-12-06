package pages; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 


public class PhpTravelLoginPage {
	
	private WebDriver driver;
	
	public void openChrome() { 
		  System.setProperty("webdriver.chrome.driver","C:\\GoogleChromeDriver\\chromedriver_v78.exe");
	      driver = new ChromeDriver(); 
	}
	
	public WebDriver getDriver() {
		return driver;
	}

	public void navigateToPhpTravels() { 
	      driver.navigate().to("http://phptravels.net/admin/"); 
	}
	
	public void closePhpTravel() { 
	      driver.close(); 
	}
	 
	private WebElement Email() {
		return driver.findElement(By.name("email"));
	}
	
	private WebElement Senha() {
		return driver.findElement(By.name("password"));
	}
	
	private WebElement BotaoLogin() {
		return driver.findElement(By.cssSelector("form > button"));
	}
	
	public void insertEmail(String pEmail) {
		 
		WebElement campoEmail = Email();
		
		campoEmail.sendKeys(pEmail);
		 
	}
	
	public void insertPassword(String pPassword) {
		 
		WebElement campoSenha = Senha();
		
		campoSenha.sendKeys(pPassword);
		 
	}
	
	public void clickLoginButton() {
		 
		WebElement botaoLogin = BotaoLogin();
		
		botaoLogin.click();
		 
	}
	
}
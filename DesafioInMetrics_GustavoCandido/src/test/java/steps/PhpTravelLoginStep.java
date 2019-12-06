package steps; 

import pages.PhpTravelLoginPage;

import cucumber.annotation.en.Given; 
import cucumber.annotation.en.Then; 
import cucumber.annotation.en.When;


import cucumber.annotation.en.And; 

public class PhpTravelLoginStep {
	
	private PhpTravelLoginPage page;
	
   @Given("^that the user opens the browser$") 
   public void openBrowser() throws Throwable { 
	  page = new PhpTravelLoginPage();
	  page.openChrome();
   } 
	
   @When("^the user navigate to PhpTravels website$") 
   public void navigateTo() throws Throwable { 
      page.navigateToPhpTravels();
   }
   
   @And("^Insert the administrator's E-mail$") 
   public void insertEmail() throws Throwable { 
      page.insertEmail("admin@phptravels.com");
   } 
   
   @And("^Insert the administrator's Password$") 
   public void insertPassword() throws Throwable { 
	   page.insertPassword("demoadmin");
   } 
   
   @And("^click at LOGIN button$") 
   public void clickLogin() throws Throwable { 
      page.clickLoginButton();
   } 
	
   @Then("^the user should access PhpTravels main page$") 
   public void pageAccess() throws Throwable {
	   page.closePhpTravel();
   } 
   
}
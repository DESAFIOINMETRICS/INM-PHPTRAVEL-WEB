package steps; 


import cucumber.annotation.en.Given; 
import cucumber.annotation.en.Then; 
import cucumber.annotation.en.When;
import pages.PhpTravelLoginPage;
import pages.PhpTravelNavigationPage;

import static org.junit.Assert.assertTrue;

import cucumber.annotation.en.And; 

public class PhpTravelNavigationStep {
	
	private PhpTravelNavigationPage page;
	private PhpTravelLoginPage logPage;
	
   @Given("^that the user is at the main page$") 
   public void openBrowser() throws Throwable { 
	   
	  logPage = new PhpTravelLoginPage();
	  logPage.openChrome();
	  logPage.navigateToPhpTravels();
	  logPage.insertEmail("admin@phptravels.com");
	  logPage.insertPassword("demoadmin");
	  logPage.clickLoginButton();
	  
	  page = new PhpTravelNavigationPage(logPage.getDriver());
	  
	  assertTrue(page.sideBarExists());
   } 
	
   @When("^the user click in ACCOUNTS tab at the sidebar$") 
   public void navigateTo() throws Throwable { 
      page.clickAccountsTab();
   }
   
   @And("^Click at GUESTCUSTOMERS sub-tab$") 
   public void insertEmail() throws Throwable { 
      page.clickGuestCustomersSubTab();
   } 
   
	
   @Then("^the user should be redirected to GUEST MANAGEMENT page$") 
   public void pageAccess() throws Throwable {
	   page.closePhpTravel();
   } 
   
}
package steps; 


import cucumber.annotation.en.Given; 
import cucumber.annotation.en.Then; 
import cucumber.annotation.en.When;
import cucumber.annotation.en.And; 
import pages.PhpTravelLoginPage;
import pages.PhpTravelNavigationPage;
import pages.PhpTravelAddPage;
import pages.PhpTravelGuestManagementPage;

import static org.junit.Assert.assertTrue;

public class PhpTravelAddStep {
	
	private PhpTravelNavigationPage page;
	private PhpTravelLoginPage logPage;
	private PhpTravelGuestManagementPage gmPage;
	private PhpTravelAddPage addPage;
	
	private String fName = "Bastion";
	private String lName = "Battleborn";
	private String email = "Bastion@testmail.com";
	
	
   @Given("^that the user is at the Add Guest page$") 
   public void openBrowser() throws Throwable { 
	   
	  logPage = new PhpTravelLoginPage();
	  logPage.openChrome();
	  logPage.navigateToPhpTravels();
	  logPage.insertEmail("admin@phptravels.com");
	  logPage.insertPassword("demoadmin");
	  logPage.clickLoginButton();
	  
	  page = new PhpTravelNavigationPage(logPage.getDriver());
	  
	  assertTrue(page.sideBarExists());
	  page.clickAccountsTab();
	  page.clickGuestCustomersSubTab();
	  
	  gmPage = new PhpTravelGuestManagementPage(logPage.getDriver());
	  
	  assertTrue("Page Guest Management has not loaded properly...",gmPage.addButtonExists());
	  
	  gmPage.clickAddButton();
	  
	  addPage = new PhpTravelAddPage(logPage.getDriver());
	  
	  assertTrue("Page Add Guest has not loaded properly...",addPage.isAddGuestPage());

   } 
	
   @When("^user type a name at first name field$") 
   public void firstName() throws Throwable { 
      addPage.typeFirstName(fName);
   }
   
   @And("^type a last name at last name field$") 
   public void lastName() throws Throwable { 
	   addPage.typeLastName(lName);
   }
   
   @And("^type an Email name at last name field$") 
   public void email() throws Throwable { 
	   addPage.typeEmail(email);
   }
   
   @And("^type a password name at last name field$") 
   public void password() throws Throwable { 
	   addPage.typePassword("battleborn");
   }
   
   @And("^type a Mobile Number name at last name field$") 
   public void mobileNumber() throws Throwable { 
	   addPage.typeMobileNumber("0800545696");
   }
   
   @And("^select a Country at last name field$") 
   public void selectCountry() throws Throwable { 
	   addPage.country("Australia");
   }
   
   @And("^type an Address name at Address 1 field$") 
   public void address1() throws Throwable { 
	   addPage.typeAddress1("St. Tinkerbell, Nº2210 - Sidney");
   }
   
   @And("^type another Address name at Address 2 field$") 
   public void address2() throws Throwable { 
	   addPage.typeAddress2("St. Minnie, Nº1210 - Sidney");
   }
   
   @And("^click at submit button$") 
   public void Register() throws Throwable { 
	   addPage.submit();
   }
	
   @Then("^the user should be redirected to previous page$") 
   public void guestManagementRedirect() throws Throwable {
	   assertTrue("Page Guest Management has not loaded properly...",gmPage.addButtonExists());
   }
   
   @And("^the registered guest should exist$") 
   public void verifyRegister() throws Throwable { 
	   assertTrue(gmPage.isGuestRegistered(fName, lName, email));
	   gmPage.closePhpTravel();
   }
   
}
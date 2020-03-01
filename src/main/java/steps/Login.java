package steps;

import cucumber.api.java.en.When;
import pages.LoginPage;

public class Login {
	
	public LoginPage loginPage = new LoginPage();
	
	@When("que eu esteja logado")
	public void dado_que_eu_esteja_logado() {
		loginPage.login();
	}

}

package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.GuestPage;

public class Guest {
	
	public GuestPage guestPage = new GuestPage();
	
	@And("clique no botão ADD")
	public void e_clique_no_botão_ADD() {
		guestPage.clickButtonAdd();
	}
	
	@Then("devo validar o email cadastrado")
	public void entao_devo_validar_o_email_cadastrado() {
		guestPage.validaEmail();
	}
}

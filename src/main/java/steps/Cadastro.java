package steps;

import cucumber.api.java.en.And;
import pages.CadastroPage;

public class Cadastro {
	
	public CadastroPage cadastroPage = new CadastroPage();
	
	@And("preencha o fomulário")
	public void e_preencha_o_formulario() throws InterruptedException {
		cadastroPage.novoCadastro();
	}
}

package Steps;

import Elementos.Elementos;
import Metodos.Metodos;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	// teste comentando 
	// teste comentando 
	// teste comentando 
	
	Metodos m = new Metodos();
	Elementos e = new Elementos();

	@Given("^que o usuario acesse a url \"([^\"]*)\"$")
	public void que_o_usuario_acesse_a_url(String url) throws Throwable {
		m.executarNavegador(url, "Abrindo Navegador");
	}

	@Given("^selecione o botao abrir nova conta$")
	public void selecione_o_botao_abrir_nova_conta() throws Throwable {
		m.click(e.getBtnPopUp() );
		m.pausa(5000, "pausa para carregar o botão abrir conta");
		m.click(e.getBtnAbrirConta());
	}

	@Given("^selecionar o botao abrir conta para voce$")
	public void selecionar_o_botao_abrir_conta_para_voce() throws Throwable {
		m.pausa(5000, "pausa para carregar o botão abrir conta");
		m.click(e.getBtnParaVoce());
	}

	@When("^o usuario preencher o formulario$")
	public void o_usuario_preencher_o_formulario() throws Throwable {
		m.pausa(3000, "pausa para carregar os dados");
		m.preencher(e.getCampoNome(), "Flash Code", "Preenchendo o campo Nome");
		m.preencher(e.getCampoTelefone(), "11111111111", "Preenchendo o campo Telefone");
		m.preencher(e.getCampoEmail(), "antonia-dias92@agreonoma.eng.br", "Preenchendo o campo Email");
		m.preencher(e.getCampoCPF(), "561.221.074-41", "Preenchendo o campo CPF");

	}

	@When("^selecionar o botao quero ser cliente$")
	public void selecionar_o_botao_quero_ser_cliente() throws Throwable {
		m.pausa(3000, "pausa para carregar o botão quero ser cliente");
		m.click(e.getBtnQueroSerCliente());
	}

	@Then("^Valido o texto Falta pouco$")
	public void valido_o_texto_Falta_pouco() throws Throwable {
		m.pausa(3000, "pausa para tirar print da tela");
		String print = "evidencia banco original";
		m.screnShoot("./evidencia/"+ print+ ".png" );
		m.pausa(3000, "pausa para tirar print da tela");
		m.fecharNavegador("fechando o navegador");
	}
	
	@When("^preencher o campo nome \"([^\"]*)\"$")
	public void preencher_o_campo_nome(String nome) throws Throwable {
		m.preencher(e.getCampoNome(), nome, "Preenchendo o campo Nome");
		
	  
	}
	@When("^preencher o campo telefone \"([^\"]*)\"$")
	public void preencher_o_campo_telefone(String telefone) throws Throwable {
		m.preencher(e.getCampoTelefone(), telefone, "Preenchendo o campo Telefone");
	   
	}

	@When("^preencher o campo email \"([^\"]*)\"$")
	public void preencher_o_campo_email(String email) throws Throwable {
		m.preencher(e.getCampoEmail(), email, "Preenchendo o campo Email");
	   
	}

	@When("^preencher o campo cpf \"([^\"]*)\"$")
	public void preencher_o_campo_cpf(String cpf) throws Throwable {
		m.preencher(e.getCampoCPF(), cpf, "Preenchendo o campo CPF");
	   
	}


}
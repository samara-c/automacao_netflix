import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class StepDefinition {
	
String url = "http://www.netflix.com/"; // declarando a URL que vou acessar
Page pagina = new Page();
Utils util = new Utils();
String nomeAValidar;
	
	
	public static WebDriver driver; // driver estatico (nao precisa instanciar a classe pra chamar ele)
	

	public static WebDriver driver() { // checando se o driver ja esta ativo
		if (driver == null)
			driver = new ChromeDriver();
		return driver;
	}
	
	
	@Given("que estou na pagina da Netflix")
	public void que_estou_na_pagina_da_Netflix() {
	    
	    try {
			
			System.setProperty("webdriver.chrome.driver", "/home/samara/eclipse-workspace/BuscaBBC/src/main/resources/chromedriver");
			System.out.println("Chrome driver iniciado com sucesso!");
			driver().get(url);
			driver.manage().window().maximize(); //maximiza a tela do teste (sera util pro printscreen)
			Thread.sleep(1000);
			util.criarPasta();
			
			
		} catch (Exception e) {
			System.out.println("Não foi possivel iniciar o ChromeDriver");
			e.printStackTrace();
		}
				
	    
	}
	
	@When("eu realizo o login {string} {string}")
	public void eu_realizo_o_login(String user, String senha) throws Throwable{
		 driver.findElement(pagina.getBotaoEntrar()).click();
	    driver.findElement(pagina.getCampoUsuario()).sendKeys(user);
	    driver.findElement(pagina.getCampoSenha()).sendKeys(senha);
	    driver.findElement(pagina.getCampoLembrarUsuario()).click();
	    Thread.sleep(1000);
	    driver.findElement(pagina.getBotaoFazerLogin()).click();
	    util.capturaScreenshot("telaLogin");
	    driver.findElement(pagina.getLogoNetflix()).click();
	}
	



	@When("eu clico na foto de perfil e clico em gerenciar perfis")
	public void eu_clico_na_foto_de_perfil_e_clico_em_gerenciar_perfis() throws Throwable {
	   driver.findElement(pagina.getBotaoFotoUsuario()).click();
	   driver.findElement(pagina.getLinkGerenciarPerfis()).click();
	   Thread.sleep(1000);
	}

	@When("clico na opção adicionar perfil")
	public void clico_na_opção_adicionar_perfil() {
	    driver.findElement(pagina.getBotaoAdicionarPerfil()).click();
	}

	@When("preencho o nome e clico no botão continuar {string} {string}")
	public void preencho_o_nome_e_clico_no_botão_continuar(String nome, String crianca) throws Throwable {
		
		if (crianca.equals("sim")) {
			driver.findElement(pagina.getOpcaoCrianca()).click();
		}
		
		nomeAValidar = nome + util.horario();
	
		driver.findElement(pagina.getCampoNomeNovoUsuario()).sendKeys(nomeAValidar);
		Thread.sleep(1000);
		util.capturaScreenshot("telaNovoUsuario");
		driver.findElement(pagina.getBotaoContinuar()).click();
		Thread.sleep(1000);
	
	    
	}

	@Then("eu valido que um novo perfil foi criado")
	public void eu_valido_que_um_novo_perfil_foi_criado() throws Throwable {
		util.capturaScreenshot("telaUsuarios");
	    
	}

	@Then("eu fecho o driver")
	public void eu_fecho_o_driver() throws Throwable {
		driver.close();
	    
	}
	
	

}

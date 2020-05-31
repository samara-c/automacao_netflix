import org.openqa.selenium.By;
 


public class Page {
	
	private By logoNetflix = By.xpath("//*[@id='appMountPoint']/div/div/div[1]/div[1]/div[1]/div/div/a");
	private By botaoEntrar = By.linkText("Entrar");
	private By campoUsuario  = By.id("id_userLoginId");
	private By campoSenha = By.id("id_password");
	private By campoLembrarUsuario = By.xpath("//span[@class='login-remember-me-label-text']");
	private By botaoFazerLogin = By.xpath("//*[@id=\"appMountPoint\"]/div/div[3]/div/div/div[1]/form/button");
	private By botaoFotoUsuario = By.className("account-dropdown-button");
	private By linkGerenciarPerfis = By.linkText("Gerenciar perfis");
	private By botaoAdicionarPerfil = By.linkText("Adicionar perfil");
	private By campoNomeNovoUsuario = By.id("add-profile-name");
	private By opcaoCrianca = By.xpath("//span[@class='add-kids-marker']");
	private By botaoContinuar = By.xpath("//span[@class='profile-button preferred-action preferred-active']");
	
	
	
	
	
	
	
 
	public By getLogoNetflix() {
		return logoNetflix;
	}

	public void setLogoNetflix(By logoNetflix) {
		this.logoNetflix = logoNetflix;
	}

	public By getBotaoEntrar() {
		return botaoEntrar;
	}

	public void setBotaoEntrar(By botaoEntrar) {
		this.botaoEntrar = botaoEntrar;
	}

	public By getCampoUsuario() {
		return campoUsuario;
	}

	public void setCampoUsuario(By campoUsuario) {
		this.campoUsuario = campoUsuario;
	}

	public By getCampoSenha() {
		return campoSenha;
	}

	public void setCampoSenha(By campoSenha) {
		this.campoSenha = campoSenha;
	}

	public By getCampoLembrarUsuario() {
		return campoLembrarUsuario;
	}

	public void setCampoLembrarUsuario(By campoLembrarUsuario) {
		this.campoLembrarUsuario = campoLembrarUsuario;
	}

	public By getBotaoFazerLogin() {
		return botaoFazerLogin;
	}

	public void setBotaoFazerLogin(By botaoFazerLogin) {
		this.botaoFazerLogin = botaoFazerLogin;
	}

	public By getBotaoFotoUsuario() {
		return botaoFotoUsuario;
	}

	public void setBotaoFotoUsuario(By botaoFotoUsuario) {
		this.botaoFotoUsuario = botaoFotoUsuario;
	}

	public By getLinkGerenciarPerfis() {
		return linkGerenciarPerfis;
	}

	public void setLinkGerenciarPerfis(By linkGerenciarPerfis) {
		this.linkGerenciarPerfis = linkGerenciarPerfis;
	}

	public By getBotaoAdicionarPerfil() {
		return botaoAdicionarPerfil;
	}

	public void setBotaoAdicionarPerfil(By botaoAdicionarPerfil) {
		this.botaoAdicionarPerfil = botaoAdicionarPerfil;
	}

	public By getCampoNomeNovoUsuario() {
		return campoNomeNovoUsuario;
	}

	public void setCampoNomeNovoUsuario(By campoNomeNovoUsuario) {
		this.campoNomeNovoUsuario = campoNomeNovoUsuario;
	}

	public By getOpcaoCrianca() {
		return opcaoCrianca;
	}

	public void setOpcaoCrianca(By opcaoCrianca) {
		this.opcaoCrianca = opcaoCrianca;
	}

	public By getBotaoContinuar() {
		return botaoContinuar;
	}

	public void setBotaoContinuar(By botaoContinuar) {
		this.botaoContinuar = botaoContinuar;
	}
	
	
	
	
	
	
	

}

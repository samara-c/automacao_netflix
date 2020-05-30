import org.openqa.selenium.By;
 


public class Page {
	
	private By logoNetflix = By.linkText("Netflix");
	private By botaoEntrar = By.linkText("Entrar");
	private By campoUsuario  = By.id("id_userLoginId");
	private By campoSenha = By.id("id_password");
	private By campoLembrarUsuario = By.id("bxid_rememberMe_true");
	
	//*[@id="bxid_rememberMe_true"]
 
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
	
	
	
	
	
	
	

}

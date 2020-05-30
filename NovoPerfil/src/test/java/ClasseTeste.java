import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver; 
public class ClasseTeste {

	public static void main(String[] args) {
		
		Page pagina = new Page();
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "/home/samara/eclipse-workspace/BuscaBBC/src/main/resources/chromedriver");
		System.out.println("Chrome driver iniciado com sucesso!");
		driver.get("www.netflix.com");
		 
		 
		
	
		

	}

}

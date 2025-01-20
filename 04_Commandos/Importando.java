/*Observação - Os comando abaixo são para lembretes, não irão funcionar pois o projeto não está vinculado.*/

//Importação do projeto.
package br.com.rocketskills.petlov;

//Importação de bibliotecas necessárias.
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.Duration;

//Criando um teste.
class Slogan
{
	//Tag necessária para informar ao código que é um teste.
	@Test

	//Inserindo um título ao teste.
	@DisplayName("Validar exibição do slogan do site.")
	
	void addsTwoNumbers()
	{		
		//Instanciando por padrão o ChromeDriver em uma váriavel.
		WebDriver driver = new ChromeDriver();

		//Configuração do timeOut de 2 segundos.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		//Visitando uma página.
		driver.get("https://petlov.vercel.app");

		//Mapeando e buscando um elemento
		WebElement title = driver.findElement(By.cssSelector("h1"));

		// Há necessidade de sempre utilizar timeOut com "esquema de waitUntil"
		Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		wait.until(d -> title.isDisplayed());

		//Verificando texto do elemento mapeado anteriormente.
		assertEquals("Conectando corações, mudando vidas!", title.getText(), "Verificando o Slogan");

		//Solicitando fechamento do Selenium WebDriver
		driver.close();
	};
};




5. Criando o Primeiro Script de Teste

public class LoginTest {
    WebDriver driver = new ChromeDriver();

    public void setUp() {
        driver.manage().window().maximize();
        driver.get("https://exemplo.com");
    }

    public void loginTest() {
        driver.findElement(By.id("usuario")).sendKeys("meuUsuario");
        driver.findElement(By.id("senha")).sendKeys("minhaSenha");
        driver.findElement(By.id("loginButton")).click();
    }

    public void tearDown() {
        driver.quit();
    }
}
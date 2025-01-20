@BeforeEach
void start()
{
    //Instanciando por padrão o ChromeDriver em uma váriavel.
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    //Configuração do timeOut de 2 segundos.
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
};

@AfterEach
void finish()
{
    //Solicitando fechamento do Selenium WebDriver
    driver.close();
};
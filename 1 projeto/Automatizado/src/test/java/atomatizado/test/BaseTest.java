package atomatizado.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTest {

    // classe protegia, somente ele ela e os filhos podem ver
    // protected static WebDriver dr;

    // ser static é == estática na programação Java, significa que a variável
    // pertence à própria classe,

    protected static WebDriver driver;
    private static final String UrlBase = "file:///C:/Users/Rafael_Senziani/OneDrive/%C3%81rea%20de%20Trabalho/Programa%C3%A7%C3%A3o%20Cursos/QA/Teste%20Automatizado/sistema/login.html"; // final
                                                                                                                                                                                           // pois
                                                                                                                                                                                           // após
                                                                                                                                                                                           // iniciado
                                                                                                                                                                                           // não
                                                                                                                                                                                           // pode
                                                                                                                                                                                           // ser
                                                                                                                                                                                           // //
                                                                                                                                                                                           // alterado
    private static final String CaminhoDriver = "src/test/java/atomatizado/resource/chromedriver.exe";

    // inicia o drive

    @BeforeClass
    public static void init() {
        System.setProperty("webdriver.chrome.driver", CaminhoDriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize(); // maximizar
        driver.get(UrlBase);// pega a url

    }

    // finaliza o drive

    @AfterClass
    public static void close() {
        driver.quit();
    }

}

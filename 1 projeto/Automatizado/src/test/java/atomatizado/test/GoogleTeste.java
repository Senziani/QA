package atomatizado.test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import atomatizado.page.GooglePO;

public class GoogleTeste extends BaseTest {

    private static GooglePO googlePage;

    @BeforeClass
    public static void prepararTestes() {
        driver.get("https://www.google.com"); // passando a url manualmente
        googlePage = new GooglePO(driver); // estanciado o objeto e pode acessalo
    }
    
    @Test
    public void FindOnGoogle() {
        googlePage.search("Batata-Assada");

        String result = googlePage.result();
        assertTrue(result, result.contains("Aproximadamente"));

        // googlePage.InputPesquisa.sendKeys("Batata-Assada" + Keys.ENTER); isolado em
        // POO
        // todo teste deve ter == preparação , ação e confirmação
        // WebElement InputPesquisa = driver.findElement(By.name("q")); trocado pelo POO
        // mandando um key para o input selecionado acima, vai colcar "batata-assada e
        // vai mandar um enter"

        // String result = driver.findElement(By.id("result-stats")).getText();
        // modificado pelo POO

        // testa se é verdade se dentr de resultado tem a palavra aproximadamente

    }

}

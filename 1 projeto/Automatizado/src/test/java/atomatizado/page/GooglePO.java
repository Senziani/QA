package atomatizado.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePO extends BasePo {

    @FindBy(name = "q")
    public WebElement InputPesquisa;

    @FindBy(id = "result-stats")
    public WebElement divResultadoPesquisa;

    /**
     * Contrutor para criação da pagina do google
     * 
     * @param driver da pagina do Google
     */
    public GooglePO(WebDriver driver) {
        super(driver);

    }

    /**
     * Metodo que ira efetuar uma pesquisa no Google baseando no texto informado e
     * concluindo com ENTER
     * 
     * @param texto Texto a ser pesquisado
     */

    public void search(String texto) {
        InputPesquisa.sendKeys(texto + Keys.ENTER);
    }

/**
 * Metodo que retorna o resultado aproximado da pesuisa
 * @return Retorna o resultado da pesquisa.
 */

    public String result() {
        
        return divResultadoPesquisa.getText();


    }

}
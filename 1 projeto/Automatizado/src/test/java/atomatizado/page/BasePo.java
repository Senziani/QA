package atomatizado.page;

/**
 * Base para a criação das novas pages Object.
 * Todas as Pages devem ser herdadas desta classe
 * 
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePo {

    /** Driver base que sera usado pelas pages */
    protected WebDriver driver;

    /**
     * Contrututor base para criação da fabrica de elementos(PageFactory)
     * @param driver Driver da página atual
     */
    public BasePo(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

}

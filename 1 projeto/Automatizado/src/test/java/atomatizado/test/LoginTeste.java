package atomatizado.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import atomatizado.page.LoginPO;

public class LoginTeste extends BaseTest {

    private static LoginPO loginPages;

    private void executarAcaoLogar(String email, String senha) {
        loginPages.escrever(loginPages.inputEmail, email);
        loginPages.escrever(loginPages.inputSenha, senha);

        loginPages.btnEntrar.click();
    }

    @BeforeClass
    public static void prepararLogin() {
        loginPages = new LoginPO(driver);
    }

    @Test
    public void TC001_naoDeveLogarNoSistemaComUserEPassEmBranco() {

        // COm POO
        loginPages.escrever(loginPages.inputEmail, "");
        loginPages.escrever(loginPages.inputSenha, "");

        loginPages.btnEntrar.click();
        String message = loginPages.obterMessage();

        // verifca se os objetos são iguais
        assertEquals(message, "Informe usuário e senha, os campos não podem ser brancos.");
    }

    @Test
    public void TC002_naoDeveLogarNoSistemaComUserErradoEPassVazio() {

        // Sem POO
        loginPages.inputEmail.sendKeys("teste");
        loginPages.inputSenha.sendKeys("");
        loginPages.btnEntrar.click();
        String message = loginPages.obterMessage();

        // verifca se os objetos são iguais
        assertEquals(message, "Informe usuário e senha, os campos não podem ser brancos.");
    }

    @Test
    public void TC003_naoDeveLogarNoSistemaComUserVazioEPassErrado() {

        // Encapsulado
        executarAcaoLogar("", "teste");
        String message = loginPages.obterMessage();

        // verifca se os objetos são iguais
        assertEquals(message, "Informe usuário e senha, os campos não podem ser brancos.");
    }

}

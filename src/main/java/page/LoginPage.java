package page;

import config.BasePage;
import org.openqa.selenium.By;

public class LoginPage {

    private final BasePage basePage = new BasePage();

    private final By adresseMailField = By.xpath("//div[@id='login_assur']//input[@name='identifiant']");
    private final By motDePasseField = By.xpath("//div[@id='login_assur']//input[@name='mdp']");
    private final By connexionBtn = By.xpath("//div[@id='login_assur']//input[@type='submit']");
    private final By accepterBtn = By.xpath("//button[@id='cc-confirm-button']");

    private void clickAccepterButton() {
        basePage.click(accepterBtn);
    }

    private void fillAdresseMail(String email) {
        basePage.fillField(adresseMailField, email);
    }

    private void fillMotDePasse(String password) {
        basePage.fillField(motDePasseField, password);
    }

    private void clickConnexionButton() {
        basePage.click(connexionBtn);
    }

    public void doSuccessfulLogin(String emailAddress, String password) {
        clickAccepterButton();
        fillAdresseMail(emailAddress);
        fillMotDePasse(password);
        clickConnexionButton();
    }
}

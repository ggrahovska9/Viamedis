package page;

import config.BasePage;
import org.openqa.selenium.By;

public class LoginPage {

    private final BasePage basePage = new BasePage();

    private final By assurAdresseMailField = By.xpath("//div[@id='login_assur']//input[@name='identifiant']");
    private final By assurMotDePasseField = By.xpath("//div[@id='login_assur']//input[@name='mdp']");
    private final By assurConnexionBtn = By.xpath("//div[@id='login_assur']//input[@type='submit']");
    private final By proAdresseMailField = By.xpath("//div[@id='login_pro']//input[@name='identifiantPs']");
    private final By proMotDePasseField = By.xpath("//div[@id='login_pro']//input[@name='mdpPs']");
    private final By proConnectionBtn = By.xpath("//div[@id='login_pro']//input[@value='Connexion']");
    private final By accepterBtn = By.xpath("//button[@id='cc-confirm-button']");

    private void clickAccepterButton() {
        basePage.click(accepterBtn);
    }

    private void fillAssurAdresseMail(String email) {
        basePage.fillField(assurAdresseMailField, email);
    }

    private void fillAssurMotDePasse(String password) {
        basePage.fillField(assurMotDePasseField, password);
    }

    private void clickAssurConnexionButton() {
        basePage.click(assurConnexionBtn);
    }

    private void fillProAdresseMail(String email) {
        basePage.fillField(proAdresseMailField, email);
    }

    private void fillProMotDePasse(String password) {
        basePage.fillField(proMotDePasseField, password);
    }

    private void clickProConnexionButton() {
        basePage.click(proConnectionBtn);
    }

    public void loginAsSupervisor(String emailAddress, String password) {
        clickAccepterButton();
        fillAssurAdresseMail(emailAddress);
        fillAssurMotDePasse(password);
        clickAssurConnexionButton();
    }

    public void loginAsPS(String emailAddress, String password) {
        clickAccepterButton();
        fillProAdresseMail(emailAddress);
        fillProMotDePasse(password);
        clickProConnexionButton();
    }
}

package page.annuairepspage.rechercherparrib;

import config.BasePage;
import org.openqa.selenium.By;

public class RechercheParRIBPage {

    private final BasePage basePage = new BasePage();

    private final By ibanNumCompteField = By.xpath("//form[@name='formRecherche']//input[@name='ibanNumCompte']");
    private final By rechercherBtn = By.xpath("//input[@name='Submit']");

    public void fillNumeroDeCompteIbanField(String iban) {
        basePage.fillField(ibanNumCompteField, iban);
    }

    public void clickRechercherButton() {
        basePage.click(rechercherBtn);
    }
}

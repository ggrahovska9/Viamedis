package page.annuairepspage.rechercherparribpage;

import config.BasePage;
import org.openqa.selenium.By;

public class RechercheParRIBPage {

    private final BasePage basePage = new BasePage();

    private final By rechercheParRIBPageTitle = By.xpath("//div[text()=' / Recherche par RIB et IBAN']");
    private final By ibanNumCompteField = By.xpath("//form[@name='formRecherche']//input[@name='ibanNumCompte']");
    private final By rechercherBtn = By.xpath("//input[@name='Submit']");

    private By resultatRechercheRIBValue(String value) {
        return By.xpath("//table[@id='currentTc']//td[text()='" + value + "']");
    }

    public void fillNumeroDeCompteIbanField(String iban) {
        basePage.fillField(ibanNumCompteField, iban);
    }

    public void clickRechercherButton() {
        basePage.click(rechercherBtn);
    }

    public void verifyRechercheParRIBPage() {
        basePage.verifyElementIsDisplayed(rechercheParRIBPageTitle);
    }

    public void verifyResultatRechercheRIBValue(String value) {
        basePage.verifyElementIsDisplayed(resultatRechercheRIBValue(value));
    }
}

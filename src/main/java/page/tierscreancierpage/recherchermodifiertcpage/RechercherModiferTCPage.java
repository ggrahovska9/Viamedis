package page.tierscreancierpage.recherchermodifiertcpage;

import config.BasePage;
import org.openqa.selenium.By;

public class RechercherModiferTCPage {

    private final BasePage basePage = new BasePage();

    private final By numeroTCField = By.xpath("//form[@name='formRecherche']//input[@name='numeroTC']");
    private final By rechercherBtn = By.xpath("//input[@name='Submit']");

    private By resultatTiersCreancierValue(String value) {
        return By.xpath("//table[@id='resultatsDisplayTag']//td[contains(text(),'" + value + "')]");
    }

    public void fillNumeroTCFiled(String numeroTC) {
        basePage.fillField(numeroTCField, numeroTC);
    }

    public void clickRechercherButton() {
        basePage.click(rechercherBtn);
    }

    public void verifyResultatRechercheRIBValue(String value) {
        basePage.verifyElementIsDisplayed(resultatTiersCreancierValue(value));
    }
}

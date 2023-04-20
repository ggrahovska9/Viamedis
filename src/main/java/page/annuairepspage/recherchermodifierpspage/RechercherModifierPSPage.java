package page.annuairepspage.recherchermodifierpspage;

import config.BasePage;
import org.openqa.selenium.By;

public class RechercherModifierPSPage {

    private final BasePage basePage = new BasePage();

    private final By rechercherModifierPSPageTitle = By.xpath("//div[text()=' / Recherche-Modification PS']");
    private final By numberoPSField = By.xpath("//table[@id='tableRechercheForm']//input[@name='numPS']");
    private final By rechercherBtn = By.xpath("//input[@name='Submit']");
    private final By modifierBtn = By.xpath("//img[@alt='modifier']");

    private By resultatRecherchePSValue(String value) {
        return By.xpath("//table[@id='resultatRecherchePs']//td[contains(text(),'" + value + "')]");
    }

    public void clickModifierButton() {
        basePage.click(modifierBtn);
    }

    public void fillNumeroPSField(String psNumber) {
        basePage.fillField(numberoPSField, psNumber);
    }

    public void clickRechercherButton() {
        basePage.click(rechercherBtn);
    }

    public void verifyRechercherModifierPSPage() {
        basePage.verifyElementIsDisplayed(rechercherModifierPSPageTitle);
    }

    public void verifyResultatRecherchePSValue(String value) {
        basePage.verifyElementIsDisplayed(resultatRecherchePSValue(value));
    }
}

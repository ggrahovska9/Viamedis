package page.gestionavecpecpage;

import config.BasePage;
import org.openqa.selenium.By;

public class ListeDpecPage {

    private final BasePage basePage = new BasePage();

    private final By numeroField = By.xpath("//span[text()='Informations PS']/ancestor::tbody//input[@name='numPs']");
    private final By numeroDossierField = By.xpath("//input[@name='numDossier']");
    private final By rechercherBtn = By.xpath("//input[@value='Rechercher']");
    private final By oneSearchResultMsg = By.xpath("//div[@class='info' and contains(.,'1') and contains(.,'Résultat(s) à la recherche')]");

    private By numeroPsFieldValue(String number) {
        return By.xpath("//a[text()='Numéro PS']/ancestor::table//td[contains(text(),'" + number + "')]");
    }

    private By numeroFieldValue(String number) {
        return By.xpath("//a[text()='Numéro']/ancestor::table//a[text()='" + number + "']");
    }

    public void fillNumeroField(String number) {
        basePage.fillField(numeroField, number);
    }

    public void fillNumeroDossierField(String number) {
        basePage.fillField(numeroDossierField, number);
    }

    public void clickRechercherButton() {
        basePage.click(rechercherBtn);
    }

    public void clickNumeroLink(String number) {
        basePage.click(numeroFieldValue(number));
    }

    public void verifyOneSearchResultMessage() {
        basePage.verifyElementIsDisplayed(oneSearchResultMsg);
    }

    public void verifyValueInNumeroPsField(String value) {
        basePage.verifyElementIsDisplayed(numeroPsFieldValue(value));
    }

    public void verifyValueInNumeroField(String value) {
        basePage.verifyElementIsDisplayed(numeroFieldValue(value));
    }
}

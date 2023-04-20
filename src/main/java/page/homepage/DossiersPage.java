package page.homepage;

import config.BasePage;
import org.openqa.selenium.By;

public class DossiersPage {

    private final BasePage basePage = new BasePage();

    private final By typeDossierDropDown = By.xpath("//select[@name='typeDossier']");
    private final By numeroDossierField = By.xpath("//input[@name='numDossier']");
    private final By rechercherBtn = By.xpath("//input[@type='submit']");
    private final By transformerBtn = By.xpath("//a[contains(text(),'Transformer')]");
    private final By confirmerBtn = By.xpath("//input[@value='Confirmer']");

    private By confirmationMessage(String number) {
        return By.xpath("//td[contains(.,'Le devis n° " + number + " a bien été transformé en prise en charge.')]");
    }

    private By confirmTransformerDevisMesage(String number) {
        return By.xpath("//td[contains(.,'- ATTENTION ! Vous avez choisi de transformer le devis n° " +
                number + " en demande de prise en charge tiers-payant.')]");
    }

    private By numeroFieldValue(String value) {
        return By.xpath("//span[text()='Numéro']/ancestor::tbody//b[contains(text(),'" + value + "')]");
    }

    private By numeroDossierFieldValue(String value) {
        return By.xpath("//div[text()='Numéro' and text()='Dossier']/ancestor::table//a[text()='" + value + "']");
    }

    private By typeDossierFieldValue(String type) {
        return By.xpath("//div[text()='Type de dossier']/ancestor::table//td[contains(text(),'" + type + "')]");
    }

    public void selectTypeDossier(String type) {
        basePage.selectFromDropDownByText(typeDossierDropDown, type);
    }

    public void fillNumeroDossierField(String number) {
        basePage.fillField(numeroDossierField, number);
    }

    public void clickRechercherButton() {
        basePage.click(rechercherBtn);
    }

    public void clickTransformerButton() {
        basePage.click(transformerBtn);
    }

    public void clickConfirmerButton() {
        basePage.click(confirmerBtn);
    }

    public void verifyNumeroDossierInConfirmationMessageForDevisTranformation(String number) {
        basePage.verifyElementIsDisplayed(confirmTransformerDevisMesage(number));
    }

    public void verifyNumeroDossierInConfirmationMessage(String number) {
        basePage.verifyElementIsDisplayed(confirmationMessage(number));
    }

    public void verifyValueInNumeroField(String value) {
        basePage.verifyElementIsDisplayed(numeroFieldValue(value));
    }

    public void verifyValueInNumeroDossierField(String value) {
        basePage.verifyElementIsDisplayed(numeroDossierFieldValue(value));
    }

    public void verifyValueInTypeDossierField(String type) {
        basePage.verifyElementIsDisplayed(typeDossierFieldValue(type));
    }
}

package page.gestionavecpecpage.nouvelledpecpage;

import config.BasePage;
import org.openqa.selenium.By;
import utils.Utils;

public class FacturePage {

    private final BasePage basePage = new BasePage();

    private final By facturePageTitle = By.xpath("//div[text()='Facturation du RC à VIAMEDIS ']/i[text()='(Tiers Payant sur RO + RC Obligatoire)']");
    private final By dayFacturationField = By.xpath("//input[@name='dateFacturationJj']");
    private final By monthFacturationField = By.xpath("//input[@name='dateFacturationMm']");
    private final By yearFacturationField = By.xpath("//input[@name='dateFacturationAa']");
    private final By dayDelivranceField = By.xpath("//input[@name='dateDelivranceJj']");
    private final By monthDelivranceField = By.xpath("//input[@name='dateDelivranceMm']");
    private final By yearDelivranceField = By.xpath("//input[@name='dateDelivranceAa']");
    private final By dayReceptionFacField = By.xpath("//input[@name='dateReceptionFacJj']");
    private final By monthReceptionFacField = By.xpath("//input[@name='dateReceptionFacMm']");
    private final By yearReceptionFacField = By.xpath("//input[@name='dateReceptionFacAa']");
    private final By numeroFactureField = By.xpath("//input[@name='numFacture']");
    private final By depenseReelleField = By.xpath("//input[@name='mntFacture']");
    private final By facturerBtn = By.xpath("//input[@type='submit' and @value='Facturer']");
    private final By ouiBtn = By.xpath("//input[@id='yesBtn']");
    private final By factureEnregistreeMsg = By.xpath("//p[text()='Votre facture a bien été enregistrée.']");

    private By facturerConfirmationMsg(String value) {
        return By.xpath("//div[@class='message_2' and contains(.,'Êtes vous certain de vouloir facturer :') and contains(.,'" +
                value + "€')]");
    }

    public void typeTodayDateInDateFacturationField() {
        basePage.fillField(dayFacturationField, Utils.currentDay);
        basePage.fillField(monthFacturationField, Utils.currentMonth);
        basePage.fillField(yearFacturationField, Utils.currentYear);
    }

    public void typeTodayDateInDateDelivranceField() {
        basePage.fillField(dayDelivranceField, Utils.currentDay);
        basePage.fillField(monthDelivranceField, Utils.currentMonth);
        basePage.fillField(yearDelivranceField, Utils.currentYear);
    }

    public void typeTodayDateInDateReceptionFacField() {
        basePage.fillField(dayReceptionFacField, Utils.currentDay);
        basePage.fillField(monthReceptionFacField, Utils.currentMonth);
        basePage.fillField(yearReceptionFacField, Utils.currentYear);
    }

    public void fillNumeroDeFactureField(String number) {
        basePage.fillField(numeroFactureField, number);
    }

    public void fillDepenseReelleField(String value) {
        basePage.fillField(depenseReelleField, value);
    }

    public void clickFacturerButton() {
        basePage.click(facturerBtn);
    }

    public void clickOuiButton() {
        basePage.click(ouiBtn);
    }

    public void verifyConfirmationMessageForFacturer(String value) {
        basePage.verifyElementIsDisplayed(facturerConfirmationMsg(value));
    }

    public void verifyFactureEnregistreeMessage() {
        basePage.verifyElementIsDisplayed(factureEnregistreeMsg);
    }

    public void verifyFacturePage() {
        basePage.verifyElementIsDisplayed(facturePageTitle);
    }
}

package page.devispage.ajouterundevispage;

import config.BasePage;
import org.openqa.selenium.By;
import utils.Utils;

public class ValorisationDevisPage {

    private final BasePage basePage = new BasePage();

    private final By visualiserDevisResauLink = By.xpath("//a[contains(text(),'Cliquer ici pour visualiser le Devis réseau.')]");
    private final By numeroDossierField = By.xpath("//div[@class='numdossier']/span[@class='bleu']");
    private final By regimeComplementaireOdField = By.xpath("//input[@name='visions[0].odRc']");
    private final By enregistrerBtn = By.xpath("//input[@value='Enregistrer']");

    private By statusFieldValue(String statut) {
        return By.xpath("//td[text()=' Statut :']/ancestor::tbody//font[contains(text(),'" + statut + "')]");
    }

    private By dateDevisFieldValue(String date) {
        return By.xpath("//td[contains(text(),'Date du DEVIS :')]/ancestor::tbody//font[contains(text(),'" +
                date + "')]");
    }

    public void clickVisualiserDevisResauLink() {
        basePage.click(visualiserDevisResauLink);
    }

    public void fillRegimeComplementaireOdField(String value) {
        basePage.fillField(regimeComplementaireOdField, value);
    }

    public void clickEnregistrerButton() {
        basePage.click(enregistrerBtn);
    }

    public String getNumeroDossier() {
        return basePage.getTextFromElement(numeroDossierField);
    }

    public void verifyValueInStatutField(String statut) {
        basePage.verifyElementIsDisplayed(statusFieldValue(statut));
    }

    public void verifyTodaysDateInDateDevisField() {
        basePage.verifyElementIsDisplayed(dateDevisFieldValue(Utils.formatTodayToUS()));
    }
}

package page.devispage.ajouterundevispage;

import config.BasePage;
import enums.TypeEquipements;
import org.openqa.selenium.By;
import utils.Utils;

public class DossierPage {

    private final BasePage basePage = new BasePage();

    private final By dayPrescriptionField = By.xpath("//input[@name='jourPrescription']");
    private final By monthPrescriptionField = By.xpath("//input[@name='moisPrescription']");
    private final By yearPrescriptionField = By.xpath("//input[@name='anneePrescription']");
    private final By dayReceptionDossierField = By.xpath("//input[@name='jourReceptionDossier']");
    private final By monthReceptionDossierField = By.xpath("//input[@name='moisReceptionDossier']");
    private final By yearReceptionDossierField = By.xpath("//input[@name='anneeReceptionDossier']");
    private final By suivantBtn = By.xpath("//input[@value='Suivant']");

    private By typeEquipementRadioBtn(TypeEquipements type) {
        return By.xpath("//input[@name='typeEquipement' and @value='" + type.getType() + "']");
    }

    private By identifiantFieldValue(String psNumber) {
        return By.xpath("//td[text()='Identifiant']/parent::tr//td[contains(text(),'" + psNumber + "')]");
    }

    public void typeTodayDateInDatePrescriptionField() {
        basePage.acceptAlert();

        basePage.fillField(dayPrescriptionField, Utils.currentDay);
        basePage.fillField(monthPrescriptionField, Utils.currentMonth);
        basePage.fillField(yearPrescriptionField, Utils.currentYear);
    }

    public void typeTodayDateInDateReceptionDevisField() {
        basePage.acceptAlert();

        basePage.fillField(dayReceptionDossierField, Utils.currentDay);
        basePage.fillField(monthReceptionDossierField, Utils.currentMonth);
        basePage.fillField(yearReceptionDossierField, Utils.currentYear);
    }

    public void selectLunettesTypeEquipement() {
        basePage.click(typeEquipementRadioBtn(TypeEquipements.LUNETTES));
    }

    public void clickSuivantButton() {
        basePage.click(suivantBtn);
    }

    public void verifyValueInIdentifiantField(String psNumber) {
        basePage.verifyElementIsDisplayed(identifiantFieldValue(psNumber));
    }
}

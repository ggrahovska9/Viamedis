package page.annuairepspage.recherchermodifierpspage;

import config.BasePage;
import org.openqa.selenium.By;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ModificationPSPage {

    private final BasePage basePage = new BasePage();

    private final By adresse1Field = By.xpath("//input[@name='adr1Ps']");
    private final By telephoneField = By.xpath("//input[@name='telPs']");
    private final By villeDropDown = By.xpath("//select[@name='villePs']");
    private final By modifierLeProfilBtn = By.xpath("//input[@type='submit']");
    private final By confirmerBtn = By.xpath("//input[@value='Confirmer']");

    private final By dayField = By.xpath("//input[@name='dateReceptionJj']");
    private final By monthField = By.xpath("//input[@name='dateReceptionMm']");
    private final By yearField = By.xpath("//input[@name='dateReceptionAa']");

    private By successfulUpdateMessage(String numeroPS) {
        return By.xpath("//b[text()='Attention : le PS numéro " + numeroPS
                + " et les informations associées ont été mises à jour dans le système et sont disponibles.']");
    }

    public void fillAdresse1Field(String address) {
        basePage.fillField(adresse1Field, address);
    }

    public void fillTelephoneField(String telephone) {
        basePage.fillField(telephoneField, telephone);
    }

    public void selectVilleOption(String option) {
        basePage.selectFromDropDown(villeDropDown, option);
    }

    public void clickModifierLeProfilButton() {
        basePage.click(modifierLeProfilBtn);
    }

    public void clickConfirmerButton() {
        basePage.click(confirmerBtn);
    }

    public void typeTodayDate() {
        basePage.acceptAlert();

        basePage.fillField(dayField, LocalDate.now().format(DateTimeFormatter.ofPattern("dd")));
        basePage.fillField(monthField, LocalDate.now().format(DateTimeFormatter.ofPattern("MM")));
        basePage.fillField(yearField, String.valueOf(LocalDate.now().getYear()));
    }

    public void verifySuccessfulUpdateMessage(String numeroPS) {
        basePage.verifyElementIsDisplayed(successfulUpdateMessage(numeroPS));
    }
}

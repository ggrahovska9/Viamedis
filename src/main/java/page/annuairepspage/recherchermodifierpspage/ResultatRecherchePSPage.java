package page.annuairepspage.recherchermodifierpspage;

import config.BasePage;
import org.openqa.selenium.By;

public class ResultatRecherchePSPage {

    private final BasePage basePage = new BasePage();

    private final By modifierBtn = By.xpath("//img[@alt='modifier']");

    private By resultatRecherchePSValue(String value) {
        return By.xpath("//table[@id='resultatRecherchePs']//td[contains(text(),'" + value + "')]");
    }

    public void clickModifierButton() {
        basePage.click(modifierBtn);
    }

    public void verifyResultatRecherchePSValue(String value) {
        basePage.verifyElementIsDisplayed(resultatRecherchePSValue(value));
    }
}

package page;

import config.BasePage;
import org.openqa.selenium.By;

public class ResultatTiersCreanciersPage {

    private final BasePage basePage = new BasePage();

    private By resultatTiersCreancierValue(String value) {
        return By.xpath("//table[@id='resultatsDisplayTag']//td[contains(text(),'" + value + "')]");
    }

    public void verifyResultatRechercheRIBValue(String value) {
        basePage.verifyElementIsDisplayed(resultatTiersCreancierValue(value));
    }
}

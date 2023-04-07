package page;

import config.BasePage;
import org.openqa.selenium.By;

public class ResultatRechercheRIBPage {

    private final BasePage basePage = new BasePage();

    private By resultatRechercheRIBValue(String value) {
        return By.xpath("//table[@id='currentTc']//td[text()='" + value + "']");
    }

    public void verifyResultatRechercheRIBValue(String value) {
        basePage.verifyElementIsDisplayed(resultatRechercheRIBValue(value));
    }
}

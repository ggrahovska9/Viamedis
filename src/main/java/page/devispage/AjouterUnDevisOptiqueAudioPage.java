package page.devispage;

import config.BasePage;
import org.openqa.selenium.By;

public class AjouterUnDevisOptiqueAudioPage {

    private final BasePage basePage = new BasePage();

    private final By numeroPSField = By.xpath("//form[@id='psFormBean']//input[@name='numPs']");
    private final By suivantBtn = By.xpath("//input[@value='Suivant']");
    private final By abandonnerBtn = By.xpath("//input[@value='Abandonner']");
    private final By annulerBtn = By.xpath("//input[@value='Annuler']");

    public void fillNumeroPSField(String numeroPS) {
        basePage.fillField(numeroPSField, numeroPS);
    }

    public void clickSuivantButton() {
        basePage.click(suivantBtn);
    }

    public void clickAnnulerButton() {
        basePage.click(annulerBtn);
    }

    public void clickAbandonnerButton() {
        basePage.click(abandonnerBtn);
    }
}

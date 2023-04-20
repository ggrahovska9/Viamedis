package page.devispage;

import config.BasePage;
import org.openqa.selenium.By;

public class RechercherUnDevisPage {

    private final BasePage basePage = new BasePage();

    private final By dentaireBtn = By.xpath("//input[@id='dentaire']");
    private final By audioOptiqueBtn = By.xpath("//input[@id='optique']");

    public void clickDentaireButton() {
        basePage.click(dentaireBtn);
    }

    public void clickAudioOptiqueButton() {
        basePage.click(audioOptiqueBtn);
    }
}

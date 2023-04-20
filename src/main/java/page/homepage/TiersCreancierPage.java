package page.homepage;

import config.BasePage;
import org.openqa.selenium.By;

public class TiersCreancierPage {

    private final BasePage basePage = new BasePage();

    private By subMenuBtn(String sousMenuBtn) {
        return By.xpath("//div[@class='sous-menu']//span[contains(text(),'" + sousMenuBtn + "')]");
    }

    public void clickRechercherModifierTCButton() {
        basePage.click(subMenuBtn("Rechercher/Modifier TC"));
    }
}

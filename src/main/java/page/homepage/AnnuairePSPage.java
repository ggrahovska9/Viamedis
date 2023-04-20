package page.homepage;

import config.BasePage;
import org.openqa.selenium.By;

public class AnnuairePSPage {

    private final BasePage basePage = new BasePage();

    private final By annuairePSPageTitle = By.xpath("//img[@alt='Annuaire PS']");

    private By subMenuBtn(String sousMenuBtn) {
        return By.xpath("//div[@class='sous-menu']//span[contains(text(),'" + sousMenuBtn + "')]");
    }

    public void clickRechercherModifierPSButton() {
        basePage.click(subMenuBtn("Rechercher/Modifier PS"));
    }

    public void clickRechercheParRIBButton() {
        basePage.click(subMenuBtn("Recherche par RIB"));
    }

    public void verifyAnnuairePSPage() {
        basePage.verifyElementIsDisplayed(annuairePSPageTitle);
    }
}

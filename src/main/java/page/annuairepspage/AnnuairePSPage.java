package page;

import config.BasePage;
import enums.SousMenuBtns;
import org.openqa.selenium.By;

public class AnnuairePSPage {

    private final BasePage basePage = new BasePage();

    private By sousMenuBtn(SousMenuBtns sousMenuBtn) {
        return By.xpath("//div[@class='sous-menu']//span[contains(text(),'"
                + sousMenuBtn.getButtonName() + "')]");
    }

    public void clickRechercherModifierPSButton() {
        basePage.click(sousMenuBtn(SousMenuBtns.RECHERCHER_MODIFIER_PS));
    }

    public void clickRechercheParRIBButton() {
        basePage.click(sousMenuBtn(SousMenuBtns.RECHERCHE_PAR_RIB));
    }
}

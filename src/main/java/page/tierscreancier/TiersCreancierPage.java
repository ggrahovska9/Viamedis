package page;

import config.BasePage;
import enums.SousMenuBtns;
import org.openqa.selenium.By;

public class TiersCreancierPage {

    private final BasePage basePage = new BasePage();

    private By sousMenuBtn(SousMenuBtns sousMenuBtn) {
        return By.xpath("//div[@class='sous-menu']//span[contains(text(),'"
                + sousMenuBtn.getButtonName() + "')]");
    }

    public void clickRechercherModifierTCButton() {
        basePage.click(sousMenuBtn(SousMenuBtns.RECHERCHER_MODIFIER_TC));
    }
}

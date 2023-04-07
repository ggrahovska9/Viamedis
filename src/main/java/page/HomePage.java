package page;

import config.BasePage;
import org.openqa.selenium.By;

public class HomePage {

    private final BasePage basePage = new BasePage();

    private final By annuairePSBtn = By.xpath("//div[@id='menu1']//a[text()='ANNUAIRE PS']");
    private final By tiersCreancierBtn = By.xpath("//div[@id='menu1']//a[text()='TIERS' and text()='CREANCIER']");

    public void clickAnnuairePSButton() {
        basePage.click(annuairePSBtn);
    }

    public void clickTiersCreancierButton() {
        basePage.click(tiersCreancierBtn);
    }
}

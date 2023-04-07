package page.homepage;

import config.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private final By annuairePSBtn = By.xpath("//div[@id='menu1']//a[text()='ANNUAIRE PS']");
    private final By tiersCreancierBtn = By.xpath("//div[@id='menu1']//a[text()='TIERS' and text()='CREANCIER']");

    public void clickAnnuairePSButton() {
        super.click(annuairePSBtn);
    }

    public void clickTiersCreancierButton() {
        super.click(tiersCreancierBtn);
    }
}

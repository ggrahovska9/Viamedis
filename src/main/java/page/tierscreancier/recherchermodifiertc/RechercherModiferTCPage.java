package page;

import config.BasePage;
import org.openqa.selenium.By;

public class RechercherModiferTCPage {

    private final BasePage basePage = new BasePage();

    private final By numeroTCField = By.xpath("//form[@name='formRecherche']//input[@name='numeroTC']");
    private final By rechercherBtn = By.xpath("//input[@name='Submit']");

    public void fillNumeroTCFiled(String numeroTC) {
        basePage.fillField(numeroTCField, numeroTC);
    }

    public void clickRechercherButton() {
        basePage.click(rechercherBtn);
    }
}

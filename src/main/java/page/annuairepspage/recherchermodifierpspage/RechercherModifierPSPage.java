package page;

import config.BasePage;
import org.openqa.selenium.By;

public class RechercherModifierPSPage {

    private final BasePage basePage = new BasePage();

    private final By numberoPSField = By.xpath("//table[@id='tableRechercheForm']//input[@name='numPS']");
    private final By rechercherBtn = By.xpath("//input[@name='Submit']");

    public void fillNumeroPSField(String psNumber) {
        basePage.fillField(numberoPSField, psNumber);
    }

    public void clickRechercherButton() {
        basePage.click(rechercherBtn);
    }
}

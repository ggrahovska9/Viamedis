package page.devispage;

import config.BasePage;
import org.openqa.selenium.By;

public class RetourListeDossiersPage {

    private final BasePage basePage = new BasePage();

    private final By rechercherBtn = By.xpath("//input[@value='Rechercher']");
    private final By effacerBtn = By.xpath("//input[@value='Effacer']");

    public void clickRechercherButton() {
        basePage.click(rechercherBtn);
    }

    public void clickEffacerButton() {
        basePage.click(effacerBtn);
    }
}

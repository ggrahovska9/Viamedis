package page.devispage;

import config.BasePage;
import org.openqa.selenium.By;

public class AjouterUnDevisDentairePage {

    private final BasePage basePage = new BasePage();

    private final By rechercherBtn = By.xpath("//button[@id='rechercherPs']");
    private final By annulerBtn = By.xpath("//button[@id='annulerDevisPre']");
    private final By quitterBtn = By.xpath("//button[@id='quitter']");

    public void clickRechercherButton() {
        basePage.click(rechercherBtn);
    }

    public void clickAnnulerButton() {
        basePage.click(annulerBtn);
    }

    public void clickQuitterButton() {
        basePage.click(quitterBtn);
    }
}

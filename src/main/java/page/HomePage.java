package page;

import config.BasePage;
import org.openqa.selenium.By;

public class HomePage {

    private final BasePage basePage = new BasePage();

    private final By pageTitleForPS = By.xpath("//div[text()=\"Bienvenue sur l'espace Opticien\"]");
    private final By annuairePSBtn = By.xpath("//div[@id='menu1']//a[text()='ANNUAIRE PS']");
    private final By tiersCreancierBtn = By.xpath("//div[@id='menu1']//a[text()='TIERS' and text()='CREANCIER']");
    private final By devisBtn = By.xpath("//div[@id='menu1']//a[text()='DEVIS']");
    private final By dossiersBtn = By.xpath("//div[@id='menu1']//a[text()='DOSSIERS']");
    private final By supervisionBtn = By.xpath("//div[@id='menu1']//a[text()='SUPERVISION']");
    private final By gestionAvecPecBtn = By.xpath("//div[@id='menu1']//a[text()='GESTION' and text()='AVEC PEC']");

    public void clickAnnuairePSButton() {
        basePage.click(annuairePSBtn);
    }

    public void clickTiersCreancierButton() {
        basePage.click(tiersCreancierBtn);
    }

    public void clickDevisButton() {
        basePage.click(devisBtn);
    }

    public void clickDossiersButton() {
        basePage.click(dossiersBtn);
    }

    public void clickGestionAvecPecButton() {
        basePage.click(gestionAvecPecBtn);
    }

    public void verifyHomePage() {
        basePage.verifyElementIsDisplayed(pageTitleForPS);
    }

    public void verifySupervisionButton() {
        basePage.verifyElementIsDisplayed(supervisionBtn);
    }
}

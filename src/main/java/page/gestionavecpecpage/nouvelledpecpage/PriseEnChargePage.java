package page.gestionavecpecpage.nouvelledpecpage;

import config.BasePage;
import org.openqa.selenium.By;

public class PriseEnChargePage {

    private final BasePage basePage = new BasePage();

    private final By priseEnChargePageTitle = By.xpath("//div[contains(text(),'Conditions') and contains(.,'de la Prise en charge (PEC)')]");
    private final By regimeComplementaireODField = By.xpath("//input[@id='visions[0].pecARcOd']");
    private final By enregistrerBtn = By.xpath("//input[@value='Enregistrer']");
    private final By poursuivreFactureLink = By.xpath("//a[contains(text(),'Cliquer pour poursuivre à la Facture')]");
    private final By saisirNouvellePecLink = By.xpath("//a[contains(text(),'une nouvelle PEC')]");
    private final By visualiserLaPecLink = By.xpath("//a[contains(text(),'ici pour visualiser la PEC')]");

    public void fillRegimeComplementaireODField(String value) {
        basePage.fillField(regimeComplementaireODField, value);
    }

    public void clickEnregistrerButton() {
        basePage.click(enregistrerBtn);
    }

    public void clickPoursuivreFactureLink() {
        basePage.click(poursuivreFactureLink);
    }

    public void verifySaisirNouvellePecLink() {
        basePage.verifyElementIsDisplayed(saisirNouvellePecLink);
    }

    public void verifyVisualiserLaPecLink() {
        basePage.verifyElementIsDisplayed(visualiserLaPecLink);
    }

    public void verifyPriseEnChargePage() {
        basePage.verifyElementIsDisplayed(priseEnChargePageTitle);
    }
}

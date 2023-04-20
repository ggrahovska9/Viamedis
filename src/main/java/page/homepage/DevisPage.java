package page.homepage;

import config.BasePage;
import org.openqa.selenium.By;

public class DevisPage {

    private final BasePage basePage = new BasePage();

    private By subMenuBtn(String subMenuBtn) {
        return By.xpath("//div[@class='sous-menu']//span[contains(text(),'" + subMenuBtn + "')]");
    }

    public void clickAjouterUnDevisDentaireButton() {
        basePage.click(subMenuBtn("Ajouter un devis dentaire"));
    }

    public void clickAjouterUnDevisOptiqueAudioButton() {
        basePage.click(subMenuBtn("Ajouter un devis optique/audio"));
    }

    public void clickRechercherUnDevisButton() {
        basePage.click(subMenuBtn("Rechercher un devis "));
    }

    public void clickRetourListeDossiersButton() {
        basePage.click(subMenuBtn("Retour Liste Dossiers "));
    }

    public void clickListeDesDevisEnDebrayageButton() {
        basePage.click(subMenuBtn("Liste des devis en débrayage "));
    }
}

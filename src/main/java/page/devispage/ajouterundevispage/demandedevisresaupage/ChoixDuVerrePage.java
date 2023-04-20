package page.devispage.ajouterundevispage.demandedevisresaupage;

import config.BasePage;
import org.openqa.selenium.By;

public class ChoixDuVerrePage {

    private final BasePage basePage = new BasePage();

    private final By typeDuVerreDropDown = By.xpath("//select[@name='ltype']");
    private final By indiceDropDown = By.xpath("//select[@id='IdIndice']");
    private final By rechercherBtn = By.xpath("//input[@value='Rechercher']");
    private final By classAUnifSt150ARRadioBtn = By.xpath("//td[contains(text(),'ClassA Unif St 1.50 AR')]/parent::tr//input");
    private final By validerLaSectionBtn = By.xpath("//input[@value='Valider la selection']");

    public void selectTypeDuVerre(String option) {
        basePage.selectFromDropDownByText(typeDuVerreDropDown, option);
    }

    public void selectIndice(String option) {
        basePage.selectFromDropDownByText(indiceDropDown, option);
    }

    public void clickRechercherButton() {
        basePage.click(rechercherBtn);
    }

    public void clickClassAUnifSt150ARRadioButton() {
        basePage.click(classAUnifSt150ARRadioBtn);
    }

    public void clickValiderLaSectionButton() {
        basePage.click(validerLaSectionBtn);
    }
}

package page.devispage.ajouterundevispage;

import config.BasePage;
import org.openqa.selenium.By;

public class BeneficiairePage {

    private final BasePage basePage = new BasePage();

    private final By numeroSecuriteSocialField = By.xpath("//form[@id='beneficiaireFormBean']//input[@name='numSecu']");
    private final By retrouverBeneficiaireBtn = By.xpath("//form[@id='beneficiaireFormBean']//input[@value='Retrouver bénéficiaire']");
    private final By suivantBtn = By.xpath("//input[@value='Suivant']");

    private By selectionRadioBtn(String beneficiaire) {
        return By.xpath("//td[text()='" + beneficiaire + "']//parent::tr//input[@type='radio']");
    }

    public void fillNumeroSecuriteSocialField(String numeroSecuriteSocial) {
        basePage.fillField(numeroSecuriteSocialField, numeroSecuriteSocial);
    }

    public void clickRetrouverBeneficiaireButton() {
        basePage.click(retrouverBeneficiaireBtn);
    }

    public void clickSuivantButton() {
        basePage.click(suivantBtn);
    }

    public void selectBeneficiaire(String beneficiaire) {
        basePage.click(selectionRadioBtn(beneficiaire));
    }
}

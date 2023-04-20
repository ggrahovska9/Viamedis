package page.devispage.ajouterundevispage;

import config.BasePage;
import enums.VisionTypes;
import org.openqa.selenium.By;

public class DemandeDevisResauPage {

    private final BasePage basePage = new BasePage();

    private final By emailDuBeneficiaireField = By.xpath("//table[@aria-describedby='infoCoordonnes']//input[@name='devisEmail']");
    private final By confirmationEmailDuBeneficiaireField = By.xpath("//table[@aria-describedby='infoCoordonnes']//input[@name='devisEmailConfirmation']");
    private final By numeroADELIField = By.xpath("//table[@class='results']//input[@name='finessPrescripteur']");
    private final By premiereUtilisationDeLOrdonnanceRadioBtn = By.xpath("//table[@class='results']//input[@name='optBtnPrimoDelivrance']");
    private final By ordonnanceTableArrowBtn = By.xpath("//input[@onclick='return checkDepcRFormV2(this);']");
    private final By visionTypeODDropDown = By.xpath("//select[@id='visionTypeOD']");
    private final By visionTypeCommentairesTableArrowBtn = By.xpath("//input[@onclick='return checkMotif(ageBenef, complCommentaires) && show_correctionvisu();']");
    private final By sphereODField = By.xpath("//input[@id='visions[0].lodSphere']");
    private final By nomDuFabricantField = By.xpath("//input[@id='visions[0].odFabricant']");
    private final By correctionVisuelleTableArrowBtn = By.xpath("//input[@onclick='setVisionType(0); return checkVerreNeutre(0) && checkVisionsSelection(0) && show_LunettesOuLentilleReseau(0);']");
    private final By fournisseurDropDown = By.xpath("//select[@id='visions[0].listfourVerres']");
    private final By choisirLeVerrebtn = By.xpath("//div[@id='visions[0].div_FournisseurReferenceEquivalent']//input[@name='_eventId_goPoppupVerre']");
    private final By tarifField = By.xpath("//input[@id='visions[0].idPrixVerreOdmeme']");
    private final By recueilConsentementCheckbox = By.xpath("//input[@id='recueilConsentement']");
    private final By enregistrerBtn = By.xpath("//input[@value='Enregistrer']");

    private By nomDuVerreFieldValue(String value) {
        return By.xpath("//label[@id='visions[0].libelle_verre' and text()='" + value + "']");
    }

    private By nomFabricantFieldValue(String value) {
        return By.xpath("//a[text()='" + value + "']");
    }

    private By fieldName(String fieldName) {
        return By.xpath("//input[@name='" + fieldName + "' and @value and @readonly]");
    }

    private By numeroSSFieldValue(String numberoSS) {
        return By.xpath("//td[text()='Numéro SS']/parent::tr//td[contains(text(),'" + numberoSS + "')]");
    }

    private By optTPRegimeObligatoire(String value) {
        return By.xpath("//input[@name='optTPRegimeObligatoire' and @value='" + value + "']");
    }

    private By classePourLesVerresOption(String option) {
        return By.xpath("//span[contains(text(),' Classe pour les verres')]//input[@id='visions[0].lunettes" + option + "']");
    }

    public void fillEmailDuBeneficiaireField(String email) {
        basePage.fillField(emailDuBeneficiaireField, email);
    }

    public void fillConfirmationEmailDuBeneficiaireField(String email) {
        basePage.fillField(confirmationEmailDuBeneficiaireField, email);
    }

    public void selectPremiereUtilisationDeLOrdonnanceRadioButton() {
        basePage.click(premiereUtilisationDeLOrdonnanceRadioBtn);
    }

    public void fillNumeroADELIField(String number) {
        basePage.fillField(numeroADELIField, number);
    }

    public void clickOrdonnanceTableArrow() {
        basePage.click(ordonnanceTableArrowBtn);
    }

    public void selectOptTPRegimeObligatoire(String option) {
        basePage.click(optTPRegimeObligatoire(option));
    }

    public void selectVisionTypeOD(VisionTypes type) {
        basePage.selectFromDropDownByText(visionTypeODDropDown, type.getType());
    }

    public void clickVisionTypeCommentairesTableArrow() {
        basePage.click(visionTypeCommentairesTableArrowBtn);
    }

    public void selectClassePourLesVerres(String option) {
        basePage.click(classePourLesVerresOption(option));
    }

    public void fillSphereODField(String value) {
        basePage.fillField(sphereODField, value);
    }

    public void fillNomDuFabricantField(String value) {
        basePage.fillField(nomDuFabricantField, value);
        basePage.click(nomFabricantFieldValue(value));
    }

    public void clickCorrectionVisuelleTableArrow() {
        basePage.click(correctionVisuelleTableArrowBtn);
    }

    public void selectFournisseur(String value) {
        basePage.selectFromDropDownByText(fournisseurDropDown, value);
    }

    public void clickChoisirUnVerrebutton() {
        basePage.click(choisirLeVerrebtn);
    }

    public void fillTarifField(String value) {
        basePage.fillField(tarifField, value);
    }

    public void clickRecueilConsentementCheckbox() {
        basePage.click(recueilConsentementCheckbox);
    }

    public void clickEnregistrerButton() {
        basePage.click(enregistrerBtn);
    }

    public void verifyValueInNomDuVerreField(String value) {
        basePage.verifyElementIsDisplayed(nomDuVerreFieldValue(value));
    }

    public void verifyValueInNumeroSSField(String numeroSS) {
        basePage.verifyElementIsDisplayed(numeroSSFieldValue(numeroSS));
    }

    public void verifyCodeLLPFabricantFieldIsPopulatedAndReadOnly() {
        basePage.verifyElementIsDisplayed(fieldName("visions[0].odTips"));
    }

    public void verifyCodeLLPGeneriqueFieldIsPopulatedAndReadOnly() {
        basePage.verifyElementIsDisplayed(fieldName("visions[0].odTipsGen"));
    }

    public void verifyTarifDeConvensionFieldIsPopulatedAndReadOnly() {
        basePage.verifyElementIsDisplayed(fieldName("visions[0].odTcss"));
    }

    public void verifyROFieldIsPopulatedAndReadOnly() {
        basePage.verifyElementIsDisplayed(fieldName("visions[0].odRo"));
    }
}

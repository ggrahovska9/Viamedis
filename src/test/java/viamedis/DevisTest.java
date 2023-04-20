package viamedis;

import config.BaseTest;
import enums.VisionTypes;
import org.testng.annotations.Test;
import page.HomePage;
import page.LoginPage;
import page.devispage.AjouterUnDevisOptiqueAudioPage;
import page.devispage.ajouterundevispage.BeneficiairePage;
import page.devispage.ajouterundevispage.DemandeDevisResauPage;
import page.devispage.ajouterundevispage.DossierPage;
import page.devispage.ajouterundevispage.ValorisationDevisPage;
import page.devispage.ajouterundevispage.demandedevisresaupage.ChoixDuVerrePage;
import page.gestionavecpecpage.ListeDpecPage;
import page.gestionavecpecpage.nouvelledpecpage.FacturePage;
import page.gestionavecpecpage.nouvelledpecpage.PriseEnChargePage;
import page.homepage.DevisPage;
import page.homepage.DossiersPage;
import page.homepage.GestionAvecPecPage;

public class DevisTest extends BaseTest {

    private final LoginPage loginPage = new LoginPage();
    private final HomePage homePage = new HomePage();
    private final DevisPage devisPage = new DevisPage();
    private final AjouterUnDevisOptiqueAudioPage ajouterDevisPage = new AjouterUnDevisOptiqueAudioPage();
    private final DossierPage dossierPage = new DossierPage();
    private final BeneficiairePage beneficiairePage = new BeneficiairePage();
    private final DemandeDevisResauPage demandeDevisResauPage = new DemandeDevisResauPage();
    private final ChoixDuVerrePage choixDuVerrePage = new ChoixDuVerrePage();
    private final ValorisationDevisPage valorisationDevisPage = new ValorisationDevisPage();
    private final DossiersPage dossiersPage = new DossiersPage();
    private final GestionAvecPecPage gestionAvecPecPage = new GestionAvecPecPage();
    private final ListeDpecPage listeDpecPage = new ListeDpecPage();
    private final FacturePage facturePage = new FacturePage();
    private final PriseEnChargePage priseEnChargePage = new PriseEnChargePage();

    private final String numeroDossier = "229635420";
    private final String numeroPS = "102602240";

    @Test
    public void ajouterUnDevisReseauParSuperviseurTest() {
        loginPage.loginAsSupervisor("l.grinkevich@tinqin.com", "Tinqin2023!");

        homePage.verifySupervisionButton();
        homePage.clickDevisButton();

        devisPage.clickAjouterUnDevisOptiqueAudioButton();

        ajouterDevisPage.fillNumeroPSField(numeroPS);
        ajouterDevisPage.clickSuivantButton();

        beneficiairePage.fillNumeroSecuriteSocialField("270096211914453");
        beneficiairePage.clickRetrouverBeneficiaireButton();

        beneficiairePage.selectBeneficiaire("270096211914453");
        beneficiairePage.clickSuivantButton();

        dossierPage.verifyValueInIdentifiantField(numeroPS);
        dossierPage.typeTodayDateInDatePrescriptionField();
        dossierPage.typeTodayDateInDateReceptionDevisField();
        dossierPage.selectLunettesTypeEquipement();
        dossierPage.clickSuivantButton();

        demandeDevisResauPage.verifyValueInNumeroSSField("270096211914453");
        demandeDevisResauPage.fillEmailDuBeneficiaireField("test123@tinqin.com");
        demandeDevisResauPage.fillConfirmationEmailDuBeneficiaireField("test123@tinqin.com");
        demandeDevisResauPage.fillNumeroADELIField("970400057");
        demandeDevisResauPage.selectPremiereUtilisationDeLOrdonnanceRadioButton();
        demandeDevisResauPage.clickOrdonnanceTableArrow();

        demandeDevisResauPage.selectOptTPRegimeObligatoire("OUI");
        demandeDevisResauPage.selectVisionTypeOD(VisionTypes.VISION_DE_LOIN);
        demandeDevisResauPage.clickVisionTypeCommentairesTableArrow();

        demandeDevisResauPage.selectClassePourLesVerres("ClassA");
        demandeDevisResauPage.fillSphereODField("+2");
        demandeDevisResauPage.fillNomDuFabricantField("BB GR");

        demandeDevisResauPage.verifyCodeLLPFabricantFieldIsPopulatedAndReadOnly();
        demandeDevisResauPage.verifyCodeLLPGeneriqueFieldIsPopulatedAndReadOnly();
        demandeDevisResauPage.verifyTarifDeConvensionFieldIsPopulatedAndReadOnly();
        demandeDevisResauPage.verifyROFieldIsPopulatedAndReadOnly();
        demandeDevisResauPage.clickCorrectionVisuelleTableArrow();

        demandeDevisResauPage.selectFournisseur("BBGR");
        demandeDevisResauPage.clickChoisirUnVerrebutton();

        choixDuVerrePage.selectTypeDuVerre("Unifocal");
        choixDuVerrePage.selectIndice("1,5");
        choixDuVerrePage.clickRechercherButton();

        choixDuVerrePage.clickClassAUnifSt150ARRadioButton();
        choixDuVerrePage.clickValiderLaSectionButton();

        demandeDevisResauPage.verifyValueInNomDuVerreField("ClassA Unif St 1.50 AR");
        demandeDevisResauPage.fillTarifField("10");
        demandeDevisResauPage.clickRecueilConsentementCheckbox();
        demandeDevisResauPage.clickEnregistrerButton();

        valorisationDevisPage.fillRegimeComplementaireOdField("4.15");
        valorisationDevisPage.clickEnregistrerButton();

        valorisationDevisPage.clickVisualiserDevisResauLink();

        valorisationDevisPage.verifyValueInStatutField("Devis - Valorisé");
        valorisationDevisPage.verifyTodaysDateInDateDevisField();

        System.out.println("Numero dossier: " + valorisationDevisPage.getNumeroDossier());
    }

    @Test
    public void transformationDevisEnDpecParPSTest() {
        loginPage.loginAsPS("102602240@viamedis.fr", "Tinqin12345!");

        homePage.verifyHomePage();
        homePage.clickDossiersButton();

        dossiersPage.verifyValueInNumeroField(numeroPS);
        dossiersPage.selectTypeDossier("DEVIS valorisé");
        dossiersPage.fillNumeroDossierField(numeroDossier);
        dossiersPage.clickRechercherButton();

        dossiersPage.verifyValueInNumeroDossierField(numeroDossier);
        dossiersPage.verifyValueInTypeDossierField("DEVIS valorisé");
        dossiersPage.clickTransformerButton();

        dossiersPage.verifyNumeroDossierInConfirmationMessageForDevisTranformation(numeroDossier);
        dossiersPage.clickConfirmerButton();

        dossiersPage.verifyNumeroDossierInConfirmationMessage(numeroDossier);
    }

    @Test
    public void facturerPECParSuperviseurTest() {
        loginPage.loginAsSupervisor("l.grinkevich@tinqin.com", "Tinqin2023!");

        homePage.verifySupervisionButton();
        homePage.clickGestionAvecPecButton();

        gestionAvecPecPage.clickListeDPECButton();

        listeDpecPage.fillNumeroDossierField(numeroDossier);
        listeDpecPage.fillNumeroField(numeroPS);
        listeDpecPage.clickRechercherButton();

        listeDpecPage.verifyOneSearchResultMessage();
        listeDpecPage.verifyValueInNumeroPsField(numeroPS);
        listeDpecPage.verifyValueInNumeroField(numeroDossier);
        listeDpecPage.clickNumeroLink(numeroDossier);

        priseEnChargePage.verifyPriseEnChargePage();
        priseEnChargePage.fillRegimeComplementaireODField("4.15");
        priseEnChargePage.clickEnregistrerButton();

        priseEnChargePage.verifyVisualiserLaPecLink();
        priseEnChargePage.verifySaisirNouvellePecLink();
        priseEnChargePage.clickPoursuivreFactureLink();

        facturePage.verifyFacturePage();
        facturePage.typeTodayDateInDateFacturationField();
        facturePage.typeTodayDateInDateDelivranceField();
        facturePage.typeTodayDateInDateReceptionFacField();
        facturePage.fillNumeroDeFactureField(numeroDossier);
        facturePage.fillDepenseReelleField("10");
        facturePage.clickFacturerButton();

        facturePage.verifyConfirmationMessageForFacturer("10");
        facturePage.clickOuiButton();

        facturePage.verifyFactureEnregistreeMessage();
    }
}

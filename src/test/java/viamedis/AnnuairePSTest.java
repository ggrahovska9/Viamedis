package viamedis;

import config.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.HomePage;
import page.LoginPage;
import page.annuairepspage.recherchermodifierpspage.ModificationPSPage;
import page.annuairepspage.recherchermodifierpspage.RechercherModifierPSPage;
import page.annuairepspage.rechercherparribpage.RechercheParRIBPage;
import page.homepage.AnnuairePSPage;

public class AnnuairePSTest extends BaseTest {

    private final LoginPage loginPage = new LoginPage();
    private final HomePage homePage = new HomePage();
    private final AnnuairePSPage annuairePSPage = new AnnuairePSPage();
    private final RechercherModifierPSPage rechercherModifierPSPage = new RechercherModifierPSPage();
    private final RechercheParRIBPage rechercheParRIBPage = new RechercheParRIBPage();
    private final ModificationPSPage modificationPSPage = new ModificationPSPage();

    @BeforeMethod
    public void before() {
        loginPage.loginAsSupervisor("e.aleksandrova@tinqin.com", "Test123!");
        homePage.clickAnnuairePSButton();

        annuairePSPage.verifyAnnuairePSPage();
    }

    @Test
    public void TNR_CT01_RechercherPSParNumeroTest() {
        annuairePSPage.clickRechercherModifierPSButton();

        rechercherModifierPSPage.verifyRechercherModifierPSPage();
        rechercherModifierPSPage.fillNumeroPSField("12600003");
        rechercherModifierPSPage.clickRechercherButton();

        rechercherModifierPSPage.verifyResultatRecherchePSValue("12600003");
    }

    @Test
    public void TNR_CT02_RechercherPSParRIBTest() {
        annuairePSPage.clickRechercheParRIBButton();

        rechercheParRIBPage.verifyRechercheParRIBPage();
        rechercheParRIBPage.fillNumeroDeCompteIbanField("30001007941234567890190");
        rechercheParRIBPage.clickRechercherButton();

        rechercheParRIBPage.verifyResultatRechercheRIBValue("600774 0000");
    }

    @Test
    public void TNR_CT06_ModifierPSTest() {
        annuairePSPage.clickRechercherModifierPSButton();

        rechercherModifierPSPage.verifyRechercherModifierPSPage();
        rechercherModifierPSPage.fillNumeroPSField("11030434");
        rechercherModifierPSPage.clickRechercherButton();

        rechercherModifierPSPage.verifyResultatRecherchePSValue("11030434");
        rechercherModifierPSPage.clickModifierButton();

        modificationPSPage.verifyModificationPSPage();
        modificationPSPage.fillAdresse1Field("17 rue de La Fontaine");
        modificationPSPage.selectVilleOption("BOURG EN BRESSE");
        modificationPSPage.fillTelephoneField("0694888777");
        modificationPSPage.clickModifierLeProfilButton();
        modificationPSPage.typeTodayDate();
        modificationPSPage.clickModifierLeProfilButton();
        modificationPSPage.clickConfirmerButton();

        modificationPSPage.verifySuccessfulUpdateMessage("11030434");
    }
}

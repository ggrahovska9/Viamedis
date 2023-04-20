package viamedis;

import config.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.HomePage;
import page.LoginPage;
import page.homepage.TiersCreancierPage;
import page.tierscreancierpage.recherchermodifiertcpage.RechercherModiferTCPage;

public class TiersCreancierTest extends BaseTest {

    private final LoginPage loginPage = new LoginPage();
    private final HomePage homePage = new HomePage();
    private final TiersCreancierPage tiersCreancierPage = new TiersCreancierPage();
    private final RechercherModiferTCPage rechercherModiferTCPage = new RechercherModiferTCPage();

    @BeforeMethod
    public void before() {
        loginPage.loginAsSupervisor("e.aleksandrova@tinqin.com", "Test123!");
        homePage.clickTiersCreancierButton();
    }

    @Test
    public void TNR_CT01_RechercherTierCreancierTest() {
        tiersCreancierPage.clickRechercherModifierTCButton();

        rechercherModiferTCPage.fillNumeroTCFiled("74090");
        rechercherModiferTCPage.clickRechercherButton();

        rechercherModiferTCPage.verifyResultatRechercheRIBValue("74090");
    }
}

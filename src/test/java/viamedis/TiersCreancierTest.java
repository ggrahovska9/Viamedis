package viamedis;

import config.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.HomePage;
import page.LoginPage;
import page.tierscreancier.TiersCreancierPage;
import page.tierscreancier.recherchermodifiertc.RechercherModiferTCPage;
import page.tierscreancier.recherchermodifiertc.ResultatTiersCreanciersPage;

public class TiersCreancierTest extends BaseTest {

    private final LoginPage loginPage = new LoginPage();
    private final HomePage homePage = new HomePage();
    private final TiersCreancierPage tiersCreancierPage = new TiersCreancierPage();
    private final RechercherModiferTCPage rechercherModiferTCPage = new RechercherModiferTCPage();
    private final ResultatTiersCreanciersPage resultatTiersCreanciersPage = new ResultatTiersCreanciersPage();

    @BeforeMethod
    public void before() {
        loginPage.doSuccessfulLogin("e.aleksandrova@tinqin.com", "Test123!");
        homePage.clickTiersCreancierButton();
    }

    @Test
    public void TNR_CT01_RechercherTierCreancierTest() {
        tiersCreancierPage.clickRechercherModifierTCButton();

        rechercherModiferTCPage.fillNumeroTCFiled("74090");
        rechercherModiferTCPage.clickRechercherButton();

        resultatTiersCreanciersPage.verifyResultatRechercheRIBValue("74090");
    }
}

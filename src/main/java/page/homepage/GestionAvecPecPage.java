package page.homepage;

import config.BasePage;
import org.openqa.selenium.By;

public class GestionAvecPecPage {

    private final BasePage basePage = new BasePage();

    private By subMenuBtn(String subMenuBtn) {
        return By.xpath("//div[@class='sous-menu']//span[contains(text(),'" + subMenuBtn + "')]");
    }

    public void clickListeDPECButton() {
        basePage.click(subMenuBtn("Liste DPEC"));
    }
}

package config;

import enums.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    private final AcceptanceHelper helper = new AcceptanceHelper();

    public void click(By locator) {
        helper.waitForElementClickable(Waits.SHORT_WAIT, locator);
        helper.findElement(locator).click();
    }

    public void fillField(By locator, String value) {
        helper.findElement(locator).clear();
        helper.findElement(locator).sendKeys(value);
    }

    public void selectFromDropDown(By locator, String option) {
        Select select = new Select(helper.findElement(locator));
        select.selectByValue(option);
    }

    public void switchToWindow() {
        String originalWindow = helper.getDriverBrowser().getWindowHandle();

        for (String windowHandle : helper.getDriverBrowser().getWindowHandles()) {
            if (!originalWindow.contentEquals(windowHandle)) {
                helper.getDriverBrowser().switchTo().window(windowHandle);
                break;
            }
        }
    }

    public void acceptAlert() {
        if (isAlertPresent()) {
            WebDriverWait wait = new WebDriverWait(WebDriverProvider.getDriver(), Waits.SHORT_WAIT.getSeconds());
            wait.until(ExpectedConditions.alertIsPresent());
            helper.getDriverBrowser().switchTo().alert().accept();
        }
    }

    private boolean isAlertPresent() {
        try {
            helper.getDriverBrowser().switchTo().alert();
            return true;
        } catch (NoAlertPresentException ex) {
            return false;
        }
    }

    public void verifyElementIsDisplayed(By locator) {
        helper.findElement(locator).isDisplayed();
    }
}

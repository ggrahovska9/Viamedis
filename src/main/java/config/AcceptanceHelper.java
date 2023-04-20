package config;

import enums.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AcceptanceHelper {

    public WebElement findElement(By locator) {
        waitForElementVisible(Waits.SHORT_WAIT, locator);

        return WebDriverProvider.getDriver().findElement(locator);
    }

    public WebDriver getDriverBrowser() {
        return WebDriverProvider.getDriver();
    }

    public void waitForElementVisible(Waits seconds, By locator) {
        try {
            WebDriverWait wait = new WebDriverWait(WebDriverProvider.getDriver(), seconds.getSeconds());
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void waitForElementClickable(Waits seconds, By locator) {
        try {
            WebDriverWait wait = new WebDriverWait(WebDriverProvider.getDriver(), seconds.getSeconds());
            wait.until(ExpectedConditions.elementToBeClickable(locator));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverProvider {

    private static final String url = "http://192.168.100.200:8380/ViamedisNet/page/accueil/index";
    private static final String driverPath = "driver\\chromedriver.exe";

    public static WebDriver driver;

    public static void invokeBrowser() {
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static String getBaseUrl() {
        return url;
    }
}

package config;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import utils.CaptureScreenshot;
import utils.Utils;

import java.io.IOException;
import java.lang.reflect.Method;

public class BaseTest {

    private ExtentReports reports;

    @BeforeMethod
    public void openApplication(Method method) {
        WebDriverProvider.invokeBrowser();
        WebDriverProvider.getDriver().get(WebDriverProvider.getBaseUrl());
    }

    @BeforeClass
    public void generateReport() {
        reports = new ExtentReports();

        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")
                + "/test-output/TestReport_" + Utils.getLocalDateTime() + ".html");

        reports.attachReporter(htmlReporter);

        reports.setSystemInfo("Env", "Recette");
        reports.setSystemInfo("Build", "Integration");
        reports.setSystemInfo("Browser", "Chrome");
    }

    @AfterMethod
    public void setTestResult(ITestResult result, Method method) throws IOException {
        String screenShot = CaptureScreenshot.captureScreen(WebDriverProvider.getDriver(), method);
        ExtentTest test = reports.createTest(method.getName());

        if (result.getStatus() == ITestResult.FAILURE) {
            test.log(Status.FAIL, result.getName());
            test.log(Status.FAIL, result.getThrowable());
            test.fail("Screenshot : " + screenShot);
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            test.log(Status.PASS, result.getName());
        } else if (result.getStatus() == ITestResult.SKIP) {
            test.skip("Test Case : " + result.getName() + " has been skipped");
        }

        reports.flush();
        WebDriverProvider.getDriver().quit();
    }
}

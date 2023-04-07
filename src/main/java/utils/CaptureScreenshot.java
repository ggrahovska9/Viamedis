package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

public class CaptureScreenshot {

    public static String captureScreen(WebDriver driver, Method method) throws IOException {
        TakesScreenshot screen = (TakesScreenshot) driver;
        File source = screen.getScreenshotAs(OutputType.FILE);

        String destination = System.getProperty("user.dir") + "/screenshots/" + generateFileName(method);

        File finalDestination = new File(destination);
        FileHandler.copy(source, finalDestination);

        return destination;
    }

    private static String generateFileName(Method method) {
        return method.getName() + "_" + Utils.getLocalDateTime() + ".png";
    }
}

/*package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtils {

    public static String captureScreenshot(WebDriver driver, String testName, String status) {
        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File srcFile = ts.getScreenshotAs(OutputType.FILE);

            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String folderPath = System.getProperty("user.dir") + "/reports/screenshots/";
            Files.createDirectories(Paths.get(folderPath));

            String destPath = folderPath + testName + "_" + status + "_" + timestamp + ".png";
            File destFile = new File(destPath);
            Files.copy(srcFile.toPath(), destFile.toPath());

            return destPath;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}*/
package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtils {

    public static String captureScreenshot(WebDriver driver, String testName, String status) {
        try {
            // Capture screenshot
            TakesScreenshot ts = (TakesScreenshot) driver;
            File srcFile = ts.getScreenshotAs(OutputType.FILE);

            // Build filename
            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String folderPath = ExtentManager.getScreenshotDir(); // central path from ExtentManager
            Files.createDirectories(Paths.get(folderPath));

            String fileName = testName + "_" + status + "_" + timestamp + ".png";
            String destPath = folderPath + fileName;

            // Save file
            File destFile = new File(destPath);
            Files.copy(srcFile.toPath(), destFile.toPath());

            return destPath;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}


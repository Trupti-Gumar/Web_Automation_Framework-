package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SeleniumDriver {

    private static SeleniumDriver seleniumDriver;

    // initialize webdriver
    private static WebDriver driver;

    // initialize property file object
    private static Properties properties;

    // initialize timeouts
    public static WebDriverWait waitDriver;
    public final static Duration TIMEOUT = Duration.ofSeconds(25);
    public final static Duration PAGE_LOAD_TIMEOUT = Duration.ofSeconds(25);

    private SeleniumDriver() {

        ChromeOptions co = new ChromeOptions();
        co.setBrowserVersion("118");

        driver = new ChromeDriver(co);
        driver.manage().window().maximize();

        waitDriver = new WebDriverWait(driver, TIMEOUT);
        driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT);
        String window = driver.getWindowHandle();
        System.out.println("Window ->" + window);
    }

    // ✅ patched to auto-init driver
    public static void openPage(String url){
        if (driver == null) {
            setUpDriver(); // ensure driver is initialized
        }
        System.out.println(url);
        System.out.println(driver);
        driver.get(url);

        // ✅ handle cookie banner automatically
        acceptCookiesIfPresent();
    }

    // ✅ patched to always guarantee valid driver
    public static WebDriver getDriver() {
        try {
            if (driver == null) {
                setUpDriver();   // create driver if null
            }
        } catch (org.openqa.selenium.NoSuchSessionException e) {
            setUpDriver();       // recreate driver if session invalid
        }
        return driver;
    }

    public static void setUpDriver() {
        if (seleniumDriver == null) {
            seleniumDriver = new SeleniumDriver();
        }
    }

    // ✅ patched to reset driver cleanly
    public static void tearDown() {
        if (driver != null) {
            try {
                driver.quit();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                driver = null;         // reset for next scenario
                seleniumDriver = null; // force re-init
            }
        }
    }

    public static void waitForPageToLoad() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(
            "arguments[0].scrollIntoView({behavior: 'smooth', block: 'start', inline: 'nearest'}); window.scrollBy(0,100);",
            element);
    }

    public static void moveToElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element, 0, 0).build().perform();
    }

    public static boolean isElementPresent(WebElement webElement) {
        return webElement.isDisplayed();
    }

    public static String GetElementText(WebElement webElemen) {
        return webElemen.getText();
    }

    public static void initializePropertyFile() {
        try {
            FileInputStream input = new FileInputStream(
                ".\\src\\test\\resources\\config.properties");
            properties = new Properties();
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getPageUrl() {
        return properties.getProperty("URL");
    }

    public static WebElement getElelment(WebElement ele) {
        return ele;
    }

    public static void verifytheLink(WebElement ele) {
        clickOnElement(ele);
    }

    // ✅ safer click handling
    public static void clickOnElement(WebElement ele) {
        try {
            waitDriver.until(ExpectedConditions.elementToBeClickable(ele));
            ele.click();
        } catch (org.openqa.selenium.ElementClickInterceptedException e) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", ele);
        }
    }

    public static boolean clickElement(WebElement element, String buttonname) {
        boolean clicked = false;
        try {
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("arguments[0].click();", element);
            clicked = true;
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Unable to click\"" + buttonname +"\" using javascript click");
            clicked = false;
        }
        return clicked; 
    }

    public static String getPageTitle(WebElement ele) {
        Set<String> windowHandleBefore = SeleniumDriver.getDriver().getWindowHandles();
        int numberOfTabsBefore = windowHandleBefore.size();

        SeleniumDriver.clickOnElement(ele);
        SeleniumDriver.waitForPageToLoad();

        Set<String> windowHandleAfter = SeleniumDriver.getDriver().getWindowHandles();
        int numberOfTabsAfter = windowHandleAfter.size();

        if (numberOfTabsAfter > numberOfTabsBefore) {
            for (String handle : windowHandleAfter) {
                if (!windowHandleBefore.contains(handle)) {
                    SeleniumDriver.getDriver().switchTo().window(handle);
                    break;
                }
            }
        }

        String pageTitle = SeleniumDriver.getDriver().getTitle();

        if (numberOfTabsAfter > numberOfTabsBefore) {
            SeleniumDriver.getDriver().close();
            SeleniumDriver.getDriver().switchTo().window(windowHandleBefore.iterator().next());
        } else if(numberOfTabsAfter == numberOfTabsBefore){
            SeleniumDriver.waitForPageToLoad();
            SeleniumDriver.getDriver().navigate().back();
        }

        return pageTitle;
    }

    public static void waitForElementClickable(WebElement element) {
        try {
            WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(30));
            w.until(ExpectedConditions.elementToBeClickable(element));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Web Element is not clicked in a given time");
        }
    }

    public static String getPageURL(WebElement ele) {
        Set<String> windowHandleBefore = SeleniumDriver.getDriver().getWindowHandles();
        int numberOfTabsBefore = windowHandleBefore.size();

        SeleniumDriver.clickOnElement(ele);

        Set<String> windowHandleAfter = SeleniumDriver.getDriver().getWindowHandles();
        int numberOfTabsAfter = windowHandleAfter.size();

        if (numberOfTabsAfter > numberOfTabsBefore) {
            for (String handle : windowHandleAfter) {
                if (!windowHandleBefore.contains(handle)) {
                    SeleniumDriver.getDriver().switchTo().window(handle);
                    break;
                }
            }
        }

        String pageURL = SeleniumDriver.getDriver().getCurrentUrl();

        if (numberOfTabsAfter > numberOfTabsBefore) {
            SeleniumDriver.getDriver().close();
            SeleniumDriver.getDriver().switchTo().window(windowHandleBefore.iterator().next());
        }

        return pageURL;
    }

    public static void clickElementWithJavaScript(WebElement element) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", element);
    }

    // ✅ new helper
    public static void acceptCookiesIfPresent() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            WebElement acceptBtn = wait.until(ExpectedConditions.elementToBeClickable(
                By.id("onetrust-accept-btn-handler") // adjust if site uses different ID
            ));
            acceptBtn.click();
            System.out.println("Cookie banner dismissed.");
        } catch (Exception e) {
            // Banner not present or already dismissed
        }
    }

    public static void clickElementWithJavaScript1(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Ensure element is in view before clicking
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        js.executeScript("arguments[0].click();", element);
    }
    
    

}
/*package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SeleniumDriver {

    private static SeleniumDriver seleniumDriver;

    // initialize webdriver
    private static WebDriver driver;

    // initialize property file object
    private static Properties properties;

    // initialize timeouts
    public static WebDriverWait waitDriver;
    public final static Duration TIMEOUT = Duration.ofSeconds(10);         // ⏱ reduced
    public final static Duration PAGE_LOAD_TIMEOUT = Duration.ofSeconds(15); // ⏱ reduced

    private SeleniumDriver() {
        ChromeOptions co = new ChromeOptions();
        // ⚡ Performance flags
        co.addArguments("--headless=new");          // run faster without GUI
        co.addArguments("--disable-gpu");
        co.addArguments("--no-sandbox");
        co.addArguments("--disable-extensions");
        co.addArguments("--disable-dev-shm-usage");
        co.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});

        driver = new ChromeDriver(co);
        driver.manage().window().maximize();

        waitDriver = new WebDriverWait(driver, TIMEOUT);
        driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT);
        String window = driver.getWindowHandle();
        System.out.println("Window ->" + window);
    }

    public static void openPage(String url){
        if (driver == null) {
            setUpDriver(); // ensure driver is initialized
        }
        System.out.println(url);
        driver.get(url);

        // ✅ handle cookie banner automatically
        acceptCookiesIfPresent();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setUpDriver() {
        if (seleniumDriver == null)
            seleniumDriver = new SeleniumDriver();
    }

    public static void tearDown() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
        seleniumDriver = null;
    }

    // ⚡ Smarter wait instead of fixed sleep
    public static void waitForPageToLoad() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(
            webDriver -> ((JavascriptExecutor) webDriver)
                .executeScript("return document.readyState").equals("complete")
        );
    }

    public static void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(
            "arguments[0].scrollIntoView({behavior: 'smooth', block: 'start', inline: 'nearest'}); window.scrollBy(0,100);",
            element);
    }

    public static void moveToElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element, 0, 0).build().perform();
    }

    public static boolean isElementPresent(WebElement webElement) {
        return webElement.isDisplayed();
    }

    public static String GetElementText(WebElement webElemen) {
        return webElemen.getText();
    }

    public static void initializePropertyFile() {
        try {
            FileInputStream input = new FileInputStream(
                ".\\src\\test\\resources\\config.properties");
            properties = new Properties();
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getPageUrl() {
        return properties.getProperty("URL");
    }

    public static WebElement getElelment(WebElement ele) {
        return ele;
    }

    public static void verifytheLink(WebElement ele) {
        clickOnElement(ele);
    }

    // ✅ safer click handling
    public static void clickOnElement(WebElement ele) {
        try {
            waitDriver.until(ExpectedConditions.elementToBeClickable(ele));
            ele.click();
        } catch (org.openqa.selenium.ElementClickInterceptedException e) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", ele);
        }
    }

    public static boolean clickElement(WebElement element, String buttonname) {
        boolean clicked = false;
        try {
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("arguments[0].click();", element);
            clicked = true;
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Unable to click\"" + buttonname +"\" using javascript click");
            clicked = false;
        }
        return clicked; 
    }

    public static String getPageTitle(WebElement ele) {
        Set<String> windowHandleBefore = SeleniumDriver.getDriver().getWindowHandles();
        int numberOfTabsBefore = windowHandleBefore.size();

        SeleniumDriver.clickOnElement(ele);
        SeleniumDriver.waitForPageToLoad();

        Set<String> windowHandleAfter = SeleniumDriver.getDriver().getWindowHandles();
        int numberOfTabsAfter = windowHandleAfter.size();

        if (numberOfTabsAfter > numberOfTabsBefore) {
            for (String handle : windowHandleAfter) {
                if (!windowHandleBefore.contains(handle)) {
                    SeleniumDriver.getDriver().switchTo().window(handle);
                    break;
                }
            }
        }

        String pageTitle = SeleniumDriver.getDriver().getTitle();

        if (numberOfTabsAfter > numberOfTabsBefore) {
            SeleniumDriver.getDriver().close();
            SeleniumDriver.getDriver().switchTo().window(windowHandleBefore.iterator().next());
        } else if(numberOfTabsAfter == numberOfTabsBefore){
            SeleniumDriver.waitForPageToLoad();
            SeleniumDriver.getDriver().navigate().back();
        }

        return pageTitle;
    }

    public static void waitForElementClickable(WebElement element) {
        try {
            WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(10)); // ⏱ reduced
            w.until(ExpectedConditions.elementToBeClickable(element));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Web Element is not clicked in a given time");
        }
    }

    public static String getPageURL(WebElement ele) {
        Set<String> windowHandleBefore = SeleniumDriver.getDriver().getWindowHandles();
        int numberOfTabsBefore = windowHandleBefore.size();

        SeleniumDriver.clickOnElement(ele);

        Set<String> windowHandleAfter = SeleniumDriver.getDriver().getWindowHandles();
        int numberOfTabsAfter = windowHandleAfter.size();

        if (numberOfTabsAfter > numberOfTabsBefore) {
            for (String handle : windowHandleAfter) {
                if (!windowHandleBefore.contains(handle)) {
                    SeleniumDriver.getDriver().switchTo().window(handle);
                    break;
                }
            }
        }

        String pageURL = SeleniumDriver.getDriver().getCurrentUrl();

        if (numberOfTabsAfter > numberOfTabsBefore) {
            SeleniumDriver.getDriver().close();
            SeleniumDriver.getDriver().switchTo().window(windowHandleBefore.iterator().next());
        }

        return pageURL;
    }

    public static void clickElementWithJavaScript(WebElement element) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", element);
    }

    // ✅ new helper
    public static void acceptCookiesIfPresent() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            WebElement acceptBtn = wait.until(ExpectedConditions.elementToBeClickable(
                By.id("onetrust-accept-btn-handler")
            ));
            acceptBtn.click();
            System.out.println("Cookie banner dismissed.");
        } catch (Exception e) {
            // Banner not present or already dismissed
        }
    }

    public static void clickElementWithJavaScript1(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        js.executeScript("arguments[0].click();", element);
    }
}*/
/*package utils;-------------------This is working setb

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SeleniumDriver {

    private static SeleniumDriver seleniumDriver;

    // initialize webdriver
    private static WebDriver driver;

    // initialize property file object
    private static Properties properties;

    // initialize timeouts
    public static WebDriverWait waitDriver;
    public final static Duration TIMEOUT = Duration.ofSeconds(25);
    public final static Duration PAGE_LOAD_TIMEOUT = Duration.ofSeconds(25);

    private SeleniumDriver() {

        ChromeOptions co = new ChromeOptions();
        co.setBrowserVersion("118");

        driver = new ChromeDriver(co);
        driver.manage().window().maximize();

        waitDriver = new WebDriverWait(driver, TIMEOUT);
        driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT);
        String window = driver.getWindowHandle();
        System.out.println("Window ->" + window);
    }

    // ✅ patched to auto-init driver
    public static void openPage(String url){
        if (driver == null) {
            setUpDriver(); // ensure driver is initialized
        }
        System.out.println(url);
        System.out.println(driver);
        driver.get(url);

        // ✅ handle cookie banner automatically
        acceptCookiesIfPresent();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setUpDriver() {
        if (seleniumDriver == null)
            seleniumDriver = new SeleniumDriver();
    }

    public static void tearDown() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
        seleniumDriver = null;
    }

    public static void waitForPageToLoad() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(
            "arguments[0].scrollIntoView({behavior: 'smooth', block: 'start', inline: 'nearest'}); window.scrollBy(0,100);",
            element);
    }

    public static void moveToElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element, 0, 0).build().perform();
    }

    public static boolean isElementPresent(WebElement webElement) {
        return webElement.isDisplayed();
    }

    public static String GetElementText(WebElement webElemen) {
        return webElemen.getText();
    }

    public static void initializePropertyFile() {
        try {
            FileInputStream input = new FileInputStream(
                ".\\src\\test\\resources\\config.properties");
            properties = new Properties();
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getPageUrl() {
        return properties.getProperty("URL");
    }

    public static WebElement getElelment(WebElement ele) {
        return ele;
    }

    public static void verifytheLink(WebElement ele) {
        clickOnElement(ele);
    }

    // ✅ safer click handling
    public static void clickOnElement(WebElement ele) {
        try {
            waitDriver.until(ExpectedConditions.elementToBeClickable(ele));
            ele.click();
        } catch (org.openqa.selenium.ElementClickInterceptedException e) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", ele);
        }
    }

    public static boolean clickElement(WebElement element, String buttonname) {
        boolean clicked = false;
        try {
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("arguments[0].click();", element);
            clicked = true;
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Unable to click\"" + buttonname +"\" using javascript click");
            clicked = false;
        }
        return clicked; 
    }

    public static String getPageTitle(WebElement ele) {
        Set<String> windowHandleBefore = SeleniumDriver.getDriver().getWindowHandles();
        int numberOfTabsBefore = windowHandleBefore.size();

        SeleniumDriver.clickOnElement(ele);
        SeleniumDriver.waitForPageToLoad();

        Set<String> windowHandleAfter = SeleniumDriver.getDriver().getWindowHandles();
        int numberOfTabsAfter = windowHandleAfter.size();

        if (numberOfTabsAfter > numberOfTabsBefore) {
            for (String handle : windowHandleAfter) {
                if (!windowHandleBefore.contains(handle)) {
                    SeleniumDriver.getDriver().switchTo().window(handle);
                    break;
                }
            }
        }

        String pageTitle = SeleniumDriver.getDriver().getTitle();

        if (numberOfTabsAfter > numberOfTabsBefore) {
            SeleniumDriver.getDriver().close();
            SeleniumDriver.getDriver().switchTo().window(windowHandleBefore.iterator().next());
        } else if(numberOfTabsAfter == numberOfTabsBefore){
            SeleniumDriver.waitForPageToLoad();
            SeleniumDriver.getDriver().navigate().back();
        }

        return pageTitle;
    }

    public static void waitForElementClickable(WebElement element) {
        try {
            WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(30));
            w.until(ExpectedConditions.elementToBeClickable(element));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Web Element is not clicked in a given time");
        }
    }

    public static String getPageURL(WebElement ele) {
        Set<String> windowHandleBefore = SeleniumDriver.getDriver().getWindowHandles();
        int numberOfTabsBefore = windowHandleBefore.size();

        SeleniumDriver.clickOnElement(ele);

        Set<String> windowHandleAfter = SeleniumDriver.getDriver().getWindowHandles();
        int numberOfTabsAfter = windowHandleAfter.size();

        if (numberOfTabsAfter > numberOfTabsBefore) {
            for (String handle : windowHandleAfter) {
                if (!windowHandleBefore.contains(handle)) {
                    SeleniumDriver.getDriver().switchTo().window(handle);
                    break;
                }
            }
        }

        String pageURL = SeleniumDriver.getDriver().getCurrentUrl();

        if (numberOfTabsAfter > numberOfTabsBefore) {
            SeleniumDriver.getDriver().close();
            SeleniumDriver.getDriver().switchTo().window(windowHandleBefore.iterator().next());
        }

        return pageURL;
    }

    public static void clickElementWithJavaScript(WebElement element) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", element);
    }

    // ✅ new helper
    public static void acceptCookiesIfPresent() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            WebElement acceptBtn = wait.until(ExpectedConditions.elementToBeClickable(
                By.id("onetrust-accept-btn-handler") // adjust if site uses different ID
            ));
            acceptBtn.click();
            System.out.println("Cookie banner dismissed.");
        } catch (Exception e) {
            // Banner not present or already dismissed
        }
    }

    // --- PATCH START ---
    public static void clickElementWithJavaScript1(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Ensure element is in view before clicking
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        js.executeScript("arguments[0].click();", element);
    }
    // --- PATCH END ---

}-------------- till here workable */
/*package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SeleniumDriver {

    private static SeleniumDriver seleniumDriver;

    // initialize webdriver
    private static WebDriver driver;

    // initialize property file object
    private static Properties properties;

    // initialize timeouts
    public static WebDriverWait waitDriver;
    public final static Duration TIMEOUT = Duration.ofSeconds(25);
    public final static Duration PAGE_LOAD_TIMEOUT = Duration.ofSeconds(25);

    private SeleniumDriver() {

        ChromeOptions co = new ChromeOptions();
        co.setBrowserVersion("118");

        driver = new ChromeDriver(co);
        driver.manage().window().maximize();

        waitDriver = new WebDriverWait(driver, TIMEOUT);
        driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT);
        String window = driver.getWindowHandle();
        System.out.println("Window ->" + window);
    }

    public static void openPage(String url){
        System.out.println(url);
        System.out.println(driver);
        driver.get(url);

        // ✅ handle cookie banner automatically
        acceptCookiesIfPresent();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setUpDriver() {
        if (seleniumDriver == null)
            seleniumDriver = new SeleniumDriver();
    }

    public static void tearDown() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
        seleniumDriver = null;
    }

    public static void waitForPageToLoad() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(
            "arguments[0].scrollIntoView({behavior: 'smooth', block: 'start', inline: 'nearest'}); window.scrollBy(0,100);",
            element);
    }

    public static void moveToElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element, 0, 0).build().perform();
    }

    public static boolean isElementPresent(WebElement webElement) {
        return webElement.isDisplayed();
    }

    public static String GetElementText(WebElement webElemen) {
        return webElemen.getText();
    }

    public static void initializePropertyFile() {
        try {
            FileInputStream input = new FileInputStream(
                ".\\src\\test\\resources\\config.properties");
            properties = new Properties();
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getPageUrl() {
        return properties.getProperty("URL");
    }

    public static WebElement getElelment(WebElement ele) {
        return ele;
    }

    public static void verifytheLink(WebElement ele) {
        clickOnElement(ele);
    }

    // ✅ safer click handling
    public static void clickOnElement(WebElement ele) {
        try {
            waitDriver.until(ExpectedConditions.elementToBeClickable(ele));
            ele.click();
        } catch (org.openqa.selenium.ElementClickInterceptedException e) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", ele);
        }
    }

    public static boolean clickElement(WebElement element, String buttonname) {
        boolean clicked = false;
        try {
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("arguments[0].click();", element);
            clicked = true;
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Unable to click\"" + buttonname +"\" using javascript click");
            clicked = false;
        }
        return clicked; 
    }

    public static String getPageTitle(WebElement ele) {
        Set<String> windowHandleBefore = SeleniumDriver.getDriver().getWindowHandles();
        int numberOfTabsBefore = windowHandleBefore.size();

        SeleniumDriver.clickOnElement(ele);
        SeleniumDriver.waitForPageToLoad();

        Set<String> windowHandleAfter = SeleniumDriver.getDriver().getWindowHandles();
        int numberOfTabsAfter = windowHandleAfter.size();

        if (numberOfTabsAfter > numberOfTabsBefore) {
            for (String handle : windowHandleAfter) {
                if (!windowHandleBefore.contains(handle)) {
                    SeleniumDriver.getDriver().switchTo().window(handle);
                    break;
                }
            }
        }

        String pageTitle = SeleniumDriver.getDriver().getTitle();

        if (numberOfTabsAfter > numberOfTabsBefore) {
            SeleniumDriver.getDriver().close();
            SeleniumDriver.getDriver().switchTo().window(windowHandleBefore.iterator().next());
        } else if(numberOfTabsAfter == numberOfTabsBefore){
            SeleniumDriver.waitForPageToLoad();
            SeleniumDriver.getDriver().navigate().back();
        }

        return pageTitle;
    }

    public static void waitForElementClickable(WebElement element) {
        try {
            WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(30));
            w.until(ExpectedConditions.elementToBeClickable(element));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Web Element is not clicked in a given time");
        }
    }

    public static String getPageURL(WebElement ele) {
        Set<String> windowHandleBefore = SeleniumDriver.getDriver().getWindowHandles();
        int numberOfTabsBefore = windowHandleBefore.size();

        SeleniumDriver.clickOnElement(ele);

        Set<String> windowHandleAfter = SeleniumDriver.getDriver().getWindowHandles();
        int numberOfTabsAfter = windowHandleAfter.size();

        if (numberOfTabsAfter > numberOfTabsBefore) {
            for (String handle : windowHandleAfter) {
                if (!windowHandleBefore.contains(handle)) {
                    SeleniumDriver.getDriver().switchTo().window(handle);
                    break;
                }
            }
        }

        String pageURL = SeleniumDriver.getDriver().getCurrentUrl();

        if (numberOfTabsAfter > numberOfTabsBefore) {
            SeleniumDriver.getDriver().close();
            SeleniumDriver.getDriver().switchTo().window(windowHandleBefore.iterator().next());
        }

        return pageURL;
    }

    public static void clickElementWithJavaScript(WebElement element) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", element);
    }

    // ✅ new helper
    public static void acceptCookiesIfPresent() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            WebElement acceptBtn = wait.until(ExpectedConditions.elementToBeClickable(
                By.id("onetrust-accept-btn-handler") // adjust if site uses different ID
            ));
            acceptBtn.click();
            System.out.println("Cookie banner dismissed.");
        } catch (Exception e) {
            // Banner not present or already dismissed
        }
    }
 // --- PATCH START ---
    public static void clickElementWithJavaScript1(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Ensure element is in view before clicking
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        js.executeScript("arguments[0].click();", element);
    }
    // --- PATCH END ---

}*/

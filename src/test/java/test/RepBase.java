package test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public abstract class RepBase {

    public static AndroidDriver<MobileElement> driver;

    @BeforeClass
    public static void setUpAtrium() throws MalformedURLException {

        final String URL_STRING = "http://127.0.0.1:4723/wd/hub";
        URL url = new URL(URL_STRING);
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "8");
        capabilities.setCapability("app", "D:\\apk\\rep0900720.apk");
        driver = new AndroidDriver<MobileElement>(url, capabilities);
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        //Devices:
        //Android Emulator
        //ee9f6822


        // Codigo para subir na Device Farm Kobiton

//		final String URL_STRING = "https://BrunoInacio:79bb559e-234c-440b-aba5-5e90a8f42ee2@api.kobiton.com/wd/hub";
//
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("sessionName", "Automation test session");
//        capabilities.setCapability("sessionDescription", "");
//        capabilities.setCapability("deviceOrientation", "portrait");
//        capabilities.setCapability("captureScreenshots", false);
//        capabilities.setCapability("app", "kobiton-store:66097");
//        capabilities.setCapability("groupId", 1291); // Group: blu-users
//        capabilities.setCapability("deviceGroup", "KOBITON");
//        capabilities.setCapability("udid", "R58M21YX81L");


    }
    public static void clickByXPath(String xpath) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
        driver.findElement(By.xpath(xpath)).click();
    }

    public static void clickByClassName(String className) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.className(className)));
        driver.findElement(By.className(className)).click();
    }

    public static void clickById(String id) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id(id)));
        driver.findElement(By.id(id)).click();
    }
    public static void sendKeysById(String id, String keys) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id(id)));
        driver.findElement(By.id(id)).sendKeys(keys);
    }

    public static void sendKeysByClassName(String className, String keys) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.className(className)));
        driver.findElement(By.className(className)).sendKeys(keys);
    }

    public static void sendKeysByXPath(String xpath, String keys) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
        driver.findElement(By.xpath(xpath)).sendKeys(keys);
    }

    @AfterClass
    public static void tearDownAtrium() {
        driver.quit();
    }

    public String getLinearLayout() {

        return "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/";

    }

    public boolean takeScreenshot(final String name) {
        // TODO: Comentar ao enviar para AWS Device Farm
        return true;
    }


}



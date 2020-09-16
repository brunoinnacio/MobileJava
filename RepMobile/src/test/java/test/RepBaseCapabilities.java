package test;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public abstract class RepBaseCapabilities {

	public static AndroidDriver<MobileElement> driver;
	
	
	@BeforeClass
	public static void setUpAppium() throws MalformedURLException {

		final String URL_STRING = "http://127.0.0.1:4723/wd/hub";
		URL url = new URL(URL_STRING);
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "ee9f6822");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "8");
		capabilities.setCapability("app", "D:\\apk\\Rep18062020.apk");
		driver = new AndroidDriver<MobileElement>(url, capabilities);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		
		// Codigo para subir na Device Farm Kobiton
		
//		final String URL_STRING = "https://BrunoInacio:79bb559e-234c-440b-aba5-5e90a8f42ee2@api.kobiton.com/wd/hub";
//	
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setCapability("sessionName", "Automation test session");
//		capabilities.setCapability("sessionDescription", "");
//		capabilities.setCapability("deviceOrientation", "portrait");
//		capabilities.setCapability("captureScreenshots", false);
//		capabilities.setCapability("app", "kobiton-store:66097");
//		// The given group is used for finding devices and the created session will be visible for all members within the group.
//		capabilities.setCapability("groupId", 1291); // Group: blu-users
//		capabilities.setCapability("deviceGroup", "KOBITON");
//		// Specify UDID of the device you want to use
//		capabilities.setCapability("udid", "4d0078964b7f31d5");
//		
	}

	/**
	 * Always remember to quit
	 */
	@AfterClass
	public static void tearDownAppium() {
		driver.quit();
	}
	
	//Criação de Metodos para facilitar a chamada
		public void clickById(String id) {
			new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id(id)));
			driver.findElement(By.id(id)).click();
		}

		public void clickByClassName(String className) {
			new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.className(className)));
			driver.findElement(By.className(className)).click();
		}

		public void sendKeysById(String id, String keys) {
			new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id(id)));
			driver.findElement(By.id(id)).sendKeys(keys);
		}

		public void sendKeysByClassName(String className, String keys) {
			new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.className(className)));
			driver.findElement(By.className(className)).sendKeys(keys);
		}

		public void sendKeysByXPath(String xpath, String keys) {
			new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
			driver.findElement(By.xpath(xpath)).sendKeys(keys);
		}

		public void clickByXPath(String xpath) {
			new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
			driver.findElement(By.xpath(xpath)).click();
		}
		
		public String getLinearLayout() {
			
			return "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/";

		}
		
		public boolean takeScreenshot(final String name) {
			// TODO: Comentar ao enviar para AWS Device Farm
			return true;
			
							
		}
			
					
}


package VTOTests;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;

import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestForOneUpFeatures {

	public WebDriver wd;
	public MobileDriver driver;
	
	@Before
	public void setUp() throws Exception {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("appium-version", "1.0");
		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability("platformVersion", "8.0");
		capabilities.setCapability("deviceName", "iPad Air (8E60C67F-B033-4BDF-AEF8-145F47A7AA80)");
		capabilities.setCapability("app", "/Users/rachael/Library/Developer/Xcode/DerivedData/"
				+ "GlassesVTO-dxpvytyjzvywujbmrkntaogdrudi/Build/Products/Debug-iphonesimulator/RayBanVTO.app");
		wd = new RemoteWebDriver (new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@SuppressWarnings("serial")
	@Test
	public void test() throws InterruptedException {
		wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		wd.findElement(By.name("Start App")).click();
		Thread.sleep(500);	
		
		//tap for one up
		((RemoteWebDriver) wd).executeScript("mobile: tap", new HashMap<String, Double>() {{ put("tapCount", (double) 1); put("touchCount", (double) 1); put("duration", 0.5); put("x", (double) 222); put("y", (double) 342); }});
		Thread.sleep(500);
		
		
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAScrollView[1]/UIAButton[3]")).click();
		Thread.sleep(500);
		
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[1]")).click();
		Thread.sleep(500);
		
		wd.findElement(By.name("productdetail btn banner")).click();
		Thread.sleep(500);
		
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAScrollView[1]/UIAButton[1]")).click();
		Thread.sleep(500);
		
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAScrollView[1]/UIAButton[1]")).click();
		Thread.sleep(500);
		
		wd.findElement(By.name("ADD TO BAG")).click();
	

	}

}

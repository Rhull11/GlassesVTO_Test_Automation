package VTOTests;

//import static org.junit.Assert.*;
import java.net.URL;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestForTap {
	
	private WebDriver wd;

	@Before
	public void setUp() throws Exception {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("appium-version", "1.3");
		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability("platformVersion", "8.1");
		capabilities.setCapability("deviceName", "iPhone 5s");
		capabilities.setCapability("app", "/Users/rachael/Library/Developer/Xcode/DerivedData/"
				+ "GlassesVTO-blhwqzlbovrrwlbxcsjwrhawyysh/Build/Products/Debug-iphonesimulator/GlassesVTO-iPhone.app");
		wd = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		
	}

	@After
	public void tearDown() throws Exception {
		
		//wd.quit();
		
	}

	@Test
	public void test() throws Exception {
		
		Scenes.HowWouldYouLikeToShopToday.TapUseAModel( wd );
		Scenes.UseAModel.TapModel_1( wd );
		Scenes.BottomNavBar.TapAccountInfo( wd );
		
	}

}

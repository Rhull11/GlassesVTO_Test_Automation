package Scenes;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class HowWouldYouLikeToShopToday {


	public static void TapUseYourFace (WebDriver wd) {
		
		wd.findElement( By.name( "Use Your Face" ) ).click( );
		
	}
	
	public static void TapUseAModel (WebDriver wd) {
		
		wd.findElement( By.name("Use a Model") ).click( );
		
	}
	
	public static void TapFramesOnly (WebDriver wd) {
		
		wd.findElement( By.name( "Frames Only" ) ).click( );
		
	}
	
	public static void TapSignInText(WebDriver wd){
		
		
	}
	
	public static void assertHowWouldYouLikeToShopTodayText(WebDriver wd) {
		
		boolean testPassed;
		
		if (wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIAStaticText[1]")).getText() == "How would you like to shop today")
			
			testPassed = true;
			
		else
			
			testPassed = false; 
		
		assert(testPassed);
		
	}
	
	
}

package Scenes;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class UseAModel {

	
	public static void TapModel_1 ( WebDriver wd ) {
		
		wd.findElement( By.xpath ( "//UIAApplication[1]/UIAWindow[2]/UIAScrollView[1]/UIAScrollView[1]/UIAButton[1]" ) ).click( );

	}
	
	public static void TapModel_2 ( WebDriver wd ) {
		
		Swipe(wd); 
		wd.findElement( By.xpath ( "//UIAApplication[1]/UIAWindow[2]/UIAScrollView[1]/UIAScrollView[1]/UIAButton[1]") ).click( );
		
	}
	
	public static void TapModel_3 ( WebDriver driver ) {
		
		Swipe( driver );
		driver.findElement( By.xpath ( "//UIAApplication[1]/UIAWindow[2]/UIAScrollView[1]/UIAScrollView[1]/UIAButton[1]") ).click( );
		
	}
	
	public static void TapModel_4 ( WebDriver driver ) {
		
		Swipe( driver );
		driver.findElement( By.xpath ( "//UIAApplication[1]/UIAWindow[2]/UIAScrollView[1]/UIAScrollView[1]/UIAButton[1]") ).click( );
		
	}
	
	public static void TapModel_5 ( WebDriver driver ) {
		
		Swipe( driver );
		driver.findElement( By.xpath ( "//UIAApplication[1]/UIAWindow[2]/UIAScrollView[1]/UIAScrollView[1]/UIAButton[1]") ).click( );
		
	}
	
	public static void TapModel_6 ( WebDriver driver ) {
		
		Swipe( driver );
		driver.findElement( By.xpath ( "//UIAApplication[1]/UIAWindow[2]/UIAScrollView[1]/UIAScrollView[1]/UIAButton[1]") ).click( );
		
	}
	
	public static void TapModel_7 ( WebDriver driver ) {
		
		Swipe( driver );
		driver.findElement( By.xpath ( "//UIAApplication[1]/UIAWindow[2]/UIAScrollView[1]/UIAScrollView[1]/UIAButton[1]") ).click( );
		
	}
	
	public static void TapModel_8 ( WebDriver driver ) {
		
		Swipe( driver );
		driver.findElement( By.xpath ( "//UIAApplication[1]/UIAWindow[2]/UIAScrollView[1]/UIAScrollView[1]/UIAButton[1]") ).click( );
		
	}
	
	public static void TapModel_9 ( WebDriver driver ) {
		
		Swipe( driver );
		driver.findElement( By.xpath ( "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAScrollView[1]/UIAButton[1]") ).click( );
		
	}
	
	public static void TapModel_10 ( WebDriver driver ) {
		
		Swipe( driver );
		driver.findElement( By.xpath ( "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAScrollView[1]/UIAButton[1]") ).click( );
		
	}

	public static void Swipe (WebDriver driver){

			JavascriptExecutor js = ( JavascriptExecutor ) driver;
			HashMap < String, Double >swipeObject = new HashMap<String, Double>( );
			swipeObject.put( "touchCount", 1.00 );
			swipeObject.put( "startX", 279.00 );
			swipeObject.put( "startY",262.00 );
			swipeObject.put( "endX", 94.00 );
			swipeObject.put( "endY", 247.00 );
			swipeObject.put( "duration", 0.5270117 );
			js.executeScript( "mobile: swipe", swipeObject );

	}

}

package Scenes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BottomNavBar {
	
	public static void TapAccountInfo (WebDriver wd){
		
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIAButton[4]")).click();
		
	}
	
	public static void TapFavoritesButton (WebDriver wd){
		
		wd.findElement(By.name("tabbar favorites inactive")).click();
		
	}
	
	public static void TapBrowseButton (WebDriver wd){
		
		wd.findElement(By.name("tabbar browse inactive")).click();
		
	}
	
	public static void TapShoppingCartButton (WebDriver wd){
		
		wd.findElement(By.name("tabbar cart inactive")).click();
		
	}

}

package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePagePOMClass;
import com.SauceDemo.POMClasses.LoginPagePOMClass;
import com.SauceDemo.UtilityClasses.ScreenshotClass;

public class TC03SingleProductAddToCardFunctionality  extends BaseClass
{ 
		
		   @Test
		    public void SingleProductAddToCard() throws InterruptedException, IOException 
		   {
		   
		   ScreenshotClass.takesscreenShot(driver);
		   
	        HomePagePOMClass hp = new HomePagePOMClass(driver);
	       
	        
	        hp.selectBackpack();
	        log.info("product is added to cart");
			
	        log.info("Apply the validation");
	        
	        ScreenshotClass.takesscreenShot(driver);
	        log.info("Screenshot is teken ");
	        
	        String actualResult = hp.getTextFromCartButton();
	       
	        String expectedResult ="1";
	        
	        Assert.assertEquals(actualResult, expectedResult);
	        
	           hp.clickmenubutton();
		       log.info("click on menu");
		       
		       hp.clickLogoutButton();
		       log.info("click on logout");
	        
	        
	   }      
		    
    	
	}
	
	


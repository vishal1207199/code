package com.SauceDemo.UtilityClasses;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotClass 
{
   public static void takesscreenShot(WebDriver driver) throws IOException
   {
	   
	      SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy & HH-mm-ss");
		  Calendar cal = Calendar.getInstance();
		  String filename = date.format(cal.getTime());
		  
		  TakesScreenshot ts = (TakesScreenshot)driver;
		  File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		  File dest = new File("D:\\Automation-Screenshots\\POMproject"+filename+".png");
		  
		  FileHandler.copy(sourceFile, dest);
	   
   }
	
}

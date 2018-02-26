package com.selenium4testing.Helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;

public class Helper {
	 static WebDriver driver;
	 static Util util=new Util();
	public static  WebDriver startBrowser(String browsername){
		
		
		if(browsername.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecho.driver",util.firefoxDriver());
			driver=new FirefoxDriver();
		}
		
		else if(browsername.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver",util.chromeDriver());
			driver=new ChromeDriver();

		}
		if(browsername.equalsIgnoreCase("internetExplorer")){
			System.setProperty("webdriver.ie.driver",util.ieDriver());
			driver=new InternetExplorerDriver();
		}

		driver.get(util.openUrl());
		//driver.manage().window().maximize();
		
		return driver;
		
	}
}
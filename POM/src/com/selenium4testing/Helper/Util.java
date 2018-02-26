package com.selenium4testing.Helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Util {
	 
	static Properties pro;
	//load the properties files
	public Util(){
		
		try {
			File f=new File("config//locators.properties");
			FileInputStream fis=new FileInputStream(f);
			pro=new Properties();
		
			pro.load(fis);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	public String openUrl(){
		return pro.getProperty("URL");
	}
	public String chromeDriver(){
		return pro.getProperty("chromedriver");
		
	}
	public String firefoxDriver(){
		return pro.getProperty("firefoxdriver");
	}
	public String ieDriver(){
		return pro.getProperty("iedriver");
	}
	}
	
	



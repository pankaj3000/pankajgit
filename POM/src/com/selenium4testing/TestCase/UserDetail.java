package com.selenium4testing.TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.selenium4testing.Helper.Helper;
import com.selenium4testing.Pages.HomePage;

public class UserDetail {

	
@Test
public void loginValidation() {
	
	  
WebDriver driver=Helper.startBrowser("chrome");
HomePage loginpage=  PageFactory.initElements(driver, HomePage.class);
loginpage.loginByUser("admin", "admin");
	  	  
  }
}

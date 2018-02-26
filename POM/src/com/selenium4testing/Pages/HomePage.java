package com.selenium4testing.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver=driver;
	}
	
	@FindBy(name="username")
	WebElement uname;
	
	@FindBy(name="password")
	WebElement upass;
	
	@FindBy(name="submit")
	WebElement loginbtn;
	

	
	
	public void loginByUser(String usern,String upassword){
		
		uname.sendKeys(usern);
		upass.sendKeys(usern);
		loginbtn.click();

		
	}
	

	
	
	

}

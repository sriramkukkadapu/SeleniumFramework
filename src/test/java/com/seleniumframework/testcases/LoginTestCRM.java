package com.seleniumframework.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import com.seleniumframework.pages.LoginPage;
import com.seleniumframework.utility.BrowserFactory;

public class LoginTestCRM extends BrowserFactory {

	LoginPage loginPage;
	
	@BeforeMethod
	public void setUp() {
		initialization("chrome","https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		loginPage = PageFactory.initElements(driver,LoginPage.class);
	}
	
  @Test
  public void loginApp() {
	  
	  loginPage.login("manjunathapt.clk@gmail.com", "D@dm0ms1s");	  
	  
	  System.out.println(driver.getTitle());
	  quitBrowser(driver);
  }
  
  
  
}

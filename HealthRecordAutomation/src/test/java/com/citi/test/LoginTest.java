package com.citi.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.citi.base.AutomationWrapper;
import com.citi.pages.LoginPage;
import com.citi.pages.MainPage;
import com.citi.utilities.DataUtils;

public class LoginTest extends AutomationWrapper {
	 
	@Test(dataProvider = "commonDataProvider",dataProviderClass = DataUtils.class)
	public void validLoginTest(String username,String password,String expectedTitle)
	{
		LoginPage loginPage=new LoginPage(driver);
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
		loginPage.clickLogin();
		
		MainPage mainPage=new MainPage(driver);
		
		String actualTitle=mainPage.getMainPageTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test(dataProvider = "commonDataProvider",dataProviderClass = DataUtils.class)
	public void invalidLoginTest(String username,String password,String language,String expectedError)
	{
		LoginPage loginPage=new LoginPage(driver);
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
		loginPage.clickLogin();
		
		String actualError=loginPage.getErrorMessage();
		
		Assert.assertTrue(actualError.contains(expectedError));  //expect true
	}

}

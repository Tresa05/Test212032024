package com.naveenautomation.Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.Pages.AccountLoginPage;
import com.naveenautomation.Pages.MyAccountPage;
import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.Pages.NewsLetterPage;

public class MyAccountPageTest extends TestBase {

	AccountLoginPage page;
	MyAccountPage myAccountPage;
	NewsLetterPage newsLetterPage;
	
	@BeforeMethod
	public void launchBrowser() {
		intialisation();
		page = new AccountLoginPage();
	}

	@Test
	public void validateLogin() {
		AccountLoginPage page = new AccountLoginPage();
		myAccountPage = page.submitLogin("tresamariya25@gmail.com", "REENA25");
		String myAccountText = myAccountPage.getMyAccountText();
		Assert.assertEquals(myAccountText, "My Account");
	}
	
	@Test
	public void validateNewsLetterPage() {
		myAccountPage = page.submitLogin("tresamariya25@gmail.com", "REENA25");
		newsLetterPage = myAccountPage.clickSideNavMenuItem("NewsLetter");
		newsLetterPage.newsLetterSubscribed();
		String newsLetterAlert = myAccountPage.getNewsLetterSuccessAlertText();
		Assert.assertEquals("Success: Your newsletter subscription has been successfully updated!", newsLetterAlert);
	}
}
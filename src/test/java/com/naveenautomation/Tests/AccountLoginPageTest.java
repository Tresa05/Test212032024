package com.naveenautomation.Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.Pages.AccountLoginPage;
import com.naveenautomation.TestBase.TestBase;


public class AccountLoginPageTest extends TestBase {

	@BeforeMethod
	public void launchBrowser() {
		intialisation();
	}

	@Test (enabled = false)
	public void validateLogin() {
		AccountLoginPage page = new AccountLoginPage();
		page.submitLogin("tresamariya25@gmail.com", "REENA25");
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}
package com.naveenautomation.Tests;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.Pages.AccountLoginPage;
import com.naveenautomation.Pages.ContactUsPage;
import com.naveenautomation.Pages.MyAccountPage;
import com.naveenautomation.TestBase.TestBase;

public class ContactUsPageTest extends TestBase {

	AccountLoginPage page;
	MyAccountPage myAccountPage;
	ContactUsPage contactUsPage;

	@BeforeMethod
	public void launchBrowser() {
		intialisation();
		page = new AccountLoginPage();
	}

	@Test
	public void validateContactUs() {
		myAccountPage = page.submitLogin("tresamariya25@gmail.com", "REENA25");
		contactUsPage = myAccountPage.clickContactUsBtn();
		contactUsPage.submitContactUs("Tresa", "tresamariya25@gmail.com", RandomStringUtils.randomAlphabetic(60));
		String contactUsSuccessAlertText = contactUsPage.getContactUsSucessAlertText();
		Assert.assertEquals("Contact Us", contactUsSuccessAlertText);

	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}

package com.naveenautomation.Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.Pages.NewsLetterPage;
import com.naveenautomation.TestBase.TestBase;

public class NewsLetterPageTest extends TestBase{
	
	@BeforeMethod
	public void launchBrowser() {
		intialisation();
	}

	@Test(enabled = false)
	public void validateNewsLetterPage() {
		NewsLetterPage newsLetter = new NewsLetterPage();
		newsLetter.newsLetterSubscribed();
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}
}

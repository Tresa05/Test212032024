package com.naveenautomation.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.TestBase.TestBase;

public class MyAccountPage extends TestBase {

	public MyAccountPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#account-account>div.row h2:first-of-type")
	WebElement myAccountText;

	@FindBy(css = "#column-right a")
	List<WebElement> sideNavWebelementList;

	@FindBy(css = "div.alert")
	WebElement NewsLetterSuccessBanner;

	@FindBy(xpath = "//a[text()='Gift Certificates']")
	WebElement giftCertificateBtn;

	@FindBy(xpath = "//a[text()='Contact Us']")
	WebElement contactUsBtn;

	public String getMyAccountText() {
		return myAccountText.getText();
	}

	public NewsLetterPage clickSideNavMenuItem(String item) {
		for (int i = 0; i < sideNavWebelementList.size(); i++) {
			if (sideNavWebelementList.get(i).getText().equalsIgnoreCase(item)) {
				sideNavWebelementList.get(i).click();
				break;
			}
		}
		return new NewsLetterPage();
	}

	public String getNewsLetterSuccessAlertText() {
		return NewsLetterSuccessBanner.getText();
	}

	public GiftCertificatePage clickGiftCertificatesBtn() {
		giftCertificateBtn.click();
		return new GiftCertificatePage();
	}

	public ContactUsPage clickContactUsBtn() {
		contactUsBtn.click();
		return new ContactUsPage();
	}

}

package com.stepdefinition;

import org.junit.Assert;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;

public class TC3_SelectHotelStep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();

	@Then("User should select the Hotel Name and Click Continue button")
	public void userShouldSelectTheHotelNameAndClickContinueButton() {
		pom.getSelectHotelPage().SelectHotel();
	}

	@Then("User should verify after select hotel title {string} in the book hotel page")
	public void userShouldVerifyAfterSelectHotelTitleInTheBookHotelPage(String expBookHotel) {
		Assert.assertEquals("verify title Book A Hotel", expBookHotel,
				getElementText(pom.getBookHotelPage().getVerifyTitle()));
	}

	@Then("User should Click Continue button without selecting hotel")
	public void userShouldClickContinueButtonWithoutSelectingHotel() {
		pom.getSelectHotelPage().selectContinue();
	}

	@Then("User should verify after click continue button the error message {string} in the select hotel page")
	public void userShouldVerifyAfterClickContinueButtonTheErrorMessageInTheSelectHotelPage(
			String expLocationErrorMsg) {
		Assert.assertEquals("verify error message location ", expLocationErrorMsg,
				getElementText(pom.getSelectHotelPage().getErrorSelectHotel()));
	}

}

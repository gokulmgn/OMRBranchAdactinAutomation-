package com.stepdefinition;

import org.junit.Assert;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;

public class CommonStep extends BaseClass {
	PageObjectManager pom = new PageObjectManager();

	@Then("User should verify welcome message after login {string}")
	public void userShouldVerifyWelcomeMessageAfterLogin(String expWelcomeMsg) {
		Assert.assertEquals("verify after login welcome success msg", expWelcomeMsg,
				getAttributeValue(pom.getSearchHotelPage().getWelcomeMsg()));
	}

}

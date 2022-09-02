package com.stepdefinition;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC1_LoginStep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();

	@Given("User is on the adactin Page")
	public void userIsOnTheAdactinPage() throws FileNotFoundException, IOException {
		getDriver(getPropertyFileValue("browserType"));
		enterUrl(getPropertyFileValue("url"));
	}

	@When("User should perform login {string},{string}")
	public void userShouldPerformLogin(String userName, String password) {
		pom.getLoginPage().login(userName, password);
	}

	@When("User should perform login {string},{string} with Enter key")
	public void userShouldPerformLoginWithEnterKey(String userName, String password) throws AWTException {
		pom.getLoginPage().loginWithEnter(userName, password);
	}

	@Then("User should verify error message after login {string}")
	public void userShouldVerifyErrorMessageAfterLogin(String expErrorMsg) {

		Assert.assertTrue(getElementText(pom.getLoginPage().getLoginErrorMsg()).contains(expErrorMsg));
	}

}

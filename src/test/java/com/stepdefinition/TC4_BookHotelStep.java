package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

public class TC4_BookHotelStep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();

	@Then("User should Enter all fileds {string},{string} and {string} in book hotel page")
	public void userShouldEnterAllFiledsAndInBookHotelPage(String firstName, String lastName, String address,
			DataTable dataTable) {
		List<Map<String, String>> m = dataTable.asMaps();
		Map<String,String> cardDetails= m.get(1);
		String CardNo =cardDetails.get("cardNo");
		String CardType =cardDetails.get("cardType");
		String ExpMonth = cardDetails.get("expMonth");
		String ExpYear = cardDetails.get("expYear");
		String CVV = cardDetails.get("cvv");

		pom.getBookHotelPage().BookHotel(firstName, lastName, address, CardNo, CardType, ExpMonth, ExpYear, CVV);

	}

	@Then("User should verify after Click Book Now title {string} in the Booking Confirmation page")
	public void userShouldVerifyAfterClickBookNowTitleInTheBookingConfirmationPage(String expBookNow) {
		Assert.assertEquals(" Verify Book Now title ", expBookNow,getElementText(pom.getBookHotelPage().getVerifybookconfi()));
		
	}

	@Then("User should perform without Enter any fileds in book hotel page")
	public void userShouldPerformWithoutEnterAnyFiledsInBookHotelPage() {
		pom.getBookHotelPage().BookHotel();
	}

	@Then("User should verify after click Book Now the error message {string},{string},{string},{string},{string},{string} and {string}")
	public void userShouldVerifyAfterClickBookNowTheErrorMessageAnd(String expErrorFirstName, String expErrorLastName, String expErrorAddress,
			String expErrorCardNo, String expErrorCardType, String expErrorExpiryDate, String expErrorCVV) {
		Assert.assertEquals(" Verify the error message ", expErrorFirstName,pom.getBookHotelPage().getErrorFirstName());
		Assert.assertEquals(" Verify the error message ", expErrorLastName,pom.getBookHotelPage().getErrorLastName());
		Assert.assertEquals(" Verify the error message ", expErrorAddress,pom.getBookHotelPage().getErrorAddress());
		Assert.assertEquals(" Verify the error message ", expErrorCardNo,pom.getBookHotelPage().getErrorCardNo());
		Assert.assertEquals(" Verify the error message ", expErrorCardType,pom.getBookHotelPage().getErrorCardType());
		Assert.assertEquals(" Verify the error message ", expErrorExpiryDate,pom.getBookHotelPage().getErrorExpiryDate());
		Assert.assertEquals(" Verify the error message ", expErrorCVV,pom.getBookHotelPage().getErrorCVV());


	}

}

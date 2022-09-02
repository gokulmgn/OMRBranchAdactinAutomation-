package com.stepdefinition;

import org.junit.Assert;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;

public class TC2_SearchHotelStep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();

	@Then("User should perform the search hotel {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void userShouldPerformTheSearchHotelAnd(String location, String hotels, String roomType, String noOfRooms,
			String checkInDate, String checkOutDate, String adultsPerRoom, String childrenPerRoom) {
		pom.getSearchHotelPage().searchHotel(location, hotels, roomType, noOfRooms, checkInDate, checkOutDate,
				adultsPerRoom, childrenPerRoom);
	}

	@Then("User should verify after the select hotel title {string} in the select hotel page")
	public void userShouldVerifyAfterTheSelectHotelTitleInTheSelectHotelPage(String expSelectHotel) {
		Assert.assertEquals("verify after the select hotel", expSelectHotel,
				getElementText(pom.getSearchHotelPage().getVerifyTitle()));
	}

	@Then("User should Enter mandatory filed perform the search hotel  {string},{string},{string},{string} and {string}")
	public void userShouldEnterMandatoryFiledPerformTheSearchHotelAnd(String location, String noOfRooms,
			String checkInDate, String checkOutDate, String adultsPerRoom) {
		pom.getSearchHotelPage().searchHotel(location, noOfRooms, checkInDate, checkOutDate, adultsPerRoom);
	}

	@Then("User should verify the date error message {string} and {string} in the search hotel page")
	public void userShouldVerifyTheDateErrorMessageAndInTheSearchHotelPage(String expErrorMsgCheckIn,
			String expErrorMsgCheckOut) {
		Assert.assertEquals("verify the date error message", expErrorMsgCheckIn,
				getElementText(pom.getSearchHotelPage().getErrorCheckIn()));
		Assert.assertEquals("verify the date error message", expErrorMsgCheckOut,
				getElementText(pom.getSearchHotelPage().getErrorCheckOut()));
	}

	@Then("User should perform search hotel without enter any fileds")
	public void userShouldPerformSearchHotelWithoutEnterAnyFileds() {
		pom.getSearchHotelPage().searchHotel();
	}

	@Then("User should verify the location error message {string} in the search hotel page")
	public void userShouldVerifyTheLocationErrorMessageInTheSearchHotelPage(String expLocationErrorMsg) {
		Assert.assertEquals("verify the location error message", expLocationErrorMsg,
				getElementText(pom.getSearchHotelPage().getErrorLocation()));

	}

}

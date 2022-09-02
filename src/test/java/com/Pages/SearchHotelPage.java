package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SearchHotelPage extends BaseClass {
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement dDnLocation;

	@FindBy(id = "hotels")
	private WebElement dDnHotels;

	@FindBy(id = "room_type")
	private WebElement dDnRoomType;

	@FindBy(id = "room_nos")
	private WebElement dDnNoOfRooms;

	@FindBy(id = "datepick_in")
	private WebElement dDnCheckInDate;

	@FindBy(id = "datepick_out")
	private WebElement dDnCheckOutDate;

	@FindBy(id = "adult_room")
	private WebElement dDnAdultRoom;

	@FindBy(id = "child_room")
	private WebElement dDnChildRoom;

	@FindBy(id = "Submit")
	private WebElement dDnSubmit;
	
	@FindBy(id = "username_show")
	private WebElement welcomeMsg;
	
	@FindBy(xpath = "//td[text()='Select Hotel ']")
	private WebElement verifyTitle;
	
	@FindBy(id = "checkin_span")
	private WebElement errorCheckIn;
	
	@FindBy(id = "checkout_span")
	private WebElement errorCheckOut;
	
	@FindBy(id = "location_span")
	private WebElement errorLocation;

	public WebElement getdDnLocation() {
		return dDnLocation;
	}

	public WebElement getdDnHotels() {
		return dDnHotels;
	}

	public WebElement getdDnRoomType() {
		return dDnRoomType;
	}

	public WebElement getdDnNoOfRooms() {
		return dDnNoOfRooms;
	}

	public WebElement getdDnCheckInDate() {
		return dDnCheckInDate;
	}

	public WebElement getdDnCheckOutDate() {
		return dDnCheckOutDate;
	}

	public WebElement getdDnAdultRoom() {
		return dDnAdultRoom;
	}

	public WebElement getdDnChildRoom() {
		return dDnChildRoom;
	}

	public WebElement getdDnSubmit() {
		return dDnSubmit;
	}

	public WebElement getWelcomeMsg() {
		return welcomeMsg;
	}

	public WebElement getVerifyTitle() {
		return verifyTitle;
	}

	public WebElement getErrorCheckIn() {
		return errorCheckIn;
	}

	public WebElement getErrorCheckOut() {
		return errorCheckOut;
	}

	public WebElement getErrorLocation() {
		return errorLocation;
	}
	//1.Verifying Adactin Search Hotel By Select All The Field
    //3.Verifying Adactin Search Hotel By Enter Invaild CheckInDate and CheckOutDate
	public void searchHotel(String location, String hotels, String roomType,String noOfRooms, String checkInDate,
			String checkOutDate, String adultsPerRoom, String childrenPerRoom) {
		selectOptbyText(getdDnLocation(), location);
		selectOptbyText(getdDnHotels(), hotels);
		selectOptbyText(getdDnRoomType(), roomType);
		selectOptbyText(getdDnNoOfRooms(), noOfRooms);
		clearValue(getdDnCheckInDate());
		sendKeys(getdDnCheckInDate(), checkInDate);
		clearValue(getdDnCheckOutDate());
		sendKeys(getdDnCheckOutDate(), checkOutDate);
		selectOptbyText(getdDnAdultRoom(), adultsPerRoom);
		selectOptbyText(getdDnChildRoom(), childrenPerRoom);
		elementClick(getdDnSubmit());
	
	}
	//2.Verifying Adactin Search Hotel By Enter Mandatory filed
	public void searchHotel(String location, String noOfRooms, String checkInDate, String checkOutDate, String adultsPerRoom) {
		selectOptbyText(getdDnLocation(), location);
		selectOptbyText(getdDnNoOfRooms(), noOfRooms);
		clearValue(getdDnCheckInDate());
		sendKeys(getdDnCheckInDate(), checkInDate);
		clearValue(getdDnCheckOutDate());
		sendKeys(getdDnCheckOutDate(), checkOutDate);
		selectOptbyText(getdDnAdultRoom(), adultsPerRoom);
		elementClick(getdDnSubmit());
	}
	//4.Verifying Adactin Search Hotel By Without Enter Any Fields
	public void searchHotel() {
		elementClick(getdDnSubmit());
	}
	
	
}

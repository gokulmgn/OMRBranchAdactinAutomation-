package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class CancelBookingPage extends BaseClass {
	public CancelBookingPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id = "my_itinerary")
	private WebElement myItinerary;
	
	@FindBy(id = "order_id_text")
	private WebElement orderId;
	
	@FindBy(id = "check_all")
	private WebElement selectOrderId;
	
	@FindBy (id = "search_result_error")
	private WebElement bookingCancelled;

	public WebElement getMyItinerary() {
		return myItinerary;
	}

	public WebElement getOrderId() {
		return orderId;
	}

	public WebElement getSelectOrderId() {
		return selectOrderId;
	}

	public WebElement getBookingCancelled() {
		return bookingCancelled;
	}
	
	public void cancelBooking() {
		elementClick(myItinerary);
		sendKeys(orderId, getCurrentTitle());
	}
	
}

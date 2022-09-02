package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class BookingConfirmationPage extends BaseClass {
	public BookingConfirmationPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "order_no")
	private WebElement orderNo;

	public WebElement getOrderNo() {
		return orderNo;
	}

	public String getOrderId() {
		String orderId = getAttributeValue(orderNo);
		return orderId;
	}

}

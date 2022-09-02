package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class BookHotelPage extends BaseClass {
	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[text()='Book A Hotel ']")
	private WebElement verifyTitle;

	@FindBy(id = "first_name")
	private WebElement firstName;

	@FindBy(id = "last_name")
	private WebElement lastName;

	@FindBy(id = "address")
	private WebElement address;

	@FindBy(id = "cc_num")
	private WebElement cardNo;

	@FindBy(id = "cc_type")
	private WebElement cardType;

	@FindBy(id = "cc_exp_month")
	private WebElement expMonth;

	@FindBy(id = "cc_exp_year")
	private WebElement expYear;

	@FindBy(id = "cc_cvv")
	private WebElement cvv;

	@FindBy(id = "book_now")
	private WebElement bookNow;
	//
	@FindBy(id = "first_name_span")
	private WebElement errorFirstName;

	@FindBy(id = "last_name_span")
	private WebElement errorLastName;

	@FindBy(id = "address_span")
	private WebElement errorAddress;

	@FindBy(id = "cc_num_span")
	private WebElement errorCardNo;

	@FindBy(id = "cc_type_span")
	private WebElement errorCardType;

	@FindBy(id = "cc_expiry_span")
	private WebElement errorExpiryDate;

	@FindBy(id = "cc_cvv_span")
	private WebElement errorCVV;

	@FindBy(xpath = "//td[text()='Booking Confirmation ']")
	private WebElement verifybookconfi;

	public WebElement getVerifyTitle() {
		return verifyTitle;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardNo() {
		return cardNo;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getExpMonth() {
		return expMonth;
	}

	public WebElement getExpYear() {
		return expYear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBookNow() {
		return bookNow;
	}

	public WebElement getErrorFirstName() {
		return errorFirstName;
	}

	public WebElement getErrorLastName() {
		return errorLastName;
	}

	public WebElement getErrorAddress() {
		return errorAddress;
	}

	public WebElement getErrorCardNo() {
		return errorCardNo;
	}

	public WebElement getErrorCardType() {
		return errorCardType;
	}

	public WebElement getErrorExpiryDate() {
		return errorExpiryDate;
	}

	public WebElement getErrorCVV() {
		return errorCVV;
	}

	public WebElement getVerifybookconfi() {
		return verifybookconfi;
	}

	// 1.Verifying Adactin Book Hotel By Select All Fileds
	public void BookHotel(String firstName, String lastName, String address, String cardNo, String cardTpye,
			String expMonth, String expYear, String cvv) {
		sendKeys(getFirstName(), firstName);
		sendKeys(getLastName(), lastName);
		sendKeys(getAddress(), address);
		sendKeys(getCardNo(), cardNo);
		selectOptbyText(getCardType(), cardTpye);
		selectOptbyText(getExpMonth(), expMonth);
		selectOptbyText(getExpYear(), expYear);
		sendKeys(getCvv(), cvv);
		elementClick(getBookNow());
	}

	// 2.Verifying Adactin Book Hotel By Without Enter Any Fileds
	public void BookHotel() {

		elementClick(getBookNow());
	}

}
